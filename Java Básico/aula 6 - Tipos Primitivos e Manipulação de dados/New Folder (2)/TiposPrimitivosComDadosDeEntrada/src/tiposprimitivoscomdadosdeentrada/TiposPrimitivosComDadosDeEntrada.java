/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// AQUI A GENTE TEM UM COMENTÁRIO DE VÁRIS LINHAS  COM O PADRÃO COMUMENTE USADO PELOS PROGRAMADORES
package tiposprimitivoscomdadosdeentrada;

import java.util.Scanner;

/**
 *
 * @author magal
 */
//AQUI TEMOS COMETÁRIOS DO TIPO DOCUMENTAÇÃO

public class TiposPrimitivosComDadosDeEntrada {    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//E POR FIM UM COMENTÁRIO DE UMA LINHA QUE É O QUE EU ESTOU USANDO E APRENDI NO VISUALG
       
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno(a): ");
        String nome = teclado.nextLine();
        System.out.println("");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.2f \n ", nome, nota);
        
        
/*  1º-> modo
 *      float nota = 8.5f;
 *      System.out.println(" A nota é : " + nota);
 *  2º-> modo
 *      float nota = (float)8.5
 *  3º-> modo     
 *      System.out.printf(" Sua nota é %.2f", nota);
 *      System.out.printf(" Sua nota é %.2f \n", nota); 
 * para saltar uma linha usa-se "\n"
 * o nº dois indica o número de casas decimais que vc deseja ter 
 * até já aprendi a comentar igual a programador 
 *  4º-> modo  
 *      System.out.format("A nota de %s é %.2f \n ", nome, nota);
 *
 *!!! ULTIMA OBS: VC PODE TROCAR O CÓDIGO DE ACORDO COM O QUE EU INDIQUEI COMO "modo",
 * DESDE QUE NÃO ESEJA DE ACORDO COM A ESTRUTURA CORRETA ELE VAI FUNCIONAR DE QUALQUER JEITO.
 */
}
    
} 