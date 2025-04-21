/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author jeferson
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//posso declarar a variável desta maneira:

                //int n[] = {3,2,8,7,5,4};

//tambem posso fazer:

                //int[] n = {3,2,8,7,5,4};

/*ou ainda:
                
                int n[] = new int[4];
                n[0] = 3;
                n[1] = 2;
                n[2] = 8;
                n[3] = 7;
                n[4] = 5;
                n[5] = 4;*/
//vamos mostrar esses valores na tela, começando por uma maneira que a gente acabou de ver(aula anterior):
/*desta maneira veremos os valores dos índeces:

                for(int c = 0; c<=5;c++){
                System.out.print(c);
                }*/
/*para mostrar os valores dentro de cada indice:
    
                for(int c = 0; c<=5;c++){
                System.out.print(n[c]);//quero dizer "n" na posição "c" (n[c]).
                }*/


        int n[] = {3,2,8,7,5,4};
        System.out.println("Total de casas de N " + n.length);/*como se trata de um objeto
ele possui atributos e métodos, este(length) é o único atributo para n
LENGTH-> significa comprimento, todos os outros acompanhados de () são metodos, para vê-los 
basta acrescentar o ponto final após a variável(n.)*/
       
        for(int c = 0; c<= n.length-1; c++){
/*desta forma eu tenho um código genérico para qualquer valor de n
            tnho que subtrair 1 do length, pq os indices sempre se iniciam do zero(0). ou troque o sinal de <= por <*/
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
        
    }
    
}
