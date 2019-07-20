package Prueba.prototype;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Alejandro Ocampo
 */
public class Sprite extends JFrame {

  //  Image img;
  // Thread hilo;
  // int Incremento = 0;
  //BufferedImage bi;
    
    public Sprite(){
       JFrame ventana = new JFrame("Animacionn");  
       ventana.add(new lienzo());
       ventana.setDefaultCloseOperation(3);
       ventana.setSize(500, 500);
       ventana.setVisible(true);
        
       //this.add(new lienzo());
       // setSize(AnchoVentana,AltoVentana);
       // setDefaultCloseOperation(EXIT_ON_CLOSE);
       //setLocationRelativeTo(null);
        //setTitle("Animacion");
        //setResizable(false);
        
       // hilo = new Thread(this);
       // bi = new BufferedImage(AnchoVentana, AltoVentana, BufferedImage.TYPE_INT_RGB);
       // Toolkit herramienta = Toolkit.getDefaultToolkit();
        //img = herramienta.getImage(getClass().getResource("/imagenes/sprites.png"));
        //hilo.start();
        
    
    }

    
    //Sprites SIN TECLADO -------------
    
    
//    @Override
//    public void paint(Graphics g) {
//        Graphics2D g2d;
//        g.drawImage(bi, 0, 0, this);
//        g2d = bi.createGraphics();
//        g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
//        int mx = (Incremento%6)*117;
//        int my = (Incremento/6)*157;
//        
//        g2d.drawImage(img, 200,200,200+117,200+157,mx,my,mx+117,my+157, this);
//       
//        repaint();
//    }
    
    
    
    
//    @Override
//    public void run() {
//        while(true){
//           try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Sprite.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//           Incremento++;
//            
//            if(Incremento>10){
//                Incremento=0;
//            }
//            
//        }
//    }
    
    //---------------------------------------------------------------
    
    public static void main(String[]args){
      // new Sprite().setVisible(true);
      new Sprite();
      
    }
    
}
