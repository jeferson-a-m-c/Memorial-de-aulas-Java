
package exercicion1;
/*1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e 
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/

import java.util.Scanner;


public class ExercicioN1 {

    
    public static void main(String[] args) {
        
        System.out.print(" Quantos anos tem ? ");
        Scanner teclado = new Scanner(System.in);
        int ano = teclado.nextInt();
        System.out.print(" Em qual mês nasceu ? ");
        int mes = teclado.nextInt();
        System.out.print(" Em que dia nasceu ? ");
        int dia = teclado.nextInt();
        
        int total = (ano * 365) + (mes * 30) + dia;
        
        System.out.println(" O nº TOTAL de dias vividos é : " + total );

       /*utilizando chat GPT consegui ter noção do meu equivoco e de como se usa
        * o comando + (contatenado) para fazer uma relação entre ideias, coisa que 
        *eu tinha visto a pouco, mas acabei por esquecer.        
        */
    }
}