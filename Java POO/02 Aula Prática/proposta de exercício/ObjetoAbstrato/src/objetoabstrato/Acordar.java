
package objetoabstrato;

public class Acordar {
    
    //ATRIBUTOS
    
    int cobertores;//QUANTOS COBERTORES PARA DOBRAR ?
    boolean lencol;/**PRECISA TROCAR ?
                            * a diferença de usar boolean (uma variavel primi-
                            * tiva) para Boolean (Uma Classe) é que primeiro:
                            * boolen armazena dois valores true e false, já
                            * Boolean armazena três valores true, fase e null
                            * Portanto a variável primitiva ocupa menos memória 
                            * enquanto a variável invólucro permite que sejam 
                            * usados métodos diferentes; usar uma ou outra vai
                            * depender de qual é mais vantajosa pra vc.
                            */
    boolean travesseiroFronha;//precisa trocar?
    boolean molhada;
    float tempoMin;//tempo para arrumar a cama.
    boolean preparada;//a cama está arrumada para dormir.
    
    //STATUS
    
    void status(){
        System.out.println("quantos cobertores ? " + this.cobertores);
        System.out.println("preciso trocar o lencol ? " + this.lencol);
        System.out.println("preciso trocar a fronha ? " + this.travesseiroFronha);
        System.out.println("a cama molhou ? " + this.molhada);
        System.out.println("quanto tempo leva para arrumar ? " + this.tempoMin + " minutos");
        System.out.println("A cama esta arrumada para dormir ? " + this.preparada);
        
    }
    //MÉTODOS
        
    void preparar(){//preparar para dormir.
        System.out.println("Arrumando...");
        this.preparada = true;
    }
    
    void dormir(){
        if (this.preparada == true && this.molhada == false){
            System.out.println("PODE DORMIR!");
        }
    }
    
}
