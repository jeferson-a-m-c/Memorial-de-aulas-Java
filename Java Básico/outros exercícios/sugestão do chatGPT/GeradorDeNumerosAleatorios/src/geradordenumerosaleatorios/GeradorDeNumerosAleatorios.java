package geradordenumerosaleatorios;

import java.util.Scanner;

/*6-Gerador Aleatório de Números
Implemente um jogo de adivinhação onde o programa gera um 
número aleatório e pede ao usuário para adivinhá-lo. 
Dê dicas se o palpite estiver muito alto ou muito baixo.
*/
public class GeradorDeNumerosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int random = (int) (1 + Math.random() * (11-1));
        System.out.println(" Adinhe o número sorteado de 1 a 10");
        Scanner tec = new Scanner(System.in);
        int palpite = tec.nextInt();
        if (random == palpite){
            System.out.println("Você acertou!!!");
        }else{
            System.out.println("Você errou!!!");
        }
        System.out.println("O Nº sorteado é : " + random);
    }    

}
//CREIO QUE ESTEJA TUDO CERTO.
