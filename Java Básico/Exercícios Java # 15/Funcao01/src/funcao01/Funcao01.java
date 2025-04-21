/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcao01;

/**
 *
 * @author jeferson
 */
public class Funcao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // O código fica muito mais curto usando uma classe externa
        Fatorial f = new Fatorial();          //CRIEI UM OBJETO "f", que tem os métodos
        f.setValor(5);                        //passo 5 como parâmetro para o método setValor
        System.out.print(f.getFormula());     //método getFormula para retornar a String
        System.out.println(f.getFatorial());  //retorna o fatorial
                                              /**
                                               * Note que todos usam f.algum método isso
                                               * pq f é um objeto que contém todos esses 
                                               * métodos da Classe Fatorial.
                                               */    
    
    }
    
}
