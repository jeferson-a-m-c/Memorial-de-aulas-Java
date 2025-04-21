/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultimateemotecombat;

/**
 *
 * @author jeferson
 */
public class Lutadores {

    /**               Atributos
     * é importante manter os atributos da classe privados.Encapusulamento
     */
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public Lutadores(String no, String na, int i, float a, float p, int v, int d, int e){
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(i);
        this.setAltura(a);
        this.setPeso(p);//Dentro do metodo acessor setter iremos ter uma estrutura condional para definir a categoria
        this.setVitorias(v);
        this.setDerrotas(d);
        this.setEmpates(e);
    }
//----------------------------------gettes and setters--------------------------   
//------------------------------------------------------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2f) {
            categoria = "Invalidada";
        }else{
            if (this.getPeso() <= 70.3f) {
                categoria = "leve";
            }else{
                if (this.getPeso() <= 83.9f) {
                    categoria = "médio";
                }else{
                    if (this.getPeso() <= 120.2f) {
                        categoria = "pesado";
                    }else{
                        categoria = "Invalida";
                    }
                }
            }
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    /**                                  Especiais
     * -------------------------------------------------------------------------
     */
    public void apresentar(){
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("ladies and gentlemen... \nwith you this killing machine...\n" + this.getNome() + "!!!!!");
        System.out.println("---------------------------------------------------------------------------------------");
    }
    public void status(){
        System.out.println("Nacionalidade " + this.getNacionalidade());
        System.out.println("Idade " + this.getIdade());
        System.out.println("Altura " + this.getAltura());
        System.out.println("Peso " + this.getPeso());
        System.out.println("Categoria " + this.getCategoria());
        System.out.println("Vitórias " + this.getVitorias());
        System.out.println("Derrotas " + this.getDerrotas());
        System.out.println("Empates " + this.getEmpates());
        System.out.println("----------------------------------------------------");
    }
    public void ganhar(){
        this.setVitorias(this.getVitorias() + 1);
    }  
    public void perder(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatar(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
