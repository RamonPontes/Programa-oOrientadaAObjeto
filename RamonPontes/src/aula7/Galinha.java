/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7;

/**
 *
 * @author info2
 */
public class Galinha {
    String nome;
    int quantidadeOvos = 0;
    boolean alimentada = false;
    static int quantidadeOvosGranja = 0;
    
    public void alimentar() {
        if (!alimentada) {
            alimentada = true;
            System.out.println("Galinha alimentada");
        } else {
            System.out.println("Galinha não esta com fome");
        }
    }
    
    public void botar() {
        if (alimentada) {
            alimentada = false;
            quantidadeOvos++;
            quantidadeOvosGranja++;
        } else {
            System.out.println("Galinha esta com fome");
        }
    }
    
    @Override
    public String toString() {
        String msg = "A galinha: " + nome + "\nEsta com " + (alimentada ? "pouca" : "muita") + " fome" + "\nJa botou: " + quantidadeOvos + " ovos" + "\nSua granja tem: " + quantidadeOvosGranja + " ovos";
        
        return msg;
    }
}
