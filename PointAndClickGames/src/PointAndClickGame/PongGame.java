/*********************************************************************
* 
*   File: PongGame.java
*   Author: Steven Phung & Alex Vargas
*   Class: CS 2450.01 - Programming Graphical User Interfaces
*
*   Assignment: Point and Click Game v.1.3
*   Date last modified: 10/11/2019
*
*   Purpose: This class will generate a frame for a game of pong.
* 
*********************************************************************/
package PointAndClickGame;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PongGame extends javax.swing.JFrame {
    
    //Player scores
    public static int p1Score, p2Score;
    //Timer for score checker
    private Timer scoreTimer;

    //Constructor
    public PongGame() {
        p1Score = 0; p2Score = 0;
        initComponents();
        currentDateAndTime();
        initToolTips();
        bindKeys();
        checkScore();
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new PongPanel();
        currentDateAndTime = new javax.swing.JTextField();
        pongTitle = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        player1Score = new javax.swing.JLabel();
        player2Score = new javax.swing.JLabel();
        quitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));

        currentDateAndTime.setText(" dd/mm/yyyy hh:mm:ss ");

        pongTitle.setFont(new java.awt.Font("RaysHand", 0, 36)); // NOI18N
        pongTitle.setForeground(new java.awt.Color(255, 153, 102));
        pongTitle.setText("Pong");

        player1.setFont(new java.awt.Font("RaysHand", 0, 14)); // NOI18N
        player1.setForeground(new java.awt.Color(255, 153, 102));
        player1.setText("Player 1 Score");

        player2.setFont(new java.awt.Font("RaysHand", 0, 14)); // NOI18N
        player2.setForeground(new java.awt.Color(255, 153, 102));
        player2.setText("Player 2 Score");

        player1Score.setFont(new java.awt.Font("RaysHand", 0, 24)); // NOI18N
        player1Score.setForeground(new java.awt.Color(255, 0, 0));
        player1Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player1Score.setText("0");

        player2Score.setFont(new java.awt.Font("RaysHand", 0, 24)); // NOI18N
        player2Score.setForeground(new java.awt.Color(255, 0, 0));
        player2Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player2Score.setText("0");

        quitButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(pongTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(currentDateAndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(player1Score, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(390, 390, 390)
                        .addComponent(player2Score, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(quitButton)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentDateAndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pongTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1)
                    .addComponent(player2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player2Score)
                    .addComponent(player1Score))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(quitButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Method: quitButtonActionPerformed
    //Purpose: Returns to main menu
    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        new Menu();
        this.dispose();
    }//GEN-LAST:event_quitButtonActionPerformed
    
    //Method: updatePlayer1Score()
    //Purpose: Updates player 1 score and text color
    public static void updatePlayer1Score() {
        //Update and set score
        p1Score = p1Score + 10;
        player1Score.setText(Integer.toString(p1Score));
        
        //Color text
        if(p1Score >= 0 && p1Score <= 30) {
            player1Score.setForeground(Color.RED);
        } else if(p1Score >= 31 && p1Score <= 50) {
            player1Score.setForeground(Color.ORANGE);
        } else if(p1Score >= 51 && p1Score <= 80) {
            player1Score.setForeground(Color.YELLOW);
        } else if(p1Score >= 81 && p1Score <= 100) {
            player1Score.setForeground(Color.GREEN);
        }
    }
    
    //Method: updatePlayer2Score()
    //Purpose: Updates player 2 score and text color
    public static void updatePlayer2Score() {
        //Update and set score
        p2Score = p2Score + 10;
        player2Score.setText(Integer.toString(p2Score));
        
        //Color text
        if(p2Score >= 0 && p2Score <= 30) {
            player2Score.setForeground(Color.RED);
        } else if(p2Score >= 31 && p2Score <= 50) {
            player2Score.setForeground(Color.ORANGE);
        } else if(p2Score >= 51 && p2Score <= 80) {
            player2Score.setForeground(Color.YELLOW);
        } else if(p2Score >= 81 && p2Score <= 100) {
            player2Score.setForeground(Color.GREEN);
        }
    }

    //Method: checkScore()
    //Purpose: Oonce 100 points is reached the game will end
    private void checkScore() {
        scoreTimer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //End game when score = 100
                if(p1Score == 100) {
                    scoreTimer.stop();
                    PongGame.this.dispose();
                    new EndPage(1, p1Score);
                } else if(p2Score == 100) {
                    scoreTimer.stop();
                    PongGame.this.dispose();
                    new EndPage(2, p2Score);
                }
            }
        });
        scoreTimer.setRepeats(true);
        scoreTimer.start();
    }
    
    //Method: currentDateAndTime()
    //Purpose: Creates a thread that runs and displays current date and time.
    //Repeated every second.
    private void currentDateAndTime() {
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" dd/mm/yyyy hh:mm:ss ");
                LocalDateTime now = LocalDateTime.now();
                currentDateAndTime.setText(dtf.format(now));
            }
        });
        timer.setInitialDelay(0);
        timer.start();
    }
    
    //Method: initToolTips()
    //Purpose: Implements tool tips for every component
    private void initToolTips() {
        currentDateAndTime.setToolTipText("Displays current date and time");
        pongTitle.setToolTipText("Game of Pong");
        player1.setToolTipText("Player 1's score");
        player1Score.setToolTipText("Player 1's score");
        player2.setToolTipText("Player 2's score");
        player2Score.setToolTipText("Player 2's score");
        quitButton.setToolTipText("Quit and return to main menu");
    }
    
    //Method: bindKeys()
    //Purpose: Binds Escape key to exit program and F1 to show info
    private void bindKeys() {
        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
            KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "EXIT");
        rootPane.getActionMap().put("EXIT", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
            KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "popUpDisplay");
        rootPane.getActionMap().put("popUpDisplay", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Names & Bronco #s:\n"
                        + "Steven Phung 010433202\n"
                        + "Alex Vargas 011633258\n"
                        + "Team Name: //temporary fix\n"
                        + "Term: Fall Semester 2019");
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField currentDateAndTime;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel player1;
    private static javax.swing.JLabel player1Score;
    private javax.swing.JLabel player2;
    private static javax.swing.JLabel player2Score;
    private javax.swing.JLabel pongTitle;
    private javax.swing.JButton quitButton;
    // End of variables declaration//GEN-END:variables
}