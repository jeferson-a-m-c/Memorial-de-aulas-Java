package projetolivro;
/**
 *
 * @author jeferson
 */
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    /** Construtor
     *usando insert code, marquei todos atributos com a exceção de aberto e pagAtual
     */
    
    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.leitor = leitor;
        this.aberto = false; // inicia-se fechado
        this.pagAtual = 0; // por estar fechado não pode estar em uma página.

    }
    // métodos especiais
    /**
     * usando o insert code, todo esse retorno já vem pré definido, de acordo com
     * o que você definiu como que deseja ser mostrado;
     * veja o código sem alteração.
     *
     * public String toString() {
     *    return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", totPag=" +
     *            totPag + ", pagAtual=" + pagAtual + ", aberto=" + aberto +
     *            ", leitor=" + leitor + '}';
     * }
     */
    public String detalhes() {
        return "Livro {" + "titulo = " + titulo + "\n autor = " + autor +
                "\n totPag = " + totPag + ", pagAtual = " + pagAtual + ", "
                + "aberto = " + aberto + "\n leitor = " + leitor.getNome() + 
                ", idade" + leitor.getIdade() + " anos " + ", sexo " + 
                leitor.getSexo() + '}' + "\n";
    }
    
    // métodos implementados

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }
              
    @Override
    public void folear(int p) {
        if (this.getTotPag() < p) {
            this.pagAtual = 0;// não dá pra folear páginas que não existem, essa
            //foi a lógica, portanto sendo o p maior a pag atual será redefinada 
            //para 0.
        }else{
            this.pagAtual = p;
        }
    }
    
    @Override
    public void avacarPag() {
        if (this.getPagAtual() < this.getTotPag()){
            this.setPagAtual(this.getPagAtual() + 1);
        }else{
            System.out.println("O livro está na ultima página, não se pode avançar mais");
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() > 0) {
            this.setPagAtual(this.getPagAtual() - 1);
        }else{
            System.out.println("O livro está na primeira página, não se pode retroceder mais");
        }
    }
   
    // Métodos Assessores e Modificadores

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

    public boolean isAberto() {
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
    
}
        
