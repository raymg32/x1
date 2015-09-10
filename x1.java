//////// Change the scene up
/////Gershom Raymundo (CST 112;someday in september 2015)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640, 480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 0, 215, 255 );                // sky
  fill( 255, 255, 0 );
  ellipse( width*3/4, height/8, 40, 40 );    // sun
  // Grass
  fill( 100, 200, 100 );
  rect( 0, horizon, width, height*3/4 );      // grass


  /* INSERT YOUR CODE HERE! */
  //roof of the house
  fill(250, 0, 246);
  triangle(200, 200 , 250,100, 300,200);
  //add the body of the house
  fill(250,238,0);
  rect(200,200,100,100);
  //door of the house
  fill(3,0,250);
  rect(235,250,30,50);
  //door knob
  fill(209,130,114);
  ellipse(243,279,10,10);
   // tree leaf
   fill(255, 170, 0);
  triangle( 70, 130, 30, 200, 100, 200  ); 
  //tree body
  fill(62 , 43, 4);
  rect( 60 , 200 , 10 , 70);
  fill(0);
  text( " A+   PLS . . .", 400, horizon );

  fill(255);
  text( "My name is Mud", 10, height-20 );                                          

  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;

  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  fill(255, 0, 0); 
  rect( x, y, 30, 50 );        /* REPLACE THIS WITH YOUR OWN CODE! */
  text( "Fred", x, y );
}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}



