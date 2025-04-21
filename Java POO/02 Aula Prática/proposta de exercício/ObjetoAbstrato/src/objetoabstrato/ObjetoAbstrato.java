
package objetoabstrato;

public class ObjetoAbstrato {

    public static void main(String[] args) {
        // Intanciar um (meu) objeto da classe Acordar.
        Acordar meu = new Acordar();
        
        meu.cobertores = 3;
        meu.lencol = false;
        meu.molhada = false;
        meu.travesseiroFronha = true;
        meu.tempoMin = 1.45f;
        meu.preparada = false;
        
        //VER STATUS
        meu.status();
        
        //metodos
        
        meu.preparar();
        meu.dormir();
        
    }
    
}
