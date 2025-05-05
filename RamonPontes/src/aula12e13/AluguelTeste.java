/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12e13;

/**
 *
 * @author info2
 */
public class AluguelTeste {
    public static void main(String[] args) {
        Carro carro = new Carro("Modelo", "Marca", 2025);
        ContratoAluguel contrato = new ContratoAluguel(1, "Nome Cliente", "Data Locacao", "Data Devolucao", 100, carro);
        
        contrato.mostrarDados();
    }
}
