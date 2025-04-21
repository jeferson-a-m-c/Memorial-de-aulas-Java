package aulapratica10copia;

import java.util.Scanner;

public class Aluno extends Pessoa {
    //Atributos 
    private int numMatricula;
    private String curso;
    private boolean matricula;
    
    //construtor
    /**
     * aqui eu declaro todo tipo de dados que vou receber, note que uso "super",
     * Que faz refência a classe mãe (Pessoa) utilizando seus  métodos
     */
    public Aluno(String nome, int idade, char sexo, int numMatricula, 
            String curso){
        super(nome, idade, sexo);
        this.abrirMatricula();
        this.setNumMatricula(numMatricula);
        this.setCurso(curso);
    }
    
    //Metodos getters e setters

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        
        this.numMatricula = numMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    //metodo especial
    public void cancelarMatricula(){
        this.matricula = false;
    }
    public void abrirMatricula(){
        this.matricula = true;
    }
    //Mostrar status
    /**
     * aqui eu devo usar o "@Override" para indicar que estou sobrescrevendo o 
     * método "Detalhes" da classe "Pessoa", ao qual faco referência usando a 
     * palavra "super", para então poder exibir a informação completa
     * 1º eu criei o método toSting de forma altomática
     * 2º alterei para que se chamasse "detalhes" e fizesse referência a outro.
     */
    @Override
    public String detalhes() {
        return "{Aluno-->" + super.detalhes() + ", nº Matricula = " + numMatricula + 
                ", curso = " + curso + ", matricula = " + matricula + '}';
    }
}