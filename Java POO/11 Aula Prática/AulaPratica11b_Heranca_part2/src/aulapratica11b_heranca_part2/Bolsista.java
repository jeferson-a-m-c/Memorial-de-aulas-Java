/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapratica11b_heranca_part2;

/**
 *
 * @author jeferson
 */
public final class Bolsista extends Aluno {
    //usando final na clase impossibilito dela ter filhos
    //Atributos
    private float bolsa;
    
    //Metodos Especiais
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    //sobrescrevendo o método de herdado de Aluno
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");
    }
    //getters and setters

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
