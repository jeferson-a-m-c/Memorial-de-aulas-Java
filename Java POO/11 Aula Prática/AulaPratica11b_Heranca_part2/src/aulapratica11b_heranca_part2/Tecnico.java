/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapratica11b_heranca_part2;

/**
 *
 * @author jeferson
 */
public class Tecnico extends Aluno {
    //ATRIBUTOS
    private int registroProfiddional;
    
    //MÉTODO ESPECIAL
    public void praticar(){
        System.out.println(this.getNome() + " Está praticando.");
    }
    //Métodos getters e setters

    public int getRegistroProfiddional() {
        return registroProfiddional;
    }

    public void setRegistroProfiddional(int registroProfiddional) {
        this.registroProfiddional = registroProfiddional;
    }
}
