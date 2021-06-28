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
    Hueso hueso;
    Perro Perro;
    boolean izquierda = true;//Izquierda es false es por que ira a la derecha
    boolean Quieto = true;
    

    public Ventana() {
        Perro = new Perro();
        Perro.setLayout(null);
        Perro.setBounds(50, 50, 160, 120);


        hueso = new Hueso();
        hueso.setLayout(null);
        hueso.setBounds(80, 10, 500, 500);
        hueso.setVisible(true);
        this.add(hueso);

        TirarHueso = new JButton("TIRAR HUESO");
        TirarHueso.setBounds(600, 570, 160, 45);
        TirarHueso.setVisible(true);
        TirarHueso.addActionListener(this);
        this.add(TirarHueso);

        this.setTitle("HILOS");
        this.setBounds(0, 0, 800, 700);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        this.add(Perro);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
