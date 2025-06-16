/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula14;

import java.util.Scanner;

/**
 *
 * @author info2
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algo: ");
        String palavra = scanner.nextLine();
        
        System.out.println("Caractere da posição 3: " + palavra.charAt(2));
        System.out.println("Número total de caracteres: " + palavra.length());
        System.out.println("Palavra minuscula: " + palavra.toLowerCase());
        
        System.out.println("Digite algo novamente: ");
        String palavra2 = scanner.nextLine();
        
        if (palavra.equals(palavra2)) {
            System.out.println("As palavras são iguais");
        } else {
            System.out.println("As palavras são diferentes");
        }
    }
}
