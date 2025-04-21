package aula09pratica;

/**
 *
 * @author jeferson
 */
public class Pessoa {
    
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //Construtor
    
    public Pessoa(String n, int i, String s){
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(s);
    }
    
    //método
    
    public void fazerAniv(){
        this.setIdade(this.getIdade() + 1);
    }
    //getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }
    
}
