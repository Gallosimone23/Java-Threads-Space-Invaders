/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferStrategy;
import javax.swing.ImageIcon;


/**
 *
 * @author Roberto
 */
public class Intro extends Spazio {
    
    private int i = 0;
    private BufferStrategy strategy;
    
    final Image image = new ImageIcon("src/spaceinvaders/razzo.jpg").getImage();
    void run() throws InterruptedException {
        createBufferStrategy(2);
        strategy = getBufferStrategy();
        
       
               
        for(i=100;i>=0;i-=1) {
            System.out.println("i: " + i);
            this.paint();
            Thread.sleep(50);
        }

    }

   
    public void paint() {
        Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
        g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        g.setColor(Color.orange);
        g.setFont(new Font("Bold", Font.PLAIN, 40+i));
        g.drawString("Space Invaders", 100+i, 100+i);
        g.setFont(new Font("Bold", Font.PLAIN, 10+i));
        g.drawString("          by Simone Gallo", 110+i+i, 110+i+i);
        g.dispose();
        strategy.show();
        
    }

}
