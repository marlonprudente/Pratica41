/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1562339
 */
public class Elipse {
    private double semiex;
    private double semiey;
    public Elipse(double x, double y){
        this.semiex = x;
        this.semiey = y;
    }
    
    public double getArea(){        
        return Math.PI*this.semiex*this.semiey;
    }
    public double getPerimetro(){        
        
        return Math.PI*Math.abs(3*(this.semiex + this.semiey) - Math.sqrt((3*this.semiex + this.semiey)*(this.semiex + 3*this.semiey)));
    }
}
