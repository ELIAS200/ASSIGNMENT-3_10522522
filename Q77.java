/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class Q77 extends Canvas {
   @Override
   public void paint( Graphics g )
    {
        g.setColor(Color.green);
        g.drawRect(50,20,100,200);  // draw a rectangle
        g.fillOval(160,20,100,200); // draw a filled-in oval
        g.setColor(Color.blue);
        g.fillRect(200,400,200,20); // a filled-in rectangle
        g.drawOval(200,430,200,100);
        g.setColor(Color.red);
        g.fillRect(500, 360, 100, 100);
        
        
        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 500, 100);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("     The first letter of this string is at (" + x + "," + y + ")", x, y);
    }

    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Q77 canvas = new Q77();
        win.add( canvas );
        win.setVisible(true);
    }

    
}
