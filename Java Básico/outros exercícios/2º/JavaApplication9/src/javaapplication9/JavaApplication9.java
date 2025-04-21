
package javaapplication9;

public class JavaApplication9 {
    
    /*2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos 
números 4, 5 e 6. A soma das duas médias. A média das médias.*/

    public static void main(String[] args) {
        int n1 = 8;
        int n2 = 9;
        int n3 = 7;
        float m1 = ( n1 + n2 + n3 ) / 3 ;
        System.out.println(" A 1º média é igual a : " + m1);
        
        int n4 = 4;
        int n5 = 5;
        int n6 = 6;
        float m2 = ( n4 + n5 + n6 ) / 3;
        System.out.println(" A 2º média é igual a : " + m2);
        
        float somaMedia = m1 + m2;
        float mediaMedia = somaMedia / 2;
        
        System.out.println(" A soma das médias é igual a : " + somaMedia + " e a media das médias 1 e 2 é igual a : " + mediaMedia);
        
        /*é possivel formatar o resultado e eu vou fazer isso em outro código com a estrutura idêntica somente mudando o nescessário 
        para que haja essa formatação do resultado da média.Vou salvar na mesma pasta com o nome de 9.1
        */
       
    }
    
}
