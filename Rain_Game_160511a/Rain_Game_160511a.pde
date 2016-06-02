import ddf.minim.*;
//water fill isnt working if rain misses the first time
Minim minim;
AudioSample sound;
PImage ireland;
int yDrop = 0;
int speed = 2;
int xDrop = 50;
int Score = 0;
int levelProgress = 0;
int level = 1;
int fillY = 600;
int fillH = 0;
void setup() {
  size(700, 700);
  ireland = loadImage("RainCloud.jpeg");
  minim = new Minim (this);
  sound = minim.loadSample("waterDrop.aiff");
}
void draw()
{
//missing the drop
  background(ireland);
  textSize(25);
  text("Score:"+Score, 10, 40);
  text("Level:"+level, 10, 70);
  fill(100, 150, 200);
  noStroke();
  ellipse(xDrop, yDrop+=speed, 4, 10);
  fill(100, 200, 150);
  if (yDrop>=700) {
    yDrop=0;
    xDrop=(int)random(700);
    Score=0;
    fillY=675;
    fillH=0;
    levelProgress=0;
    level=0;
    speed=2;
    sound.trigger();
  }
//getting a point
  if (yDrop>=550) {
    if (xDrop>=mouseX) {
      if (xDrop<=mouseX+50) {
        fill(100, 150, 200);
        yDrop=0;
        xDrop=(int)random(200);
        Score++;
        levelProgress++;
        fillY-=2;
        fillH+=2;
      }
    }
  }
  //bucket and water filling
  fill(100, 200, 150);
  rect(mouseX, 550, 50, 50);//bucket
  fill(100, 150, 200);
  rect(mouseX, fillY, 50, fillH);//water

//next level
  if (levelProgress==25) {
    level++;
    speed++;
    fillH=0;
    levelProgress=0;
    fillY=600;
  }
}

