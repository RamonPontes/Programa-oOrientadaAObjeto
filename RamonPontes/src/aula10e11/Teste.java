/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10e11;

/**
 *
 * @author info2
 */
public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ramon", "24/09/2009", "M", "email@example.com", "Solteiro", new Endereco("Rua Nao sei oq", 100, "Centro", "Ponta Grossa", "PR"));
        pessoa.imprimirDados();
    }
   
}
