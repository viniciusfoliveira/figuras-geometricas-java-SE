/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhointerdiciplinar.model;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Paralelepipedo extends Ponto implements Serializable {
    
    private double z;

    public Paralelepipedo(double z, double x, double y) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

   
    public double volume(){
     return z * super.getX() * super.getY();
    }
    
        
    public String toString() {
        return "Comprimento: " + z +  "Largura: " + super.getX() + " Altura: " + super.getY()
                + "\nVolume: " + volume() + "\n\n";
    }
}
