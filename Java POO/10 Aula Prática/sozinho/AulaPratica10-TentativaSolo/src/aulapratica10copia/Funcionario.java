package aulapratica10copia;

public class Funcionario extends Pessoa{

    //atributos
    private String funcao;
    private boolean trabalhando;
        //Construtor
    public Funcionario(String nome, int idade, char sexo, String funcao){
        super(nome, idade, sexo);
        this.setFuncao(funcao);
        this.setTrabalhando();
    }
    
    //metodos getters e setters
    public String getFuncao(){
        return funcao;
    }
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
    public boolean getTrabalhando(){
        return trabalhando;
    }
    public void setTrabalhando(){
        this.trabalhando = true;
    }
    // metodo especial
    public void mudarFuncao(){
        this.setFuncao(funcao);
    }
    //mostrar status
    @Override
    public String detalhes() {
        return "{Funcionário-->" + super.detalhes() + ", Funcao = " + funcao + ", Trabalhando = " + trabalhando + '}';
    }
}