package aulapratica04;

public class AulaPratica04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("nick", "Amarelo", 0.4f);
        c1.status(); //posso usar tanto o status para mostra o conteúdo quanto
        //também posso usar os metodos getters
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        Caneta c2 = new Caneta("faber", "rosa", 0.9f);
        c2.status();
    }
}
