/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author jeferson
 */
public class Radar {
    /**
     * 17) Escreva um programa que pergunte a velocidade de um carro. 
     * Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário 
     * foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por cada Km
     * acima da velocidade permitida.
     */
    
    public static int multa (int lmt, int vlcdd){//vldd = velocidade, lmt = limite
        if (vlcdd > lmt){
            int m = (vlcdd - lmt) * 5;
            String s = ("O limete foi ultrapassado, será aplicada uma multa no valor de R$ " + m);
        }else{
            String s = ("Sem infração");
        }
        return (s) ;
    }
}
/**
 * o problema do código pode se dar pelo fato de que o professor ainda não tinha
 * ensinado a utilizar classes em projetos com janela, imagino que deva ter algo
 * haver com os modificadores de acesso privite, public ou protected. enfim, não 
 * sei resolver isso por enquanto.
 */
