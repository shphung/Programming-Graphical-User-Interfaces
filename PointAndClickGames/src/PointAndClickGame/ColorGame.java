/*********************************************************************
* 
*   File: ColorGame.java
*   Author: Steven Phung & Alex Vargas
*   Class: CS 2450.01 - Programming Graphical User Interfaces
*
*   Assignment: Point and Click Game v.1.3
*   Date last modified: 10/11/2019
*
*   Purpose: This class generates the colored buttons game and
*           handles all the logic.
*
*********************************************************************/
package PointAndClickGame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public class ColorGame extends javax.swing.JFrame {
    
    //Color bank
    private static final String[] COLOR_BANK = { "Red", "Yellow", "Green", "Blue", "Purple" };
    //Randomize order of which colors to choose from
    private String[] colors;
    //Keep track of current color and current word
    private String currentColor, currentWord;
    //Keep track of score, overall score, and how many rounds is played
    private int roundScore, overallScore, maxRounds;

    //Constructor
    public ColorGame(int score) {
        initComponents();
        initToolTips();
        initVariables(score);
        currentDateAndTime();
        randomizeAnswer();
        randomizeButtons();
        bindKeys();
        this.setTitle("Color Game");
        this.setResizable(false);
        this.setVisible(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currentDateAndTime = new javax.swing.JTextField();
        colorGamePanel = new javax.swing.JPanel();
        button1 = new javax.swing.JLabel();
        button2 = new javax.swing.JLabel();
        button3 = new javax.swing.JLabel();
        button4 = new javax.swing.JLabel();
        button5 = new javax.swing.JLabel();
        textColor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));

        currentDateAndTime.setText(" yyyy/mm/dd hh:mm:ss ");

        colorGamePanel.setBackground(new java.awt.Color(255, 255, 255));
        colorGamePanel.setForeground(new java.awt.Color(255, 255, 255));
        colorGamePanel.setMaximumSize(new java.awt.Dimension(600, 400));
        colorGamePanel.setMinimumSize(new java.awt.Dimension(600, 400));
        colorGamePanel.setLayout(null);

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2450project/resources/red.jpg"))); // NOI18N
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1MouseExited(evt);
            }
        });
        colorGamePanel.add(button1);
        button1.setBounds(10, 202, 100, 100);

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2450project/resources/yellow.jpg"))); // NOI18N
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button2MouseExited(evt);
            }
        });
        colorGamePanel.add(button2);
        button2.setBounds(10, 308, 100, 100);

        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2450project/resources/green.jpg"))); // NOI18N
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button3MouseExited(evt);
            }
        });
        colorGamePanel.add(button3);
        button3.setBounds(116, 202, 100, 100);

        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2450project/resources/blue.jpg"))); // NOI18N
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button4MouseExited(evt);
            }
        });
        colorGamePanel.add(button4);
        button4.setBounds(116, 308, 100, 100);

        button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2450project/resources/purple.jpg"))); // NOI18N
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button5MouseExited(evt);
            }
        });
        colorGamePanel.add(button5);
        button5.setBounds(222, 308, 100, 100);

        textColor.setFont(new java.awt.Font("RaysHand", 0, 36)); // NOI18N
        textColor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textColor.setText("PURPLE");
        colorGamePanel.add(textColor);
        textColor.setBounds(220, 25, 140, 55);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colorGamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(468, Short.MAX_VALUE)
                    .addComponent(currentDateAndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colorGamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(currentDateAndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(369, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Methods: button[1-5]MouseEntered
    //Purpose: Change image to indicate a highlight
    private void button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseEntered
        setNewImageButton(button1, 0);
    }//GEN-LAST:event_button1MouseEntered

    //Methods: button[1-5]MouseExited
    //Purpose: Change image to indicate unhighlight
    private void button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseExited
        setImageButton(button1, 0);
    }//GEN-LAST:event_button1MouseExited

    private void button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseEntered
       setNewImageButton(button2, 1);
    }//GEN-LAST:event_button2MouseEntered

    private void button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseExited
        setImageButton(button2, 1);
    }//GEN-LAST:event_button2MouseExited

    private void button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseEntered
        setNewImageButton(button3, 2);
    }//GEN-LAST:event_button3MouseEntered

    private void button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseExited
        setImageButton(button3, 2);
    }//GEN-LAST:event_button3MouseExited

    private void button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseEntered
        setNewImageButton(button4, 3);
    }//GEN-LAST:event_button4MouseEntered

    private void button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseExited
        setImageButton(button4, 3);
    }//GEN-LAST:event_button4MouseExited

    private void button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseEntered
        setNewImageButton(button5, 4);
    }//GEN-LAST:event_button5MouseEntered

    private void button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseExited
        setImageButton(button5, 4);
    }//GEN-LAST:event_button5MouseExited

    //Methods: button[1-5]Clicked
    //Purpose: Update game based on what color was clicked
    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        update(colors[0]);
    }//GEN-LAST:event_button1MouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        update(colors[1]);
    }//GEN-LAST:event_button2MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        update(colors[2]);
    }//GEN-LAST:event_button3MouseClicked

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
        update(colors[3]);
    }//GEN-LAST:event_button4MouseClicked

    private void button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseClicked
        update(colors[4]);
    }//GEN-LAST:event_button5MouseClicked

    //Method: update(String)
    //Purpose: String argument is the color the user picked, if correct we increment the
    //score, then start a new round with new colors and new buttons in different spots.
    //Once the player has completed playing 5 rounds, the color game ends and we switch
    //to the sudoku game.
    private void update(String color) {
        if(maxRounds < 5) {
            if(color.equals(currentColor)) {
                overallScore = overallScore + roundScore;
            }
            maxRounds++;
            randomizeAnswer();
            randomizeButtons();
        }
        if(maxRounds >= 5) {
            new SudokuGame(overallScore);
            ColorGame.this.dispose();
        }
    }
    
    //Method: initVariables()
    //Purpose: Initializes game rounds to 0 and scores
    private void initVariables(int score) {
        roundScore = 100;
        overallScore = score;
        maxRounds = 0;
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
    
    //Method: randomizeAnswer()
    //Purpose: Gets a random color and a random color word from our word bank
    private void randomizeAnswer() {
        Random rng = new Random();
        int rdm = rng.nextInt(5);
        currentColor = COLOR_BANK[rdm];
        rdm = rng.nextInt(5);
        currentWord = COLOR_BANK[rdm];
    }
    
    //Method: randomizeButtons()
    //Purpose: Randomly places buttons in the appropriate window space
    //and also randomly assigns a color to a button
    private void randomizeButtons() {
        int width[] = new int[6];
        int height[] = new int[6];
        colors = new String[5];
        ArrayList<Integer> list = new ArrayList<>();
        
        //[600,400] window is divided into ~6 squares and each button will be
        //placed randomly within a square
        width[0] = getRdm(96) + 5;
        height[0] = getRdm(95) + 5;

        width[1] = getRdm(96) + 5 + 197;
        height[1] = getRdm(95) + 5;
        //Adjusted to avoid JTextField in upper right hand corner
        width[2] = getRdm(96) + 5 + 393;
        height[2] = getRdm(65) + 35;
        
        width[3] = getRdm(96) + 5;
        height[3] = getRdm(95) + 5 + 200;
        
        width[4] = getRdm(96) + 5 + 197;
        height[4] = getRdm(140) + 5 + 155;
        
        width[5] = getRdm(96) + 5 + 393;
        height[5] = getRdm(95) + 5 + 200;
        
        //Place our COLOR_BANK into a list and then shuffle to randomize order
        for(int i = 0; i < 5; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for(int i = 0; i < 5; i++) {
            colors[i] = COLOR_BANK[list.get(i)];
        }
        
        //Buttons are placed and given a color
        button1.setLocation(width[0], height[0]);
        setImageButton(button1, 0);
        textColor.setLocation(width[1], height[1]);
        setTextAndColor();
        button2.setLocation(width[2], height[2]);
        setImageButton(button2, 1);
        button3.setLocation(width[3], height[3]);
        setImageButton(button3, 2);
        button4.setLocation(width[4], height[4]);
        setImageButton(button4, 3);
        button5.setLocation(width[5], height[5]);
        setImageButton(button5, 4);
    }
    
    //Method: setTextAndColor()
    //Purpose: Assigns word and color to our text based on randomizeAnswer()
    private void setTextAndColor() {
        textColor.setText(currentWord);
        switch(currentColor.toUpperCase()) {
            case "RED":
                textColor.setForeground(Color.RED);
                break;
            case "YELLOW":
                textColor.setForeground(Color.YELLOW);
                break;
            case "GREEN":
                textColor.setForeground(Color.GREEN);
                break;
            case "BLUE":
                textColor.setForeground(Color.BLUE);
                break;
            case "PURPLE":
                Color purple = new Color(138, 43, 226);
                textColor.setForeground(purple);
                break;
        }
    }
    
    //Method: setImageButton(button, int)
    //Purpose: Button tells us which button to change and int tells us which
    //color to change to.
    private void setImageButton(JLabel button, int counter) {
        ImageIcon icon;
        switch(colors[counter].toUpperCase()) {
            case "RED":
                icon = new ImageIcon(getClass().getResource("/cs2450project/resources/red.jpg"));
                button.setIcon(icon);
                break;
            case "YELLOW":
                icon = new ImageIcon(getClass().getResource("/cs2450project/resources/yellow.jpg"));
                button.setIcon(icon);
                break;
            case "GREEN":
                icon = new ImageIcon(getClass().getResource("/cs2450project/resources/green.jpg"));
                button.setIcon(icon);
                break;
            case "BLUE":
                icon = new ImageIcon(getClass().getResource("/cs2450project/resources/blue.jpg"));
                button.setIcon(icon);
                break;
            case "PURPLE":
                icon = new ImageIcon(getClass().getResource("/cs2450project/resources/purple.jpg"));
                button.setIcon(icon);
                break;
        }
    }
    
    //Method: setNewImageButton(button, int)
    //Purpose: Button tells us which button to change and int tells us which
    //color to change to. This is to show a highlighted image
    private void setNewImageButton(JLabel button, int counter) {
        ImageIcon icon;
        switch(colors[counter].toUpperCase()) {
            case "RED":
                icon = new ImageIcon(getClass().getResource("/cs2450project/resources/red_tint.jpg"));
                button.setIcon(icon);
                break;
            case "YELLOW":
                icon = new ImageIcon(getClass().getResource("/cs2450project/resources/yellow_tint.jpg"));
                button.setIcon(icon);
                break;
            case "GREEN":
                icon = new ImageIcon(getClass().getResource("/cs2450project/resources/green_tint.jpg"));
                button.setIcon(icon);
                break;
            case "BLUE":
                icon = new ImageIcon(getClass().getResource("/cs2450project/resources/blue_tint.jpg"));
                button.setIcon(icon);
                break;
            case "PURPLE":
                icon = new ImageIcon(getClass().getResource("/cs2450project/resources/purple_tint.jpg"));
                button.setIcon(icon);
                break;
        }
    }

    //Method: getRdm(int)
    //Purpose: Returns a random x or y position based on a given range
    private int getRdm(int range) {
        Random rng = new Random();
        int rdm = rng.nextInt(range);
        return rdm;
    }
    
    //Method: initToolTips()
    //Purpose: Implement tool tips for every component
    private void initToolTips() {
        currentDateAndTime.setToolTipText("Displays current date and time");
        button1.setToolTipText("Click here to choose this button's color");
        button2.setToolTipText("Click here to choose this button's color");
        button3.setToolTipText("Click here to choose this button's color");
        button4.setToolTipText("Click here to choose this button's color");
        button5.setToolTipText("Click here to choose this button's color");
        textColor.setToolTipText("Choose a button based on this text's color");
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
    private javax.swing.JLabel button1;
    private javax.swing.JLabel button2;
    private javax.swing.JLabel button3;
    private javax.swing.JLabel button4;
    private javax.swing.JLabel button5;
    private javax.swing.JPanel colorGamePanel;
    private javax.swing.JTextField currentDateAndTime;
    private javax.swing.JLabel textColor;
    // End of variables declaration//GEN-END:variables
}