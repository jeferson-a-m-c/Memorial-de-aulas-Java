/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapratica11b_heranca_part2;

/**
 *
 * @author jeferson
 */
public abstract class Pessoa {// pela primeira vez estou usando uma classe abstrata
                    //ao dizer que uma classe é abstrata, quero indicar que esta
                    //não vai poder ser instanciada, somente irá servir como
                    //PROJENITORA
    //ATRIBUTOS
    private String nome;
    private int idade;
    private String sexo;
    //METEDO ESPECIAL
    public void fazerAniversario(){
        this.idade ++ ;
    }
    //MÉTODOS ASSESSORES E MODIFICADORES

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //Método para mostrar o Status
    @Override
    public String toString() {
        return "Dados{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
}
