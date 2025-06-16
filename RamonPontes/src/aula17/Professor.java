/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula17;

/**
 *
 * @author info2
 */
public class Professor extends Pessoa {
    private double salarioBase;
    private double salarioTitulacao;

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Salario titulacao: " + salarioTitulacao);
    }

    public Professor() {
        super();
        this.salarioBase = 0;
        this.salarioTitulacao = 0;
    }

    public Professor(double salarioBase, double salarioTitulacao, String nome, Integer idade) {
        super(nome, idade);
        this.salarioBase = salarioBase;
        this.salarioTitulacao = salarioTitulacao;
    }

    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * @return the salarioTitulacao
     */
    public double getSalarioTitulacao() {
        return salarioTitulacao;
    }

    /**
     * @param salarioTitulacao the salarioTitulacao to set
     */
    public void setSalarioTitulacao(double salarioTitulacao) {
        this.salarioTitulacao = salarioTitulacao;
    }
    
    public double calcularSalario() {
        return salarioBase + salarioTitulacao;
    }
}
