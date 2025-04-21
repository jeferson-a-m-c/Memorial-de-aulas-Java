package aulapratica04;

public class AulaPratica04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setModelo("Bic Cristal");
        c1.setPonta(0.5f);
        c1.status(); //posso usar tanto o status para mostra o conteúdo quanto
        //também posso usar os metodos getters
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    
    }
    
}
