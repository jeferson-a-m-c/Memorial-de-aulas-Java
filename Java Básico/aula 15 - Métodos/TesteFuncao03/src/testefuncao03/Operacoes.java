/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testefuncao03;

/**
 *
 * @author jeferson
 */
public class Operacoes {
    /*Temos uma classe pública
    *criamos um método público para que fosse possível chamá-lo dento de outra classe
    *esse método também é estático,pois não posso chamar um método não estático dentro de um estático
    *temos outras opções que veremos mais a frente para tipos de classe sendo privadas e protected 
    */
    public static String contador(int i, int f){
        String s = "";
        for (int c = i;c <= f; c++){
            s += c + " ";//+= é um operador de atribuição, onde os termos á direita são acrescidos ao da esquerda
        }
        return s;
    }
}
