package javaapplication14;
    
import java.util.Scanner;

/*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
 *calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
 *(1SM=R$788,00) *na verdade vou considerar o valor atual(R$ 1320,00)
 */

public class JavaApplication14 {

    
    public static void main(String[] args) {
        double min = 1320.00;
        Scanner teclado = new Scanner(System.in);
        System.out.println(" salário do usuário :");
        double salario = teclado.nextDouble();
        double qMin = salario / min ;
        System.out.printf(" equivalente a %.2f salário(s) mínimo(s)",qMin);
    }
    
}
