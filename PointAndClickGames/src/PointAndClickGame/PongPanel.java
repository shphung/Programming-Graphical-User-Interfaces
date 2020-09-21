/*********************************************************************
* 
*   File: PongPanel.java
*   Author: Steven Phung & Alex Vargas
*   Class: CS 2450.01 - Programming Graphical User Interfaces
*
*   Assignment: Point and Click Game v.1.3
*   Date last modified: 10/11/2019
*
*   Purpose: This class will generate a panel for pong.
* 
*********************************************************************/
package PointAndClickGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PongPanel extends JPanel implements ActionListener, KeyListener {
    
    //Ball
    private Ball ball;
    //Paddles
    private Paddle player1, player2;
    //Timer for repaint
    private Timer timer;
    //Delay on timer
    private final int delay = 10;
    //Movement keys
    private final int player1MoveUp = 0, player1MoveDown = 1, player2MoveUp = 2, player2MoveDown = 3;
    private boolean keys[];
    
    //Constructor
    PongPanel() {
        startNewGame();
    }

    //Method: startNewGame()
    //Purpose: Pseudo-constructor, initializes everything
    //As a method, allows call whenever to restart pong
    private void startNewGame() {
        initListener();
        setBackground(Color.BLACK);
        ball = new Ball();
        player1 = new Paddle(1);
        player2 = new Paddle(2);
        addKeyListener(this);
        setFocusable(true);
        timer = new Timer(delay, this);
        setDoubleBuffered(true);
        keys = new boolean[]{ false, false, false, false };
    }

    //Method: initListener()
    //Purpose: Adds listener for space bar getting pressed
    private void initListener() {
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                spaceKeyTyped(e);
            }
        });
    }

    //Method: spaceKeyTyped()
    //Purpose: Starts game when space bar is pressed
    private void spaceKeyTyped(java.awt.event.KeyEvent e) {
        if(e.getKeyChar() == KeyEvent.VK_SPACE) {
            timer.start();
        }
    }

    //Method: actionPerformed()
    //Purpose: constantly repainting JPanel
    @Override
    public void actionPerformed(ActionEvent e) {
        //Move ball
        ball.move();
        checkCollision();
        //Move player
        if(keys[player1MoveUp]) {
            player1.moveUp();
        }
        if(keys[player1MoveDown]) {
            player1.moveDown();
        }
        if(keys[player2MoveUp]) {
            player2.moveUp();
        }
        if(keys[player2MoveDown]) {
            player2.moveDown();
        }
        repaint();
    }

    //Method: checkCollision()
    //Purpose: Cross checks x and y values for paddles and ball, switches values accordinly
    public void checkCollision() {
        //If ball touches player 1's paddle, reverse ball's x value and continue
        //else if ball moves beyond player 1's paddle, stop, update score, and restart
        // + 5 is to adjust for radius of ball, allowing an edge hit
        if(ball.x < (player1.x + player1.width)) {
            if((ball.y > (player1.y + 5)) && (ball.y < (player1.y + player1.height + 5))) {
                ball.reverseX();
            } else {
                timer.stop();
                PongGame.updatePlayer2Score();
                startNewGame();
            }
        }

        //If ball touches player 2's paddle, reverse ball's x value and continue
        //else if ball moves beyond player 2's paddle, stop, update score, and restart
        // + 5 is to adjust for radius of ball, allowing an edge hit
        if(ball.x > (player2.x - player2.width)) {
            if((ball.y > (player2.y + 5)) && (ball.y < (player2.y + player2.height + 5))) {
                ball.reverseX();
            } else {
                timer.stop();
                PongGame.updatePlayer1Score();
                startNewGame();
            }
        }

        //Reverse y value whenever ball touches the top or bottom of the screen
        if(ball.y < 0 || ball.y > 390) {
            ball.reverseY();
        }
    }

    //Method: paintComponent(Graphics g)
    //Purpose: paints ball and paddles
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBall(g);
        drawPaddles(g);
    }

    //Method: drawBall(Graphics g)
    //Purpose: Paints the ball
    private void drawBall(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval((int)ball.x, (int)ball.y, ball.diameter, ball.diameter);
        Toolkit.getDefaultToolkit().sync();
    }

    //Method: drawPaddles(Graphics g)
    //Purpose: Paints both paddles
    private void drawPaddles(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(player1.x, player1.y, player1.width, player1.height);
        g.fillRect(player2.x, player2.y, player2.width, player2.height);
        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP) {
            keys[player2MoveUp] = true;
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            keys[player2MoveDown] = true;
        }
        if(e.getKeyCode() == KeyEvent.VK_W) {
            keys[player1MoveUp] = true;
        }
        if(e.getKeyCode() == KeyEvent.VK_S) {
            keys[player1MoveDown] = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP) {
            keys[player2MoveUp] = false;
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            keys[player2MoveDown] = false;
        }
        if(e.getKeyCode() == KeyEvent.VK_W) {
            keys[player1MoveUp] = false;
        }
        if(e.getKeyCode() == KeyEvent.VK_S) {
            keys[player1MoveDown] = false;
        }
    }
}
