
package aula09pratica;

/**
 *
 * @author jeferson
 */
public class Aula09Pratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p = new Pessoa("Jeferon", 21, "Masculino");
        p.fazerAniv();
        Livro l = new Livro("Salmos", "Rei Davi", 111, 11,false,p);
        l.detalhes();
        l.abrir();
        l.avançarPagina();
        l.avançarPagina();
        l.folear();
    }
    
}
