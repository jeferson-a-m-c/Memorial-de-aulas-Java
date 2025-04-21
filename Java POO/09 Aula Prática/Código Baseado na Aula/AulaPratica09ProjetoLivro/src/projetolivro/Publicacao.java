package projetolivro;
/**
 *
 * @author jeferson
 */
public interface Publicacao {
    public void abrir();
    public void fechar();
    public void folear(int p);//isso aqui me gerou muito problema, eu não tinha 
    //percebido que deveria ter passado um parâmetro nesse método, tudo funcionava
    //exceto por essa parte.
    public void avacarPag();
    public void voltarPag();
}
