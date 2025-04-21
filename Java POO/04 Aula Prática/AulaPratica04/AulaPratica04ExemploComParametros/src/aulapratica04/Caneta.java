package aulapratica04;
public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
                                               // ESTE É O MÉTODO CONSTRUTOR, ELE PODE SER IDENTIFI   
    public Caneta(String m, String c, float p){// CADO POR TER O MESMO NOME DA CLASSE, COMO DITO NA
        this.modelo = m;   // AULA ANTERIOR ELE VAI SER RESPONSÁVEL POR JÁ INICIAR
        this.cor = c;      //O PROGRAMA COM OS VALORES DENTRO DELE JÁ ATRIBUIDOS
        this.tampar();     // ÀS VARIÁVEIS.NÃO USE VOID.
        this.setPonta(p);
    }                      
    
    public String getModelo() {// quando eu tenho um método que vi ter um retorno
        return this.modelo;    // eu não posso usar void, tenho que especificar 
                               // o tipo de retorno que vou ter.
    }
    public void setModelo(String m){  //sem retorno "VOID". Aqui eu vou receber
        this.modelo = m;          // um parâmtro "m" que virá de "AulaPratica04"
    }
    public float getPonta() {
        return this.ponta;//ponta é privado mas o método é público e por meio
                          // do método é possível ter acesso ao atributo.
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        tampada = true;
    }
    public void destanpar(){
        tampada = false;
    }
    public void status(){
        System.out.println(" SOBRE A CANETA");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
