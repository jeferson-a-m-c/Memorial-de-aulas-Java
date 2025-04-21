package aulapratica02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    Boolean tampada;
    
    void status(){//mostra-rá o estado do objeto
        System.out.println("modelo " + this.modelo);
        System.out.println("Uma Caneta " + this.cor);
        /**
         * A palavra "this" significa auto referência ... quem chamou o método?
         * status vai aparecer no lugar de "this". Quando o método for chamadado
         * this será substituido por c1 que é o própio obejeto que chamou
         * SEMPRE QUE EU QUISER FAZER A ALTERAÇÃO DE ALGUM ATIBUTO DENTRO DA
         * PROPRIA CLASSE, DEVO USAR "this".
         */
        System.out.println("Ponta " + this.ponta);
        System.out.println("carga " + this.carga);
        System.out.println("Esta Tampada ? " + this.tampada);

    }
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO: NAO posso rabiscar");
        }else{
            System.out.println("Rabiscando");
        }
    }
    
    void tampar(){
       this.tampada = true; 
    }
    
    void destampar(){
        this.tampada = false;
    }
}
