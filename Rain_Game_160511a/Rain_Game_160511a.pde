//drop properties
int yDrop = 0;
int speed = 3;
int xDrop = 50;
boolean missed = false;

//game properties
int levelProgress = 0;
int levelGoal = 5;

int Score = 0;
int level = 1;

//bucket properties
int bucketPos = 600;
int bucketSize = 50;
int bucketTop = bucketPos-bucketSize;


void drawBucket(){
  float fillRate = (levelProgress / float(levelGoal));
  int fillH = round(bucketSize * fillRate);
  int fillY = bucketPos - fillH;
  
  fill(200, 150, 150);
  rect(mouseX, bucketTop, bucketSize, bucketSize); //bucket
  
  fill(100, 150, 200);
  rect(mouseX, fillY, bucketSize, fillH); //water
}

void resetDrop() {
  yDrop=0;
  xDrop=(int)random(700);
  missed = false;
}

void setup() {
  size(700, 700);
}

void draw()
{
  //creating the board
  background(50, 50, 50);
  textSize(25);
  text("Score:"+Score, 10, 40);
  text("Level:"+level, 10, 70);
  fill(100, 150, 200);
  noStroke();

  //drop
  ellipse(xDrop, yDrop+=speed, 8, 14);
  fill(100, 200, 150);

  //reseting the game(failing)
  if (yDrop>= 700) {
    resetDrop();
    Score=0;
    levelProgress=0;
    level=1;
    speed=3;
  }
  //getting a point
  //if the drop is below the top of the bucket
  if (yDrop>=bucketTop) {
    //checking to see if we have missed it yet
    if (missed == false) {
      //checking if its in the bucket
      if (xDrop>=mouseX && xDrop<=mouseX+bucketSize) {
        resetDrop();
        Score++;
        levelProgress++;
      } else {
        missed = true;
      }
    }
  }
  
  //bucket and water filling
  drawBucket();

  //next level
  if (levelProgress==levelGoal) {
    level++;
    speed++;
    levelProgress=0;
  }
}





