/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula8;

/**
 *
 * @author info2
 */
public class RelogioTeste {
    public static void main(String[] args) {
        Relogio relogio = new Relogio("Teste", 30, 99);
        
        relogio.setHora(1);
        relogio.setMinuto(1);
        
        System.out.println(relogio.toString());
    }
}
