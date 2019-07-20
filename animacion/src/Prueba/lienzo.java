/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Timer;


/**
 *
 * @author Alejandro Ocampo
 */
public class lienzo extends JPanel implements KeyListener{
private JLabel prueba = new JLabel("");
//public int i=0;


public lienzo(){
       
    System.out.println("aaa");
        addKeyListener(this);
        setFocusable(true);  
        add(prueba);
        prueba.setIcon(new ImageIcon(getClass().getResource("sprite1.png")));
}


    @Override
    public void keyTyped(KeyEvent e) {
              
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
       

        if(e.getExtendedKeyCode()== KeyEvent.VK_UP){
            prueba.setLocation(prueba.getX(), prueba.getY() - 5);
            prueba.setIcon(new ImageIcon(getClass().getResource("sprite4.png")));
        }
        if(e.getExtendedKeyCode()== KeyEvent.VK_DOWN){
            prueba.setLocation(prueba.getX(), prueba.getY() + 5);
            prueba.setIcon(new ImageIcon(getClass().getResource("sprite4.png")));
            
        }
        if(e.getExtendedKeyCode()== KeyEvent.VK_LEFT){
            prueba.setLocation(prueba.getX() - 5, prueba.getY());
            prueba.setIcon(new ImageIcon(getClass().getResource("sprite6.png")));
            
        }
        if(e.getExtendedKeyCode()== KeyEvent.VK_RIGHT){
            prueba.setLocation(prueba.getX() + 5, prueba.getY());
            prueba.setIcon(new ImageIcon(getClass().getResource("sprite2.png")));
            
        }
        if(e.getExtendedKeyCode()== KeyEvent.VK_SPACE){
            prueba.setLocation(prueba.getX(), prueba.getY());
            prueba.setIcon(new ImageIcon(getClass().getResource("sprite8.png")));
        }
//         if(e.getExtendedKeyCode()== KeyEvent.VK_RIGHT && e.getExtendedKeyCode()== KeyEvent.VK_UP){
//            prueba.setLocation(prueba.getX() + 5, prueba.getY() - 5);
//            prueba.setIcon(new ImageIcon(getClass().getResource("sprite4.png")));
//        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        if(e.getExtendedKeyCode()== KeyEvent.VK_UP){
            prueba.setIcon(new ImageIcon(getClass().getResource("sprite1.png")));
        }
        if(e.getExtendedKeyCode()== KeyEvent.VK_DOWN){
            prueba.setIcon(new ImageIcon(getClass().getResource("sprite1.png")));
        }
        if(e.getExtendedKeyCode()== KeyEvent.VK_LEFT){
            prueba.setIcon(new ImageIcon(getClass().getResource("sprite5.png")));
            
        }
        if(e.getExtendedKeyCode()== KeyEvent.VK_RIGHT){
           prueba.setIcon(new ImageIcon(getClass().getResource("sprite1.png")));
        }
        if(e.getExtendedKeyCode()== KeyEvent.VK_SPACE){
            prueba.setLocation(prueba.getX() + 5, prueba.getY());
            prueba.setIcon(new ImageIcon(getClass().getResource("sprite1.png")));
        }
             
              
              
    }
    
}

    

