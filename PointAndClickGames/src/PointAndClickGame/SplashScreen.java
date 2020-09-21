/**********************************************************************
*
*   File: SplashScreen.java
*   Author: Steven Phung & Alex Vargas
*   Class: CS 2450.01 - Programming Graphical User Interfaces
*
*   Assignment: Point and Click Game v.1.3
*   Date last modified: 10/11/2019
*
*   Purpose: This class will generate a splash screen with custom font
* 
**********************************************************************/
package PointAndClickGame;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import org.apache.commons.io.FileUtils;

public class SplashScreen extends javax.swing.JFrame {
    
    //Custom font
    Font raysHand;
    
    //Constructor
    public SplashScreen() {
        checkResources();
        try {
            raysHand = Font.createFont(Font.TRUETYPE_FONT, Main.class.getResourceAsStream("/cs2450project/resources/RaysHand.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, Main.class.getResourceAsStream("/cs2450project/resources/RaysHand.ttf")));
        } catch (IOException | FontFormatException e) {}
        initComponents();
        bindKeys();
        this.setResizable(false);
        this.setVisible(true);
        limitRunTime();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splashPanel = new javax.swing.JPanel();
        classNameLabel = new javax.swing.JLabel();
        pointAndClickLabel = new javax.swing.JLabel();
        teamNameLabel = new javax.swing.JLabel();
        splashImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));

        splashPanel.setBackground(new java.awt.Color(11, 28, 71));
        splashPanel.setMaximumSize(new java.awt.Dimension(600, 400));
        splashPanel.setMinimumSize(new java.awt.Dimension(600, 400));
        splashPanel.setLayout(null);

        classNameLabel.setFont(new java.awt.Font("RaysHand", 0, 36)); // NOI18N
        classNameLabel.setForeground(new java.awt.Color(255, 153, 51));
        classNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        classNameLabel.setText("CS2450");
        splashPanel.add(classNameLabel);
        classNameLabel.setBounds(180, 100, 130, 30);

        pointAndClickLabel.setFont(new java.awt.Font("RaysHand", 0, 24)); // NOI18N
        pointAndClickLabel.setForeground(new java.awt.Color(255, 153, 51));
        pointAndClickLabel.setText("Point & Click Games");
        splashPanel.add(pointAndClickLabel);
        pointAndClickLabel.setBounds(190, 140, 220, 30);

        teamNameLabel.setFont(new java.awt.Font("RaysHand", 0, 24)); // NOI18N
        teamNameLabel.setForeground(new java.awt.Color(255, 153, 51));
        teamNameLabel.setText("Team Name: //temporary fix");
        splashPanel.add(teamNameLabel);
        teamNameLabel.setBounds(130, 170, 320, 30);

        splashImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2450project/resources/splashgif.gif"))); // NOI18N
        splashPanel.add(splashImage);
        splashImage.setBounds(0, 0, 600, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splashPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splashPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Method: limitRunTime()
    //Purpose: Method allows splash screen to run for only 3 seconds before calling menu
    private void limitRunTime() {
        try { Thread.sleep(3000); } catch(InterruptedException e) {}
        new Menu();
        this.setVisible(false);
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
    
    //Method: checkResources()
    //Purpose: Copys resources to bin folder if that folder is missing or missing resources
    private void checkResources() {
        //Relative path for main folder and bin folder
        String mainFolder = "src/main/java/cs2450project/resources";
        String binFolder = "target/classes/cs2450project/resources";
        
        //Create file objects for both
        File mainResources = new File(mainFolder);
        File binResources = new File(binFolder);
        
        //If bin folder is missing, create a copy using main folder resources
        if(!binResources.exists()) {
            try {
                FileUtils.copyDirectory(mainResources, binResources);
            } catch(IOException e) {}
        } else {
            File[] listOfMainResources = mainResources.listFiles();
            File[] listOfBinResources = binResources.listFiles();
            
            //If bin folder is not missing but is missing files, delete folder
            //and create a new from scratch using main folder resources
            if(listOfMainResources.length != listOfBinResources.length) {
                binResources.delete();
                try {
                    FileUtils.copyDirectory(mainResources, binResources);
                } catch(IOException e) {}
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel classNameLabel;
    private javax.swing.JLabel pointAndClickLabel;
    private javax.swing.JLabel splashImage;
    private javax.swing.JPanel splashPanel;
    private javax.swing.JLabel teamNameLabel;
    // End of variables declaration//GEN-END:variables
}
