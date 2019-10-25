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
public class Quadrado extends Ponto implements Serializable {

   private double a;
   
   private double b;

    public Quadrado(double a, double b, double x, double y) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public double areaTotal(){
      return a * b;
    }
    
    public double perimetro(){
     return a + b + super.getX() + super.getY();
    }
    
      @Override
    public String toString() {
        return "Lado1: " + a + ", Lado2:" + b + " Lado3: " + super.getX() + " Lado4: " + super.getY()
                + "\nAréa total: " + areaTotal() + " Perimetro " + perimetro() + "\n\n";
    }
   
    
    
   
}
