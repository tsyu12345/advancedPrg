import processing.net.*;

Client client;
Bom bom;


void setup(){
  size(600, 600);
  client = new Client(this, "127.0.1.1", 5500);
  bom = new Bom(width/2, height/2, 100, 100);
}

void draw() {
  background(255);
  bom.drawBom();
 
  if(bom.isFire) {
    bom.fireBom();
  }
}


void keyPressed() {
  client.write(key);
}

/*サーバーから値を受け取るイベントリスナー*/
void clientEvent(Client client) {
   while(client.available() > 0) {
     String v = client.readString().trim();
     print(v);
     if(v == "BOM!!!") {
         bom.fireBom();
     }
   }
}

public class Bom {
  
  private float x, y, bom_width, bom_height;
  public boolean isFire;
  private Particle[] particleArray;
  
  Bom(float x, float y, float w, float h) {
    this.x = x;
    this.y = y;
    this.bom_width = w;
    this.bom_height = h;
    this.isFire = false;
    this.particleArray = new Particle[100];
  }
  
  void drawBom() {
    fill(0);
    noStroke();
    ellipse(this.x, this.y, this.bom_width, this.bom_height);
  }
  
  void fireBom(){
    for(int i = 0; i < particleArray.length; i++) {
      float px = random(width);
      float py = random(height);
      float pl = random(50); 
      this.particleArray[i] = new Particle(px,py,pl,pl);
      this.particleArray[i].drawPrticle();
    }
  }
}

public class Particle {
  float x, y, w, h, mx, my;
  int bwColor;
  Particle(float x, float y, float w, float h) {
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    this.mx = 2.0;
    this.my = 2.0;
    this.bwColor = int(random(255));
  }
  
  void drawPrticle() {
    if(this.x < 0 || this.x > width) {
      this.mx *= -1.0;
    }
    if(this.y < 0 || this.y > height) {
      this.my *= -1.0;
    }
    fill(this.bwColor);
    noStroke();
    ellipse(this.x, this.y, this.w, this.h);
    this.x += this.mx;
    this.y += this.my;
  }
}
