
package javaapplication16;

import java.util.Scanner;

/*Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.*/

public class JavaApplication16 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Número Inteiro: ");
        int num = teclado.nextInt();
        int suc = num + 1;
        int ant = num -1;
        System.out.println(" O antecessor de " + num + " é " + ant + " e o sucessor é " + suc);

    }
    
}
