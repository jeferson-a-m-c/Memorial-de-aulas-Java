package aula09pratica;

/**
 *
 * @author jeferson
 */
public interface Publicacao {
    /**
     * Na interface os métodos são abstratos não sendo desenvolvidos nela;
     * A interface apenas apresentar as funcionalidades;
     */
    public void abrir();
    public void fechar();
    public void folear();
    public void avançarPagina();
    public void voltarPagina();
}
