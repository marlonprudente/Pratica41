/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1562339
 */
public class Pratica41 {
        public static void main(String[] args) {
            Elipse elipse = new Elipse();
            Circulo circulo = new Circulo();
            System.out.println("Area da Elipse: " + elipse.getArea(2, 4));
            System.out.println("Perimetro da Elipse: " + elipse.getPerimetro(2, 4));
            System.out.println("Area do Circulo: " + circulo.getArea(1, 1));
            System.out.println("Perimetro do Circulo: " + circulo.getPerimetro(1));
    }
}
