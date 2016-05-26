int yDrop = 0;
int speed = 2;
int xDrop = 50;
int Score = 0;
int levelProgress = 0;
int level = 1;
int fillY = 675;
int fillH = 0;
void setup() {
  size(700, 700);
}
void draw()
{

  background(100, 100, 100);
  text("Score:"+Score, 1, 10);
  text("Level:"+level, 1, 50);
  fill(100, 150, 200);
  noStroke();
  ellipse(xDrop, yDrop+=speed, 4, 10);
  fill(100, 200, 150);
  if (yDrop>=250) {
    yDrop=0;
    xDrop=(int)random(700);
    Score=0;
    fillY=675;
    fillH=0;
    levelProgress=0;
    level=0;
    speed=2;
  }

  if (yDrop>=150) {
    if (xDrop>=mouseX) {
      if (xDrop<=mouseX+25) {
        fill(100, 150, 200);
        yDrop=0;
        xDrop=(int)random(200);
        Score++;
        levelProgress++;
        fillY--;
        fillH++;
      }
    }
  }
  fill(100, 200, 150);
  rect(mouseX, 550, 50, 50);//bucket
  fill(100, 150, 200);
  rect(mouseX, fillY, 50, fillH);//water

  if (levelProgress==25) {
    level++;
    speed++;
    fillH=0;
    levelProgress=0;
    fillY=675;
  }
}

