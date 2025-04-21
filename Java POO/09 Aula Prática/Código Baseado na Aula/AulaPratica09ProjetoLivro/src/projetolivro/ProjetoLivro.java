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
        p[1] = new Pessoa("Sabrina", 33, "F");
    
        Livro[] l = new Livro[3];
        l[0] = new Livro ("Aprendendo Java", "Geraldo Cunha", 270, p[0]);
        l[1] = new Livro ("POO para Avançado","Sebastiana Velasques", 500, p[1]);
        l[2] = new Livro ("Enciclopédia De Java em Português", 
                "Rodiney D'Artagnan", 2000, p[0]);
        
        l[0].abrir();
        l[0].folear(201);
    //tenho que usar um sout porque o metodo detalhes cria e retorna uma String
        System.out.println(l[0].detalhes());
    }

}
