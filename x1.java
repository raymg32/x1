//////// MAKE MY OWN CREATURE + HOUSE
//////// GERSHOM RAYMUND0 (CST 112; SOMEDAY IN SEPTEMBER)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 100,150,200 );                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 40,40 );    // sun
  
  
  // Grass
  stroke(0);
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );   
  

      //GRASS LINES
      stroke(0);
      line(250, 250, 260 , 240);
      line(260, 240, 270, 250);
      line(270, 250, 280, 240);
      line(280, 240, 290, 250);
      
  
// tree
  fill(0,255,14);
  triangle( 400,100, 350,250, 450,250 );
  
  // tree trunk 
  fill(255,102,0);
  rect(385, 250, 30,120);
  
    // apple 
  stroke(0);
  fill( 198 , 100 , 102 );
  ellipse( 400, 170 , 10 , 10);
  ellipse(380, 200 , 10, 10);
  ellipse(410, 230, 10 ,10);
  
  
// text
  fill(255);
  text( "A+ PLS...", 200,horizon );
  
// house
     fill(238,89,80);
     stroke(0);
     rect( 100, 150 , 100, 130);

          //roof of the house

          stroke(0);
          fill(75,89,80);
          triangle(100,150,200,150,150,100);

            // door 
            stroke(0);
            fill(20,100,100);
            rect(130 , 230 , 30,50);

              //door knob
              fill(21,206,189);
              ellipse(137,255,10,10);

                                            
// BOTTOM TEXT
  fill(0);
  text( "My Boy ChAR1i3 is just c0d3", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
  //// SHOW:  display the creature at (x,y)

//// charlies head
  stroke(178 , 0 ,255);
  fill(178, 0 , 255);
  ellipse(x + 15 , y , 30 , 30);
  
  // charlies body
  stroke( 178 , 0 , 255);
  fill(178 , 0, 255); 
  rect( x,y, 30,50 ); 
  
  //charlies left eye
  stroke (0 );
  fill(246,255,0);
  ellipse( x+ 5 , y + 10, 5 ,5 );
  
  //charlies right eye
  stroke(0);
  fill(246, 255, 0);
  ellipse( x + 20, y + 10 ,5 ,5);
  
  //charlies mouth
  stroke( 0 ) ;
  fill(255 , 0 , 243);
  ellipse( x + 10 , y + 30 , 10 , 20);
  
  // charlies name ) its under him
  fill(0);
  text( "ChAR1i3", x,y + 70);

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
   
   

