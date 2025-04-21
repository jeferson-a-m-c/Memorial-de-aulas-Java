/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author jeferson
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*EXEMPLO ESTRUTURA DE REPETIÇÃO
        
        int cc = 0;
        while (cc < 4) {
            System.out.println(cc + " Cambalhotas");
            cc++;
        } 
        */
        
//EXEMPLO MUDANDO O FLUXO DE UM LAÇO utilizando continue e break
        
        int cc = 0;
        while (cc<10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue;
                //quando a condição é atingida o comando continue é executado reiniciando a repetição
        }
            if (cc == 7){
                break;
                //quando a condição é atingida o comando break é executado encerrando a repetição
            }
            System.out.println(cc + " Cambalhota");
        }
//quando a condição é atingida o comando break é executado encerrando a repetição            

    }
    
}
