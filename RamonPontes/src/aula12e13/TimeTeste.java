/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12e13;

/**
 *
 * @author info2
 */
public class TimeTeste {
    public static void main(String[] args) {
        Time time = new Time("Operario", "Ponta Grossa");
        
        Jogador jogador1 = new Jogador("Nome", "dataNascimento", 100, 0);
        Jogador jogador2 = new Jogador("Nome2", "dataNascimento", 100, 0);
        Jogador jogador3 = new Jogador("Nome3", "dataNascimento", 100, 0);

        time.cadastrarJogador(jogador1);
        time.cadastrarJogador(jogador2);
        time.cadastrarJogador(jogador3);
        
        time.mostrarDados();
    }
}
