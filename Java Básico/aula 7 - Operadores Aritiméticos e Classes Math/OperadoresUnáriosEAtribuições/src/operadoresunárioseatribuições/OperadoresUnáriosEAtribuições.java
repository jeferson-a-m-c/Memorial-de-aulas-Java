package operadoresunárioseatribuições;

public class OperadoresUnáriosEAtribuições {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Todos os outros operadores são iguais
        
        // OPERADORES UNÁRIOS
        // 1º Exemplo
        int numero = 5;
        numero++;
        System.out.println(" Número vale: " + numero);
        /*aqui pode-se entender que a variável número através do comando "++" 
        *recebe +1(pós-incremento) e passa a valer 6
        */
        System.out.println(" ");
        //2º Exemplo
        /* Nesse exemplo, sabe-se que o valor final do Numeral será igual a 9, porém
        *Atenção o conteúdo da variável valor não será 13 que é o que geralmente se imagina.
        *Na verdade o pós-decremento funciona da seguinte forma, " É realizada todas as 
        *operações necessárias e depois e feito o decremento da variável", deste modo temos
        *que o valor de valor é 14 e após essa soma o numeral vale 9.
        */
        int numeral = 10;
        int valor = 4 + numeral--;
        System.out.println(" Numeral vale: " + numeral);
        System.out.println(" Valor vale: " + valor);
        //3º Exemplo trocando o Pós-Decremento do exemplo dois pelo Pré-Decremento:
        System.out.println(" ");
        int numeral2 = 10;
        int valor2 = 4 + --numeral2;
        System.out.println(" Numeral vale: " + numeral2);
        System.out.println(" Valor vale: " + valor2);
        //Acho que já deu para entender
    }
    
}
