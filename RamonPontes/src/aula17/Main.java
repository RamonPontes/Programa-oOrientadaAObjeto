/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula17;

/**
 *
 * @author info2
 */
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ramon", 15, "2INFO");
        Professor professor = new Professor(10, 10, "Nome", 20);
    
        aluno.realizarMatricula("2AC");
        System.out.println(professor.calcularSalario());
        aluno.imprimirDados();
        professor.imprimirDados();
    }
}
