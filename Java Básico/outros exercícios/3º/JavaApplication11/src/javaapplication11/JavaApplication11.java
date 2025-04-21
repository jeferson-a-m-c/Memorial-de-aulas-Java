
package javaapplication11;

import java.util.Scanner;

public class JavaApplication11 {
 
    //Informar um saldo e imprimir o saldo com reajuste de 1%.
    
    public static void main(String[] args) {
        
      Scanner teclado = new Scanner(System.in);  
      double saldo = teclado.nextDouble(); 
      double reajuste = saldo * 0.01 ;
      double novoValor = reajuste + saldo ;
        System.out.println(" O seu saldo passa a ser : " + novoValor + " com o reajuste");
/* Da primeira vez não quis funcionar, não sei o porque, mas parecia tudo estar do mesmo geito
 * que está agora.
 */ 
        
        
        
    }
    
}
