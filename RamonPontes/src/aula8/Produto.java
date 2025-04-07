/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula8;

/**
 *
 * @author info2
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        if (preco > this.preco) {
            this.preco = preco;
        } else {
            System.out.println("O preço deve ser maior que o antigo preço");
        }
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quantidade + "\nValor total em estoque: " + quantidade * preco;
    }
}
