/*********************************************************************
* 
*   File: EndPage.java
*   Author: Steven Phung & Alex Vargas
*   Class: CS 2450.01 - Programming Graphical User Interfaces
*
*   Assignment: Point and Click Game v.1.3
*   Date last modified: 10/11/2019
*
*   Purpose: This class generates the end page and relevant scores.
*
*********************************************************************/
package PointAndClickGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public class EndPage extends javax.swing.JFrame {

    //Constructor
    public EndPage(int score) {
        initComponents();
        initToolTips();
        display(score);
        checkScore(score);
        bindKeys();
        this.setTitle("End Page");
        this.setResizable(false);
        this.setVisible(true);
    }
    
    //Modified Constructor for pong
    //Takes in player and score
    public EndPage(int playerNumber, int score) {
        initComponents();
        initToolTips();
        display(playerNumber, score);
        bindKeys();
        this.setTitle("End Page");
        this.setResizable(false);
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(11, 28, 71));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));

        title.setFont(new java.awt.Font("RaysHand", 0, 45)); // NOI18N
        title.setForeground(new java.awt.Color(255, 153, 51));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Game Over!");

        score.setFont(new java.awt.Font("RaysHand", 0, 24)); // NOI18N
        score.setForeground(new java.awt.Color(255, 204, 51));
        score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score.setText("Your Score: #!");

        backButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(score, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(37, 37, 37)
                .addComponent(score)
                .addGap(117, 117, 117)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Method: backButtonActionPerformed
    //Purpose: This method takes us back to the menu.
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new Menu();
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    //Method: display(int player, int scoreIn)
    //Purpose: Displays player who won pong
    private void display(int player, int scoreIn) {
        score.setText("Player " + player + " has won with a score of: " + scoreIn + "!");
    }
    
    //Method: display()
    //Purpose: Displays the correct information.
    //If game was won, text will display "You won!" instead of "Game Over!"
    private void display(int scoreIn) {
        score.setText("Your Score: " + scoreIn + "!");
    }
    
    //Method: checkScore(int)
    //Purpose: Checks to see if the user got a highscore
    private void checkScore(int score) {
        Timer timer = new Timer(0, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Highscores hs = new Highscores();
                hs.setVisible(false);
                hs.loadFile();
                hs.checkIfHighScore(score);
                hs.dispose();
            }
        });
        timer.setInitialDelay(1000);
        timer.setRepeats(false);
        timer.start();
    }

    //Method: initToolTips()
    //Purpose: Implement tool tips for every component
    private void initToolTips() {
        title.setToolTipText("Game over!");
        score.setToolTipText("Your score this session");
        backButton.setToolTipText("Click here to go back to the main menu");
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
    private javax.swing.JButton backButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel score;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
