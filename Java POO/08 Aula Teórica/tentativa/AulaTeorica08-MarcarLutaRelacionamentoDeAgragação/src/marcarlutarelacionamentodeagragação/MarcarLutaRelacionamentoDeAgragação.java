/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marcarlutarelacionamentodeagragação;

/**
 *
 * @author jeferson
 */
public class MarcarLutaRelacionamentoDeAgragação {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// engraçado é que não foi utilizado o atributo round.
        // tornei setAltura um método privado , pois não faz sentido mudar a altura.
        Lutadores l[] = new Lutadores[6];//"l" é um vetor de [0 a 5].Portanto, l é um vetor que contém objetos do tipo Lutadores.
        l[0] = new Lutadores("Pretty Boy 😎","França", 31, 1.75f, 68.9f, 11, 2, 1);
        
        l[1] = new Lutadores("Putscript 😠","Brasil", 29, 1.68f, 57f, 14, 2, 3);
        
        l[2] = new Lutadores("Snapshadow 😁","EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
        l[3] = new Lutadores("Dead Code 💀","Autrália", 28, 1.93f, 81.6f, 13, 0, 2);
        
        l[4] = new Lutadores("Ufucoobol 👽","Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        
        l[5] = new Lutadores("Nerdaard 🤓","EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        //Luta luta01 = new Luta(l[0], l[1]);
        /**a linha acima era a antiga linha desse código que acredito que por 
         *engano ela esta descrita desta forma, portanto vou retirar os parâmetros
         * que nela são exigidos modificando tbm o construtor da classe Luta
         */
        Luta luta01 = new Luta();
        luta01.marcarLuta(l[2], l[3]);//introduza aqui quais os lutadores que você 
        //quer "ver" na lutar
        luta01.lutar();
    }
    
}
