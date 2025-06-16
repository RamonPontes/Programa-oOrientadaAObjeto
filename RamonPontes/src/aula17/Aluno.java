/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula17;

/**
 *
 * @author info2
 */
public class Aluno extends Pessoa {
    private String curso;

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Curso: " + curso);
    }

    public Aluno() {
    }

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public void realizarMatricula(String curso) {
        this.curso = curso;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
}