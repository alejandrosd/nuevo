/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba.prototype;

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
import javax.swing.Icon;


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
        Icon imagen=new ImageIcon(getClass().getResource("sprite1.png"));
        prueba.setIcon(imagen);
}


    @Override
    public void keyTyped(KeyEvent e) {
              
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
       int i=1;
       //imagen img= new imagen(i);

        if(e.getExtendedKeyCode()== KeyEvent.VK_UP){
            prueba.setLocation(prueba.getX(), prueba.getY() - 5);
            //prueba.setIcon(new ImageIcon(getClass().getResource("sprite4.png")));
            i=4;
            try {
               System.out.println("ARRIBA");
               imagen img= new imagen(i);
               imagen clon=(imagen) img.clonar();

               clon.setIcono(i);
               prueba.setIcon(clon.toIcon());
               
           } catch (CloneNotSupportedException ex) {
               System.out.println("error");
           }
        

        }
        if(e.getExtendedKeyCode()== KeyEvent.VK_DOWN){
            prueba.setLocation(prueba.getX(), prueba.getY() + 5);
            i=4;
           try {
               System.out.println("ABAJO");
               imagen img= new imagen(i);
               imagen clon=(imagen) img.clonar();

               clon.setIcono(i);
               prueba.setIcon(clon.toIcon());
               
           } catch (CloneNotSupportedException ex) {
               System.out.println("error");
           }
            
        }
        if(e.getExtendedKeyCode()== KeyEvent.VK_LEFT){
            prueba.setLocation(prueba.getX() - 5, prueba.getY());
            i=6;
           try {
               System.out.println("IZQUIERDA");
               imagen img= new imagen(i);
               imagen clon=(imagen) img.clonar();

               clon.setIcono(i);
               prueba.setIcon(clon.toIcon());
               
           } catch (CloneNotSupportedException ex) {
               System.out.println("error");
           }
            
        }
        if(e.getExtendedKeyCode()== KeyEvent.VK_RIGHT){
            prueba.setLocation(prueba.getX() + 5, prueba.getY());
            i=2;
           try {
               System.out.println("DERECHA");
               imagen img= new imagen(i);
               imagen clon=(imagen) img.clonar();

               clon.setIcono(i);
               prueba.setIcon(clon.toIcon());
               
           } catch (CloneNotSupportedException ex) {
               System.out.println("error");
           }
            
        }
        if(e.getExtendedKeyCode()== KeyEvent.VK_SPACE){
            prueba.setLocation(prueba.getX(), prueba.getY());
        i=8;
           try {
               System.out.println("GOLPEAR");
               imagen img= new imagen(i);
               imagen clon=(imagen) img.clonar();

               clon.setIcono(i);
               prueba.setIcon(clon.toIcon());
               
           } catch (CloneNotSupportedException ex) {
               System.out.println("error");
           }
        }
//         if(e.getExtendedKeyCode()== KeyEvent.VK_RIGHT && e.getExtendedKeyCode()== KeyEvent.VK_UP){
//            prueba.setLocation(prueba.getX() + 5, prueba.getY() - 5);
//            prueba.setIcon(new ImageIcon(getClass().getResource("sprite4.png")));
//        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int i=1;
        imagen img= new imagen(i);
        if(e.getExtendedKeyCode()== KeyEvent.VK_UP){
            try {               
               imagen clon=(imagen) img.clonar();
               clon.setIcono(i);
               prueba.setIcon(clon.toIcon());
               
           } catch (CloneNotSupportedException ex) {
               System.out.println("error");
           }
        
        }
        if(e.getExtendedKeyCode()== KeyEvent.VK_DOWN){
          try {               
               imagen clon=(imagen) img.clonar();
               clon.setIcono(i);
               prueba.setIcon(clon.toIcon());
               
           } catch (CloneNotSupportedException ex) {
               System.out.println("error");
           }
        }
        if(e.getExtendedKeyCode()== KeyEvent.VK_LEFT){
            try {               
               imagen clon=(imagen) img.clonar();
               clon.setIcono(i);
               prueba.setIcon(clon.toIcon());
               
           } catch (CloneNotSupportedException ex) {
               System.out.println("error");
           }
            
        }
        if(e.getExtendedKeyCode()== KeyEvent.VK_RIGHT){
           try {               
               imagen clon=(imagen) img.clonar();
               clon.setIcono(i);
               prueba.setIcon(clon.toIcon());
               
           } catch (CloneNotSupportedException ex) {
               System.out.println("error");
           }
        }
        if(e.getExtendedKeyCode()== KeyEvent.VK_SPACE){
            prueba.setLocation(prueba.getX() + 5, prueba.getY());
           try {               
               imagen clon=(imagen) img.clonar();
               clon.setIcono(i);
               prueba.setIcon(clon.toIcon());
               
           } catch (CloneNotSupportedException ex) {
               System.out.println("error");
           }
        }
             
              
              
    }
    
}

    

