/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7;

/**
 *
 * @author info2
 */
public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        carro.modelo = "Fusca";
        carro.marca = "Volkswagen";
        carro.ano = 1978;
        carro.placa = "XXX-XXXX";
        carro.cor = "Azul";
        
        carro.ligar();
        carro.desligar();
        carro.estacionar();
        carro.ligar();
        carro.estacionar();
        carro.desligar();
        carro.sair();
        carro.ligar();
        carro.sair();
    }
}
