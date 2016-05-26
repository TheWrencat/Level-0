PImage minion;
PImage mustache;
PImage tophat;
void setup(){
  minion = loadImage("minion.jpg");
  size(89,100);
 background(minion);
 mustache = loadImage("mustache.png");
 tophat = loadImage("tophat.png");
}
 void draw(){
   if (mousePressed && mouseButton==LEFT){
 image(mustache, mouseX-25, mouseY-25);
   }
   if (mousePressed && mouseButton==RIGHT){
     image(tophat, mouseX-20, mouseY-25);
   }
}
