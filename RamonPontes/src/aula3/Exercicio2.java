/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;

/**
 *
 * @author info2
 */
public class Exercicio2 {
    public static void main(String[] args) {
        double a = 2, b = 5, c = 2;
        double delta = b * b - 4 * a * c;
        
        double x1 = ((b * -1) - Math.sqrt(delta)) / (2 * a);
        double x2 = ((b * -1) + Math.sqrt(delta)) / (2 * a);  
        
        System.out.println("A = " + a + " B = "+ b + " C = " + c);
        
        System.out.println("Delta: " + delta);
        
        System.out.println("X1 = " + x1 + " X2 = " + x2);
    }
}
