package projetolivro;
/**
 *
 * @author jeferson
 */
public class Pessoa {
    // atributos
    
    private String nome;
    private int idade;
    private String sexo;
    
    // método Construtor
    
    public Pessoa(String n, int i, String s){
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(s);
    }
    
    // método especiais
    
    public void fazerAniversario(){
       this.setIdade(this.getIdade() + 1);
    }
    
    // métodos assessores e modificadores

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
    
}
