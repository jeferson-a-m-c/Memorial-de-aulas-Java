/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapratica13.sobrecarga;

/**
 *
 * @author jeferson
 */
public class Cachorro extends Lobo{
    @Override 
    public void emitirSom(){
        System.out.println("AU! AU! AU!");
    }
    
    public void reagir(String frase) {
        if ((frase.equals( "Toma comida" )) || (frase.equals("Olá"))){
            System.out.println("Abanar e Latir");
        }else{
            System.out.println("Rosnar");
        } 
    }
    /**public void reagir(String f){
     *   ...
     * esse tracho não é aceito por ter a mesma assinatura do metodo acima deste
     * , pois recebe o mesmo tipo de parametro e a mesma quantidade de parametros
     */ 
    public void reagir(int h, int m){
        float min = m / 100;
        float hora = h + min;
        if (hora > 12 && hora < 18 ) {
            System.out.println("Abanar");
        }else if (hora >= 18){
                System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e latir");//tudo que for menor que 12
        }
    }
    public void reagir(boolean dono){
        if (dono){//para tipo logico já se verifica se caso verdadeiro
            System.out.println("Abanar");
    }else{
            System.out.println("Rosnar e latir");
            }
    }
    public void reagir(int idade, float peso){
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            }else{
                  System.out.println("Latir");
                 }
        }else{
            if (peso < 10) {
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }
    }
}
