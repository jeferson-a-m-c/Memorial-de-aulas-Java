/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao02;

/**
 *
 * @author jeferson
 */

public class TesteFuncao02 {
    
    /**
     * @param args the command line arguments
     */
    static int soma (int a, int b){
        int s = a + b;
        return(s);
    }
    /*quase o mesmo que o outro código, foi retirado o comando para escrever na tela 
    *(System.out.println) e colocado o comando para retornar um valor (retorn)
    *mantenho o static pelo mesmo motivo do código anterior, não posso chamar um
    *método não estático dentro de um método estático.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Comecou o Programa");
        int sm = soma(5,2);
        System.out.println("A soma e: " + sm);
        
                    //ATENÇÃO PARA BOA PRÁTICA DA PROGRAMAÇÃO
                    
            /*UMA COISA A SE NOTAR E LEVAR EM CONSIDERAÇÃO É QUE A PARTE 
            *RESPONSÁVEL PELA EXIBIÇÃO FOI O MÉTODO PRINCIPAL, ESSA É UMA BOA 
            *PRÁTICA DE PROGRAMAÇÃO, POIS SEU CÓDIGO NÃO FICA ENGEÇADO...
            *VOCÊ CRIA FUNÇÕES QUE RETORNAM VALOR, E Á SEU PRÓPIO CÓDIGO VAI TRATAR
            *DA MANEIRA QUE MELHOR LHE CONVER. PORTANTO, SE ALGUÉM FOR USAR SUA 
            *FUNÇÃO... ELA NÃO VAI FICAR PRESA NO FORMATO DE EXIBIÇÃO QUE FOI 
            *FEITO NO PROCEDIMENTO POR EXEMPLO.
            */
    }
    
}
