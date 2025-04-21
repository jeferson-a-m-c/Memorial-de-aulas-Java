/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplocondiçãodemultiplaescolha;

import java.util.Scanner;

/**
 *
 * @author magal
 */
public class ExemploCondiçãodeMultiplaEscolha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (perna) {
            case 1 :
                tipo = "Saci";
                break;
            case 2 :
                tipo = "Bípede";
                break;
            case 3 :
                tipo = "cavalo de três pernas";
                break;
            case 4 : 
                tipo = "Quadrúpede";
                break;
            case 6, 8 :
                tipo = "Aracnídeo";
                break;
            case 100 :
                tipo = "centopéia";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
}
