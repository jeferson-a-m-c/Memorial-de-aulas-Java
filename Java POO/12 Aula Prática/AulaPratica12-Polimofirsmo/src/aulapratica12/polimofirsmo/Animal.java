/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapratica12.polimofirsmo;

/**
 *
 * @author jeferson
 */
public abstract class Animal {//é uma classe abstrata portanto não pode ser
    protected float peso;     //instânciada, mas pode ser herdada
    protected int idade;
    protected int menbros;
    
    public abstract void locomover();//metodos abstratos não são desenvolvidos na
    public abstract void alimentar();//mesma classe em que são introduzidos.
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMenbros() {
        return menbros;
    }

    public void setMenbros(int menbros) {
        this.menbros = menbros;
    }
    
    
}
