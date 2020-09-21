/*********************************************************************
* 
*   File: Paddle.java
*   Author: Steven Phung & Alex Vargas
*   Class: CS 2450.01 - Programming Graphical User Interfaces
*
*   Assignment: Point and Click Game v.1.3
*   Date last modified: 10/11/2019
*
*   Purpose: This class holds the data needed for a paddle
* 
*********************************************************************/
package PointAndClickGame;

public class Paddle {
    
    //Height and width
    protected int height, width;
    //x and y position of paddle
    protected int x, y;
    //How fast the paddle can move
    private final int moveSpeed = 3;

    //Constructor based on which player
    Paddle(int playerNumber) {
        width = 10;
        height = 60;
        //Left paddle
        if(playerNumber == 1) {
            x = 100 + 10;
        //Right paddle
        } else if(playerNumber == 2) {
            x = 100 + 400 - 35;
        }
        y = (300 / 2);
    }

    //Method: moveUp()
    //Purpose: Moves paddle up y amount based on moveSpeed
    public void moveUp() {
        int tempy = y;
        tempy = tempy - moveSpeed;
        //Checks if moving paddle will result in going off panel
        //If not, change paddle position
        if(tempy > 0)
            y = y - moveSpeed;
    }

    //Method: moveDown()
    //Purpose: Moves paddle down y amount based on moveSpeed
    public void moveDown() {
        int tempy = y;
        tempy = tempy + moveSpeed;
        //Checks if moving paddle will result in going off panel
        //If not, change paddle position
        if(tempy < 340)
            y = y + moveSpeed;
    }
}
