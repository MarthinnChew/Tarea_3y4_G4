/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_4_g4;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Bone extends JLabel {

    int x;
    int y;


    public Bone(int x, int y, Ventana ventana){
        this.x=x;
        this.y=y;
        JLabel label = new JLabel(new ImageIcon("dogBone.jpg"));
        label.setSize(160, 120);
        label.setLocation(x, y);
        ventana.add(label);
        ventana.repaint();

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}