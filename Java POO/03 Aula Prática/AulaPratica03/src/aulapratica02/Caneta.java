/**
 * essa é a aula pratica 03 reutilizando todo o pacote da aula 02, aqui veremos
 * como utilizar os modificadores de visibilidade (public, private, protected)
 * nos atributos e métodos.
 */
package aulapratica02;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;//essa alteração foi feita para exemplificar um fato
    
    public void status(){//mostra-rá o estado do objeto
        System.out.println("modelo " + this.modelo);
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("carga " + this.carga);
        System.out.println("Esta Tampada ? " + this.tampada);

    }
    
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO: NAO posso rabiscar");
        }else{
            System.out.println("Rabiscando");
        }
    }
    /**
     * OS MÉTODOS TAMPAR E DESTAMPAR AGORAM SÃO PÚBLICOS PARA QUE SEJA POSSÍVEL 
     * EXEMPLIFICAR UM CASO ESPECÍFICO.
     */
    
    /**
     * NOTE QUE, OS MÉTOS ABAIXO SÃO PÚBLICOS, OU SEJA TODOS PODEM TER ACESSO,
     * PORÉM O ATRIBUTO TAMPADA É PRIVADO, OU SEJA, SOMENTE A CLASSE PODE ALTERAR
     * ESSA É A QUESTÃO... COMO QUE O CÓDIGO VAI REAGIR AO FATO DE QUE MEU METODO
     * PUBLICO VAI LEVAR A ALTERAÇÃO DO MEU ATRIBUTO PRIVADO? ISSO SERÁ POSSÍVEL?
     * SE SIM OU SE NÃO, COMO?
     * 
     * A resposta é SIM, se torna possível ter acesso ao atributo privado desta
     * forma pq agora, apesar de o atributo ser privado, o método se encontra na 
     * mesma classe que o atributo e desta forma ele pode ter acesso.
     * 
     * o metodo publico é um caminho ao qual todos tem acesso (Classes externas)
     * e por meio dele podem chegar até o atributo privado ao qual somente quem 
     * esta na mesma classe pode chegar.
     * EXEMPLO REAL: "quando vc vai comprar no mercado vc não pode pagar e pegar 
     * o troco por conta propia, para receber o troco e guadar o dinheiro existe 
     * o atendente que funciona como o metodo publico, qualquer cliente vai pagar
     * ao atendente e atravez do atendente é que o seu dinheiro será guadado e 
     * seu troco será repassado, porque o caixa é privado ao atendente, mas o 
     * acesso ao atendente é liberado a todos".
     */
    public void tampar(){
       this.tampada = true; 
    }
    
    public void destampar(){
        this.tampada = false;
    }
}
