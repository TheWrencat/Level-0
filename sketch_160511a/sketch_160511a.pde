int yDrop = 0;
int xDrop = 50;
int Score = 0;
int fill = 0;
void setup() {
  size(200, 200);
}
void draw()
{
  background(100, 100, 100);
  text("Score:"+Score,1,10);
  fill(100, 150, 200);
  noStroke();
  ellipse(xDrop, yDrop+=3, 4, 10);
  fill(100, 200, 150);
  if (yDrop>=250) {
    yDrop=0;
    xDrop=(int)random(200);
    Score=0;
    fill=0;
  }

    if (yDrop>=150) {
      if(xDrop>=mouseX){
        if(xDrop<=mouseX+25){
      fill(100,150,200);
      yDrop=0;
      xDrop=(int)random(200);
      Score++;
      fill++;
      }
    }
  }
   fill(100,200,150);
  rect(mouseX, 150, 25, 25);//bucket
   fill(100,150,200);
  rect(mouseX, fill+150, 25, fill);//water
  
}

