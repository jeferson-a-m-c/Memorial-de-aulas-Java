/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.pkg017;

import java.util.Scanner;

/**
 *
 * @author jeferson
 */
public class Exercicio017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ESTRUTURA CONDICIONAL SIMPLES 
        /**
         * 17) Escreva um programa que pergunte a velocidade de um carro. 
         * Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário 
         * foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 
         * por cada Km acima da velocidade permitida.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite a velocidade do veiculo em km/h: ");
        int vel =  teclado.nextInt();
        if (vel > 80){
            int multa = (vel - 80) * 5;
            System.out.println("Cometeu infracao");
            System.out.println("Deve ser aplicada multa no valor de R$ " + multa);
        }else{
            System.out.println("Nao cometeu nenhuma infracao.");
        }
        
    }
    
}
