/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapratica13.sobrecarga;

/**
 *
 * @author jeferson
 */
public class AulaPratica13Sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Nesta aula veremos como funciona a sobrecarga(observe a classe 
         * Cachorro), também teremos exemplos de sobreposição;
         * a diferença entre sobreposição e sobrecarga está ligada ao conceito de
         * Assinatura de Métodos e como eles interagem com a Classe.
         * - Sobrecarga = Ocorre quando há Metodos de assinatura diferentes e 
         * que estão na mesma classe
         * - Sobreposição = Ocorre quando há Métodos de assinatura iguais em 
         * Classes diferentes
         * - Assinatura de Métodos = nº de parâmetros e tipos de parâmetros, 
         * sendo ambos iguais, o método tem a mesma assinatura.
         * - sobrecarga e sobreposição possuem métodos de mesmo nome
         */
        
        Cachorro dog = new Cachorro();
        dog.reagir("Olá");              //Abanar e latir 
        dog.reagir("Vai Apanhar!");     //Rosnar
        dog.reagir(11, 45);             //Abanar e latir
        dog.reagir(21, 00);             //ignorar
        dog.reagir(true);               //abanar 
        dog.reagir(false);              //Rosnar e latir
        dog.reagir(2, 12.5f);           //latir
        dog.reagir(17, 4.50f);          //Rosnar
    }
    
}
