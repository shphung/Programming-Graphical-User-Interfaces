/*********************************************************************
* 
*   File: Highscores.java
*   Author: Steven Phung & Alex Vargas
*   Class: CS 2450.01 - Programming Graphical User Interfaces
*
*   Assignment: Point and Click Game v.1.3
*   Date last modified: 10/11/2019
*
*   Purpose: This class generates the high scores from a text file.
*
*********************************************************************/
package PointAndClickGame;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class Highscores extends javax.swing.JFrame {
    
    //Constructor
    public Highscores() {
        initComponents();
        initToolTips();
        bindKeys();
        checkFile();
        loadFile();
        this.setTitle("High Scores");
        this.setResizable(false);
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        highscore1 = new javax.swing.JLabel();
        highscore2 = new javax.swing.JLabel();
        highscore3 = new javax.swing.JLabel();
        highscore4 = new javax.swing.JLabel();
        highscore5 = new javax.swing.JLabel();
        clearList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(11, 28, 71));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));

        backButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("RaysHand", 0, 45)); // NOI18N
        title.setForeground(new java.awt.Color(255, 153, 51));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Highscores!");

        highscore1.setFont(new java.awt.Font("RaysHand", 0, 24)); // NOI18N
        highscore1.setForeground(new java.awt.Color(255, 153, 51));
        highscore1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        highscore1.setText("1.ABC.....000");

        highscore2.setFont(new java.awt.Font("RaysHand", 0, 24)); // NOI18N
        highscore2.setForeground(new java.awt.Color(255, 153, 51));
        highscore2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        highscore2.setText("2.ABC.....000");

        highscore3.setFont(new java.awt.Font("RaysHand", 0, 24)); // NOI18N
        highscore3.setForeground(new java.awt.Color(255, 153, 51));
        highscore3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        highscore3.setText("3.ABC.....000");

        highscore4.setFont(new java.awt.Font("RaysHand", 0, 24)); // NOI18N
        highscore4.setForeground(new java.awt.Color(255, 153, 51));
        highscore4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        highscore4.setText("4.ABC.....000");

        highscore5.setFont(new java.awt.Font("RaysHand", 0, 24)); // NOI18N
        highscore5.setForeground(new java.awt.Color(255, 153, 51));
        highscore5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        highscore5.setText("5.ABC.....000");

        clearList.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        clearList.setText("Clear High Scores");
        clearList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearListActionPerformed(evt);
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearList))
                    .addComponent(highscore1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addComponent(highscore2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addComponent(highscore3, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addComponent(highscore4, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addComponent(highscore5, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(highscore1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(highscore2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(highscore3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(highscore4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(highscore5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    //Method: backButtonActionPerformed()
    //Purpose: Exit program out of the highscores display and back to menu display
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new Menu();
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    //Method: clearListActionPerformed()
    //Purpose: Deletes high scores list
    private void clearListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearListActionPerformed
        deleteFile();
        this.dispose();
        new Highscores();
    }//GEN-LAST:event_clearListActionPerformed

    //Method: loadFile()
    //Purpose:  Loads data from file if there is a file, if there is no file
    //a template file will be made
    public void loadFile() {
        try {
            int counter = 1;
            File scores = new File("highscores.txt");
            Scanner sc = new Scanner(scores);
            //Only read up to 5 lines of the file
            while(counter <= 5 && sc.hasNextLine()) {
                switch (counter) {
                    case 1:
                        highscore1.setText("1." + sc.nextLine());
                        break;
                    case 2:
                        highscore2.setText("2." + sc.nextLine());
                        break;
                    case 3:
                        highscore3.setText("3." + sc.nextLine());
                        break;
                    case 4:
                        highscore4.setText("4." + sc.nextLine());
                        break;
                    case 5:
                        highscore5.setText("5." + sc.nextLine());
                        break;
                    default:
                        break;
                }
                counter++;
            }
            sc.close();
        } catch(FileNotFoundException e) {
            //If we could not find the high score file
            try {
                File scores = new File("highscores.txt");
                scores.createNewFile();
                //Create a high score file with blank data
                BufferedWriter file = new BufferedWriter(new FileWriter("highscores.txt", true));
                for(int i = 1; i <= 5; i++) {
                    file.write("ABC.....000");
                    if(i < 5)
                        file.newLine();
                }
                file.close();
            } catch (IOException ex) {
                System.out.println("File already exists");
            }
        }
    }
    
    //Method: checkFile()
    //Purpose: Checks if the file "temphighscores.txt" exists, we do not want this file
    //so it will be deleted if it exists
    private void checkFile() {
        File checkTempFile = new File("temphighscores.txt");
        if(checkTempFile.exists())
            checkTempFile.delete();
    }
    
    //Method: deleteFile()
    //Purpose: Deletes high scores file
    private void deleteFile() {
        File hsFile = new File("highscores.txt");
        if(hsFile.exists())
            hsFile.delete();
    }
    
    //Method: checkIfHighScore(int)
    //Purpose: Allows user to enter 3 initials to save their score if they have
    //a highscore
    public void checkIfHighScore(int newScore) {
        checkFile();
        try {
            int counter = 0;
            boolean replace = true;
            String newHighScoreLine = "";
            File scores = new File("highscores.txt");
            Scanner sc = new Scanner(scores);

            //Only reading up to 5 lines of the file
            while(counter < 5 && sc.hasNextLine()) {
                
                //Gets the score part of the string
                //ex. ABC.....000, 000 substring is obtained, then typecast as an int
                String oldHighScoreLine = sc.nextLine();
                String scoreInOldHighScoreLine = oldHighScoreLine.substring(8, Math.min(oldHighScoreLine.length(), 11));
                int currentHighScore = Integer.parseInt(scoreInOldHighScoreLine);
                
                //If our new score is better than any old score
                //we replace, but we only replace the lowest possible score
                if(newScore > currentHighScore && replace == true) {
                    
                    //Let user input their initials
                    String highScoreName = JOptionPane.showInputDialog(this.getRootPane(), "You achieved a high score!"
                            + "\nTo save your score, please enter 3 initials: ");
                    
                    //If user hits cancel, no score is saved
                    if(highScoreName == null) {
                        break;
                    //Allow exactly only 3 characters
                    } else if(highScoreName.length() != 3) {
                        do {
                            //If no input, no score is saved
                            if(highScoreName.equals("")) {
                                return;
                            }
                            highScoreName = JOptionPane.showInputDialog(this.getRootPane(), "Please enter 3 initials: ");
                        } while(highScoreName.length() != 3);
                    }
                    newHighScoreLine = highScoreName + "....." + newScore;
                    replace = false;
                    //Update new temp file based on new data
                    updateHighScoresFile(newHighScoreLine);
                    updateHighScoresFile(oldHighScoreLine);
                    counter++;
                } else {
                    updateHighScoresFile(oldHighScoreLine);
                }
                counter++;
            }
            sc.close();
        } catch(FileNotFoundException e) {
        }
        //Delete old datafile and rename new file as old file.
        //New data will now be in 'old' file
        File oldFile = new File("highscores.txt");
        oldFile.delete();
        File newFile = new File("temphighscores.txt");
        newFile.renameTo(oldFile);
    }
    
    //Method: updateHighScoreFile(String)
    //Purpose: Creates a new file with the correct high scores to replace old data
    private void updateHighScoresFile(String text) {
        try {
            BufferedWriter scores = new BufferedWriter(new FileWriter("temphighscores.txt", true));
            scores.append(text);
            scores.newLine();
            scores.close();
        } catch (IOException ex) {
        }
    }
    
    //Method: initToolTips()
    //Purpose: Implement tool tips for every component
    private void initToolTips() {
        backButton.setToolTipText("Click here to go back to main menu");
        clearList.setToolTipText("Click here to clear the high scores");
        title.setToolTipText("High scores!");
        highscore1.setToolTipText("High score #1");
        highscore2.setToolTipText("High score #2");
        highscore3.setToolTipText("High score #3");
        highscore4.setToolTipText("High score #4");
        highscore5.setToolTipText("High score #5");
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
    private javax.swing.JButton clearList;
    private javax.swing.JLabel highscore1;
    private javax.swing.JLabel highscore2;
    private javax.swing.JLabel highscore3;
    private javax.swing.JLabel highscore4;
    private javax.swing.JLabel highscore5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
