package aula09pratica;

import java.util.Random;

/**
 *
 * @author jeferson
 */
public class Livro implements Publicacao {

    //Atributos
    
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
   
    //Construtor
    
    public Livro(String tit, String aut, int tot, int pagAt, boolean ab, Pessoa lei){
        this.setTitulo(tit);
        this.setAutor(aut);
        this.setTotPag(tot);
        this.setPagAtual(pagAt);
        this.setAberto(ab);
        this.setLeitor(lei);
    }
    
    //Getters and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //Método Especial
    
    /**
     * Concatenação de Strings:
     * StringBuilder: Para concatenar várias strings, é mais eficiente utilizar 
     * um StringBuilder do que o operador +. Isso evita a criação de objetos 
     * String intermediários a cada concatenação. Formatação de Strings: 
     * Utilize String.format() ou as expressões de string formatadas 
     * (string templates) introduzidas no Java 15 para criar strings formatadas
     * de forma mais clara e concisa. 
     */
    
public void detalhes() {
    String status = this.getAberto() ? "aberto" : "fechado";/**
     * Operador ternário: A expressão this.getAberto() ? "aberto" : "fechado" 
     * é uma forma mais concisa de atribuir um valor a status.
     */

    StringBuilder sb = new StringBuilder();/**
     * StringBuilder: Utiliza-se um StringBuilder para concatenar as strings de 
     * forma mais eficiente.
     */
    sb.append(String.format("O leitor %s, de %d anos e do sexo %s",
            this.getLeitor().getNome(),
            this.getLeitor().getIdade(),
            this.getLeitor().getSexo()));
    /** 
     * HAVIA ME ESQUECIDO DISSO, onde vc encontra %s, %d é onde sera iserido o 
     * dado, s para strings d para decimais
     * Outros especificadores de formato comuns:
     * f: Números de ponto flutuante
     * x: Números hexadecimais
     * e: Notação científica
     * ... e muitos outros
     * String.format(): Emprega-se String.format() para criar strings formatadas
     * de forma clara e concisa.
     */
    sb.append(System.lineSeparator());
    /**
     * System.lineSeparator(): Garante que a nova linha seja adequada para o 
     * sistema operacional em uso. quebra de linha 
     */
    sb.append(String.format("está lendo o livro \"%s\", escrito por %s.",
            this.getTitulo(), this.getAutor()));
    sb.append(System.lineSeparator()); // Nova linha adicionada aqui
    sb.append(String.format("O livro tem %d páginas e o leitor está na página %d.",
            this.getTotPag(), this.getPagAtual()));
    sb.append(System.lineSeparator());
    sb.append(String.format("O livro encontrasse fechado %s.", status));
    /** Append: Adicionando ao Final
     * Append é um método muito comum em diversas linguagens de programação, 
     * incluindo Java, e significa adicionar ou acrescentar algo ao final de uma
     * sequência. No contexto do StringBuilder, o método append serve para 
     * adicionar caracteres, palavras, números ou até mesmo outros StringBuilder
     * ao final da sequência que está sendo construída.
     * StringBuilder frase = new StringBuilder("Olá, ");
     * frase.append("mundo!");
     * System.out.println(frase); // Imprime: Olá, mundo!
     */

    System.out.println(sb.toString());
}

    /**public void detalhes(){
        String f;
        if (this.getAberto()) {
            f = "aberto";
        }else{
            f = "fechado";
        }
        System.out.println(this.getLeitor().getNome() + " tem " + 
                this.getLeitor().getIdade() + " anos " + "e é do sexo " + 
                this.getLeitor().getSexo());
    //--------------------------------------------------------------------------
        System.out.println("E Está lendo o livro " + this.getTitulo() + ", escrito por " + 
                this.getAutor() + "," + "\n o livro tem " + this.getTotPag() + " páginas, " + 
                this.getLeitor().getNome() + " está na página " + this.getPagAtual() + 
                ",\n o livro nesse momento está " + f);
    }
    */
    //Métodos da interface
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
       this.setAberto(false);
    }

    @Override
    public void folear() {
        System.out.println("Foleando...");
        for (int i = this.getPagAtual(); i <= this.getTotPag(); i += 20 ){
            System.out.println("vendo página " + i);
        }
    }

    @Override
    public void avançarPagina() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPagina() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
    
}
