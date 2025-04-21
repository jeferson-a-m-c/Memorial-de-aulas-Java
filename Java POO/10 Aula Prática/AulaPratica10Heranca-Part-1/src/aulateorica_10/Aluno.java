package aulateorica_10;

/**
 *
 * @author jeferson
 */
public class Aluno extends Pessoa {
    // Atributo
    private int mat;
    private String curso;

    //Métodos
    public void cancelarMatricula(){
        System.out.println("Matrícula Cancelada");
    }

    public int getMatricula() {
        return mat;
    }

    public void setMatricula(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
