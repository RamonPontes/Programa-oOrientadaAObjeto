/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula8;

/**
 *
 * @author info2
 */
public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto("Teste", 2, 10);
        
        produto.setPreco(1);
        System.out.println(produto.toString());
        
        produto.setPreco(3);
        System.out.println(produto.toString());
    }
}
