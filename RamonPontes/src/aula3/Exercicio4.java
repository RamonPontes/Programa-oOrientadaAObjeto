/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;

/**
 *
 * @author info2
 */
public class Exercicio4 {
    public static void main(String[] args) {
        double valorDoProduto = 50;
        double valorDoProdutoFinal;
        
        if (valorDoProduto >= 50) {
            valorDoProdutoFinal = valorDoProduto*0.90;
        } else {
            valorDoProdutoFinal = valorDoProduto*0.95;
        }
        
        System.out.println("Valor Original: R$ " + valorDoProduto);
        System.out.println("Valor com Desconto: R$ " + valorDoProdutoFinal);
    }
}
