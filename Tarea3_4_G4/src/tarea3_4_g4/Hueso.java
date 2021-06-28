/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_4_g4;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class Hueso extends JLabel implements Runnable {
    
    public Hueso() {
         ImageIcon foto;
        foto = new ImageIcon("hueso.png");
        this.setIcon(foto);
        
    }
    
    
    
    
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
