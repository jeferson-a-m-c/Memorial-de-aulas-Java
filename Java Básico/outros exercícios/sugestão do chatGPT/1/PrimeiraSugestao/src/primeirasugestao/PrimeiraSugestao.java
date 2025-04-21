package primeirasugestao;

import java.util.Scanner;

public class PrimeiraSugestao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*1-Calculadora Simples
         *Crie um programa que permita ao usuário realizar operações 
         *aritméticas simples (adição, subtração, multiplicação e 
         *divisão) inserindo dois números e a operação desejada.
         */
        /*  Como eu não aprendi a usar comandos de condição vou fazer uma
         * calculadora para cada situação e talvez eu use o mesmo código
         * só colocando o código que não irei uasr como comentário. 
         */
        Scanner teclado = new Scanner(System.in);
        /*tá ficando chato esqueci de acrescentar "new" e pior tava dando erro 
        na linha 21 e eu com certeza escrevi tudo certo, pórem ao apagar e reescrever
        o problema sumiu, nao faz sentido*/
        
        /*Começando por adição */
        /*
        System.out.println(" A ordem dos fatores não altera o produto. ");
        float primeiroFator = teclado.nextFloat();
        float segundoFator = teclado.nextFloat();
        float soma = primeiroFator + segundoFator;
        System.out.format("O resultado da soma dos fatores é: %.2f \n", soma);
        */
        //poderia melhorar o código usando repetição
        //também poderia fazer uma versão uasando Swing
        
        //SUBTRAÇÃO:
        /*
        System.out.println(" A ordem entre Minuendo e Subtraendo faz toda Diferença no Resultado. ");
        float minuendo = teclado.nextFloat();
        float subtraendo = teclado.nextFloat();
        float diferença = minuendo - subtraendo;
        System.out.format(" A diferença  é: %.2f \n", diferença);
        */
        
        //Divisão:
        /*
        System.out.println("'Quem Divide, Multiplica!'");
        float dividendo = teclado.nextFloat();
        float divisor = teclado.nextFloat();
        float resultado = dividendo / divisor;
        float resto = dividendo % divisor;
        System.out.printf(" O resultado da divisão é %.2f e tem como resto %.2f \n", resultado, resto);
        */
        
        //multiplicação
        System.out.println("Seis vezes oito é igual a quarenta e oito.");
        float multiplicando = teclado.nextFloat();
        float multiplicador = teclado.nextFloat();
        float resultado = multiplicando * multiplicador;
        System.out.format("O resultado da operção é : %.2f \n", resultado);
        
    }
    
}
