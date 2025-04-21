
package javaapplication12;

import java.util.Scanner;

public class JavaApplication12 {

    /**
     * Escrever um algoritmo que lê:
     *- a porcentagem do IPI a ser acrescido no valor das peças
     *- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
     *- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
     * O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
     * Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
     */
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println(" IPI (Imposto Sobre Produtos Industrializados : ");
        float ipi = teclado.nextFloat();
        System.out.println(" Código da peça 1 : ");
        float cod1 = teclado.nextFloat();
        System.out.println(" Valor unitário : ");
        float valor1 = teclado.nextInt();
        System.out.println(" Unidades : ");
        int quant1 = teclado.nextInt();
        System.out.println(" Código da peça 2 : ");
        float cod2 = teclado.nextInt();
        System.out.println(" Valor unitário : ");
        float valor2 = teclado.nextInt();
        System.out.println(" Unidades : ");
        int quant2 = teclado.nextInt();
        float valorTotal = (valor1 * quant1 + valor2 * quant2) * (ipi/100 + 1);
        System.out.println(" O valor total cobrado é : " + valorTotal);
        System.out.print("Como foi calculado? Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)");
    }
    
}
