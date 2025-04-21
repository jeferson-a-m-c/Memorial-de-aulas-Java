/** atalhos
 * contol + e para apagar a linhas à direita
 * delete para apagar à direita
 */
/**
 * o foco da aula é a sobreposição dos métodos (usá-se, @Override)
 */
package aulapratica12.polimofirsmo;
/**
 * 
 * @author jeferson
 */
public class AulaPratica12Polimofirsmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Animal n = new Animal(); // errado por ser uma Classe Abstrata
        
        Mamifero m = new Mamifero();
        m.setCorPelo("marrom");
        m.setIdade(10);
        m.setMenbros(4);
        m.setPeso(20.20f);
        m.alimentar();
        m.emitirSom();
        m.locomover();
        Canguru c = new Canguru();
        c.usarBlosa();
        c.locomover();
        Cachorro dog = new Cachorro();
        dog.enterrarOsso();
        dog.abanarRabo();
        dog.emitirSom();
        
        
        Reptil r = new Reptil();
        r.setCorEscama("verde");
        r.setIdade(50);
        r.setMenbros(5);
        r.setPeso(200f);
        r.alimentar();
        r.emitirSom();
        r.locomover();
        Cobra snake = new Cobra();
        Tartaruga t = new Tartaruga();
        t.locomover();
        
        Peixe p = new Peixe();
        p.setCorEscama("colorida");
        p.setIdade(2);
        p.setMenbros(0);
        p.setPeso(0.500f);
        p.alimentar();
        p.emitirSom();
        p.locomover();
        p.soltarBolha();
        PeixeDourado goldFish = new PeixeDourado();
        
        
        Ave a = new Ave();
        a.setCorPena("Azul");
        a.setIdade(8);
        a.setMenbros(4);
        a.setPeso(1.5f);
        a.alimentar();
        a.emitirSom();
        a.locomover();
        a.fazerNinho();
        Arara arara = new Arara();
    }
    
}
