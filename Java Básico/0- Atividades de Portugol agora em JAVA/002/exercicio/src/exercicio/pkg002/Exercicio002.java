/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/* Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
*Ex:
*Qual é o seu nome? João da Silva
*Olá João da Silva, é um prazer te conhecer!
*/
package exercicio.pkg002;

import java.util.Scanner;

/**
 *
 * @author jeferson
 */
public class Exercicio002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Qual e o seu nome ? ");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        System.out.println("Ola " + nome + ", e um prazer te conhecer!");
    }
    
}
