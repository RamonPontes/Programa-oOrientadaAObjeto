/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12e13;

/**
 *
 * @author info2
 */
public class Funcionario {
    private String nome;
    private Funcionario chefia;

    public Funcionario() {
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.chefia = null;
    }
    
    public Funcionario(String nome, Funcionario chefia) {
        this.nome = nome;
        this.chefia = chefia;
    }
    
    public void imprimirDados() {
        if (chefia != null) {
            System.out.println("Nome: " + nome + "\nChefe: " + "");
            chefia.imprimirDados();
        } else {
            System.out.println(" Nome: " + nome + "\n");
        }
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
