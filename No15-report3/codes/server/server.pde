import processing.net.*;

Server server;
DetLoseNum loseNum;


void setup() {
  server = new Server(this, 5500);
  loseNum = new DetLoseNum(1,10);
}

void draw() {
  background(255);
}


/*サーバー接続時*/
void serverEvent(Server server, Client client) {
  println("HELLO WORLD");
  print(loseNum.loseNumber);
}

/*クライアントから値を受け取る時*/
void clientEvent(Client client) {
   while(client.available() > 0) {
     int v = 0;
     v = int(client.readString().trim());
     println("clientInput:" + v);
     if(v == loseNum.loseNumber) {
       server.write("BOM!!!");
     }
   }
}



public class DetLoseNum {
  private int upper;
  private int lower;
  public int loseNumber;
  
  DetLoseNum(int upper, int lower) {
    this.upper = upper;
    this.lower = lower;
    this.assignment();  
  }
  
  void assignment() {
    this.loseNumber = int(random(this.upper, this.lower));
  }
}
