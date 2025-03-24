/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7;

/**
 *
 * @author info2
 */
public class Carro {
    String modelo;
    String marca;
    int ano;
    String placa;
    String cor;
    boolean estacionado;
    static int qntdCarros;
    boolean ligado;
    
    public void ligar() {
        ligado = true;
        System.out.println(modelo + " " + cor + " esta ligado");
    }
    
    public void desligar() {
        ligado = false;
        System.out.println(modelo + " " + cor + " esta desligado");
    }
    
    public void estacionar() {
        if (ligado && !estacionado) {
            estacionado = true;
            qntdCarros++;
            System.out.println(modelo + " " + cor + " esta estacionado");
            desligar();
        } else if (estacionado) {
            System.out.println("O Carro ja esta estacionado");
        } else {
            System.out.println("Ligue o carro para estacionar");
        }
    }
    
    public void sair() {
        if (ligado && estacionado) {
            estacionado = false;
            qntdCarros--;
            System.out.println(modelo + " " + cor + " não esta mais estacionado");
        } else if (!estacionado) {
            System.out.println("O Carro não esta estacionado");
        } else {
            System.out.println("Ligue o carro para sair do estacionamento");
        }
    }
}
