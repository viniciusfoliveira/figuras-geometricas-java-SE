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
public class Triangulo extends Ponto implements Serializable{
    
    private double c;

    public Triangulo(double c, double x, double y) {
        super(x, y);
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public double areaTotal (){
       return (c * super.getX())/ 2;
    }
    
    public double perimetro(){
      return c + super.getX() + super.getY();
    }
    
    public String toString() {
        return "Base: " + c +  "Altura: " + super.getX() + " Lado3: " + super.getY()
                + "\nAréa total: " + areaTotal() + " Perimetro " + perimetro() + "\n\n";
    }
}
