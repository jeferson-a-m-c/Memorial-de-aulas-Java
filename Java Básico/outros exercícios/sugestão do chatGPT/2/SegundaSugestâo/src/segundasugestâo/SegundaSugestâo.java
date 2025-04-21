package segundasugestâo;

import java.util.Scanner;

public class SegundaSugestâo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Operadores Unários
        Escreva um programa que use operadores unários para inverter 
        o sinal de um número inteiro digitado pelo usuário.
        */
        
        System.out.println("Digite uma número para obter seu oposto:");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int oposto = -num;
        System.out.println(" O oposto de " + num + " é " + oposto);
    }
}
