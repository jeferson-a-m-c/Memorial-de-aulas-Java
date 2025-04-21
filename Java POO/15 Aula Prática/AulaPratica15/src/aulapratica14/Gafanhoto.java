/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapratica14;

/**
 *
 * @author jeferson
 */
public class Gafanhoto extends Pessoa{
//gafanhoto = aluno, aprendis, jovem mancebo.
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, char sexo,String login) {
        super(nome, idade, sexo);//Super faz referencia á superclasse
        this.login = login;
        this.totAssistido = 0;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{"+ super.toString() + " \nlogin=" + login +
                ", totAssistido=" + totAssistido + '}';
    }
    
}
