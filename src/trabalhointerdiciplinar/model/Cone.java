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
public class Cone extends Ponto implements Serializable {

    public Cone(double x, double y) {
        super(x, y);
    }
    
    public double volume(){
      return (3.14 * Math.pow(super.getX(), 2) * super.getY())/ 3;
    }
    
          @Override
    public String toString() {
        return "Raio: " + super.getX() + " Altura: " + super.getY()
                + "\nVolume: " + volume() + "\n\n";
    }
}
