package terceirasugestão;

import java.util.Scanner;

public class TerceiraSugestão {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Operadores de Atribuição
        Faça um programa que calcule juros compostos usando 
        operadores de atribuição para atualizar o valor do saldo em 
        uma conta bancária ao longo do tempo.
        */
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Siga os passos para saber o montante do seu investimento em juros compostos");
        System.out.println("");
        System.out.print("insira o valor inicial investido R$ ");
        double capital = teclado.nextDouble();
        System.out.print("insira a taxa de juros em porcentagem ");
        float taxa = teclado.nextFloat() / 100;
        System.out.print("Tempo em que o capital foi ou será aplicado (em meses) ");
        short tempo = teclado.nextShort();
        double montante = capital * Math.pow(( 1 + taxa ),tempo);
        System.out.printf(" O seu Montante aplicado nesse perído é de R$ %.2f \n", montante);

        /*foi interessante usar a função Math.pow (para exponenciação) pela primeira
        vez.
        Ocorreu de ter uma diferença pequena nos valores não sei onde está o problema
        parece que a operação math.pow está certa mas ainda está diferente da calculadora
        o que não faz muito sentido.
        */
        
    }
    
}
