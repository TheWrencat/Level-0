
void setup () {

  size(400, 400);
  fill(238, 153, 102);
  ellipse(200, 200, 200, 200);
  fill(200, 0, 0);
  ellipse(200, 200, 180, 180);
  fill(204, 153, 0);
  ellipse(200, 200, 170, 170);
}
void draw () {
  PImage pepperoni = loadImage ("olive.ppm.gif");
  PImage olive = loadImage ("pepperoni.ppm.gif");
  if (mousePressed && (mouseButton == LEFT)) {
    image (pepperoni, mouseX, mouseY);
  }
  if (mousePressed && (mouseButton == RIGHT)) {
    image (olive, mouseX, mouseY);
  }
}

