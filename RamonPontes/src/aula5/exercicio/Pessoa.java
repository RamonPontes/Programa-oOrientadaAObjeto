/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5.exercicio;

/**
 *
 * @author info2
 */
public class Pessoa {
    String nome;
    String cpf;
    String dataNascimento;
    int altura;
    int idade;
    double peso;
    String corOlho;
    
    public void aniversariar() {
        System.out.println("A pessoa " + nome + " está aniversariando!");
        System.out.println("Idade Antiga: " + idade);
        
        idade +=  1;

        System.out.println("Idade Nova: " + idade);
    }
    
    public void falar() {
        System.out.println("A pessoa " + nome + " está falando!");
    }
    
    public void chorar() {
        System.out.println("A pessoa " + nome + " está chorando!");
    }
    
    public void correr() {
        peso -= 0.5;
        
        System.out.println("A pessoa " + nome + " está queimando calorias e perdeu 0.5kg!");
        System.out.println("Peso atual: " + peso);
    }
    
    public void dormir() {
        System.out.println("A pessoa " + nome + " está roncando!");
    }
}
