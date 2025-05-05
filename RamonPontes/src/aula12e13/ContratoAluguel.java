/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12e13;

/**
 *
 * @author info2
 */
public class ContratoAluguel {
    private Integer numeroContrato;
    private String nomeCliente;
    private String dataLocacao;
    private String dataDevolucao;
    private double valor;
    private Carro carro;
    
    public void mostrarDados() {
        System.out.println("Numero de contrato: " + numeroContrato);
        System.out.println("Nome cliente: " + nomeCliente);
        System.out.println("Data de locação: " + dataLocacao);
        System.out.println("Data de devolução: " + dataDevolucao);
        System.out.println("Valor: " + valor);
        System.out.println("Carro: ");
        carro.mostrarDados();
    }

    public ContratoAluguel(Integer numeroContrato, String nomeCliente, String dataLocacao, String dataDevolucao, double valor, Carro carro) {
        this.numeroContrato = numeroContrato;
        this.nomeCliente = nomeCliente;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valor = valor;
        this.carro = carro;
    }

    /**
     * @return the numeroContrato
     */
    public Integer getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * @param numeroContrato the numeroContrato to set
     */
    public void setNumeroContrato(Integer numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the dataLocacao
     */
    public String getDataLocacao() {
        return dataLocacao;
    }

    /**
     * @param dataLocacao the dataLocacao to set
     */
    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    /**
     * @return the dataDevolucao
     */
    public String getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the carro
     */
    public Carro getCarro() {
        return carro;
    }

    /**
     * @param carro the carro to set
     */
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    
}
