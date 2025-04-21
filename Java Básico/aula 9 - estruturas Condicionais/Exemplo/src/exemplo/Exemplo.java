/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo;

import java.util.Scanner;

/**
 *
 * @author magal
 */
public class Exemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //1º EXEMPLO - CONDIÇÃO SIMPLES.
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/ 2;
        System.out.println("Sua média foi " + m);
        if (m>9) {
            System.out.println("Parabéns pequeno gafanhoto!");
        }
        */
        
        // 2º EXEMPLO - COMDIÇÃO COMPOSTA:
        
        Scanner t = new Scanner(System.in);
        System.out.print("Ano de nascimento: ");
        int nasc = t.nextInt();
        int i = 2023 - nasc;
        if (i>=18) {
            System.out.println("Maior de idade.");
        }else{
            System.out.println("Menor de idade.");
        }
        
    }
    
}
