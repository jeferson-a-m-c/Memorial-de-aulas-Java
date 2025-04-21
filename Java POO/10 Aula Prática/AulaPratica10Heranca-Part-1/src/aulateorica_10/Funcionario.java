package aulateorica_10;

/**
 *
 * @author jeferson
 */
public class Funcionario extends Pessoa {
    // Atributos 
    private String setor;
    private boolean trabalhando;

    // métodos
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando; //! valor inverso
    }
    
    // Métodos getters and setters

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
