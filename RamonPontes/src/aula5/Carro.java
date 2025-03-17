/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5;

/**
 *
 * @author info2
 */
public class Carro {
    String marca;
    String modelo;
    int ano;
    String placa;
    String cor;
    
    public void ligar() {
        System.out.println(marca + " " + modelo +  " " + ano + " está ligado!");
    }
    
    public void desligar() {
        System.out.println(marca + " " + modelo +  " " + ano + " está desligado!");
    }
    
    public void acelerar() {
        System.out.println(marca + " " + modelo + " " + ano + " está acelerando!");
    }
    
    public void frear() {
        System.out.println(marca + " " + modelo +  " " + ano + " está freiando!");
    }
}
