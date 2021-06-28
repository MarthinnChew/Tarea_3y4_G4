/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_4_g4;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ivana
 */
public class Ventana extends JFrame implements ActionListener {

    JButton TirarHueso;
    JLabel perro,hueso;

    public Ventana() {

        TirarHueso = new JButton("TIRAR HUESO");
        TirarHueso.setBounds(600, 570, 160, 45);
        TirarHueso.setVisible(true);
        TirarHueso.addActionListener(this);
        this.add(TirarHueso);

        perro = new JLabel();
        perro.setLayout(null);
        perro.setBounds(200, 120, 160 , 120);
        ImageIcon foto;
        foto = new ImageIcon("perrocaminando.gif");
        perro.setIcon(foto);
        perro.setVisible(true);
        this.add(perro);
        
        hueso = new JLabel();
        hueso.setLayout(null);
        hueso.setBounds(150, 120, 160 , 120);
       ImageIcon foto1;
        foto = new ImageIcon("hueso.png");
        hueso.setIcon(foto);
        hueso.setVisible(true);
        this.add(hueso);

//        JLabel j1 = new JLabel("PERRO");
//        j1.setLayout(null);
//        j1.setBounds(100, 100, 50, 100);
//        this.add(j1);

        this.setTitle("HILOS");
        this.setBounds(0, 0, 800, 700);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
