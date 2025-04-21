/**
 * essa é a aula pratica 03 reutilizando todo o pacote da aula 02, aqui veremos
 * como utilizar os modificadores de visibilidade (public, private, protected)
 * nos atributos e métodos.
 */
package aulapratica02;

public class AulaPratica02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Bristal";
        c1.cor = "Azul";
        /** c1.ponta = 0.5f; Ponta está com o modificador privado. desse geito 
         * não consigo mudar o contéudo deste atributo, pois estão em classes 
         * diferentes.
         */ 
        c1.carga = 80;
            /** Dentro da minha Classe "AulaPratica02" eu tenho um
             * método "main" que está usando o objeto "c1", ou seja, 
             * lembre que o Guanabara disse " que protected dá acesso
             * a mãe e aos seus filhos ""Dá acesso a Classe e a todas 
             * as suas sub-classes"
             * Portanto o método main vai deixar-me mexer no atributo 
             * que está protegido, porque main esta dentro de uma Classe,
             * que utiliza a Classe "Caneta".
             */
            
        /** c1.tampada = true;
         * não posso mexer em tampada, pq ela está privada, e 
         * o objeto c1 não se encontra na mesma classe que o atributo tampada
         */
        c1.tampar();
        c1.status();
        
    }
    
}
