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
  
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ivana
 */
public class Ventana extends JFrame implements ActionListener {

    JButton buttonEmpezar;
    JButton buttonVolverHueso;
    Bone bone;
    Dog dog;
    Thread hilo;
    boolean objetivoAlcanzado=false;
    int contador=0;

    public Ventana() {
        setInicio();
        this.buttonEmpezar=addButton("Tirar Hueso", 900, 525, 150,50);
        this.buttonVolverHueso=addButton("Lanzar Hueso nuevamente", 630, 525, 250,50);


    }

    public void setInicio(){
        setTitle("Tarea 3 y 4");
        Color myColor = Color.decode("#1C2833");
        this.getContentPane().setBackground(myColor);
        setVisible(true);
        setLayout(null);
        setLocation(125, 50);
        setSize(1100, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    public JButton addButton(String title, int x, int y, int width, int height){
        JButton button=new JButton(title);
        button.setBounds(x,y,width,height);
        button.setFont(new Font("Arial", Font.PLAIN, 18));
        Color myColor = Color.decode("#345FE3");
        button.setBackground(myColor);
        Color myColor2 = Color.decode("#FBFCFC");
        button.setForeground(myColor2);
        button.addActionListener(this);
        add(button);
        repaint();
        return button;
    }

    public void comenzarJuego(){
        int x=(int)(Math.random()*740);
        int y=(int)(Math.random()*380);
        System.out.println(x + " " + y);
        bone=new Bone(x, y, this);
        dog=new Dog(900, 400, this);
        dog.setBoneCoordinates(bone.getX(), bone.getY());
        hilo=new Thread(dog);
        hilo.start();
    }

    public void setEndGame(boolean objetivoAlcanzado){
        this.objetivoAlcanzado=objetivoAlcanzado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==buttonEmpezar){

            if (this.contador==0){
                comenzarJuego();
                contador++;
            }
        }

        if (e.getSource()==this.buttonVolverHueso){
            if (this.objetivoAlcanzado==true){
                this.dispose();
                this.objetivoAlcanzado=false;
                this.contador=0;
                new Ventana();
            }
        }
    }
}