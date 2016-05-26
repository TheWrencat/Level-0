PImage rainbow;
PImage unicorn;
void setup(){
  rainbow = loadImage("rainbow.jpg");
  unicorn = loadImage("unicorn.png");
  size (540,304);
 
}
void draw(){
  background(rainbow);
  image (unicorn, mouseX-50, mouseY-50);
}
