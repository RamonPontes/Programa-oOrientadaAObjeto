/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12e13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author info2
 */
public class Time {
    private String nome;
    private String cidade;
    List<Jogador> jogadores;

    
    
    

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Jogadores: ");
        
        for (Jogador j : jogadores) {
            System.out.println("  Nome: " + j.getNome());
            System.out.println("  Data de Nascimento: " + j.getDataNascimento());
            System.out.println("  CPF: " + j.getCpf());
            System.out.println("  Salário: " + j.getSalario());
            System.out.println("  ----------------------------------------------------");
        }
    }
    
    public Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.jogadores = new ArrayList<>();
    }
    
    public void cadastrarJogador(Jogador jogador) {
        jogadores.add(jogador);
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

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}
