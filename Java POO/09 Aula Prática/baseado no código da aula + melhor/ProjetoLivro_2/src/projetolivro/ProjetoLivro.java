package projetolivro;
/**
 *
 * @author jeferson
 */
public class ProjetoLivro {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[2];
        p[0] = new Pessoa("Adalto", 24, "M");
        p[0].fazerAniversario();

        p[1] = new Pessoa("Sabrina", 33, "F");
    
        Livro[] l = new Livro[3];
        l[0] = new Livro ("Aprendendo Java", "Geraldo Cunha", 270, p[0]);
        l[1] = new Livro ("POO para Avançado","Sebastiana Velasques", 500, p[1]);
        l[2] = new Livro ("Enciclopédia De Java em Português", 
                "Rodiney Dartanhã", 2000, p[0]);
        
        l[0].abrir();
        l[0].folear(201);
        l[0].avacarPag();
        l[0].detalhes();
        
        l[1].abrir();
        l[1].folear(444);
        l[1].voltarPag();
        l[1].detalhes();
        
        l[2].fechar();
        l[2].detalhes();
    }

}
