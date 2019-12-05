import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) 
  {
    //Refer back to your Runestone academy book as needed.
    //Instantiate the world. The world should be 220x220.
    
    //Instantiate a turtle. Name it as you wish.

    /*Have your turtle make 4 boxes in the world. The boxes should be in a 2x2 grid. Similar to this:
     ___ ___ 
    |   |   |
    |___|___|
    |   |   |
    |___|___|

    */


    
    //Finally, set the world to be visible with a boolean. Ex: worldName.setVisible(the proper boolean);
    //I used World class to make a new world called one, and I put the turtle in that world
    World one = new World(200, 200);
    Turtle Bob = new Turtle(one);
    int move = 50;
    int dMove = (move * 2);
    int x = 100;
    int y = 50;
    int yTwo = 100;
    double oneEighty = 180;
    Bob.forward(move);
    Bob.turnLeft();
    Bob.forward(move);
    Bob.turnLeft();
    Bob.forward(dMove);
    Bob.turnLeft();
    Bob.forward(dMove);
    Bob.turnLeft();
    Bob.forward(move);
    Bob.turnLeft();
    Bob.forward(dMove);
    Bob.penUp();
    Bob.moveTo(x, y);
    Bob.turn(oneEighty);
    Bob.penDown();
    Bob.forward(move);
    Bob.turnRight();
    Bob.forward(move);
    Bob.penUp();
    Bob.moveTo(x, yTwo);
    Bob.penDown();
    Bob.forward(move);
    one.setVisible(true);
    //I used the methods that come with turtle class to make a 4x4 grid
  }
}
