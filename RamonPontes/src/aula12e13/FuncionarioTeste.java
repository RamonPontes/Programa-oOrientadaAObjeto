/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12e13;

/**
 *
 * @author info2
 */
public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario chefe = new Funcionario("Chefe");
        Funcionario funcionario = new Funcionario("Teste", chefe);
        Funcionario funcionario2 = new Funcionario("Teste2", funcionario);
        
        
   
        funcionario2.imprimirDados();
    }
}
