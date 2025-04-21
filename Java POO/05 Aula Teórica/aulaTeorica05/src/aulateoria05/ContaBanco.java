/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulateoria05;

/**
 *
 * @author jeferson
 */
public class ContaBanco {
    /**
     * considere conta corrente como string "cc"
     * considere conta poupança como string "cp"
     * considere que o usuário que tiver conta corrente(cc) receberá um bônus
     * de R$ 50,00 ao abri-la.
     * O usuário quue tiver uma conta poupança(cp) receberá um bônus de R$ 150
     * ao abri-la.
     * o valor da mensalidade para quem tiver conta corrente é R$ 12,00
     * o valor da mensalidade para quem tiver conta poupança é R$ 20,00.
     */
                            // atributos do objeto
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean estado;
    // para mostrar o estado atual do objeto.
    public void statusAtual(){
        System.out.println("--------------------------------------");
        System.out.println("Nº Conta: " + this.getNumConta());
        System.out.println("tipo da conta " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("saldo " + this.getSaldo());
        System.out.println("estado da conta " + this.getEstado());
    }
                            //metodo construtor
    public void ContaBanco(){
        this.saldo = 0;
        this.estado = false;
    }
                            //metodos scessores e modificadores
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return this.dono;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setEstado(boolean e){
        this.estado = e;
    }
    public boolean getEstado(){
        return this.estado;
    }
                            //metodos especiais
    public void abrirConta(String t){
        this.setTipo(t);
        this.setEstado(true);
        if ("cc".equals(t)){
            setSaldo(50);
        }else if ("cp".equals(t)){
            this.setSaldo(150);
        }
        /** foi passado como parâmetro que t é uma string, que é uma Classe 
         * Invólocro para isso é indicado que se use equals para comparar 
         * conteudos de objetos, já == é usado em tipos primitivos como "char"
         */
    }
    public void fecharConta(){//O IDEAL É QUE OS MÉTODOS NÃO ESCRREVAM
        if (this.getSaldo() > 0){
            System.out.println("Ainda há saldo na conta, impossível encerrá-la");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta em débito, para encerrá-la zere o valor");
        }else{
            this.setEstado(false);
            System.out.println("Conta Encerrada com sucesso.");
        }
    }
    
    public void depositar(float v){
      if (this.getEstado()){
        this.setSaldo(this.getSaldo() + v);
          System.out.println("Depósito realizado na conta de " + this.getDono());
      }else{
          System.out.println("Impossível depositar, não há conta aberta");
      }
    }
    public void sacar(float v){
        if (this.getEstado()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }
    public void pagarMensal(){
        float v = 0;
        if ("cc".equals(this.getTipo())){
            v = 12;
        }else if("cp".equals(this.getTipo())){
            v = 20;
        }
        if (this.getEstado()){
            this.setSaldo(getSaldo() - v);
            System.out.println("Mensalidade paga por " + this.getDono());
        }else{
            System.out.println("Impossível pagar uma conta fechada");
        }
    }
}
