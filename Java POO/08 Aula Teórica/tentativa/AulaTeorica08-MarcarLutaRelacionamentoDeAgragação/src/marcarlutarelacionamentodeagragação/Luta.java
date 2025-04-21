/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marcarlutarelacionamentodeagragação;

import java.util.Random;

/**
 *
 * @author jeferson
 */
public class Luta {
    /**
     * há uma relação de "TEM UM" entre a classe luta e a classe lutadores, esse
     * termo se refere a essa relação de agregação,exemplicando, luta tem uma
     * instância que pertence a classe lutadores.
     */
/**                Regras:
 * só pode ser marcada luta entre lutadores de mesma categoria
 * desafiante e desafiado devem ser lutadores diferentes (!=)
 * só pode acontecer uma luta se ela estiver aprovada
 * só pode ter como resultado a vitória de um dos lutadores ou o empate
 */    

//Atributos
    /**
     * novo conceito: desafiante e desafiado são atibutos que tem uma relação 
     * de um tipo abstrato e uma instância respectivamente
     */
    private Lutadores desafiante;
    private Lutadores desafiado;
    private int rounds;
    private Boolean aprovada;
//método construtor
    
    /**public Luta(Lutadores desafiante, Lutadores desafiado) {
        this.desafiante = desafiante;
        this.desafiado = desafiado;
    }
    *não sei se por erro meu ou do enunciado da atividade esse código engessado 
    * demais desse jeito, mas se for o caso de ser nescessário retornar ao que 
    * estava antes vou deixar aqui o código como comentário.
    */
    public Luta() {
        this.aprovada = false;
    }
    
//métodos especiais 
    public void marcarLuta(Lutadores l1, Lutadores l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)){
            //passei mó tempão tentando entender o que estava errado e era o 
            //bendito sinal de diferença que é != e não =!...kkkkkkk
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if (this.getAprovada()) {
            System.out.println("### Desafiado ###");
            this.getDesafiado().apresentar();
            System.out.println("### Desafiante ###");
            this.getDesafiante().apresentar();
            //tenho que criar um gerado de números aleatórios que seja 0,1 ou 2.
            Random n = new Random();//fazer a importação do java.util.Random
            int vencedor = n.nextInt(3);//fazer a converção de n para inteiro
            System.out.println("=============RESULTADO======================");
            switch (vencedor){//switch = escolha
                case 0://case = caso
                    System.out.println(this.desafiado.getNome() + " e " + 
                            this.desafiante.getNome() + " empataram");
                            System.out.println("========================"
                                    + "====================");
                        //somente saltei a linha para não ficar uma frase longa
                    this.getDesafiado().empatar();
                    this.getDesafiante().empatar();
                    break;//se essa linha é executada, ela é então pulada para que
                    // isso a estrutura não  fique repetindo-se.semelhante ao FimSe
                case 1:
                    System.out.println("E o vencedor é " + 
                            this.desafiado.getNome() + " !!!!!!!");
                    System.out.println("========================"
                            + "====================");
                    this.getDesafiado().ganhar();
                    System.out.println("Agora com ");
                    this.desafiado.status();
                    this.getDesafiante().perder();
                    break;
                case 2:
                    System.out.println("E o vencedor é " + 
                            this.desafiante.getNome() + " !!!!!!!");
                            System.out.println("========================"
                                    + "====================");
                    this.getDesafiado().perder();
                    this.getDesafiante().ganhar();
                    System.out.println("Agora com ");
                    this.desafiado.status();
                    break;
            }
        }else{
            System.out.println("Luta não pode acontecer.");
        }
    }
    //getters and setters

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
