package Prueba;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author Alejandro Ocampo
 */
public class Sprite extends JFrame {

    
    public Sprite(){
       JFrame ventana = new JFrame("Animacionn");  
       ventana.add(new lienzo());
       ventana.setDefaultCloseOperation(3);
       ventana.setSize(500, 500);
       ventana.setVisible(true);
        
    
    }


    
    
    public static void main(String[]args){
      // new Sprite().setVisible(true);
      new Sprite();
      
    }
    
}
