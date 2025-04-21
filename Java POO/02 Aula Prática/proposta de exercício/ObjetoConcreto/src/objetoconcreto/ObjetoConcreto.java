
package objetoconcreto;

public class ObjetoConcreto {

    public static void main(String[] args) {

    //capacete 01
    Capacete c01 = new Capacete();
    c01.modelo = "c01";
    c01.cor = "amarelo";
    c01.visor = true;
    if (c01.visor == true){
        c01.corVisor = "transparente";
    }
    c01.preco = 541.90f;
    c01.validade = 6;
    //status
    c01.status();
    
    //métodos
    
    c01.equipar();
    c01.abotoar();
    c01.fechar();
    c01.andar();
    
    }
    
    
}
