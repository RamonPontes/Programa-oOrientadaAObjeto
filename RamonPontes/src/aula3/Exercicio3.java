/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;

/**
 *
 * @author info2
 */
public class Exercicio3 {
    public static void main(String[] args) {
        boolean a,b;
        
        a = false; b = false;
        System.out.println(a + " && " + b + " = " + (a && b));

        a = false; b = true;
        System.out.println(a + " && " + b + " = " + (a && b));
        
        a = true; b = true;
        System.out.println(a + " && " + b + " = " + (a && b));

        a = true; b = false;
        System.out.println(a + " && " + b + " = " + (a && b));

    }
}
