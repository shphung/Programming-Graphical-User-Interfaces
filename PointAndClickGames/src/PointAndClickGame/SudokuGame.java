/*********************************************************************
* 
*   File: SudokuGame.java
*   Author: Steven Phung & Alex Vargas
*   Class: CS 2450.01 - Programming Graphical User Interfaces
*
*   Assignment: Point and Click Game v.1.3
*   Date last modified: 10/11/2019
*
*   Purpose: This class generates a fixed game of sudoku and
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
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public class SudokuGame extends javax.swing.JFrame {
    
    //Array of JTextFields so we can quickly sort through all our JTextField cells
    //instead of having to individually call every JTextField
    private JTextField[] listOfCells;
    //Array that keeps track of our hard coded answer key
    private int[] answerKey;
    //Boolean array that indicates which cells are correct
    private boolean[] correct;
    //Keep track of current game score and overall game score.
    private int gameScore, overallScore;
    
    //Constructor
    public SudokuGame(int score) {
        initComponents();
        initVariables(score);
        initArrayOfCells();
        initToolTips();
        currentDateAndTime();
        bindKeys();
        this.setTitle("Sudoku Game");
        this.setResizable(false);
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        gameName = new javax.swing.JLabel();
        currentDateAndTime = new javax.swing.JTextField();
        sudokuPanel = new javax.swing.JPanel();
        box1 = new javax.swing.JPanel();
        cell1 = new javax.swing.JPanel();
        num1 = new javax.swing.JTextField();
        cell2 = new javax.swing.JPanel();
        num2 = new javax.swing.JTextField();
        cell3 = new javax.swing.JPanel();
        num3 = new javax.swing.JTextField();
        cell4 = new javax.swing.JPanel();
        num4 = new javax.swing.JTextField();
        cell5 = new javax.swing.JPanel();
        num5 = new javax.swing.JTextField();
        cell6 = new javax.swing.JPanel();
        num6 = new javax.swing.JTextField();
        cell7 = new javax.swing.JPanel();
        num7 = new javax.swing.JTextField();
        cell8 = new javax.swing.JPanel();
        num8 = new javax.swing.JTextField();
        cell9 = new javax.swing.JPanel();
        num9 = new javax.swing.JTextField();
        box2 = new javax.swing.JPanel();
        cell10 = new javax.swing.JPanel();
        num10 = new javax.swing.JTextField();
        cell11 = new javax.swing.JPanel();
        num11 = new javax.swing.JTextField();
        cell12 = new javax.swing.JPanel();
        num12 = new javax.swing.JTextField();
        cell13 = new javax.swing.JPanel();
        num13 = new javax.swing.JTextField();
        cell14 = new javax.swing.JPanel();
        num14 = new javax.swing.JTextField();
        cell15 = new javax.swing.JPanel();
        num15 = new javax.swing.JTextField();
        cell16 = new javax.swing.JPanel();
        num16 = new javax.swing.JTextField();
        cell17 = new javax.swing.JPanel();
        num17 = new javax.swing.JTextField();
        cell18 = new javax.swing.JPanel();
        num18 = new javax.swing.JTextField();
        box3 = new javax.swing.JPanel();
        cell19 = new javax.swing.JPanel();
        num19 = new javax.swing.JTextField();
        cell20 = new javax.swing.JPanel();
        num20 = new javax.swing.JTextField();
        cell21 = new javax.swing.JPanel();
        num21 = new javax.swing.JTextField();
        cell22 = new javax.swing.JPanel();
        num22 = new javax.swing.JTextField();
        cell23 = new javax.swing.JPanel();
        num23 = new javax.swing.JTextField();
        cell24 = new javax.swing.JPanel();
        num24 = new javax.swing.JTextField();
        cell25 = new javax.swing.JPanel();
        num25 = new javax.swing.JTextField();
        cell26 = new javax.swing.JPanel();
        num26 = new javax.swing.JTextField();
        cell27 = new javax.swing.JPanel();
        num27 = new javax.swing.JTextField();
        box4 = new javax.swing.JPanel();
        cell28 = new javax.swing.JPanel();
        num28 = new javax.swing.JTextField();
        cell29 = new javax.swing.JPanel();
        num29 = new javax.swing.JTextField();
        cell30 = new javax.swing.JPanel();
        num30 = new javax.swing.JTextField();
        cell31 = new javax.swing.JPanel();
        num31 = new javax.swing.JTextField();
        cell32 = new javax.swing.JPanel();
        num32 = new javax.swing.JTextField();
        cell33 = new javax.swing.JPanel();
        num33 = new javax.swing.JTextField();
        cell34 = new javax.swing.JPanel();
        num34 = new javax.swing.JTextField();
        cell35 = new javax.swing.JPanel();
        num35 = new javax.swing.JTextField();
        cell36 = new javax.swing.JPanel();
        num36 = new javax.swing.JTextField();
        box5 = new javax.swing.JPanel();
        cell37 = new javax.swing.JPanel();
        num37 = new javax.swing.JTextField();
        cell38 = new javax.swing.JPanel();
        num38 = new javax.swing.JTextField();
        cell39 = new javax.swing.JPanel();
        num39 = new javax.swing.JTextField();
        cell40 = new javax.swing.JPanel();
        num40 = new javax.swing.JTextField();
        cell41 = new javax.swing.JPanel();
        num41 = new javax.swing.JTextField();
        cell42 = new javax.swing.JPanel();
        num42 = new javax.swing.JTextField();
        cell43 = new javax.swing.JPanel();
        num43 = new javax.swing.JTextField();
        cell44 = new javax.swing.JPanel();
        num44 = new javax.swing.JTextField();
        cell45 = new javax.swing.JPanel();
        num45 = new javax.swing.JTextField();
        box6 = new javax.swing.JPanel();
        cell46 = new javax.swing.JPanel();
        num46 = new javax.swing.JTextField();
        cell47 = new javax.swing.JPanel();
        num47 = new javax.swing.JTextField();
        cell48 = new javax.swing.JPanel();
        num48 = new javax.swing.JTextField();
        cell49 = new javax.swing.JPanel();
        num49 = new javax.swing.JTextField();
        cell50 = new javax.swing.JPanel();
        num50 = new javax.swing.JTextField();
        cell51 = new javax.swing.JPanel();
        num51 = new javax.swing.JTextField();
        cell52 = new javax.swing.JPanel();
        num52 = new javax.swing.JTextField();
        cell53 = new javax.swing.JPanel();
        num53 = new javax.swing.JTextField();
        cell54 = new javax.swing.JPanel();
        num54 = new javax.swing.JTextField();
        box7 = new javax.swing.JPanel();
        cell55 = new javax.swing.JPanel();
        num55 = new javax.swing.JTextField();
        cell56 = new javax.swing.JPanel();
        num56 = new javax.swing.JTextField();
        cell57 = new javax.swing.JPanel();
        num57 = new javax.swing.JTextField();
        cell58 = new javax.swing.JPanel();
        num58 = new javax.swing.JTextField();
        cell59 = new javax.swing.JPanel();
        num59 = new javax.swing.JTextField();
        cell60 = new javax.swing.JPanel();
        num60 = new javax.swing.JTextField();
        cell61 = new javax.swing.JPanel();
        num61 = new javax.swing.JTextField();
        cell62 = new javax.swing.JPanel();
        num62 = new javax.swing.JTextField();
        cell63 = new javax.swing.JPanel();
        num63 = new javax.swing.JTextField();
        box8 = new javax.swing.JPanel();
        cell64 = new javax.swing.JPanel();
        num64 = new javax.swing.JTextField();
        cell65 = new javax.swing.JPanel();
        num65 = new javax.swing.JTextField();
        cell66 = new javax.swing.JPanel();
        num66 = new javax.swing.JTextField();
        cell67 = new javax.swing.JPanel();
        num67 = new javax.swing.JTextField();
        cell68 = new javax.swing.JPanel();
        num68 = new javax.swing.JTextField();
        cell69 = new javax.swing.JPanel();
        num69 = new javax.swing.JTextField();
        cell70 = new javax.swing.JPanel();
        num70 = new javax.swing.JTextField();
        cell71 = new javax.swing.JPanel();
        num71 = new javax.swing.JTextField();
        cell72 = new javax.swing.JPanel();
        num72 = new javax.swing.JTextField();
        box9 = new javax.swing.JPanel();
        cell73 = new javax.swing.JPanel();
        num73 = new javax.swing.JTextField();
        cell74 = new javax.swing.JPanel();
        num74 = new javax.swing.JTextField();
        cell75 = new javax.swing.JPanel();
        num75 = new javax.swing.JTextField();
        cell76 = new javax.swing.JPanel();
        num76 = new javax.swing.JTextField();
        cell77 = new javax.swing.JPanel();
        num77 = new javax.swing.JTextField();
        cell78 = new javax.swing.JPanel();
        num78 = new javax.swing.JTextField();
        cell79 = new javax.swing.JPanel();
        num79 = new javax.swing.JTextField();
        cell80 = new javax.swing.JPanel();
        num80 = new javax.swing.JTextField();
        cell81 = new javax.swing.JPanel();
        num81 = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        cheatButton = new javax.swing.JButton();
        scoreTag = new javax.swing.JLabel();
        score = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));

        mainPanel.setBackground(new java.awt.Color(11, 28, 71));
        mainPanel.setMaximumSize(new java.awt.Dimension(600, 400));
        mainPanel.setMinimumSize(new java.awt.Dimension(600, 400));

        gameName.setFont(new java.awt.Font("RaysHand", 0, 24)); // NOI18N
        gameName.setForeground(new java.awt.Color(255, 153, 51));
        gameName.setText("Sudoku");

        currentDateAndTime.setText(" yyyy/mm/dd hh:mm:ss ");

        sudokuPanel.setBackground(new java.awt.Color(255, 255, 255));
        sudokuPanel.setMaximumSize(new java.awt.Dimension(360, 360));
        sudokuPanel.setMinimumSize(new java.awt.Dimension(360, 360));
        sudokuPanel.setPreferredSize(new java.awt.Dimension(360, 360));
        sudokuPanel.setLayout(new java.awt.GridBagLayout());

        box1.setMaximumSize(new java.awt.Dimension(120, 120));
        box1.setMinimumSize(new java.awt.Dimension(120, 120));
        box1.setLayout(new java.awt.GridBagLayout());

        cell1.setBackground(new java.awt.Color(255, 255, 255));
        cell1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell1.setMaximumSize(new java.awt.Dimension(40, 40));
        cell1.setMinimumSize(new java.awt.Dimension(40, 40));
        cell1.setPreferredSize(new java.awt.Dimension(40, 40));

        num1.setEditable(false);
        num1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num1.setText("8");
        num1.setMaximumSize(new java.awt.Dimension(35, 35));
        num1.setMinimumSize(new java.awt.Dimension(35, 35));
        num1.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell1Layout = new javax.swing.GroupLayout(cell1);
        cell1.setLayout(cell1Layout);
        cell1Layout.setHorizontalGroup(
            cell1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell1Layout.createSequentialGroup()
                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell1Layout.setVerticalGroup(
            cell1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell1Layout.createSequentialGroup()
                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box1.add(cell1, new java.awt.GridBagConstraints());

        cell2.setBackground(new java.awt.Color(255, 255, 255));
        cell2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell2.setMaximumSize(new java.awt.Dimension(40, 40));
        cell2.setMinimumSize(new java.awt.Dimension(40, 40));

        num2.setBackground(new java.awt.Color(240, 240, 240));
        num2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num2.setMaximumSize(new java.awt.Dimension(35, 35));
        num2.setMinimumSize(new java.awt.Dimension(35, 35));
        num2.setPreferredSize(new java.awt.Dimension(35, 35));
        num2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell2Layout = new javax.swing.GroupLayout(cell2);
        cell2.setLayout(cell2Layout);
        cell2Layout.setHorizontalGroup(
            cell2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell2Layout.createSequentialGroup()
                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell2Layout.setVerticalGroup(
            cell2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell2Layout.createSequentialGroup()
                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box1.add(cell2, new java.awt.GridBagConstraints());

        cell3.setBackground(new java.awt.Color(255, 255, 255));
        cell3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell3.setMaximumSize(new java.awt.Dimension(40, 40));
        cell3.setMinimumSize(new java.awt.Dimension(40, 40));

        num3.setBackground(new java.awt.Color(240, 240, 240));
        num3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num3.setMaximumSize(new java.awt.Dimension(35, 35));
        num3.setMinimumSize(new java.awt.Dimension(35, 35));
        num3.setPreferredSize(new java.awt.Dimension(35, 35));
        num3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell3Layout = new javax.swing.GroupLayout(cell3);
        cell3.setLayout(cell3Layout);
        cell3Layout.setHorizontalGroup(
            cell3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell3Layout.createSequentialGroup()
                .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell3Layout.setVerticalGroup(
            cell3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell3Layout.createSequentialGroup()
                .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box1.add(cell3, new java.awt.GridBagConstraints());

        cell4.setBackground(new java.awt.Color(255, 255, 255));
        cell4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell4.setMaximumSize(new java.awt.Dimension(40, 40));
        cell4.setMinimumSize(new java.awt.Dimension(40, 40));

        num4.setBackground(new java.awt.Color(240, 240, 240));
        num4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num4.setMaximumSize(new java.awt.Dimension(35, 35));
        num4.setMinimumSize(new java.awt.Dimension(35, 35));
        num4.setPreferredSize(new java.awt.Dimension(35, 35));
        num4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num4KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell4Layout = new javax.swing.GroupLayout(cell4);
        cell4.setLayout(cell4Layout);
        cell4Layout.setHorizontalGroup(
            cell4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell4Layout.createSequentialGroup()
                .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell4Layout.setVerticalGroup(
            cell4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell4Layout.createSequentialGroup()
                .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box1.add(cell4, gridBagConstraints);

        cell5.setBackground(new java.awt.Color(255, 255, 255));
        cell5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell5.setMaximumSize(new java.awt.Dimension(40, 40));
        cell5.setMinimumSize(new java.awt.Dimension(40, 40));

        num5.setBackground(new java.awt.Color(240, 240, 240));
        num5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num5.setMaximumSize(new java.awt.Dimension(35, 35));
        num5.setMinimumSize(new java.awt.Dimension(35, 35));
        num5.setPreferredSize(new java.awt.Dimension(35, 35));
        num5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num5KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell5Layout = new javax.swing.GroupLayout(cell5);
        cell5.setLayout(cell5Layout);
        cell5Layout.setHorizontalGroup(
            cell5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell5Layout.createSequentialGroup()
                .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell5Layout.setVerticalGroup(
            cell5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell5Layout.createSequentialGroup()
                .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box1.add(cell5, gridBagConstraints);

        cell6.setBackground(new java.awt.Color(255, 255, 255));
        cell6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell6.setMaximumSize(new java.awt.Dimension(40, 40));
        cell6.setMinimumSize(new java.awt.Dimension(40, 40));

        num6.setBackground(new java.awt.Color(240, 240, 240));
        num6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num6.setMaximumSize(new java.awt.Dimension(35, 35));
        num6.setMinimumSize(new java.awt.Dimension(35, 35));
        num6.setPreferredSize(new java.awt.Dimension(35, 35));
        num6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num6KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell6Layout = new javax.swing.GroupLayout(cell6);
        cell6.setLayout(cell6Layout);
        cell6Layout.setHorizontalGroup(
            cell6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell6Layout.createSequentialGroup()
                .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell6Layout.setVerticalGroup(
            cell6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell6Layout.createSequentialGroup()
                .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box1.add(cell6, gridBagConstraints);

        cell7.setBackground(new java.awt.Color(255, 255, 255));
        cell7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell7.setMaximumSize(new java.awt.Dimension(40, 40));
        cell7.setMinimumSize(new java.awt.Dimension(40, 40));

        num7.setBackground(new java.awt.Color(240, 240, 240));
        num7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num7.setMaximumSize(new java.awt.Dimension(35, 35));
        num7.setMinimumSize(new java.awt.Dimension(35, 35));
        num7.setPreferredSize(new java.awt.Dimension(35, 35));
        num7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num7KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell7Layout = new javax.swing.GroupLayout(cell7);
        cell7.setLayout(cell7Layout);
        cell7Layout.setHorizontalGroup(
            cell7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell7Layout.createSequentialGroup()
                .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell7Layout.setVerticalGroup(
            cell7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell7Layout.createSequentialGroup()
                .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box1.add(cell7, gridBagConstraints);

        cell8.setBackground(new java.awt.Color(255, 255, 255));
        cell8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell8.setMaximumSize(new java.awt.Dimension(40, 40));
        cell8.setMinimumSize(new java.awt.Dimension(40, 40));

        num8.setEditable(false);
        num8.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num8.setText("1");
        num8.setMaximumSize(new java.awt.Dimension(35, 35));
        num8.setMinimumSize(new java.awt.Dimension(35, 35));
        num8.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell8Layout = new javax.swing.GroupLayout(cell8);
        cell8.setLayout(cell8Layout);
        cell8Layout.setHorizontalGroup(
            cell8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell8Layout.createSequentialGroup()
                .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell8Layout.setVerticalGroup(
            cell8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell8Layout.createSequentialGroup()
                .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box1.add(cell8, gridBagConstraints);

        cell9.setBackground(new java.awt.Color(255, 255, 255));
        cell9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell9.setMaximumSize(new java.awt.Dimension(40, 40));
        cell9.setMinimumSize(new java.awt.Dimension(40, 40));

        num9.setBackground(new java.awt.Color(240, 240, 240));
        num9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num9.setMaximumSize(new java.awt.Dimension(35, 35));
        num9.setMinimumSize(new java.awt.Dimension(35, 35));
        num9.setPreferredSize(new java.awt.Dimension(35, 35));
        num9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell9Layout = new javax.swing.GroupLayout(cell9);
        cell9.setLayout(cell9Layout);
        cell9Layout.setHorizontalGroup(
            cell9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell9Layout.createSequentialGroup()
                .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell9Layout.setVerticalGroup(
            cell9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell9Layout.createSequentialGroup()
                .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box1.add(cell9, gridBagConstraints);

        sudokuPanel.add(box1, new java.awt.GridBagConstraints());

        box2.setMaximumSize(new java.awt.Dimension(120, 120));
        box2.setMinimumSize(new java.awt.Dimension(120, 120));
        box2.setLayout(new java.awt.GridBagLayout());

        cell10.setBackground(new java.awt.Color(255, 255, 255));
        cell10.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell10.setMaximumSize(new java.awt.Dimension(40, 40));
        cell10.setMinimumSize(new java.awt.Dimension(40, 40));

        num10.setEditable(false);
        num10.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num10.setText("4");
        num10.setMaximumSize(new java.awt.Dimension(35, 35));
        num10.setMinimumSize(new java.awt.Dimension(35, 35));
        num10.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell10Layout = new javax.swing.GroupLayout(cell10);
        cell10.setLayout(cell10Layout);
        cell10Layout.setHorizontalGroup(
            cell10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell10Layout.createSequentialGroup()
                .addComponent(num10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell10Layout.setVerticalGroup(
            cell10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell10Layout.createSequentialGroup()
                .addComponent(num10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box2.add(cell10, new java.awt.GridBagConstraints());

        cell11.setBackground(new java.awt.Color(255, 255, 255));
        cell11.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell11.setMaximumSize(new java.awt.Dimension(40, 40));
        cell11.setMinimumSize(new java.awt.Dimension(40, 40));

        num11.setBackground(new java.awt.Color(240, 240, 240));
        num11.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num11.setMaximumSize(new java.awt.Dimension(35, 35));
        num11.setMinimumSize(new java.awt.Dimension(35, 35));
        num11.setPreferredSize(new java.awt.Dimension(35, 35));
        num11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num11KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell11Layout = new javax.swing.GroupLayout(cell11);
        cell11.setLayout(cell11Layout);
        cell11Layout.setHorizontalGroup(
            cell11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell11Layout.createSequentialGroup()
                .addComponent(num11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell11Layout.setVerticalGroup(
            cell11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell11Layout.createSequentialGroup()
                .addComponent(num11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box2.add(cell11, new java.awt.GridBagConstraints());

        cell12.setBackground(new java.awt.Color(255, 255, 255));
        cell12.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell12.setMaximumSize(new java.awt.Dimension(40, 40));
        cell12.setMinimumSize(new java.awt.Dimension(40, 40));

        num12.setEditable(false);
        num12.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num12.setText("6");
        num12.setMaximumSize(new java.awt.Dimension(35, 35));
        num12.setMinimumSize(new java.awt.Dimension(35, 35));
        num12.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell12Layout = new javax.swing.GroupLayout(cell12);
        cell12.setLayout(cell12Layout);
        cell12Layout.setHorizontalGroup(
            cell12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell12Layout.createSequentialGroup()
                .addComponent(num12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell12Layout.setVerticalGroup(
            cell12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell12Layout.createSequentialGroup()
                .addComponent(num12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box2.add(cell12, new java.awt.GridBagConstraints());

        cell13.setBackground(new java.awt.Color(255, 255, 255));
        cell13.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell13.setMaximumSize(new java.awt.Dimension(40, 40));
        cell13.setMinimumSize(new java.awt.Dimension(40, 40));

        num13.setBackground(new java.awt.Color(240, 240, 240));
        num13.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num13.setMaximumSize(new java.awt.Dimension(35, 35));
        num13.setMinimumSize(new java.awt.Dimension(35, 35));
        num13.setPreferredSize(new java.awt.Dimension(35, 35));
        num13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num13KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell13Layout = new javax.swing.GroupLayout(cell13);
        cell13.setLayout(cell13Layout);
        cell13Layout.setHorizontalGroup(
            cell13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell13Layout.createSequentialGroup()
                .addComponent(num13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell13Layout.setVerticalGroup(
            cell13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell13Layout.createSequentialGroup()
                .addComponent(num13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box2.add(cell13, gridBagConstraints);

        cell14.setBackground(new java.awt.Color(255, 255, 255));
        cell14.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell14.setMaximumSize(new java.awt.Dimension(40, 40));
        cell14.setMinimumSize(new java.awt.Dimension(40, 40));

        num14.setBackground(new java.awt.Color(240, 240, 240));
        num14.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num14.setMaximumSize(new java.awt.Dimension(35, 35));
        num14.setMinimumSize(new java.awt.Dimension(35, 35));
        num14.setPreferredSize(new java.awt.Dimension(35, 35));
        num14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num14KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell14Layout = new javax.swing.GroupLayout(cell14);
        cell14.setLayout(cell14Layout);
        cell14Layout.setHorizontalGroup(
            cell14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell14Layout.createSequentialGroup()
                .addComponent(num14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell14Layout.setVerticalGroup(
            cell14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell14Layout.createSequentialGroup()
                .addComponent(num14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box2.add(cell14, gridBagConstraints);

        cell15.setBackground(new java.awt.Color(255, 255, 255));
        cell15.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell15.setMaximumSize(new java.awt.Dimension(40, 40));
        cell15.setMinimumSize(new java.awt.Dimension(40, 40));

        num15.setBackground(new java.awt.Color(240, 240, 240));
        num15.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num15.setMaximumSize(new java.awt.Dimension(35, 35));
        num15.setMinimumSize(new java.awt.Dimension(35, 35));
        num15.setPreferredSize(new java.awt.Dimension(35, 35));
        num15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num15KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell15Layout = new javax.swing.GroupLayout(cell15);
        cell15.setLayout(cell15Layout);
        cell15Layout.setHorizontalGroup(
            cell15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell15Layout.createSequentialGroup()
                .addComponent(num15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell15Layout.setVerticalGroup(
            cell15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell15Layout.createSequentialGroup()
                .addComponent(num15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box2.add(cell15, gridBagConstraints);

        cell16.setBackground(new java.awt.Color(255, 255, 255));
        cell16.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell16.setMaximumSize(new java.awt.Dimension(40, 40));
        cell16.setMinimumSize(new java.awt.Dimension(40, 40));

        num16.setBackground(new java.awt.Color(240, 240, 240));
        num16.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num16.setMaximumSize(new java.awt.Dimension(35, 35));
        num16.setMinimumSize(new java.awt.Dimension(35, 35));
        num16.setPreferredSize(new java.awt.Dimension(35, 35));
        num16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num16KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell16Layout = new javax.swing.GroupLayout(cell16);
        cell16.setLayout(cell16Layout);
        cell16Layout.setHorizontalGroup(
            cell16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell16Layout.createSequentialGroup()
                .addComponent(num16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell16Layout.setVerticalGroup(
            cell16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell16Layout.createSequentialGroup()
                .addComponent(num16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box2.add(cell16, gridBagConstraints);

        cell17.setBackground(new java.awt.Color(255, 255, 255));
        cell17.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell17.setMaximumSize(new java.awt.Dimension(40, 40));
        cell17.setMinimumSize(new java.awt.Dimension(40, 40));

        num17.setBackground(new java.awt.Color(240, 240, 240));
        num17.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num17.setMaximumSize(new java.awt.Dimension(35, 35));
        num17.setMinimumSize(new java.awt.Dimension(35, 35));
        num17.setPreferredSize(new java.awt.Dimension(35, 35));
        num17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num17KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell17Layout = new javax.swing.GroupLayout(cell17);
        cell17.setLayout(cell17Layout);
        cell17Layout.setHorizontalGroup(
            cell17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell17Layout.createSequentialGroup()
                .addComponent(num17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell17Layout.setVerticalGroup(
            cell17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell17Layout.createSequentialGroup()
                .addComponent(num17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box2.add(cell17, gridBagConstraints);

        cell18.setBackground(new java.awt.Color(255, 255, 255));
        cell18.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell18.setMaximumSize(new java.awt.Dimension(40, 40));
        cell18.setMinimumSize(new java.awt.Dimension(40, 40));

        num18.setBackground(new java.awt.Color(240, 240, 240));
        num18.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num18.setMaximumSize(new java.awt.Dimension(35, 35));
        num18.setMinimumSize(new java.awt.Dimension(35, 35));
        num18.setPreferredSize(new java.awt.Dimension(35, 35));
        num18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num18KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell18Layout = new javax.swing.GroupLayout(cell18);
        cell18.setLayout(cell18Layout);
        cell18Layout.setHorizontalGroup(
            cell18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell18Layout.createSequentialGroup()
                .addComponent(num18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell18Layout.setVerticalGroup(
            cell18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell18Layout.createSequentialGroup()
                .addComponent(num18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box2.add(cell18, gridBagConstraints);

        sudokuPanel.add(box2, new java.awt.GridBagConstraints());

        box3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        box3.setMaximumSize(new java.awt.Dimension(120, 120));
        box3.setMinimumSize(new java.awt.Dimension(120, 120));
        box3.setLayout(new java.awt.GridBagLayout());

        cell19.setBackground(new java.awt.Color(255, 255, 255));
        cell19.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell19.setMaximumSize(new java.awt.Dimension(40, 40));
        cell19.setMinimumSize(new java.awt.Dimension(40, 40));

        num19.setBackground(new java.awt.Color(240, 240, 240));
        num19.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num19.setMaximumSize(new java.awt.Dimension(35, 35));
        num19.setMinimumSize(new java.awt.Dimension(35, 35));
        num19.setPreferredSize(new java.awt.Dimension(35, 35));
        num19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num19KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell19Layout = new javax.swing.GroupLayout(cell19);
        cell19.setLayout(cell19Layout);
        cell19Layout.setHorizontalGroup(
            cell19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell19Layout.createSequentialGroup()
                .addComponent(num19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell19Layout.setVerticalGroup(
            cell19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell19Layout.createSequentialGroup()
                .addComponent(num19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box3.add(cell19, new java.awt.GridBagConstraints());

        cell20.setBackground(new java.awt.Color(255, 255, 255));
        cell20.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell20.setMaximumSize(new java.awt.Dimension(40, 40));
        cell20.setMinimumSize(new java.awt.Dimension(40, 40));

        num20.setBackground(new java.awt.Color(240, 240, 240));
        num20.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num20.setMaximumSize(new java.awt.Dimension(35, 35));
        num20.setMinimumSize(new java.awt.Dimension(35, 35));
        num20.setPreferredSize(new java.awt.Dimension(35, 35));
        num20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num20KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell20Layout = new javax.swing.GroupLayout(cell20);
        cell20.setLayout(cell20Layout);
        cell20Layout.setHorizontalGroup(
            cell20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell20Layout.createSequentialGroup()
                .addComponent(num20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell20Layout.setVerticalGroup(
            cell20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell20Layout.createSequentialGroup()
                .addComponent(num20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box3.add(cell20, new java.awt.GridBagConstraints());

        cell21.setBackground(new java.awt.Color(255, 255, 255));
        cell21.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell21.setMaximumSize(new java.awt.Dimension(40, 40));
        cell21.setMinimumSize(new java.awt.Dimension(40, 40));

        num21.setEditable(false);
        num21.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num21.setText("7");
        num21.setMaximumSize(new java.awt.Dimension(35, 35));
        num21.setMinimumSize(new java.awt.Dimension(35, 35));
        num21.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell21Layout = new javax.swing.GroupLayout(cell21);
        cell21.setLayout(cell21Layout);
        cell21Layout.setHorizontalGroup(
            cell21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell21Layout.createSequentialGroup()
                .addComponent(num21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell21Layout.setVerticalGroup(
            cell21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell21Layout.createSequentialGroup()
                .addComponent(num21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box3.add(cell21, new java.awt.GridBagConstraints());

        cell22.setBackground(new java.awt.Color(255, 255, 255));
        cell22.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell22.setMaximumSize(new java.awt.Dimension(40, 40));
        cell22.setMinimumSize(new java.awt.Dimension(40, 40));

        num22.setEditable(false);
        num22.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num22.setText("4");
        num22.setMaximumSize(new java.awt.Dimension(35, 35));
        num22.setMinimumSize(new java.awt.Dimension(35, 35));
        num22.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell22Layout = new javax.swing.GroupLayout(cell22);
        cell22.setLayout(cell22Layout);
        cell22Layout.setHorizontalGroup(
            cell22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell22Layout.createSequentialGroup()
                .addComponent(num22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell22Layout.setVerticalGroup(
            cell22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell22Layout.createSequentialGroup()
                .addComponent(num22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box3.add(cell22, gridBagConstraints);

        cell23.setBackground(new java.awt.Color(255, 255, 255));
        cell23.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell23.setMaximumSize(new java.awt.Dimension(40, 40));
        cell23.setMinimumSize(new java.awt.Dimension(40, 40));

        num23.setBackground(new java.awt.Color(240, 240, 240));
        num23.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num23.setMaximumSize(new java.awt.Dimension(35, 35));
        num23.setMinimumSize(new java.awt.Dimension(35, 35));
        num23.setPreferredSize(new java.awt.Dimension(35, 35));
        num23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num23KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell23Layout = new javax.swing.GroupLayout(cell23);
        cell23.setLayout(cell23Layout);
        cell23Layout.setHorizontalGroup(
            cell23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell23Layout.createSequentialGroup()
                .addComponent(num23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell23Layout.setVerticalGroup(
            cell23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell23Layout.createSequentialGroup()
                .addComponent(num23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box3.add(cell23, gridBagConstraints);

        cell24.setBackground(new java.awt.Color(255, 255, 255));
        cell24.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell24.setMaximumSize(new java.awt.Dimension(40, 40));
        cell24.setMinimumSize(new java.awt.Dimension(40, 40));

        num24.setBackground(new java.awt.Color(240, 240, 240));
        num24.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num24.setMaximumSize(new java.awt.Dimension(35, 35));
        num24.setMinimumSize(new java.awt.Dimension(35, 35));
        num24.setPreferredSize(new java.awt.Dimension(35, 35));
        num24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num24KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell24Layout = new javax.swing.GroupLayout(cell24);
        cell24.setLayout(cell24Layout);
        cell24Layout.setHorizontalGroup(
            cell24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell24Layout.createSequentialGroup()
                .addComponent(num24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell24Layout.setVerticalGroup(
            cell24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell24Layout.createSequentialGroup()
                .addComponent(num24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box3.add(cell24, gridBagConstraints);

        cell25.setBackground(new java.awt.Color(255, 255, 255));
        cell25.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell25.setMaximumSize(new java.awt.Dimension(40, 40));
        cell25.setMinimumSize(new java.awt.Dimension(40, 40));

        num25.setEditable(false);
        num25.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num25.setText("6");
        num25.setMaximumSize(new java.awt.Dimension(35, 35));
        num25.setMinimumSize(new java.awt.Dimension(35, 35));
        num25.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell25Layout = new javax.swing.GroupLayout(cell25);
        cell25.setLayout(cell25Layout);
        cell25Layout.setHorizontalGroup(
            cell25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell25Layout.createSequentialGroup()
                .addComponent(num25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell25Layout.setVerticalGroup(
            cell25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell25Layout.createSequentialGroup()
                .addComponent(num25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box3.add(cell25, gridBagConstraints);

        cell26.setBackground(new java.awt.Color(255, 255, 255));
        cell26.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell26.setMaximumSize(new java.awt.Dimension(40, 40));
        cell26.setMinimumSize(new java.awt.Dimension(40, 40));

        num26.setEditable(false);
        num26.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num26.setText("5");
        num26.setMaximumSize(new java.awt.Dimension(35, 35));
        num26.setMinimumSize(new java.awt.Dimension(35, 35));
        num26.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell26Layout = new javax.swing.GroupLayout(cell26);
        cell26.setLayout(cell26Layout);
        cell26Layout.setHorizontalGroup(
            cell26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell26Layout.createSequentialGroup()
                .addComponent(num26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell26Layout.setVerticalGroup(
            cell26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell26Layout.createSequentialGroup()
                .addComponent(num26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box3.add(cell26, gridBagConstraints);

        cell27.setBackground(new java.awt.Color(255, 255, 255));
        cell27.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell27.setMaximumSize(new java.awt.Dimension(40, 40));
        cell27.setMinimumSize(new java.awt.Dimension(40, 40));
        cell27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cell27KeyTyped(evt);
            }
        });

        num27.setBackground(new java.awt.Color(240, 240, 240));
        num27.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num27.setMaximumSize(new java.awt.Dimension(35, 35));
        num27.setMinimumSize(new java.awt.Dimension(35, 35));
        num27.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell27Layout = new javax.swing.GroupLayout(cell27);
        cell27.setLayout(cell27Layout);
        cell27Layout.setHorizontalGroup(
            cell27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell27Layout.createSequentialGroup()
                .addComponent(num27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell27Layout.setVerticalGroup(
            cell27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell27Layout.createSequentialGroup()
                .addComponent(num27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box3.add(cell27, gridBagConstraints);

        sudokuPanel.add(box3, new java.awt.GridBagConstraints());

        box4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        box4.setMaximumSize(new java.awt.Dimension(120, 120));
        box4.setMinimumSize(new java.awt.Dimension(120, 120));
        box4.setLayout(new java.awt.GridBagLayout());

        cell28.setBackground(new java.awt.Color(255, 255, 255));
        cell28.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell28.setMaximumSize(new java.awt.Dimension(40, 40));
        cell28.setMinimumSize(new java.awt.Dimension(40, 40));

        num28.setEditable(false);
        num28.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num28.setText("5");
        num28.setMaximumSize(new java.awt.Dimension(35, 35));
        num28.setMinimumSize(new java.awt.Dimension(35, 35));
        num28.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell28Layout = new javax.swing.GroupLayout(cell28);
        cell28.setLayout(cell28Layout);
        cell28Layout.setHorizontalGroup(
            cell28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell28Layout.createSequentialGroup()
                .addComponent(num28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell28Layout.setVerticalGroup(
            cell28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell28Layout.createSequentialGroup()
                .addComponent(num28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box4.add(cell28, new java.awt.GridBagConstraints());

        cell29.setBackground(new java.awt.Color(255, 255, 255));
        cell29.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell29.setMaximumSize(new java.awt.Dimension(40, 40));
        cell29.setMinimumSize(new java.awt.Dimension(40, 40));

        num29.setBackground(new java.awt.Color(240, 240, 240));
        num29.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num29.setMaximumSize(new java.awt.Dimension(35, 35));
        num29.setMinimumSize(new java.awt.Dimension(35, 35));
        num29.setPreferredSize(new java.awt.Dimension(35, 35));
        num29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num29KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell29Layout = new javax.swing.GroupLayout(cell29);
        cell29.setLayout(cell29Layout);
        cell29Layout.setHorizontalGroup(
            cell29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell29Layout.createSequentialGroup()
                .addComponent(num29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell29Layout.setVerticalGroup(
            cell29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell29Layout.createSequentialGroup()
                .addComponent(num29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box4.add(cell29, new java.awt.GridBagConstraints());

        cell30.setBackground(new java.awt.Color(255, 255, 255));
        cell30.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell30.setMaximumSize(new java.awt.Dimension(40, 40));
        cell30.setMinimumSize(new java.awt.Dimension(40, 40));

        num30.setEditable(false);
        num30.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num30.setText("9");
        num30.setMaximumSize(new java.awt.Dimension(35, 35));
        num30.setMinimumSize(new java.awt.Dimension(35, 35));
        num30.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell30Layout = new javax.swing.GroupLayout(cell30);
        cell30.setLayout(cell30Layout);
        cell30Layout.setHorizontalGroup(
            cell30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell30Layout.createSequentialGroup()
                .addComponent(num30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell30Layout.setVerticalGroup(
            cell30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell30Layout.createSequentialGroup()
                .addComponent(num30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box4.add(cell30, new java.awt.GridBagConstraints());

        cell31.setBackground(new java.awt.Color(255, 255, 255));
        cell31.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell31.setMaximumSize(new java.awt.Dimension(40, 40));
        cell31.setMinimumSize(new java.awt.Dimension(40, 40));

        num31.setBackground(new java.awt.Color(240, 240, 240));
        num31.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num31.setMaximumSize(new java.awt.Dimension(35, 35));
        num31.setMinimumSize(new java.awt.Dimension(35, 35));
        num31.setPreferredSize(new java.awt.Dimension(35, 35));
        num31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num31KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell31Layout = new javax.swing.GroupLayout(cell31);
        cell31.setLayout(cell31Layout);
        cell31Layout.setHorizontalGroup(
            cell31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell31Layout.createSequentialGroup()
                .addComponent(num31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell31Layout.setVerticalGroup(
            cell31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell31Layout.createSequentialGroup()
                .addComponent(num31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box4.add(cell31, gridBagConstraints);

        cell32.setBackground(new java.awt.Color(255, 255, 255));
        cell32.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell32.setMaximumSize(new java.awt.Dimension(40, 40));
        cell32.setMinimumSize(new java.awt.Dimension(40, 40));

        num32.setBackground(new java.awt.Color(240, 240, 240));
        num32.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num32.setMaximumSize(new java.awt.Dimension(35, 35));
        num32.setMinimumSize(new java.awt.Dimension(35, 35));
        num32.setPreferredSize(new java.awt.Dimension(35, 35));
        num32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num32KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell32Layout = new javax.swing.GroupLayout(cell32);
        cell32.setLayout(cell32Layout);
        cell32Layout.setHorizontalGroup(
            cell32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell32Layout.createSequentialGroup()
                .addComponent(num32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell32Layout.setVerticalGroup(
            cell32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell32Layout.createSequentialGroup()
                .addComponent(num32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box4.add(cell32, gridBagConstraints);

        cell33.setBackground(new java.awt.Color(255, 255, 255));
        cell33.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell33.setMaximumSize(new java.awt.Dimension(40, 40));
        cell33.setMinimumSize(new java.awt.Dimension(40, 40));

        num33.setBackground(new java.awt.Color(240, 240, 240));
        num33.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num33.setMaximumSize(new java.awt.Dimension(35, 35));
        num33.setMinimumSize(new java.awt.Dimension(35, 35));
        num33.setPreferredSize(new java.awt.Dimension(35, 35));
        num33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num33KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell33Layout = new javax.swing.GroupLayout(cell33);
        cell33.setLayout(cell33Layout);
        cell33Layout.setHorizontalGroup(
            cell33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell33Layout.createSequentialGroup()
                .addComponent(num33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell33Layout.setVerticalGroup(
            cell33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell33Layout.createSequentialGroup()
                .addComponent(num33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box4.add(cell33, gridBagConstraints);

        cell34.setBackground(new java.awt.Color(255, 255, 255));
        cell34.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell34.setMaximumSize(new java.awt.Dimension(40, 40));
        cell34.setMinimumSize(new java.awt.Dimension(40, 40));

        num34.setBackground(new java.awt.Color(240, 240, 240));
        num34.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num34.setMaximumSize(new java.awt.Dimension(35, 35));
        num34.setMinimumSize(new java.awt.Dimension(35, 35));
        num34.setPreferredSize(new java.awt.Dimension(35, 35));
        num34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num34KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell34Layout = new javax.swing.GroupLayout(cell34);
        cell34.setLayout(cell34Layout);
        cell34Layout.setHorizontalGroup(
            cell34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell34Layout.createSequentialGroup()
                .addComponent(num34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell34Layout.setVerticalGroup(
            cell34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell34Layout.createSequentialGroup()
                .addComponent(num34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box4.add(cell34, gridBagConstraints);

        cell35.setBackground(new java.awt.Color(255, 255, 255));
        cell35.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell35.setMaximumSize(new java.awt.Dimension(40, 40));
        cell35.setMinimumSize(new java.awt.Dimension(40, 40));

        num35.setEditable(false);
        num35.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num35.setText("4");
        num35.setMaximumSize(new java.awt.Dimension(35, 35));
        num35.setMinimumSize(new java.awt.Dimension(35, 35));
        num35.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell35Layout = new javax.swing.GroupLayout(cell35);
        cell35.setLayout(cell35Layout);
        cell35Layout.setHorizontalGroup(
            cell35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell35Layout.createSequentialGroup()
                .addComponent(num35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell35Layout.setVerticalGroup(
            cell35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell35Layout.createSequentialGroup()
                .addComponent(num35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box4.add(cell35, gridBagConstraints);

        cell36.setBackground(new java.awt.Color(255, 255, 255));
        cell36.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell36.setMaximumSize(new java.awt.Dimension(40, 40));
        cell36.setMinimumSize(new java.awt.Dimension(40, 40));

        num36.setEditable(false);
        num36.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num36.setText("8");
        num36.setMaximumSize(new java.awt.Dimension(35, 35));
        num36.setMinimumSize(new java.awt.Dimension(35, 35));
        num36.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell36Layout = new javax.swing.GroupLayout(cell36);
        cell36.setLayout(cell36Layout);
        cell36Layout.setHorizontalGroup(
            cell36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell36Layout.createSequentialGroup()
                .addComponent(num36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell36Layout.setVerticalGroup(
            cell36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell36Layout.createSequentialGroup()
                .addComponent(num36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box4.add(cell36, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        sudokuPanel.add(box4, gridBagConstraints);

        box5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        box5.setMaximumSize(new java.awt.Dimension(120, 120));
        box5.setMinimumSize(new java.awt.Dimension(120, 120));
        box5.setLayout(new java.awt.GridBagLayout());

        cell37.setBackground(new java.awt.Color(255, 255, 255));
        cell37.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell37.setMaximumSize(new java.awt.Dimension(40, 40));
        cell37.setMinimumSize(new java.awt.Dimension(40, 40));

        num37.setBackground(new java.awt.Color(240, 240, 240));
        num37.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num37.setMaximumSize(new java.awt.Dimension(35, 35));
        num37.setMinimumSize(new java.awt.Dimension(35, 35));
        num37.setPreferredSize(new java.awt.Dimension(35, 35));
        num37.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num37KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell37Layout = new javax.swing.GroupLayout(cell37);
        cell37.setLayout(cell37Layout);
        cell37Layout.setHorizontalGroup(
            cell37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell37Layout.createSequentialGroup()
                .addComponent(num37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell37Layout.setVerticalGroup(
            cell37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell37Layout.createSequentialGroup()
                .addComponent(num37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box5.add(cell37, new java.awt.GridBagConstraints());

        cell38.setBackground(new java.awt.Color(255, 255, 255));
        cell38.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell38.setMaximumSize(new java.awt.Dimension(40, 40));
        cell38.setMinimumSize(new java.awt.Dimension(40, 40));

        num38.setEditable(false);
        num38.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num38.setText("3");
        num38.setMaximumSize(new java.awt.Dimension(35, 35));
        num38.setMinimumSize(new java.awt.Dimension(35, 35));
        num38.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell38Layout = new javax.swing.GroupLayout(cell38);
        cell38.setLayout(cell38Layout);
        cell38Layout.setHorizontalGroup(
            cell38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell38Layout.createSequentialGroup()
                .addComponent(num38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell38Layout.setVerticalGroup(
            cell38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell38Layout.createSequentialGroup()
                .addComponent(num38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box5.add(cell38, new java.awt.GridBagConstraints());

        cell39.setBackground(new java.awt.Color(255, 255, 255));
        cell39.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell39.setMaximumSize(new java.awt.Dimension(40, 40));
        cell39.setMinimumSize(new java.awt.Dimension(40, 40));

        num39.setBackground(new java.awt.Color(240, 240, 240));
        num39.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num39.setMaximumSize(new java.awt.Dimension(35, 35));
        num39.setMinimumSize(new java.awt.Dimension(35, 35));
        num39.setPreferredSize(new java.awt.Dimension(35, 35));
        num39.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num39KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell39Layout = new javax.swing.GroupLayout(cell39);
        cell39.setLayout(cell39Layout);
        cell39Layout.setHorizontalGroup(
            cell39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell39Layout.createSequentialGroup()
                .addComponent(num39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell39Layout.setVerticalGroup(
            cell39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell39Layout.createSequentialGroup()
                .addComponent(num39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box5.add(cell39, new java.awt.GridBagConstraints());

        cell40.setBackground(new java.awt.Color(255, 255, 255));
        cell40.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell40.setMaximumSize(new java.awt.Dimension(40, 40));
        cell40.setMinimumSize(new java.awt.Dimension(40, 40));

        num40.setBackground(new java.awt.Color(240, 240, 240));
        num40.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num40.setMaximumSize(new java.awt.Dimension(35, 35));
        num40.setMinimumSize(new java.awt.Dimension(35, 35));
        num40.setPreferredSize(new java.awt.Dimension(35, 35));
        num40.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num40KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell40Layout = new javax.swing.GroupLayout(cell40);
        cell40.setLayout(cell40Layout);
        cell40Layout.setHorizontalGroup(
            cell40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell40Layout.createSequentialGroup()
                .addComponent(num40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell40Layout.setVerticalGroup(
            cell40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell40Layout.createSequentialGroup()
                .addComponent(num40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box5.add(cell40, gridBagConstraints);

        cell41.setBackground(new java.awt.Color(255, 255, 255));
        cell41.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell41.setMaximumSize(new java.awt.Dimension(40, 40));
        cell41.setMinimumSize(new java.awt.Dimension(40, 40));

        num41.setEditable(false);
        num41.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num41.setText("7");
        num41.setMaximumSize(new java.awt.Dimension(35, 35));
        num41.setMinimumSize(new java.awt.Dimension(35, 35));
        num41.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell41Layout = new javax.swing.GroupLayout(cell41);
        cell41.setLayout(cell41Layout);
        cell41Layout.setHorizontalGroup(
            cell41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell41Layout.createSequentialGroup()
                .addComponent(num41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell41Layout.setVerticalGroup(
            cell41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell41Layout.createSequentialGroup()
                .addComponent(num41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box5.add(cell41, gridBagConstraints);

        cell42.setBackground(new java.awt.Color(255, 255, 255));
        cell42.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell42.setMaximumSize(new java.awt.Dimension(40, 40));
        cell42.setMinimumSize(new java.awt.Dimension(40, 40));

        num42.setBackground(new java.awt.Color(240, 240, 240));
        num42.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num42.setMaximumSize(new java.awt.Dimension(35, 35));
        num42.setMinimumSize(new java.awt.Dimension(35, 35));
        num42.setPreferredSize(new java.awt.Dimension(35, 35));
        num42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num42KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell42Layout = new javax.swing.GroupLayout(cell42);
        cell42.setLayout(cell42Layout);
        cell42Layout.setHorizontalGroup(
            cell42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell42Layout.createSequentialGroup()
                .addComponent(num42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell42Layout.setVerticalGroup(
            cell42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell42Layout.createSequentialGroup()
                .addComponent(num42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box5.add(cell42, gridBagConstraints);

        cell43.setBackground(new java.awt.Color(255, 255, 255));
        cell43.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell43.setMaximumSize(new java.awt.Dimension(40, 40));
        cell43.setMinimumSize(new java.awt.Dimension(40, 40));

        num43.setBackground(new java.awt.Color(240, 240, 240));
        num43.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num43.setMaximumSize(new java.awt.Dimension(35, 35));
        num43.setMinimumSize(new java.awt.Dimension(35, 35));
        num43.setPreferredSize(new java.awt.Dimension(35, 35));
        num43.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num43KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell43Layout = new javax.swing.GroupLayout(cell43);
        cell43.setLayout(cell43Layout);
        cell43Layout.setHorizontalGroup(
            cell43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell43Layout.createSequentialGroup()
                .addComponent(num43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell43Layout.setVerticalGroup(
            cell43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell43Layout.createSequentialGroup()
                .addComponent(num43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box5.add(cell43, gridBagConstraints);

        cell44.setBackground(new java.awt.Color(255, 255, 255));
        cell44.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell44.setMaximumSize(new java.awt.Dimension(40, 40));
        cell44.setMinimumSize(new java.awt.Dimension(40, 40));

        num44.setEditable(false);
        num44.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num44.setText("2");
        num44.setMaximumSize(new java.awt.Dimension(35, 35));
        num44.setMinimumSize(new java.awt.Dimension(35, 35));
        num44.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell44Layout = new javax.swing.GroupLayout(cell44);
        cell44.setLayout(cell44Layout);
        cell44Layout.setHorizontalGroup(
            cell44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell44Layout.createSequentialGroup()
                .addComponent(num44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell44Layout.setVerticalGroup(
            cell44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell44Layout.createSequentialGroup()
                .addComponent(num44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box5.add(cell44, gridBagConstraints);

        cell45.setBackground(new java.awt.Color(255, 255, 255));
        cell45.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell45.setMaximumSize(new java.awt.Dimension(40, 40));
        cell45.setMinimumSize(new java.awt.Dimension(40, 40));

        num45.setBackground(new java.awt.Color(240, 240, 240));
        num45.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num45.setMaximumSize(new java.awt.Dimension(35, 35));
        num45.setMinimumSize(new java.awt.Dimension(35, 35));
        num45.setPreferredSize(new java.awt.Dimension(35, 35));
        num45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num45KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell45Layout = new javax.swing.GroupLayout(cell45);
        cell45.setLayout(cell45Layout);
        cell45Layout.setHorizontalGroup(
            cell45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell45Layout.createSequentialGroup()
                .addComponent(num45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell45Layout.setVerticalGroup(
            cell45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell45Layout.createSequentialGroup()
                .addComponent(num45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box5.add(cell45, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        sudokuPanel.add(box5, gridBagConstraints);

        box6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        box6.setMaximumSize(new java.awt.Dimension(120, 120));
        box6.setMinimumSize(new java.awt.Dimension(120, 120));
        box6.setLayout(new java.awt.GridBagLayout());

        cell46.setBackground(new java.awt.Color(255, 255, 255));
        cell46.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell46.setMaximumSize(new java.awt.Dimension(40, 40));
        cell46.setMinimumSize(new java.awt.Dimension(40, 40));

        num46.setEditable(false);
        num46.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num46.setText("7");
        num46.setMaximumSize(new java.awt.Dimension(35, 35));
        num46.setMinimumSize(new java.awt.Dimension(35, 35));
        num46.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell46Layout = new javax.swing.GroupLayout(cell46);
        cell46.setLayout(cell46Layout);
        cell46Layout.setHorizontalGroup(
            cell46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell46Layout.createSequentialGroup()
                .addComponent(num46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell46Layout.setVerticalGroup(
            cell46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell46Layout.createSequentialGroup()
                .addComponent(num46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box6.add(cell46, new java.awt.GridBagConstraints());

        cell47.setBackground(new java.awt.Color(255, 255, 255));
        cell47.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell47.setMaximumSize(new java.awt.Dimension(40, 40));
        cell47.setMinimumSize(new java.awt.Dimension(40, 40));

        num47.setEditable(false);
        num47.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num47.setText("8");
        num47.setMaximumSize(new java.awt.Dimension(35, 35));
        num47.setMinimumSize(new java.awt.Dimension(35, 35));
        num47.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell47Layout = new javax.swing.GroupLayout(cell47);
        cell47.setLayout(cell47Layout);
        cell47Layout.setHorizontalGroup(
            cell47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell47Layout.createSequentialGroup()
                .addComponent(num47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell47Layout.setVerticalGroup(
            cell47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell47Layout.createSequentialGroup()
                .addComponent(num47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box6.add(cell47, new java.awt.GridBagConstraints());

        cell48.setBackground(new java.awt.Color(255, 255, 255));
        cell48.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell48.setMaximumSize(new java.awt.Dimension(40, 40));
        cell48.setMinimumSize(new java.awt.Dimension(40, 40));

        num48.setBackground(new java.awt.Color(240, 240, 240));
        num48.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num48.setMaximumSize(new java.awt.Dimension(35, 35));
        num48.setMinimumSize(new java.awt.Dimension(35, 35));
        num48.setPreferredSize(new java.awt.Dimension(35, 35));
        num48.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num48KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell48Layout = new javax.swing.GroupLayout(cell48);
        cell48.setLayout(cell48Layout);
        cell48Layout.setHorizontalGroup(
            cell48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell48Layout.createSequentialGroup()
                .addComponent(num48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell48Layout.setVerticalGroup(
            cell48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell48Layout.createSequentialGroup()
                .addComponent(num48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box6.add(cell48, new java.awt.GridBagConstraints());

        cell49.setBackground(new java.awt.Color(255, 255, 255));
        cell49.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell49.setMaximumSize(new java.awt.Dimension(40, 40));
        cell49.setMinimumSize(new java.awt.Dimension(40, 40));

        num49.setBackground(new java.awt.Color(240, 240, 240));
        num49.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num49.setMaximumSize(new java.awt.Dimension(35, 35));
        num49.setMinimumSize(new java.awt.Dimension(35, 35));
        num49.setPreferredSize(new java.awt.Dimension(35, 35));
        num49.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num49KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell49Layout = new javax.swing.GroupLayout(cell49);
        cell49.setLayout(cell49Layout);
        cell49Layout.setHorizontalGroup(
            cell49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell49Layout.createSequentialGroup()
                .addComponent(num49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell49Layout.setVerticalGroup(
            cell49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell49Layout.createSequentialGroup()
                .addComponent(num49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box6.add(cell49, gridBagConstraints);

        cell50.setBackground(new java.awt.Color(255, 255, 255));
        cell50.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell50.setMaximumSize(new java.awt.Dimension(40, 40));
        cell50.setMinimumSize(new java.awt.Dimension(40, 40));

        num50.setBackground(new java.awt.Color(240, 240, 240));
        num50.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num50.setMaximumSize(new java.awt.Dimension(35, 35));
        num50.setMinimumSize(new java.awt.Dimension(35, 35));
        num50.setPreferredSize(new java.awt.Dimension(35, 35));
        num50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num50KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell50Layout = new javax.swing.GroupLayout(cell50);
        cell50.setLayout(cell50Layout);
        cell50Layout.setHorizontalGroup(
            cell50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell50Layout.createSequentialGroup()
                .addComponent(num50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell50Layout.setVerticalGroup(
            cell50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell50Layout.createSequentialGroup()
                .addComponent(num50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box6.add(cell50, gridBagConstraints);

        cell51.setBackground(new java.awt.Color(255, 255, 255));
        cell51.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell51.setMaximumSize(new java.awt.Dimension(40, 40));
        cell51.setMinimumSize(new java.awt.Dimension(40, 40));

        num51.setBackground(new java.awt.Color(240, 240, 240));
        num51.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num51.setMaximumSize(new java.awt.Dimension(35, 35));
        num51.setMinimumSize(new java.awt.Dimension(35, 35));
        num51.setPreferredSize(new java.awt.Dimension(35, 35));
        num51.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num51KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell51Layout = new javax.swing.GroupLayout(cell51);
        cell51.setLayout(cell51Layout);
        cell51Layout.setHorizontalGroup(
            cell51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell51Layout.createSequentialGroup()
                .addComponent(num51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell51Layout.setVerticalGroup(
            cell51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell51Layout.createSequentialGroup()
                .addComponent(num51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box6.add(cell51, gridBagConstraints);

        cell52.setBackground(new java.awt.Color(255, 255, 255));
        cell52.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell52.setMaximumSize(new java.awt.Dimension(40, 40));
        cell52.setMinimumSize(new java.awt.Dimension(40, 40));

        num52.setEditable(false);
        num52.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num52.setText("1");
        num52.setMaximumSize(new java.awt.Dimension(35, 35));
        num52.setMinimumSize(new java.awt.Dimension(35, 35));
        num52.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell52Layout = new javax.swing.GroupLayout(cell52);
        cell52.setLayout(cell52Layout);
        cell52Layout.setHorizontalGroup(
            cell52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell52Layout.createSequentialGroup()
                .addComponent(num52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell52Layout.setVerticalGroup(
            cell52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell52Layout.createSequentialGroup()
                .addComponent(num52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box6.add(cell52, gridBagConstraints);

        cell53.setBackground(new java.awt.Color(255, 255, 255));
        cell53.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell53.setMaximumSize(new java.awt.Dimension(40, 40));
        cell53.setMinimumSize(new java.awt.Dimension(40, 40));

        num53.setBackground(new java.awt.Color(240, 240, 240));
        num53.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num53.setMaximumSize(new java.awt.Dimension(35, 35));
        num53.setMinimumSize(new java.awt.Dimension(35, 35));
        num53.setPreferredSize(new java.awt.Dimension(35, 35));
        num53.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num53KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell53Layout = new javax.swing.GroupLayout(cell53);
        cell53.setLayout(cell53Layout);
        cell53Layout.setHorizontalGroup(
            cell53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell53Layout.createSequentialGroup()
                .addComponent(num53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell53Layout.setVerticalGroup(
            cell53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell53Layout.createSequentialGroup()
                .addComponent(num53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box6.add(cell53, gridBagConstraints);

        cell54.setBackground(new java.awt.Color(255, 255, 255));
        cell54.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell54.setMaximumSize(new java.awt.Dimension(40, 40));
        cell54.setMinimumSize(new java.awt.Dimension(40, 40));

        num54.setEditable(false);
        num54.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num54.setText("3");
        num54.setMaximumSize(new java.awt.Dimension(35, 35));
        num54.setMinimumSize(new java.awt.Dimension(35, 35));
        num54.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell54Layout = new javax.swing.GroupLayout(cell54);
        cell54.setLayout(cell54Layout);
        cell54Layout.setHorizontalGroup(
            cell54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell54Layout.createSequentialGroup()
                .addComponent(num54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell54Layout.setVerticalGroup(
            cell54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell54Layout.createSequentialGroup()
                .addComponent(num54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box6.add(cell54, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        sudokuPanel.add(box6, gridBagConstraints);

        box7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        box7.setMaximumSize(new java.awt.Dimension(120, 120));
        box7.setMinimumSize(new java.awt.Dimension(120, 120));
        box7.setLayout(new java.awt.GridBagLayout());

        cell55.setBackground(new java.awt.Color(255, 255, 255));
        cell55.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell55.setMaximumSize(new java.awt.Dimension(40, 40));
        cell55.setMinimumSize(new java.awt.Dimension(40, 40));

        num55.setBackground(new java.awt.Color(240, 240, 240));
        num55.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num55.setMaximumSize(new java.awt.Dimension(35, 35));
        num55.setMinimumSize(new java.awt.Dimension(35, 35));
        num55.setPreferredSize(new java.awt.Dimension(35, 35));
        num55.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num55KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell55Layout = new javax.swing.GroupLayout(cell55);
        cell55.setLayout(cell55Layout);
        cell55Layout.setHorizontalGroup(
            cell55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell55Layout.createSequentialGroup()
                .addComponent(num55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell55Layout.setVerticalGroup(
            cell55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell55Layout.createSequentialGroup()
                .addComponent(num55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box7.add(cell55, new java.awt.GridBagConstraints());

        cell56.setBackground(new java.awt.Color(255, 255, 255));
        cell56.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell56.setMaximumSize(new java.awt.Dimension(40, 40));
        cell56.setMinimumSize(new java.awt.Dimension(40, 40));

        num56.setEditable(false);
        num56.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num56.setText("5");
        num56.setMaximumSize(new java.awt.Dimension(35, 35));
        num56.setMinimumSize(new java.awt.Dimension(35, 35));
        num56.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell56Layout = new javax.swing.GroupLayout(cell56);
        cell56.setLayout(cell56Layout);
        cell56Layout.setHorizontalGroup(
            cell56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell56Layout.createSequentialGroup()
                .addComponent(num56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell56Layout.setVerticalGroup(
            cell56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell56Layout.createSequentialGroup()
                .addComponent(num56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box7.add(cell56, new java.awt.GridBagConstraints());

        cell57.setBackground(new java.awt.Color(255, 255, 255));
        cell57.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell57.setMaximumSize(new java.awt.Dimension(40, 40));
        cell57.setMinimumSize(new java.awt.Dimension(40, 40));

        num57.setEditable(false);
        num57.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num57.setText("2");
        num57.setMaximumSize(new java.awt.Dimension(35, 35));
        num57.setMinimumSize(new java.awt.Dimension(35, 35));
        num57.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell57Layout = new javax.swing.GroupLayout(cell57);
        cell57.setLayout(cell57Layout);
        cell57Layout.setHorizontalGroup(
            cell57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell57Layout.createSequentialGroup()
                .addComponent(num57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell57Layout.setVerticalGroup(
            cell57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell57Layout.createSequentialGroup()
                .addComponent(num57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box7.add(cell57, new java.awt.GridBagConstraints());

        cell58.setBackground(new java.awt.Color(255, 255, 255));
        cell58.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell58.setMaximumSize(new java.awt.Dimension(40, 40));
        cell58.setMinimumSize(new java.awt.Dimension(40, 40));

        num58.setBackground(new java.awt.Color(240, 240, 240));
        num58.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num58.setMaximumSize(new java.awt.Dimension(35, 35));
        num58.setMinimumSize(new java.awt.Dimension(35, 35));
        num58.setPreferredSize(new java.awt.Dimension(35, 35));
        num58.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num58KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell58Layout = new javax.swing.GroupLayout(cell58);
        cell58.setLayout(cell58Layout);
        cell58Layout.setHorizontalGroup(
            cell58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell58Layout.createSequentialGroup()
                .addComponent(num58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell58Layout.setVerticalGroup(
            cell58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell58Layout.createSequentialGroup()
                .addComponent(num58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box7.add(cell58, gridBagConstraints);

        cell59.setBackground(new java.awt.Color(255, 255, 255));
        cell59.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell59.setMaximumSize(new java.awt.Dimension(40, 40));
        cell59.setMinimumSize(new java.awt.Dimension(40, 40));

        num59.setBackground(new java.awt.Color(240, 240, 240));
        num59.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num59.setMaximumSize(new java.awt.Dimension(35, 35));
        num59.setMinimumSize(new java.awt.Dimension(35, 35));
        num59.setPreferredSize(new java.awt.Dimension(35, 35));
        num59.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num59KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell59Layout = new javax.swing.GroupLayout(cell59);
        cell59.setLayout(cell59Layout);
        cell59Layout.setHorizontalGroup(
            cell59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell59Layout.createSequentialGroup()
                .addComponent(num59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell59Layout.setVerticalGroup(
            cell59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell59Layout.createSequentialGroup()
                .addComponent(num59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box7.add(cell59, gridBagConstraints);

        cell60.setBackground(new java.awt.Color(255, 255, 255));
        cell60.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell60.setMaximumSize(new java.awt.Dimension(40, 40));
        cell60.setMinimumSize(new java.awt.Dimension(40, 40));

        num60.setEditable(false);
        num60.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num60.setText("1");
        num60.setMaximumSize(new java.awt.Dimension(35, 35));
        num60.setMinimumSize(new java.awt.Dimension(35, 35));
        num60.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell60Layout = new javax.swing.GroupLayout(cell60);
        cell60.setLayout(cell60Layout);
        cell60Layout.setHorizontalGroup(
            cell60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell60Layout.createSequentialGroup()
                .addComponent(num60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell60Layout.setVerticalGroup(
            cell60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell60Layout.createSequentialGroup()
                .addComponent(num60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box7.add(cell60, gridBagConstraints);

        cell61.setBackground(new java.awt.Color(255, 255, 255));
        cell61.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell61.setMaximumSize(new java.awt.Dimension(40, 40));
        cell61.setMinimumSize(new java.awt.Dimension(40, 40));

        num61.setEditable(false);
        num61.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num61.setText("3");
        num61.setMaximumSize(new java.awt.Dimension(35, 35));
        num61.setMinimumSize(new java.awt.Dimension(35, 35));
        num61.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell61Layout = new javax.swing.GroupLayout(cell61);
        cell61.setLayout(cell61Layout);
        cell61Layout.setHorizontalGroup(
            cell61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell61Layout.createSequentialGroup()
                .addComponent(num61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell61Layout.setVerticalGroup(
            cell61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell61Layout.createSequentialGroup()
                .addComponent(num61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box7.add(cell61, gridBagConstraints);

        cell62.setBackground(new java.awt.Color(255, 255, 255));
        cell62.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell62.setMaximumSize(new java.awt.Dimension(40, 40));
        cell62.setMinimumSize(new java.awt.Dimension(40, 40));

        num62.setBackground(new java.awt.Color(240, 240, 240));
        num62.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num62.setMaximumSize(new java.awt.Dimension(35, 35));
        num62.setMinimumSize(new java.awt.Dimension(35, 35));
        num62.setPreferredSize(new java.awt.Dimension(35, 35));
        num62.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num62KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell62Layout = new javax.swing.GroupLayout(cell62);
        cell62.setLayout(cell62Layout);
        cell62Layout.setHorizontalGroup(
            cell62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell62Layout.createSequentialGroup()
                .addComponent(num62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell62Layout.setVerticalGroup(
            cell62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell62Layout.createSequentialGroup()
                .addComponent(num62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box7.add(cell62, gridBagConstraints);

        cell63.setBackground(new java.awt.Color(255, 255, 255));
        cell63.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell63.setMaximumSize(new java.awt.Dimension(40, 40));
        cell63.setMinimumSize(new java.awt.Dimension(40, 40));

        num63.setBackground(new java.awt.Color(240, 240, 240));
        num63.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num63.setMaximumSize(new java.awt.Dimension(35, 35));
        num63.setMinimumSize(new java.awt.Dimension(35, 35));
        num63.setPreferredSize(new java.awt.Dimension(35, 35));
        num63.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num63KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell63Layout = new javax.swing.GroupLayout(cell63);
        cell63.setLayout(cell63Layout);
        cell63Layout.setHorizontalGroup(
            cell63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell63Layout.createSequentialGroup()
                .addComponent(num63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell63Layout.setVerticalGroup(
            cell63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell63Layout.createSequentialGroup()
                .addComponent(num63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box7.add(cell63, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        sudokuPanel.add(box7, gridBagConstraints);

        box8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        box8.setMaximumSize(new java.awt.Dimension(120, 120));
        box8.setMinimumSize(new java.awt.Dimension(120, 120));
        box8.setLayout(new java.awt.GridBagLayout());

        cell64.setBackground(new java.awt.Color(255, 255, 255));
        cell64.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell64.setMaximumSize(new java.awt.Dimension(40, 40));
        cell64.setMinimumSize(new java.awt.Dimension(40, 40));

        num64.setBackground(new java.awt.Color(240, 240, 240));
        num64.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num64.setMaximumSize(new java.awt.Dimension(35, 35));
        num64.setMinimumSize(new java.awt.Dimension(35, 35));
        num64.setPreferredSize(new java.awt.Dimension(35, 35));
        num64.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num64KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell64Layout = new javax.swing.GroupLayout(cell64);
        cell64.setLayout(cell64Layout);
        cell64Layout.setHorizontalGroup(
            cell64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell64Layout.createSequentialGroup()
                .addComponent(num64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell64Layout.setVerticalGroup(
            cell64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell64Layout.createSequentialGroup()
                .addComponent(num64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box8.add(cell64, new java.awt.GridBagConstraints());

        cell65.setBackground(new java.awt.Color(255, 255, 255));
        cell65.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell65.setMaximumSize(new java.awt.Dimension(40, 40));
        cell65.setMinimumSize(new java.awt.Dimension(40, 40));

        num65.setBackground(new java.awt.Color(240, 240, 240));
        num65.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num65.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num65.setMaximumSize(new java.awt.Dimension(35, 35));
        num65.setMinimumSize(new java.awt.Dimension(35, 35));
        num65.setPreferredSize(new java.awt.Dimension(35, 35));
        num65.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num65KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell65Layout = new javax.swing.GroupLayout(cell65);
        cell65.setLayout(cell65Layout);
        cell65Layout.setHorizontalGroup(
            cell65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell65Layout.createSequentialGroup()
                .addComponent(num65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell65Layout.setVerticalGroup(
            cell65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell65Layout.createSequentialGroup()
                .addComponent(num65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box8.add(cell65, new java.awt.GridBagConstraints());

        cell66.setBackground(new java.awt.Color(255, 255, 255));
        cell66.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell66.setMaximumSize(new java.awt.Dimension(40, 40));
        cell66.setMinimumSize(new java.awt.Dimension(40, 40));

        num66.setBackground(new java.awt.Color(240, 240, 240));
        num66.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num66.setMaximumSize(new java.awt.Dimension(35, 35));
        num66.setMinimumSize(new java.awt.Dimension(35, 35));
        num66.setPreferredSize(new java.awt.Dimension(35, 35));
        num66.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num66KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell66Layout = new javax.swing.GroupLayout(cell66);
        cell66.setLayout(cell66Layout);
        cell66Layout.setHorizontalGroup(
            cell66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell66Layout.createSequentialGroup()
                .addComponent(num66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell66Layout.setVerticalGroup(
            cell66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell66Layout.createSequentialGroup()
                .addComponent(num66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box8.add(cell66, new java.awt.GridBagConstraints());

        cell67.setBackground(new java.awt.Color(255, 255, 255));
        cell67.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell67.setMaximumSize(new java.awt.Dimension(40, 40));
        cell67.setMinimumSize(new java.awt.Dimension(40, 40));

        num67.setBackground(new java.awt.Color(240, 240, 240));
        num67.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num67.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num67.setMaximumSize(new java.awt.Dimension(35, 35));
        num67.setMinimumSize(new java.awt.Dimension(35, 35));
        num67.setPreferredSize(new java.awt.Dimension(35, 35));
        num67.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num67KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell67Layout = new javax.swing.GroupLayout(cell67);
        cell67.setLayout(cell67Layout);
        cell67Layout.setHorizontalGroup(
            cell67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell67Layout.createSequentialGroup()
                .addComponent(num67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell67Layout.setVerticalGroup(
            cell67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell67Layout.createSequentialGroup()
                .addComponent(num67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box8.add(cell67, gridBagConstraints);

        cell68.setBackground(new java.awt.Color(255, 255, 255));
        cell68.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell68.setMaximumSize(new java.awt.Dimension(40, 40));
        cell68.setMinimumSize(new java.awt.Dimension(40, 40));

        num68.setBackground(new java.awt.Color(240, 240, 240));
        num68.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num68.setMaximumSize(new java.awt.Dimension(35, 35));
        num68.setMinimumSize(new java.awt.Dimension(35, 35));
        num68.setPreferredSize(new java.awt.Dimension(35, 35));
        num68.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num68KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell68Layout = new javax.swing.GroupLayout(cell68);
        cell68.setLayout(cell68Layout);
        cell68Layout.setHorizontalGroup(
            cell68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell68Layout.createSequentialGroup()
                .addComponent(num68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell68Layout.setVerticalGroup(
            cell68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell68Layout.createSequentialGroup()
                .addComponent(num68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box8.add(cell68, gridBagConstraints);

        cell69.setBackground(new java.awt.Color(255, 255, 255));
        cell69.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell69.setMaximumSize(new java.awt.Dimension(40, 40));
        cell69.setMinimumSize(new java.awt.Dimension(40, 40));

        num69.setBackground(new java.awt.Color(240, 240, 240));
        num69.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num69.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num69.setMaximumSize(new java.awt.Dimension(35, 35));
        num69.setMinimumSize(new java.awt.Dimension(35, 35));
        num69.setPreferredSize(new java.awt.Dimension(35, 35));
        num69.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num69KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell69Layout = new javax.swing.GroupLayout(cell69);
        cell69.setLayout(cell69Layout);
        cell69Layout.setHorizontalGroup(
            cell69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell69Layout.createSequentialGroup()
                .addComponent(num69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell69Layout.setVerticalGroup(
            cell69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell69Layout.createSequentialGroup()
                .addComponent(num69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box8.add(cell69, gridBagConstraints);

        cell70.setBackground(new java.awt.Color(255, 255, 255));
        cell70.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell70.setMaximumSize(new java.awt.Dimension(40, 40));
        cell70.setMinimumSize(new java.awt.Dimension(40, 40));

        num70.setEditable(false);
        num70.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num70.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num70.setText("9");
        num70.setMaximumSize(new java.awt.Dimension(35, 35));
        num70.setMinimumSize(new java.awt.Dimension(35, 35));
        num70.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell70Layout = new javax.swing.GroupLayout(cell70);
        cell70.setLayout(cell70Layout);
        cell70Layout.setHorizontalGroup(
            cell70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell70Layout.createSequentialGroup()
                .addComponent(num70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell70Layout.setVerticalGroup(
            cell70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell70Layout.createSequentialGroup()
                .addComponent(num70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box8.add(cell70, gridBagConstraints);

        cell71.setBackground(new java.awt.Color(255, 255, 255));
        cell71.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell71.setMaximumSize(new java.awt.Dimension(40, 40));
        cell71.setMinimumSize(new java.awt.Dimension(40, 40));

        num71.setBackground(new java.awt.Color(240, 240, 240));
        num71.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num71.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num71.setMaximumSize(new java.awt.Dimension(35, 35));
        num71.setMinimumSize(new java.awt.Dimension(35, 35));
        num71.setPreferredSize(new java.awt.Dimension(35, 35));
        num71.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num71KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell71Layout = new javax.swing.GroupLayout(cell71);
        cell71.setLayout(cell71Layout);
        cell71Layout.setHorizontalGroup(
            cell71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell71Layout.createSequentialGroup()
                .addComponent(num71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell71Layout.setVerticalGroup(
            cell71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell71Layout.createSequentialGroup()
                .addComponent(num71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box8.add(cell71, gridBagConstraints);

        cell72.setBackground(new java.awt.Color(255, 255, 255));
        cell72.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell72.setMaximumSize(new java.awt.Dimension(40, 40));
        cell72.setMinimumSize(new java.awt.Dimension(40, 40));

        num72.setEditable(false);
        num72.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num72.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num72.setText("2");
        num72.setMaximumSize(new java.awt.Dimension(35, 35));
        num72.setMinimumSize(new java.awt.Dimension(35, 35));
        num72.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell72Layout = new javax.swing.GroupLayout(cell72);
        cell72.setLayout(cell72Layout);
        cell72Layout.setHorizontalGroup(
            cell72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell72Layout.createSequentialGroup()
                .addComponent(num72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell72Layout.setVerticalGroup(
            cell72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell72Layout.createSequentialGroup()
                .addComponent(num72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box8.add(cell72, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        sudokuPanel.add(box8, gridBagConstraints);

        box9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        box9.setMaximumSize(new java.awt.Dimension(120, 120));
        box9.setMinimumSize(new java.awt.Dimension(120, 120));
        box9.setLayout(new java.awt.GridBagLayout());

        cell73.setBackground(new java.awt.Color(255, 255, 255));
        cell73.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell73.setMaximumSize(new java.awt.Dimension(40, 40));
        cell73.setMinimumSize(new java.awt.Dimension(40, 40));

        num73.setBackground(new java.awt.Color(240, 240, 240));
        num73.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num73.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num73.setMaximumSize(new java.awt.Dimension(35, 35));
        num73.setMinimumSize(new java.awt.Dimension(35, 35));
        num73.setPreferredSize(new java.awt.Dimension(35, 35));
        num73.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num73KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell73Layout = new javax.swing.GroupLayout(cell73);
        cell73.setLayout(cell73Layout);
        cell73Layout.setHorizontalGroup(
            cell73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell73Layout.createSequentialGroup()
                .addComponent(num73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell73Layout.setVerticalGroup(
            cell73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell73Layout.createSequentialGroup()
                .addComponent(num73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box9.add(cell73, new java.awt.GridBagConstraints());

        cell74.setBackground(new java.awt.Color(255, 255, 255));
        cell74.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell74.setMaximumSize(new java.awt.Dimension(40, 40));
        cell74.setMinimumSize(new java.awt.Dimension(40, 40));

        num74.setEditable(false);
        num74.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num74.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num74.setText("9");
        num74.setMaximumSize(new java.awt.Dimension(35, 35));
        num74.setMinimumSize(new java.awt.Dimension(35, 35));
        num74.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell74Layout = new javax.swing.GroupLayout(cell74);
        cell74.setLayout(cell74Layout);
        cell74Layout.setHorizontalGroup(
            cell74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell74Layout.createSequentialGroup()
                .addComponent(num74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell74Layout.setVerticalGroup(
            cell74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell74Layout.createSequentialGroup()
                .addComponent(num74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box9.add(cell74, new java.awt.GridBagConstraints());

        cell75.setBackground(new java.awt.Color(255, 255, 255));
        cell75.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell75.setMaximumSize(new java.awt.Dimension(40, 40));
        cell75.setMinimumSize(new java.awt.Dimension(40, 40));

        num75.setBackground(new java.awt.Color(240, 240, 240));
        num75.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num75.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num75.setMaximumSize(new java.awt.Dimension(35, 35));
        num75.setMinimumSize(new java.awt.Dimension(35, 35));
        num75.setPreferredSize(new java.awt.Dimension(35, 35));
        num75.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num75KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell75Layout = new javax.swing.GroupLayout(cell75);
        cell75.setLayout(cell75Layout);
        cell75Layout.setHorizontalGroup(
            cell75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell75Layout.createSequentialGroup()
                .addComponent(num75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell75Layout.setVerticalGroup(
            cell75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell75Layout.createSequentialGroup()
                .addComponent(num75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        box9.add(cell75, new java.awt.GridBagConstraints());

        cell76.setBackground(new java.awt.Color(255, 255, 255));
        cell76.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell76.setMaximumSize(new java.awt.Dimension(40, 40));
        cell76.setMinimumSize(new java.awt.Dimension(40, 40));

        num76.setBackground(new java.awt.Color(240, 240, 240));
        num76.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num76.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num76.setMaximumSize(new java.awt.Dimension(35, 35));
        num76.setMinimumSize(new java.awt.Dimension(35, 35));
        num76.setPreferredSize(new java.awt.Dimension(35, 35));
        num76.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num76KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell76Layout = new javax.swing.GroupLayout(cell76);
        cell76.setLayout(cell76Layout);
        cell76Layout.setHorizontalGroup(
            cell76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell76Layout.createSequentialGroup()
                .addComponent(num76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell76Layout.setVerticalGroup(
            cell76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell76Layout.createSequentialGroup()
                .addComponent(num76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box9.add(cell76, gridBagConstraints);

        cell77.setBackground(new java.awt.Color(255, 255, 255));
        cell77.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell77.setMaximumSize(new java.awt.Dimension(40, 40));
        cell77.setMinimumSize(new java.awt.Dimension(40, 40));

        num77.setBackground(new java.awt.Color(240, 240, 240));
        num77.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num77.setMaximumSize(new java.awt.Dimension(35, 35));
        num77.setMinimumSize(new java.awt.Dimension(35, 35));
        num77.setPreferredSize(new java.awt.Dimension(35, 35));
        num77.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num77KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell77Layout = new javax.swing.GroupLayout(cell77);
        cell77.setLayout(cell77Layout);
        cell77Layout.setHorizontalGroup(
            cell77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell77Layout.createSequentialGroup()
                .addComponent(num77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell77Layout.setVerticalGroup(
            cell77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell77Layout.createSequentialGroup()
                .addComponent(num77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box9.add(cell77, gridBagConstraints);

        cell78.setBackground(new java.awt.Color(255, 255, 255));
        cell78.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell78.setMaximumSize(new java.awt.Dimension(40, 40));
        cell78.setMinimumSize(new java.awt.Dimension(40, 40));

        num78.setBackground(new java.awt.Color(240, 240, 240));
        num78.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num78.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num78.setMaximumSize(new java.awt.Dimension(35, 35));
        num78.setMinimumSize(new java.awt.Dimension(35, 35));
        num78.setPreferredSize(new java.awt.Dimension(35, 35));
        num78.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num78KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell78Layout = new javax.swing.GroupLayout(cell78);
        cell78.setLayout(cell78Layout);
        cell78Layout.setHorizontalGroup(
            cell78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell78Layout.createSequentialGroup()
                .addComponent(num78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell78Layout.setVerticalGroup(
            cell78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell78Layout.createSequentialGroup()
                .addComponent(num78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box9.add(cell78, gridBagConstraints);

        cell79.setBackground(new java.awt.Color(255, 255, 255));
        cell79.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell79.setMaximumSize(new java.awt.Dimension(40, 40));
        cell79.setMinimumSize(new java.awt.Dimension(40, 40));
        cell79.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cell79KeyTyped(evt);
            }
        });

        num79.setBackground(new java.awt.Color(240, 240, 240));
        num79.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num79.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num79.setMaximumSize(new java.awt.Dimension(35, 35));
        num79.setMinimumSize(new java.awt.Dimension(35, 35));
        num79.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell79Layout = new javax.swing.GroupLayout(cell79);
        cell79.setLayout(cell79Layout);
        cell79Layout.setHorizontalGroup(
            cell79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell79Layout.createSequentialGroup()
                .addComponent(num79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell79Layout.setVerticalGroup(
            cell79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell79Layout.createSequentialGroup()
                .addComponent(num79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box9.add(cell79, gridBagConstraints);

        cell80.setBackground(new java.awt.Color(255, 255, 255));
        cell80.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell80.setMaximumSize(new java.awt.Dimension(40, 40));
        cell80.setMinimumSize(new java.awt.Dimension(40, 40));

        num80.setBackground(new java.awt.Color(240, 240, 240));
        num80.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num80.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num80.setMaximumSize(new java.awt.Dimension(35, 35));
        num80.setMinimumSize(new java.awt.Dimension(35, 35));
        num80.setPreferredSize(new java.awt.Dimension(35, 35));
        num80.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num80KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout cell80Layout = new javax.swing.GroupLayout(cell80);
        cell80.setLayout(cell80Layout);
        cell80Layout.setHorizontalGroup(
            cell80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell80Layout.createSequentialGroup()
                .addComponent(num80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell80Layout.setVerticalGroup(
            cell80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell80Layout.createSequentialGroup()
                .addComponent(num80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box9.add(cell80, gridBagConstraints);

        cell81.setBackground(new java.awt.Color(255, 255, 255));
        cell81.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell81.setMaximumSize(new java.awt.Dimension(40, 40));
        cell81.setMinimumSize(new java.awt.Dimension(40, 40));

        num81.setEditable(false);
        num81.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        num81.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num81.setText("5");
        num81.setMaximumSize(new java.awt.Dimension(35, 35));
        num81.setMinimumSize(new java.awt.Dimension(35, 35));
        num81.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout cell81Layout = new javax.swing.GroupLayout(cell81);
        cell81.setLayout(cell81Layout);
        cell81Layout.setHorizontalGroup(
            cell81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell81Layout.createSequentialGroup()
                .addComponent(num81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cell81Layout.setVerticalGroup(
            cell81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cell81Layout.createSequentialGroup()
                .addComponent(num81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box9.add(cell81, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        sudokuPanel.add(box9, gridBagConstraints);

        submitButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        quitButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("RaysHand", 0, 18)); // NOI18N
        status.setForeground(new java.awt.Color(255, 153, 51));
        status.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        cheatButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cheatButton.setText("Cheat");
        cheatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheatButtonActionPerformed(evt);
            }
        });

        scoreTag.setFont(new java.awt.Font("RaysHand", 0, 18)); // NOI18N
        scoreTag.setForeground(new java.awt.Color(255, 153, 51));
        scoreTag.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        scoreTag.setText("Score:");

        score.setFont(new java.awt.Font("RaysHand", 0, 48)); // NOI18N
        score.setForeground(new java.awt.Color(255, 153, 51));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gameName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(submitButton)
                    .addComponent(scoreTag)
                    .addComponent(score, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(sudokuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(currentDateAndTime)
                        .addComponent(quitButton, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cheatButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currentDateAndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gameName))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cheatButton))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(scoreTag)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quitButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(sudokuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Methods: num[1-81]KeyTyped
    //Purpose: updates the cell based on what the user typed
    private void num3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num3KeyTyped
        updateText(3, evt);
    }//GEN-LAST:event_num3KeyTyped

    private void num4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num4KeyTyped
        updateText(4, evt);
    }//GEN-LAST:event_num4KeyTyped

    private void num5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num5KeyTyped
        updateText(5, evt);
    }//GEN-LAST:event_num5KeyTyped

    private void num6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num6KeyTyped
        updateText(6, evt);
    }//GEN-LAST:event_num6KeyTyped

    private void num7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num7KeyTyped
        updateText(7, evt);
    }//GEN-LAST:event_num7KeyTyped

    private void num9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num9KeyTyped
        updateText(9, evt);
    }//GEN-LAST:event_num9KeyTyped

    private void num11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num11KeyTyped
        updateText(11, evt);
    }//GEN-LAST:event_num11KeyTyped

    private void num13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num13KeyTyped
        updateText(13, evt);
    }//GEN-LAST:event_num13KeyTyped

    private void num14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num14KeyTyped
        updateText(14, evt);
    }//GEN-LAST:event_num14KeyTyped

    private void num15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num15KeyTyped
        updateText(15, evt);
    }//GEN-LAST:event_num15KeyTyped

    private void num16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num16KeyTyped
        updateText(16, evt);
    }//GEN-LAST:event_num16KeyTyped

    private void num17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num17KeyTyped
        updateText(17, evt);
    }//GEN-LAST:event_num17KeyTyped

    private void num18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num18KeyTyped
        updateText(18, evt);
    }//GEN-LAST:event_num18KeyTyped

    private void num19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num19KeyTyped
        updateText(19, evt);
    }//GEN-LAST:event_num19KeyTyped

    private void num20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num20KeyTyped
        updateText(20, evt);
    }//GEN-LAST:event_num20KeyTyped

    private void num23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num23KeyTyped
        updateText(23, evt);
    }//GEN-LAST:event_num23KeyTyped

    private void num24KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num24KeyTyped
        updateText(24, evt);
    }//GEN-LAST:event_num24KeyTyped

    private void cell27KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cell27KeyTyped
        updateText(27, evt);
    }//GEN-LAST:event_cell27KeyTyped

    private void num29KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num29KeyTyped
        updateText(29, evt);
    }//GEN-LAST:event_num29KeyTyped

    private void num31KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num31KeyTyped
        updateText(31, evt);
    }//GEN-LAST:event_num31KeyTyped

    private void num32KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num32KeyTyped
        updateText(32, evt);
    }//GEN-LAST:event_num32KeyTyped

    private void num33KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num33KeyTyped
        updateText(33, evt);
    }//GEN-LAST:event_num33KeyTyped

    private void num34KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num34KeyTyped
        updateText(34, evt);
    }//GEN-LAST:event_num34KeyTyped

    private void num37KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num37KeyTyped
        updateText(37, evt);
    }//GEN-LAST:event_num37KeyTyped

    private void num39KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num39KeyTyped
        updateText(39, evt);
    }//GEN-LAST:event_num39KeyTyped

    private void num40KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num40KeyTyped
        updateText(40, evt);
    }//GEN-LAST:event_num40KeyTyped

    private void num42KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num42KeyTyped
        updateText(42, evt);
    }//GEN-LAST:event_num42KeyTyped

    private void num43KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num43KeyTyped
        updateText(43, evt);
    }//GEN-LAST:event_num43KeyTyped

    private void num45KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num45KeyTyped
        updateText(45, evt);
    }//GEN-LAST:event_num45KeyTyped

    private void num48KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num48KeyTyped
        updateText(48, evt);
    }//GEN-LAST:event_num48KeyTyped

    private void num49KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num49KeyTyped
        updateText(49, evt);
    }//GEN-LAST:event_num49KeyTyped

    private void num50KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num50KeyTyped
        updateText(50, evt);
    }//GEN-LAST:event_num50KeyTyped

    private void num51KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num51KeyTyped
        updateText(51, evt);
    }//GEN-LAST:event_num51KeyTyped

    private void num53KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num53KeyTyped
        updateText(53, evt);
    }//GEN-LAST:event_num53KeyTyped

    private void num55KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num55KeyTyped
        updateText(55, evt);
    }//GEN-LAST:event_num55KeyTyped

    private void num58KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num58KeyTyped
        updateText(58, evt);
    }//GEN-LAST:event_num58KeyTyped

    private void num59KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num59KeyTyped
        updateText(59, evt);
    }//GEN-LAST:event_num59KeyTyped

    private void num62KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num62KeyTyped
        updateText(62, evt);
    }//GEN-LAST:event_num62KeyTyped

    private void num63KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num63KeyTyped
        updateText(63, evt);
    }//GEN-LAST:event_num63KeyTyped

    private void num64KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num64KeyTyped
        updateText(64, evt);
    }//GEN-LAST:event_num64KeyTyped

    private void num65KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num65KeyTyped
        updateText(65, evt);
    }//GEN-LAST:event_num65KeyTyped

    private void num66KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num66KeyTyped
        updateText(66, evt);
    }//GEN-LAST:event_num66KeyTyped

    private void num67KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num67KeyTyped
        updateText(67, evt);
    }//GEN-LAST:event_num67KeyTyped

    private void num68KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num68KeyTyped
        updateText(68, evt);
    }//GEN-LAST:event_num68KeyTyped

    private void num69KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num69KeyTyped
        updateText(69, evt);
    }//GEN-LAST:event_num69KeyTyped

    private void num71KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num71KeyTyped
        updateText(70, evt);
    }//GEN-LAST:event_num71KeyTyped

    private void num73KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num73KeyTyped
        updateText(73, evt);
    }//GEN-LAST:event_num73KeyTyped

    private void num75KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num75KeyTyped
        updateText(75, evt);
    }//GEN-LAST:event_num75KeyTyped

    private void num76KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num76KeyTyped
        updateText(76, evt);
    }//GEN-LAST:event_num76KeyTyped

    private void num77KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num77KeyTyped
        updateText(77, evt);
    }//GEN-LAST:event_num77KeyTyped

    private void num78KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num78KeyTyped
        updateText(78, evt);
    }//GEN-LAST:event_num78KeyTyped

    private void cell79KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cell79KeyTyped
        updateText(79, evt);
    }//GEN-LAST:event_cell79KeyTyped

    private void num80KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num80KeyTyped
        updateText(80, evt);
    }//GEN-LAST:event_num80KeyTyped

    //Method: submitButtonActionPerformed()
    //Purpose: updates the score based on what the user has
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        updateScore();
    }//GEN-LAST:event_submitButtonActionPerformed

    //Method: quitButtonActionPerformed()
    //Purpose: 
    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        new EndPage(gameScore + overallScore);
        this.dispose();
    }//GEN-LAST:event_quitButtonActionPerformed

    private void num2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num2KeyTyped
        updateText(2, evt);
    }//GEN-LAST:event_num2KeyTyped

    //Method: cheatButtonActionPerformed()
    //Purpose: Fills enter sudoku board so we can check special cases for errors
    private void cheatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheatButtonActionPerformed
        //Fills entire board
        for(int i = 0; i < listOfCells.length; i++) {
            listOfCells[i].setForeground(Color.BLACK);
            listOfCells[i].setText(Integer.toString(answerKey[i]));
        }
    }//GEN-LAST:event_cheatButtonActionPerformed
    
    //Method: updateScore()
    //Purpose: Submit button will update the score the player recieves.
    private void updateScore() {
        //try catch will handle the cases where there are still empty or nonvalid
        //inputs on our game board.
        //Otherwise if all spaces are filled, score will update and game status
        //will be checked to either continue or end the game.
        try {
            //Our array of boolean values, correct[], is false for any incorrect or given answer
            //Given values are false by default, blank edittable spots are true by default
            //Any spot found to be incorrect input will be turned false here
            //correct[] can only be turned false, never true (only take away points)
            for(int i = 0; i < listOfCells.length; i++) {
                if(Integer.parseInt(listOfCells[i].getText()) ==  0) {
                    throw new NumberFormatException();
                } else if(Integer.parseInt(listOfCells[i].getText()) != answerKey[i]) {
                    correct[i] = false;
                }
            }
            //Score is set to 0 every time to ensure we do not take or give too many points
            int possibleScore = 0;
            //For every true in our array, we add 10 points
            //With a maximum possible score of 540
            for(int i = 0; i < correct.length; i++) {
                if(correct[i])
                    possibleScore = possibleScore + 10;
            }
            
            //Set current gameScore using possibleScore
            gameScore = possibleScore;
            //50% or higher correct, text is green to indicate a good score
            //50% to 20% is yellow for an average score
            //Less than 20% is red for a bad score
            score.setText(Integer.toString(gameScore));
            if(gameScore <= 540 && gameScore >= 270) {
                score.setForeground(Color.GREEN);
            } else if(gameScore < 270 && gameScore >= 110) {
                score.setForeground(Color.YELLOW);
            } else if(gameScore < 110) {
                score.setForeground(Color.RED);
            }
            
            //Check if game is over
            gameOver(checkGameStatus());
            
        } catch(NumberFormatException e) {
            //If we were unable to completely sort through the enter array of JLabels,
            //it's because there was either an invalid input or no input
            status.setForeground(Color.RED);
            //Display error message
            status.setText("<html>Missing or<br>invalid spaces<br>Score was<br>not recorded</html>");
            //After 2 seconds, JLabel is returned to normal (Message removed)
            Timer timer = new Timer(0, new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    status.setText("");
                    status.setForeground(Color.BLACK);
                }
            });
            timer.setInitialDelay(2000);
            timer.setRepeats(false);
            timer.start();
        }
    }
    
    //Method: checkGameStatus()
    //Purpose: Returns false (game is not over), if there is any user input that does
    //not match the answer key. Returns true (game is over), if all answers match key
    private boolean checkGameStatus() {
        for(int i = 0; i < listOfCells.length; i++) {
            if(Integer.parseInt(listOfCells[i].getText()) != answerKey[i]) {
                return false;
            }
        }
        return true;
    }
    
    //Method: gameOver(boolean)
    //Purpose: If game is won, Add game score to overall score and go to end page
    //If game is not over, prints "Incorrect solution" to indicate game is not finished
    private void gameOver(boolean gameWon) {
        if(gameWon) {
            overallScore = overallScore + gameScore;
            status.setForeground(Color.GREEN);
            status.setText("<html>You<br>win!</html>");
        } else {
            status.setForeground(Color.RED);
            status.setText("<html>Incorrect<br>Solution</html>");
        }
        Timer timer = new Timer(0, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if(gameWon) {
                    new EndPage(overallScore);
                    SudokuGame.this.dispose();
                } else {
                    status.setText("");
                    status.setForeground(Color.BLACK);
                }
            }
        });
        timer.setInitialDelay(1000);
        timer.setRepeats(false);
        timer.start();
    }
    
    //Method: updateText(int, event)
    //Purpose: Updates the appropriate JTextField based on which cell was clicked
    //and which key was typed
    private void updateText(int cellNumClicked, KeyEvent e) {
        int keyTyped = 0;
        //Based on key typed event, gets the associated virtual key and returns
        //the literal numerical value 1-9, if a key was pressed that is not 1-9
        //value returned is simply 0
        switch(e.getKeyChar()) {
            case 49:
                keyTyped = 1;
                break;
            case 50:
                keyTyped = 2;
                break;
            case 51:
                keyTyped = 3;
                break;
            case 52:
                keyTyped = 4;
                break;
            case 53:
                keyTyped = 5;
                break;
            case 54:
                keyTyped = 6;
                break;
            case 55:
                keyTyped = 7;
                break;
            case 56:
                keyTyped = 8;
                break;
            case 57:
                keyTyped = 9;
                break;
            case 8:
                keyTyped = 127;
                break;
            default:
                keyTyped = 0;
                break;
        }
        //Get the text that the user entered
        String input = listOfCells[cellNumClicked - 1].getText();
        //If the user entered more than one number, a letter, or a special character
        //Text will turn red to indicate inappropriate answer
        if(keyTyped == 0 || input.matches("^\\d+$") || input.matches(".*[A-Za-z].*") ||
                input.matches(".*[\\\\\"\\~\\@\\#\\%\\&\\:\\;\\'\\,\\/\\(\\)\\[\\]\\{\\}"
                        + "\\^\\$\\|\\?\\*\\+\\.\\<\\>\\-\\=\\!\\_].*")) {
            listOfCells[cellNumClicked - 1].setForeground(Color.RED);
        //If text entered is a numerical value between 1-9, text will be black
        } else if(keyTyped >= 1 && keyTyped <= 9) {
            listOfCells[cellNumClicked - 1].setForeground(Color.BLACK);
        }
        //If user had entered more than 1 character, text will be red.
        //When backspacing, if text is a single digit and non-zero (a valid input)
        //the text will turn black again, otherwise text will stay red
        if(keyTyped == 127 && input.matches("^\\d$") && !input.matches("0")) {
            listOfCells[cellNumClicked - 1].setForeground(Color.BLACK);
        }
    }
    
    //Method: initVariables(int)
    //Purpose: Keep track of overall score
    private void initVariables(int score) {
        overallScore = score;
    }
    
    //Method: initArrayOfCells()
    //Purpose: Creates arrays for our JLabels, answerKey, and an array of boolean
    private void initArrayOfCells() {
        //Create an array of JLabels we need to interact with
                                    //Box 1
        listOfCells = new JTextField[]{ num1, num2, num3,
                                    num4, num5, num6,
                                    num7, num8, num9,
                                    //Box 2
                                    num10, num11, num12,
                                    num13, num14, num15,
                                    num16, num17, num18,
                                    //Box 3
                                    num19, num20, num21,
                                    num22, num23, num24,
                                    num25, num26, num27,
                                    //Box 4
                                    num28, num29, num30,
                                    num31, num32, num33,
                                    num34, num35, num36,
                                    //Box 5
                                    num37, num38, num39,
                                    num40, num41, num42,
                                    num43, num44, num45,
                                    //Box 6
                                    num46, num47, num48,
                                    num49, num50, num51,
                                    num52, num53, num54,
                                    //Box 7
                                    num55, num56, num57,
                                    num58, num59, num60,
                                    num61, num62, num63,
                                    //Box 8
                                    num64, num65, num66,
                                    num67, num68, num69,
                                    num70, num71, num72,
                                    //Box 9
                                    num73, num74, num75,
                                    num76, num77, num78,
                                    num79, num80, num81 };
        
        //Create an array as our answer key, easy visualization of answer key
                                //Box 1
        answerKey = new int[]{  8, 3, 5,
                                2, 9, 6,
                                4, 1, 7,
                                //Box 2
                                4, 1, 6,
                                8, 5, 7,
                                2, 9, 3,
                                //Box 3
                                9, 2, 7,
                                4, 3, 1,
                                6, 5, 8,
                                //Box 4
                                5, 6, 9,
                                1, 2 ,3,
                                7, 4, 8,
                                //Box 5
                                1, 3, 4,
                                6, 7, 8,
                                5, 2, 9,
                                //Box 6
                                7, 8, 2,
                                5, 4, 9,
                                1, 6, 3,
                                //Box 7
                                6, 5, 2,
                                9, 8, 1,
                                3, 7, 4,
                                //Box 8
                                7, 8, 1,
                                3, 4, 5,
                                9, 6, 2,
                                //Box 9
                                3, 9, 4,
                                2, 7, 6,
                                8, 1, 5 };
        
        //For every true (correct answer), +10 points, 0 points for false (incorrect or given answer)
                                //Box 1
        correct = new boolean[] { false, true, true,
                                true, true, true,
                                true, false, true,
                                //Box 2
                                false, true, false,
                                true, true, true,
                                true, true, true,
                                //Box 3
                                true, true, false,
                                false, true, true,
                                false, false, true,
                                //Box 4
                                false, true, false,
                                true, true, true,
                                true, false, false,
                                //Box 5
                                true, false, true,
                                true, false, true,
                                true, false, true,
                                //Box 6
                                false, false, true,
                                true, true, true,
                                false, true, false,
                                //Box 7
                                true, false, false,
                                true, true, false,
                                false, true, true,
                                //Box 8
                                true, true, true,
                                true, true, true,
                                false, true, false,
                                //Box 9
                                true, false, true,
                                true, true, true,
                                true, true, false };
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
    //Purpose: Implement tool tips for every component
    private void initToolTips() {
        gameName.setToolTipText("Game of Sudoku");
        currentDateAndTime.setToolTipText("Displays current date and time");
        submitButton.setToolTipText("Click here to submit your current board");
        quitButton.setToolTipText("Click here to quit game with current score");
        status.setToolTipText("Displays status of game");
        scoreTag.setToolTipText("Displays current score");
        score.setToolTipText("Displays current score");
        cheatButton.setToolTipText("Click here to fill entire board with correct answers");
        for(int i = 0; i < correct.length; i++) {
            if(!correct[i]) {
                listOfCells[i].setToolTipText("Given clue");
            } else {
                listOfCells[i].setToolTipText("Place answer here");
            }
        }
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
    private javax.swing.JPanel box1;
    private javax.swing.JPanel box2;
    private javax.swing.JPanel box3;
    private javax.swing.JPanel box4;
    private javax.swing.JPanel box5;
    private javax.swing.JPanel box6;
    private javax.swing.JPanel box7;
    private javax.swing.JPanel box8;
    private javax.swing.JPanel box9;
    private javax.swing.JPanel cell1;
    private javax.swing.JPanel cell10;
    private javax.swing.JPanel cell11;
    private javax.swing.JPanel cell12;
    private javax.swing.JPanel cell13;
    private javax.swing.JPanel cell14;
    private javax.swing.JPanel cell15;
    private javax.swing.JPanel cell16;
    private javax.swing.JPanel cell17;
    private javax.swing.JPanel cell18;
    private javax.swing.JPanel cell19;
    private javax.swing.JPanel cell2;
    private javax.swing.JPanel cell20;
    private javax.swing.JPanel cell21;
    private javax.swing.JPanel cell22;
    private javax.swing.JPanel cell23;
    private javax.swing.JPanel cell24;
    private javax.swing.JPanel cell25;
    private javax.swing.JPanel cell26;
    private javax.swing.JPanel cell27;
    private javax.swing.JPanel cell28;
    private javax.swing.JPanel cell29;
    private javax.swing.JPanel cell3;
    private javax.swing.JPanel cell30;
    private javax.swing.JPanel cell31;
    private javax.swing.JPanel cell32;
    private javax.swing.JPanel cell33;
    private javax.swing.JPanel cell34;
    private javax.swing.JPanel cell35;
    private javax.swing.JPanel cell36;
    private javax.swing.JPanel cell37;
    private javax.swing.JPanel cell38;
    private javax.swing.JPanel cell39;
    private javax.swing.JPanel cell4;
    private javax.swing.JPanel cell40;
    private javax.swing.JPanel cell41;
    private javax.swing.JPanel cell42;
    private javax.swing.JPanel cell43;
    private javax.swing.JPanel cell44;
    private javax.swing.JPanel cell45;
    private javax.swing.JPanel cell46;
    private javax.swing.JPanel cell47;
    private javax.swing.JPanel cell48;
    private javax.swing.JPanel cell49;
    private javax.swing.JPanel cell5;
    private javax.swing.JPanel cell50;
    private javax.swing.JPanel cell51;
    private javax.swing.JPanel cell52;
    private javax.swing.JPanel cell53;
    private javax.swing.JPanel cell54;
    private javax.swing.JPanel cell55;
    private javax.swing.JPanel cell56;
    private javax.swing.JPanel cell57;
    private javax.swing.JPanel cell58;
    private javax.swing.JPanel cell59;
    private javax.swing.JPanel cell6;
    private javax.swing.JPanel cell60;
    private javax.swing.JPanel cell61;
    private javax.swing.JPanel cell62;
    private javax.swing.JPanel cell63;
    private javax.swing.JPanel cell64;
    private javax.swing.JPanel cell65;
    private javax.swing.JPanel cell66;
    private javax.swing.JPanel cell67;
    private javax.swing.JPanel cell68;
    private javax.swing.JPanel cell69;
    private javax.swing.JPanel cell7;
    private javax.swing.JPanel cell70;
    private javax.swing.JPanel cell71;
    private javax.swing.JPanel cell72;
    private javax.swing.JPanel cell73;
    private javax.swing.JPanel cell74;
    private javax.swing.JPanel cell75;
    private javax.swing.JPanel cell76;
    private javax.swing.JPanel cell77;
    private javax.swing.JPanel cell78;
    private javax.swing.JPanel cell79;
    private javax.swing.JPanel cell8;
    private javax.swing.JPanel cell80;
    private javax.swing.JPanel cell81;
    private javax.swing.JPanel cell9;
    private javax.swing.JButton cheatButton;
    private javax.swing.JTextField currentDateAndTime;
    private javax.swing.JLabel gameName;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num10;
    private javax.swing.JTextField num11;
    private javax.swing.JTextField num12;
    private javax.swing.JTextField num13;
    private javax.swing.JTextField num14;
    private javax.swing.JTextField num15;
    private javax.swing.JTextField num16;
    private javax.swing.JTextField num17;
    private javax.swing.JTextField num18;
    private javax.swing.JTextField num19;
    private javax.swing.JTextField num2;
    private javax.swing.JTextField num20;
    private javax.swing.JTextField num21;
    private javax.swing.JTextField num22;
    private javax.swing.JTextField num23;
    private javax.swing.JTextField num24;
    private javax.swing.JTextField num25;
    private javax.swing.JTextField num26;
    private javax.swing.JTextField num27;
    private javax.swing.JTextField num28;
    private javax.swing.JTextField num29;
    private javax.swing.JTextField num3;
    private javax.swing.JTextField num30;
    private javax.swing.JTextField num31;
    private javax.swing.JTextField num32;
    private javax.swing.JTextField num33;
    private javax.swing.JTextField num34;
    private javax.swing.JTextField num35;
    private javax.swing.JTextField num36;
    private javax.swing.JTextField num37;
    private javax.swing.JTextField num38;
    private javax.swing.JTextField num39;
    private javax.swing.JTextField num4;
    private javax.swing.JTextField num40;
    private javax.swing.JTextField num41;
    private javax.swing.JTextField num42;
    private javax.swing.JTextField num43;
    private javax.swing.JTextField num44;
    private javax.swing.JTextField num45;
    private javax.swing.JTextField num46;
    private javax.swing.JTextField num47;
    private javax.swing.JTextField num48;
    private javax.swing.JTextField num49;
    private javax.swing.JTextField num5;
    private javax.swing.JTextField num50;
    private javax.swing.JTextField num51;
    private javax.swing.JTextField num52;
    private javax.swing.JTextField num53;
    private javax.swing.JTextField num54;
    private javax.swing.JTextField num55;
    private javax.swing.JTextField num56;
    private javax.swing.JTextField num57;
    private javax.swing.JTextField num58;
    private javax.swing.JTextField num59;
    private javax.swing.JTextField num6;
    private javax.swing.JTextField num60;
    private javax.swing.JTextField num61;
    private javax.swing.JTextField num62;
    private javax.swing.JTextField num63;
    private javax.swing.JTextField num64;
    private javax.swing.JTextField num65;
    private javax.swing.JTextField num66;
    private javax.swing.JTextField num67;
    private javax.swing.JTextField num68;
    private javax.swing.JTextField num69;
    private javax.swing.JTextField num7;
    private javax.swing.JTextField num70;
    private javax.swing.JTextField num71;
    private javax.swing.JTextField num72;
    private javax.swing.JTextField num73;
    private javax.swing.JTextField num74;
    private javax.swing.JTextField num75;
    private javax.swing.JTextField num76;
    private javax.swing.JTextField num77;
    private javax.swing.JTextField num78;
    private javax.swing.JTextField num79;
    private javax.swing.JTextField num8;
    private javax.swing.JTextField num80;
    private javax.swing.JTextField num81;
    private javax.swing.JTextField num9;
    private javax.swing.JButton quitButton;
    private javax.swing.JLabel score;
    private javax.swing.JLabel scoreTag;
    private javax.swing.JLabel status;
    private javax.swing.JButton submitButton;
    private javax.swing.JPanel sudokuPanel;
    // End of variables declaration//GEN-END:variables
}
