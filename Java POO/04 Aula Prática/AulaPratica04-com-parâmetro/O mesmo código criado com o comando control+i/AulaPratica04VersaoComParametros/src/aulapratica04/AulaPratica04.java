package aulapratica04;

public class AulaPratica04 {

    public static void main(String[] args) {
        /**
         * Aqui eu passo diretamente e respectivamente os valores dos atributos
         * por meio dos parânmetros ao invés de usar os métodos os métodos de 
         * acesso e modificação. Abra a aula 04 para ver o outro modo
         */
        Caneta c1 = new Caneta("nick", 0.4f, "Amarelo");
        c1.status(); 
        Caneta c2 = new Caneta("faber", 0.9f, "Rosa");
        c2.status();
    }
}
