/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7;

/**
 *
 * @author info2
 */
public class GalinhaTeste {
    public static void main(String[] args) {
        Galinha galinhaTeste = new Galinha();
        
        galinhaTeste.nome = "Teste";
        
        galinhaTeste.alimentar();
        galinhaTeste.botar();
        galinhaTeste.botar();
        galinhaTeste.alimentar();
        galinhaTeste.alimentar();
        
        System.out.println(galinhaTeste);
    }
}
