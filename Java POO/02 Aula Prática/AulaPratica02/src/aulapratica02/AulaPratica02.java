
package aulapratica02;

public class AulaPratica02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;//converção de double para float
        c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        /**
         * perceba que ao usar o THIS toda diferença foi feita visto que 
         * quando a chamada dos metodos é feita o valor das variáveis são
         * reajustados para o objeto que chamou o metodo. assim foi possível
         * fazer com que a caneta c1 não rabiscasse e que caneta c2 rabiscasse.
         * TODOS ELE TEM O MESMO ESTADO, POIS PERTECEM A MESMA CLASSSE a dife_
         * rença está no valor de cada variável.
         */
        Caneta c2 = new Caneta();
        c2.modelo = "manoel gomes";
        c2.cor = "preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
