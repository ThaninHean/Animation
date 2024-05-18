package com.animator;

import javax.swing.*;
import java.awt.*;

public class Animation extends JPanel implements Runnable {
    int numImg = 72;
    Image[] img = new Image[numImg];
    Thread thread;
     public Animation(){
         Toolkit tk = Toolkit.getDefaultToolkit();
         for (int i = 0; i<img.length; i++){
             img[i] = tk.getImage("images/earth/earth/earth"+(i*5)+".gif");
             System.out.println("images/earth/earth/earth"+(i*5)+".gif");
         }
          thread = new Thread(this);
          thread.start();

     }
    int currentImage = 0;
    public void paint(Graphics graphics){
        int w = getWidth(), h = getHeight();
        graphics.drawImage(img[currentImage++],(w-100)/2,(h-100)/2,this);
        if (currentImage==img.length)currentImage = 0;

    }
    int fps = 24;
    @Override
    public void run() {
        while (true){
            repaint();
            try{
                Thread.sleep(1000/fps);// We need to update every second
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
