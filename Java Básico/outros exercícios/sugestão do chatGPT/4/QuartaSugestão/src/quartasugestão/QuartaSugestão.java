package quartasugestão;

import java.util.Scanner;

public class QuartaSugestão {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Classe Math
        *Crie um programa que use a classe Math para calcular a raiz 
        *quadrada, o seno e o cosseno de um número fornecido pelo 
        *usuário.
        */
         
        //RAIZ QUADRADA:
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual número deseja saber a raiz: ");
        long numero = teclado.nextLong();
        double raiz = Math.sqrt(numero);/*raiz não se encaixa em numeros inteiros
        portanto não se enquadra no tipo LONG, que eu ia utilizar*/
        System.out.printf(" A raiz quadrada de " + numero + " é %.2f (caso não seja exata a resposta estará aproximada). \n", raiz);
        //já vejo uma melhora em mim (:
    }
    
}
