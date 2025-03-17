/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5.exercicio;

/**
 *
 * @author info2
 */
public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa ramon = new Pessoa();
        
        ramon.nome = "Ramon";
        ramon.cpf = "000.000.000-00";
        ramon.dataNascimento = "24/09/2009";
        ramon.corOlho = "Vermelho";
        ramon.altura = 168;
        ramon.idade = 15;
        ramon.peso = 60;
        
        ramon.chorar();
        ramon.correr();
        ramon.falar();
        ramon.dormir();
        ramon.aniversariar();
    }
}
