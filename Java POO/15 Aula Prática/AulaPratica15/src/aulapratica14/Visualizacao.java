 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapratica14;

/**
 *
 * @author jeferson
 */
public class Visualizacao  {
    private Gafanhoto spectador;
    private Video filme;

    public Visualizacao(Gafanhoto spectador, Video filme) {
        this.spectador = spectador;
        this.filme = filme;
        this.spectador.setTotAssistido(this.spectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhoto getSpectador() {
        return spectador;
    }

    public void setSpectador(Gafanhoto spectador) {
        this.spectador = spectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "spectador=" + spectador + ", filme=" + filme +
                '}';
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }    
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        }else if (porc <= 50 ){
            tot = 5;
        }else if (porc <= 90) {
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
}