/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author jeferson
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    /*O método deve ser introduzido antes de se iniciar o código, antes do método
     *principal e depois, já dentro do método principal é feita a chamada.
    */
    
    static void soma(int a, int b){//FOI NESCESSÁRIO ACRESCENTAR O MÉTODO ESTÁTICO.(static)
        /*o método main serve para uma classe e não para uma instância, então
        *não posso chamar um procedimento dentro de um método estático se ele 
        *também não for estático.
        */
        int s = a + b;
        System.out.println("A soma e " + s);
    }
    /*VALE LEMBRAR que o método principal é executado primeiro então como observado
    *na prática a frase "começou o programa" irá aparecer primeiro que a frase "a soma é "
    * mesmo a aparecendo primeiro, isso porque apesar da ordem em que aparecem 
    *o método main ,como eu disse antes, é executado antes do método soma que será 
    *chamado dentro do própio método main*/ 
    public static void main(String[] args) {
/*APROVEITANDO QUE A AULA É SOBRE MÉTODOS, VAMOS RETORNAR AO MÉTODO MAIN
        *main é um método que não retorna valor, que recebe um vetor como parâmetro,
        *que é um método estático e público.
        *VOID como foi dito antes é a palavra que evidencia que não haverá um retorno
        */
        System.out.println("Comecou o programa.");
        soma (5,2);
        //muit texto e pouco código
    }
    
}
