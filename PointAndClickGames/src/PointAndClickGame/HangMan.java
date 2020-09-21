/*********************************************************************
* 
*   File: HangMan.java
*   Author: Steven Phung & Alex Vargas
*   Class: CS 2450.01 - Programming Graphical User Interfaces
*
*   Assignment: Point and Click Game v.1.3
*   Date last modified: 10/11/2019
*
*   Purpose: This class generates the hangman game as well as handles
*           all of the game logic.
*
*********************************************************************/
package PointAndClickGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public class HangMan extends javax.swing.JFrame {
    
    //Word bank
    private static final String[] WORD_BANK = {
        "abstract",
        "cemetary",
        "nurse",
        "pharmacy",
        "climbing"
    };
    //Stores our word
    private String currentWord;
    //Store the score, how many guesses the user is allowed to make, and the attempts they're currently at.
    private int score, guessesAllowed, attempts;
    //letters[] stores the word into an array by letters.
    //found[] stores the word into an array by letters found by the user.
    private String letters[], found[];
    //win[] stores true if found[] is a letter and false if found[] is a blank line.
    private boolean win[];

    //Constructor
    public HangMan() {
        initComponents();
        initToolTips();
        currentDateAndTime();
        initVariables();
        initLines(currentWord);
        bindKeys();
        this.setTitle("Hang Man Game");
        this.setResizable(false);
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hangManPanel = new javax.swing.JPanel();
        hangManLabel = new javax.swing.JLabel();
        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        E = new javax.swing.JButton();
        F = new javax.swing.JButton();
        G = new javax.swing.JButton();
        H = new javax.swing.JButton();
        I = new javax.swing.JButton();
        R = new javax.swing.JButton();
        J = new javax.swing.JButton();
        K = new javax.swing.JButton();
        N = new javax.swing.JButton();
        O = new javax.swing.JButton();
        Q = new javax.swing.JButton();
        P = new javax.swing.JButton();
        L = new javax.swing.JButton();
        M = new javax.swing.JButton();
        Z = new javax.swing.JButton();
        U = new javax.swing.JButton();
        X = new javax.swing.JButton();
        S = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        T = new javax.swing.JButton();
        V = new javax.swing.JButton();
        W = new javax.swing.JButton();
        skipButton = new javax.swing.JButton();
        currentScoreLabel = new javax.swing.JLabel();
        actualScore = new javax.swing.JLabel();
        attemptsCounter = new javax.swing.JLabel();
        attemptsLabel = new javax.swing.JLabel();
        hiddenWord = new javax.swing.JLabel();
        hangPic = new javax.swing.JPanel();
        picture = new javax.swing.JLabel();
        currentDateAndTime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));

        hangManPanel.setBackground(new java.awt.Color(11, 28, 71));
        hangManPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hangManPanel.setMaximumSize(new java.awt.Dimension(600, 400));
        hangManPanel.setMinimumSize(new java.awt.Dimension(600, 400));

        hangManLabel.setFont(new java.awt.Font("RaysHand", 0, 36)); // NOI18N
        hangManLabel.setForeground(new java.awt.Color(255, 153, 51));
        hangManLabel.setText("Hangman");

        A.setText("A");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        B.setText("B");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        D.setText("D");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        E.setText("E");
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });

        F.setText("F");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        G.setText("G");
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });

        H.setText("H");
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });

        I.setText("I");
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });

        R.setText("R");
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });

        J.setText("J");
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });

        K.setText("K");
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });

        N.setText("N");
        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });

        O.setText("O");
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });

        Q.setText("Q");
        Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QActionPerformed(evt);
            }
        });

        P.setText("P");
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });

        L.setText("L");
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });

        M.setText("M");
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        Z.setText("Z");
        Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZActionPerformed(evt);
            }
        });

        U.setText("U");
        U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UActionPerformed(evt);
            }
        });

        X.setText("X");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        S.setText("S");
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });

        Y.setText("Y");
        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });

        T.setText("T");
        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });

        V.setText("V");
        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });

        W.setText("W");
        W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WActionPerformed(evt);
            }
        });

        skipButton.setText("Skip");
        skipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipButtonActionPerformed(evt);
            }
        });

        currentScoreLabel.setFont(new java.awt.Font("RaysHand", 0, 18)); // NOI18N
        currentScoreLabel.setForeground(new java.awt.Color(255, 153, 51));
        currentScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currentScoreLabel.setText("Current Score");

        actualScore.setFont(new java.awt.Font("RaysHand", 0, 14)); // NOI18N
        actualScore.setForeground(new java.awt.Color(255, 153, 51));
        actualScore.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        actualScore.setText("100");

        attemptsCounter.setFont(new java.awt.Font("RaysHand", 0, 14)); // NOI18N
        attemptsCounter.setForeground(new java.awt.Color(255, 153, 51));
        attemptsCounter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        attemptsCounter.setText("0");

        attemptsLabel.setFont(new java.awt.Font("RaysHand", 0, 18)); // NOI18N
        attemptsLabel.setForeground(new java.awt.Color(255, 153, 51));
        attemptsLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        attemptsLabel.setText("Misses");

        hiddenWord.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        hiddenWord.setForeground(new java.awt.Color(255, 153, 51));
        hiddenWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hiddenWord.setText("_ _ _ _ _ _ _ _");

        hangPic.setBackground(new java.awt.Color(11, 28, 71));

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2450project/resources/hangman_6.png"))); // NOI18N

        javax.swing.GroupLayout hangPicLayout = new javax.swing.GroupLayout(hangPic);
        hangPic.setLayout(hangPicLayout);
        hangPicLayout.setHorizontalGroup(
            hangPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(picture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hangPicLayout.setVerticalGroup(
            hangPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(picture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        currentDateAndTime.setText(" yyyy/mm/dd hh:mm:ss ");

        javax.swing.GroupLayout hangManPanelLayout = new javax.swing.GroupLayout(hangManPanel);
        hangManPanel.setLayout(hangManPanelLayout);
        hangManPanelLayout.setHorizontalGroup(
            hangManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hangManPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hangManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hangManPanelLayout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addGroup(hangManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hangManPanelLayout.createSequentialGroup()
                                .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Q, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(hangManPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(U, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(W, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(hangManPanelLayout.createSequentialGroup()
                                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49))
                    .addGroup(hangManPanelLayout.createSequentialGroup()
                        .addGroup(hangManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hiddenWord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(hangManPanelLayout.createSequentialGroup()
                                .addGroup(hangManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(hangManPanelLayout.createSequentialGroup()
                                        .addComponent(hangManLabel)
                                        .addGap(0, 321, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hangManPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(hangPic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(hangManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(hangManPanelLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(hangManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(skipButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hangManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(actualScore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(attemptsCounter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                                .addComponent(attemptsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(currentScoreLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hangManPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(currentDateAndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
        hangManPanelLayout.setVerticalGroup(
            hangManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hangManPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hangManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hangManPanelLayout.createSequentialGroup()
                        .addComponent(currentDateAndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(skipButton))
                    .addComponent(hangManLabel))
                .addGap(18, 18, 18)
                .addGroup(hangManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hangManPanelLayout.createSequentialGroup()
                        .addComponent(currentScoreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actualScore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attemptsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attemptsCounter)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(hangPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hiddenWord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hangManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hangManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Q, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hangManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(U, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hangManPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hangManPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Method: skipButtonActionPerformed()
    //Purpose: Skipping the game will lead straight to the end screen.
    //Score is passed as 0.
    private void skipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipButtonActionPerformed
        revealWord();
        changeImage(0);
        Timer timer = new Timer(0, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new ColorGame(0);
                HangMan.this.dispose();
            }
        });
        timer.setInitialDelay(1000);
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_skipButtonActionPerformed

    //Methods: [A-Z]ActionPerformed()
    //Purposes: Pressing any button [A-Z] will disable the button and then
    //call a method update() to update the game status
    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        A.setEnabled(false);
        update("A");
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        B.setEnabled(false);
        update("B");
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        C.setEnabled(false);
        update("C");
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        D.setEnabled(false);
        update("D");
    }//GEN-LAST:event_DActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        E.setEnabled(false);
        update("E");
    }//GEN-LAST:event_EActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        F.setEnabled(false);
        update("F");
    }//GEN-LAST:event_FActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        G.setEnabled(false);
        update("G");
    }//GEN-LAST:event_GActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        H.setEnabled(false);
        update("H");
    }//GEN-LAST:event_HActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        I.setEnabled(false);
        update("I");
    }//GEN-LAST:event_IActionPerformed

    private void JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActionPerformed
        J.setEnabled(false);
        update("J");
    }//GEN-LAST:event_JActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
        K.setEnabled(false);
        update("K");
    }//GEN-LAST:event_KActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        L.setEnabled(false);
        update("L");
    }//GEN-LAST:event_LActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        M.setEnabled(false);
        update("M");
    }//GEN-LAST:event_MActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
        N.setEnabled(false);
        update("N");
    }//GEN-LAST:event_NActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
        O.setEnabled(false);
        update("O");
    }//GEN-LAST:event_OActionPerformed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        P.setEnabled(false);
        update("P");
    }//GEN-LAST:event_PActionPerformed

    private void QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QActionPerformed
        Q.setEnabled(false);
        update("Q");
    }//GEN-LAST:event_QActionPerformed

    private void RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RActionPerformed
        R.setEnabled(false);
        update("R");
    }//GEN-LAST:event_RActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
        S.setEnabled(false);
        update("S");
    }//GEN-LAST:event_SActionPerformed

    private void TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActionPerformed
        T.setEnabled(false);
        update("T");
    }//GEN-LAST:event_TActionPerformed

    private void UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UActionPerformed
        U.setEnabled(false);
        update("U");
    }//GEN-LAST:event_UActionPerformed

    private void VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VActionPerformed
        V.setEnabled(false);
        update("V");
    }//GEN-LAST:event_VActionPerformed

    private void WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WActionPerformed
        W.setEnabled(false);
        update("W");
    }//GEN-LAST:event_WActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        X.setEnabled(false);
        update("X");
    }//GEN-LAST:event_XActionPerformed

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
        Y.setEnabled(false);
        update("Y");
    }//GEN-LAST:event_YActionPerformed

    private void ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZActionPerformed
        Z.setEnabled(false);
        update("Z");
    }//GEN-LAST:event_ZActionPerformed

    //Method: initVariables()
    //Purpose: Initializes game logic variables and picks a random word from WORD_BANK
    private void initVariables() {
        score = 100;
        guessesAllowed = 6;
        attempts = 0;
        
        Random rng = new Random();
        int rdm = rng.nextInt(5);
        currentWord = WORD_BANK[rdm];
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
    
    //Method: initLines(String)
    //Purpose: The current word is received as an argument and is split by
    //letters and stored into letters[].
    //found[] will contain blank lines or any of the letters the user has found.
    //win[] will indicate whether the character in found is true or false.
    //true indicates found[] contains a character, false indicates found[] contains a blank space.
    //Finally, the correct amount of lines is displayed to the screen.
    private void initLines(String wordLength) {
        letters = wordLength.split("");
        String lines = "";
        found = new String[letters.length];
        win = new boolean[letters.length];
        for(int i = 0; i < wordLength.length(); i++) {
            //Last letter does not need a space behind it.
            if(i == wordLength.length() - 1) {
                win[i] = false;
                found[i] = "_";
                lines = lines + "_";
            //Spacing between letters for easier to see format.
            } else {
                win[i] = false;
                found[i] = "_ ";
                lines = lines + "_ ";
            }
        }
        hiddenWord.setText(lines);
    }
    
    //Method: update(String)
    //Purpose: Game will update based on which button's letter was clicked.
    //  If the button's letter matches a letter in our hidden word, that letter is
    //placed in found[], and win[] is updated to true, stating the letter is found.
    //If the user does not find a letter that is a part of our word, we increase
    //the amount of attempts they have made as well as reduce the score, and then
    //display the correct image based on how many attempts they have left.
    //  Based on the new updated game state, we then call a method to update
    //the hidden word, and check whether or not the game is over.
    private void update(String input) {
        boolean find = false;
        for(int i = 0; i < currentWord.length(); i++) {
            if(letters[i].equals(input.toLowerCase())) {
                found[i] = letters[i];
                win[i] = true;
                find = true;
            }
        }
        if(!find) {
            attempts++;
            attemptsCounter.setText(Integer.toString(attempts));
            score = score - 10;
            actualScore.setText(Integer.toString(score));
            guessesAllowed--;
            changeImage(guessesAllowed);
        }
        updateHiddenWord();
        gameOver(checkGameStatus());
    }
    
    //Method: updateHiddenWord()
    //Purpose: Check win[], if true, we print out the letter we found,
    //else continue printing out the blank lines.
    private void updateHiddenWord() {
        String newLines = "";
        for(int i = 0; i < currentWord.length(); i++) {
            if(win[i])
                newLines = newLines + found[i] + " ";
            else if(win[i] && i == currentWord.length() - 1)
                newLines = newLines + found[i];
            else
                newLines = newLines + found[i];
        }
        hiddenWord.setText(newLines);
    }
    
    //Method: checkGameStatus()
    //Purpose: Check win[], if all points are true (all letters are found)
    //then game is over. If not all letters are found, return false.
    private boolean checkGameStatus() {
        for(int i = 0; i < win.length; i++) {
            if(!win[i]) {
                return false;
            }
        }
        return true;
    }
    
    //Method: gameOver(boolean)
    //Purpose: If all letters are found, a winning image is displayed,
    //if the player is unable to guess all the correct letters and the amount
    //of guesses has been reached, then a losing image is displayed, then the
    //game will end and switch to the color game.
    private void gameOver(boolean win) {
        if(win)
            changeImage(7);
        else if(guessesAllowed == 0)
            revealWord();
        Timer timer = new Timer(0, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if(win) {
                    new ColorGame(score);
                    HangMan.this.dispose();
                } else if(guessesAllowed == 0) {
                    revealWord();
                    new ColorGame(score);
                    HangMan.this.dispose();
                }
            }
        });
        timer.setInitialDelay(1000);
        timer.setRepeats(false);
        timer.start();
    }
    
    //Method: changeImage(int)
    //Purpose: Changes the JLabel image based on how many guesses left
    private void changeImage(int guess) {
        String imageName = "/cs2450project/resources/hangman_" + guess +  ".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(imageName));
        picture.setIcon(icon);
    }
    
    //Method: revealWord()
    //Purpose: Displays hidden word on screen
    private void revealWord() {
        String newLines = "";
        for(int i = 0; i < currentWord.length(); i++) {
            if(i == currentWord.length() - 1)
                newLines = newLines + letters[i] ;
            else
                newLines = newLines + letters[i] + " ";
        }
        hiddenWord.setText(newLines);
    }
    
    //Method: initToolTips()
    //Purpose: Implements tool tips for every component
    private void initToolTips() {
        hangManLabel.setToolTipText("Game of Hang Man");
        A.setToolTipText("Click here to choose the letter A");
        B.setToolTipText("Click here to choose the letter B");
        C.setToolTipText("Click here to choose the letter C");
        D.setToolTipText("Click here to choose the letter D");
        E.setToolTipText("Click here to choose the letter E");
        F.setToolTipText("Click here to choose the letter F");
        G.setToolTipText("Click here to choose the letter G");
        H.setToolTipText("Click here to choose the letter H");
        I.setToolTipText("Click here to choose the letter I");
        J.setToolTipText("Click here to choose the letter J");
        K.setToolTipText("Click here to choose the letter K");
        L.setToolTipText("Click here to choose the letter L");
        M.setToolTipText("Click here to choose the letter M");
        N.setToolTipText("Click here to choose the letter N");
        O.setToolTipText("Click here to choose the letter O");
        P.setToolTipText("Click here to choose the letter P");
        Q.setToolTipText("Click here to choose the letter Q");
        R.setToolTipText("Click here to choose the letter R");
        S.setToolTipText("Click here to choose the letter S");
        T.setToolTipText("Click here to choose the letter T");
        U.setToolTipText("Click here to choose the letter U");
        V.setToolTipText("Click here to choose the letter V");
        W.setToolTipText("Click here to choose the letter W");
        Y.setToolTipText("Click here to choose the letter Y");
        X.setToolTipText("Click here to choose the letter X");
        Z.setToolTipText("Click here to choose the letter Z");
        skipButton.setToolTipText("<html>Click here to skip game of hang man.<br>Will result in score of 0 for this game!</html>");
        currentScoreLabel.setToolTipText("Showing current score");
        actualScore.setToolTipText("Showing current score");
        attemptsCounter.setToolTipText("Showing how many failed attempts");
        attemptsLabel.setToolTipText("Showing how many failed attempts");
        hiddenWord.setToolTipText("Hidden word");
        picture.setToolTipText("Hang man image");
        currentDateAndTime.setToolTipText("Displays current date and time");
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
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton E;
    private javax.swing.JButton F;
    private javax.swing.JButton G;
    private javax.swing.JButton H;
    private javax.swing.JButton I;
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton L;
    private javax.swing.JButton M;
    private javax.swing.JButton N;
    private javax.swing.JButton O;
    private javax.swing.JButton P;
    private javax.swing.JButton Q;
    private javax.swing.JButton R;
    private javax.swing.JButton S;
    private javax.swing.JButton T;
    private javax.swing.JButton U;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JButton X;
    private javax.swing.JButton Y;
    private javax.swing.JButton Z;
    private javax.swing.JLabel actualScore;
    private javax.swing.JLabel attemptsCounter;
    private javax.swing.JLabel attemptsLabel;
    private javax.swing.JTextField currentDateAndTime;
    private javax.swing.JLabel currentScoreLabel;
    private javax.swing.JLabel hangManLabel;
    private javax.swing.JPanel hangManPanel;
    private javax.swing.JPanel hangPic;
    private javax.swing.JLabel hiddenWord;
    private javax.swing.JLabel picture;
    private javax.swing.JButton skipButton;
    // End of variables declaration//GEN-END:variables
}
