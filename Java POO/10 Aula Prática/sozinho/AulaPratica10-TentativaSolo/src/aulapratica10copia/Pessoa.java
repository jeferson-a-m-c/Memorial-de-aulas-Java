package aulapratica10copia;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //construtor
    public Pessoa(String nome, int idade, char sexo){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }
    //Métodos assessores e modificadores
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){ //Operador Ternário
                                    //[variável = (condição) ? (verdadeiro) : (falso)]
        this.sexo = ((sexo == 'M') || (sexo == 'm')) ? "Masculino" : 
                ((sexo == 'F') || (sexo == 'f')) ? "Feminino" : "Indefinido";
        
//usando Switch usar o switch pode ser mais eficiente e mais fácil de ler e manter em uma estrututa
            //switch (sexo) {            
        //case 'M':             
        //case 'm':
            //this.sexo = "Masculino";
           // break;
        //case 'F':
       // case 'f':
          //  this.sexo = "Feminino";
        //    break;
      //  default:
           // this.sexo = "Indefinido";
           //}
//usando if
    //if (sexo == 'M' || sexo == 'm') {
         //   this.sexo = "Masculino";
        //} else if (sexo == 'F' || sexo == 'f') {
        //    this.sexo = "Feminino";
       // } else {
       // this.sexo = "Indefinido"; // Ou lançar uma exceção
       //{
    }
  
    //metodos especiais
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }
    //mostrar status
    public String detalhes() {
        return " nome = " + nome + ", idade = " + idade + ", sexo = " + sexo;
    }
}