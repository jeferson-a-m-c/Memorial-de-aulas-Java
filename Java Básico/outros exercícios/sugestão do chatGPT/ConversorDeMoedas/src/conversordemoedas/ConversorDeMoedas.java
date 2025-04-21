/*7-Conversor de Moeda
Crie um programa que permita ao usuário converter uma 
quantia de uma moeda para outra usando taxas de câmbio. 
Use números aleatórios para 
as taxas de câmbio.
*/
package conversordemoedas;

import java.util.Scanner;

public class ConversorDeMoedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("O real está fixo ao padrão de 1 unidade ");
        System.out.print("Diga o valor em Real que será convertido para a moeda europeia, estadunidense, japonesa, chinesa(respectivamente). R$ ");
        Scanner tec = new Scanner(System.in);
        float real = tec.nextFloat();
        float euro = (float)(1 + Math.random() * (4-1));
        float realEuro = real / euro;
        System.out.println("A conversão de R$ " + real + " para Euro é € " + realEuro);
        float dolar = (float)(2 + Math.random() * (6 - 2));
        float realDolar = real / dolar;
        System.out.println("A conversão de R$ " + real + " para Dolar é US$ " + realDolar);
        float iene = (float)(0.01 + Math.random() * (0.07 - 0.01));
        float realIene = real / iene;
        System.out.println("A conversão de R$ " + real + " para Iene é ¥ " + realIene);
        float yuan = (float)(0.1 + Math.random() * (1 - 0.1));
        float realYuan = real / yuan;
        System.out.println("A conversão de R$ " + real + " para yuan é ¥ " + realYuan);
        System.out.println("");
        System.out.println("Cotação das moedas (os valores se alteram a cada conversão)");
        System.out.println("euro € " + euro);
        System.out.println("dolar US$ " + dolar);
        System.out.println("iene ¥ " + iene);
        System.out.println("yuan ¥ " + yuan);
    }
    
}
