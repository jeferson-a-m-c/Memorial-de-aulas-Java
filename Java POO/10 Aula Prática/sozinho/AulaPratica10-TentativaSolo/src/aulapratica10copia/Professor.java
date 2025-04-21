package aulapratica10copia;

import java.util.Scanner;

public class Professor extends Pessoa{

    //atributos
    private String especialidade;
    private Double salario;
    
    //Construtor
    public Professor(String nome, int idade, char sexo,String especialidade){
        super(nome, idade, sexo);
        this.setEspecialidade(especialidade);
        this.setSalario(1640.00);
    }
    
    //metodos getters e setters
    public String getEspecialidade(){
        return especialidade;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public Double getSalario(){
        return salario;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
    //metodo especial
    public void aumento(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual foi o aumento recebido ?");
        Double a = teclado.nextDouble();
        this.setSalario(this.getSalario()+ a);
    }
    //mostrar status

    @Override
    public String detalhes() {
        return "{Professor-->" + super.detalhes() + ", Especialidade = " + especialidade + ", salario = " + salario + '}';
    }
}