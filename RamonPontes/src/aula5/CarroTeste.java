/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5;

/**
 *
 * @author info2
 */
public class CarroTeste {
    public static void main(String[] args) {
        Carro civic = new Carro();
        
        civic.marca = "Honda";
        civic.modelo = "Civic";
        civic.ano = 2000;
        civic.placa = "GWP-5J68";
        civic.cor = "Laranja";

        civic.ligar();
        civic.desligar();
        civic.acelerar();
        civic.frear();
        
        Carro corolla = new Carro();
        
        corolla.marca = "Toyota";
        corolla.modelo = "Corolla";
        corolla.ano = 2000;
        corolla.placa = "GWP-5J68";
        corolla.cor = "Preto";

        corolla.ligar();
        corolla.desligar();
        corolla.acelerar();
        corolla.frear();
        
    }
}
