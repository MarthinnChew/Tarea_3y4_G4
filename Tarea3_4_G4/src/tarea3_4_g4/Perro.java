
package tarea3_4_g4;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Perro extends JLabel implements Runnable {
    
    
    public Perro(){//Constructor
         ImageIcon foto;
        foto = new ImageIcon("perrocaminando.gif");
        this.setIcon(foto);
        
    
    
    }
    
    @Override
    public void run(){
    
    }
}
