import processing.net.*;

Server server;

void setup() {
  size(600, 600);
  server = new Server(this, 5500);
}

void draw() {
  background(255);
}

void serverEvent(Server server, Client client) {
  println("HELLO WORLD");
}
