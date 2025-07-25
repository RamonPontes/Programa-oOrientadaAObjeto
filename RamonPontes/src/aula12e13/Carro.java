/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12e13;

/**
 *
 * @author info2
 */
public class Carro {
    private String modelo;
    private String marca;
    private Integer ano;

    public void mostrarDados() {
        System.out.println("   Modelo: " + modelo);
        System.out.println("   Marca: " + marca);
        System.out.println("   Ano: " + ano);
    }

    public Carro(String modelo, String marca, Integer ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }
    
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the ano
     */
    public Integer getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    
}
