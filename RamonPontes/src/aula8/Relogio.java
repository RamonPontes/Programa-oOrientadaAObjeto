/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula8;

/**
 *
 * @author info2
 */
public class Relogio {
    private String marca;
    private int hora;
    private int minuto;

    public Relogio(String marca, int hora, int minuto) {
        if (minuto >= 0 || minuto <= 59 || hora >= 0 || hora <= 23) {
            this.marca = marca;
            this.hora = hora;
            this.minuto = minuto;        
        } else {
            System.out.println("Hora ou minutos invalidos");
        }
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param minuto the minuto to set
     */
    public void setMinuto(int minuto) {
        if (minuto >= 0 || minuto <= 59) {
            this.minuto = minuto;            
        } else {
            System.out.println("Minuto invalido");
        }
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        if (hora >= 0 || hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Hora invalida");
        }
    }
    
    @Override
    public String toString() {
        return "Marca: " +  marca + "\nHora: " + hora + ":" + minuto;
    }
}
