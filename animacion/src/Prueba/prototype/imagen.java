/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba.prototype;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class imagen extends icono{

    public imagen(int icon) {
        super(icon);
    }
    
  

    @Override
    public Icon toIcon() {
        int i;
        i = this.icon;
        //System.out.println(i);
        Icon ic= new ImageIcon(getClass().getResource("sprite"+i+".png"));
        return ic;

    }
    
}
