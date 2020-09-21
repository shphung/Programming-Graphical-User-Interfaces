/*********************************************************************
* 
*   File: Ball.java
*   Author: Steven Phung & Alex Vargas
*   Class: CS 2450.01 - Programming Graphical User Interfaces
*
*   Assignment: Point and Click Game v.1.3
*   Date last modified: 10/11/2019
*
*   Purpose: This class holds all of the ball logic.
*
*********************************************************************/
package PointAndClickGame;

import java.util.Random;

public class Ball {
    //x and y position on panel
    protected float x, y;
    //Diameter of the ball
    protected int diameter;
    //Movement speed of the ball
    protected float xMove, yMove;

    //Ball Constructor
    Ball() {
        Random rng = new Random();
        
        //Randomly generate int 0 or 1
        int leftOrRight = rng.nextInt(2);
        //Randomly generate float anywhere from 0 to 1
        float moveSpeedY = rng.nextFloat() * (2 - 0);
        
        //Left or right is a constant speed of 2 pixels
        if(leftOrRight == 0) {
            xMove = 2;
        } else if(leftOrRight == 1) {
            xMove = -2;
        }
        //Up or down based on generated float
        int upOrDown = rng.nextInt(2);
        if(upOrDown == 0) {
            yMove = moveSpeedY;
        } else if(upOrDown == 1) {
            yMove = -moveSpeedY;
        }
        
        //Diameter is 10
        diameter = 10;
        
        //Set ball inital location to be in the center
        x = (600 / 2) - 10;
        y = (400 / 2) - 25;
    }

    //Method: move()
    //Purpose: Move in direction of generated number
    public void move() {
        x = x + xMove;
        y = y + yMove;
    }

    //Method: reverseX()
    //Purpose: invert x to "turn ball around" left or right
    public void reverseX() {
        xMove = -xMove;
    }

    //Method: reverseY()
    //Purpose: invert y to "turn ball around" up or down
    public void reverseY() {
        yMove = -yMove;
    }
}
