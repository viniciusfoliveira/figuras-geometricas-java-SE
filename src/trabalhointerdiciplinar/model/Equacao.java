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
public class Equacao  extends Ponto implements Serializable{
    
    private double a;

    public Equacao(double a, double x, double y) {
        super(x, y);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    public String equacao (){
       double delta = Math.pow(super.getX(), 2) - 4 * a * super.getY();
       double x1 = (-super.getX() + Math.sqrt (delta)) / ( 2*a );//equação do x1
       double x2 =   (-super.getX() - Math.sqrt (delta)) / ( 2*a );
       
       if (a == 0) return "Não é equação do segundo grau";
       else if (delta >= 0){
         return "Delta: " + delta + " x1: " + x1 + " x2: " + x2; 
       }
       else{
         return "Não soluções delta negativo";
       }
    }
    
    
     public String toString() {
        return "A: " + a +  "B: " + super.getX() + " C: " + super.getY()
                + "\nEquacao: " + equacao() + "\n\n";
    }
}
