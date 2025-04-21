package aulapratica04;
public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
/**
 * Todas as linhas de código do antigo código da aula 04 foram apagadas e serão
 * reconstruidas por meio do atalho/comando control+i. Sim todas aquelas linhas
 * de código só precisavam de alguns cliques para seerem feitas.
 */
    
//         A UNICA COISA QUE EU TERIA DE ESCREVER SÃO OS ATRIBUTOS
    
    /**
     * PS: control+i não funcionou para mim, mas se clicar com botão direito do
     * mouse na linha e escolher a opção em inglês "INSERT CODE" vc obterá o 
     * mesmo resultado.
     */
    
    /**
     * Abaixo vemos o metodo construtor, o método construtor leva o mesmo nome da
     * Classe, nesse caso, "Caneta". Ele é executado assim que o objeto é instan
     * ciado
     */
    
    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
// eu decidi manter o Status();
    public void status(){
        System.out.println(" SOBRE A CANETA");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
