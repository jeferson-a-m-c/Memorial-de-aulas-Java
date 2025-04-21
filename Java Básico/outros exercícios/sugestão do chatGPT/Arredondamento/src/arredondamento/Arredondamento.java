package arredondamento;

import java.util.Scanner;

/*
5-Arredondamentos
Peça ao usuário para digitar um número decimal e, em seguida
,arredonde-o para o número inteiro mais próximo, para cima e 
para baixo, usando os métodos da classe Math.
*/
public class Arredondamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite um número decimal: ");
        Double num = tec.nextDouble();
        System.out.println("Valor absoluto");
        //classe math para numero absoluto
        Double numAbs = Math.abs(num);
        System.out.println("O valor absoluto é : " + numAbs);
        //classe math para arredondadamento para baixo
        Double numBx = Math.floor(num);
        System.out.println("Arredondamento para baixo " + numBx);
        //classe math para arredondamento para cima
        Double numC = Math.ceil(num);
        System.out.println("Arredondamento para cima " + numC);
        //classe math para arredondamento padrão
        Long numArr = Math.round(num);
        System.out.println("Arredondamento padrão " + numArr);
    }   
}