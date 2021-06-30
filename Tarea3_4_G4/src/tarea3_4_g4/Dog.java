
package tarea3_4_g4;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.*;

public class Dog extends JLabel implements Runnable{

    int x;
    int y;
    int boneX;
    int boneY;
    Ventana ventana;
    JLabel label;
    boolean endGame=false;

    public Dog(int x, int y, Ventana ventana){
        this.ventana=ventana;
        this.x=x;
        this.y=y;
        this.label = new JLabel(new ImageIcon("dogImage.gif"));
        label.setSize(160, 120);
        label.setLocation(this.x, this.y);
        ventana.add(label);
        ventana.repaint();
    }

    public void setBoneCoordinates(int x, int y){
        this.boneX=x;
        this.boneY=y;
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

    @Override
    public void run() {

        System.out.println("Hola");
        boolean validacionX=false;
        boolean validacionY=false;

        while (validacionY==false || validacionX==false){


            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (validacionX==false){
                this.label.setLocation(this.x-=15, y);
                if (this.x<this.boneX){
                    validacionX=true;
                }
            }



            if (validacionY==false && validacionX==true){
                this.label.setLocation(this.x, this.y-=15);

                if (this.y<this.boneY){
                    validacionY=true;
                    this.ventana.setEndGame(true);
                    JOptionPane.showMessageDialog(this, "Lamiendo mi huesito XD");
                }
            }
        }
    }
}