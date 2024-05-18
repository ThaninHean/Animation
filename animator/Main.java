package com.animator;

import javax.swing.*;

public class Main extends JFrame {
    public Main(){
        Animation obj = new Animation();
        add(obj);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setBackground(Color.GRAY);
        setBounds(300,100,600,350);
        setAlwaysOnTop(true);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Main();
    }
}
