package objetoconcreto;

public class Capacete {
    
    //Atributos
    String modelo;
    String cor;
    boolean visor;
    String corVisor;
    int validade;
    float preco;
    boolean equipado;
    boolean fechado;
    boolean abotoado;
    
    //Estado
    
    void status(){
        System.out.println("modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("Tem visor ? " + this.visor);
        if (this.visor == true){
            System.out.println("cor do visor: " + this.corVisor);
        }
        System.out.println("validade: " + this.validade);
        System.out.println("R$ " + this.preco);

    }
    
    //Métodos
    
    void equipar(){
        this.equipado = true;
    }
    void fechar(){
        this.fechado = true;
    }
    void abotoar(){
        this.abotoado = true;
    }
    void andar (){
        if (this.equipado && this.abotoado && this.fechado ){
            System.out.println("Voce pode andar, esta em seguro");
        }else{
            System.out.println("não pode andar");
        }
    }
}
    
