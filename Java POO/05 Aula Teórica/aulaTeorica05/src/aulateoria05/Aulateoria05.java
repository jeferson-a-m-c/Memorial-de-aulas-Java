/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulateoria05;

/**
 *
 * @author jeferson
 */
public class Aulateoria05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco cb1 = new ContaBanco();
        cb1.setNumConta(1111);
        cb1.setDono("Zeca");
        //antes de abrir conta não há saldo, depois de abrir a conta ganhará um
        //bonus adepender
        cb1.abrirConta("cc");//cc conta corrente/cp conta poupança
        cb1.depositar(100f);
        cb1.pagarMensal();
        
        ContaBanco cb2 = new ContaBanco();
        cb2.setDono("claudiomara");
        cb2.setNumConta(2222);
        cb2.abrirConta("cp");
        cb2.depositar(500);
        cb2.sacar(100f);
        cb2.pagarMensal();
        
        cb1.sacar(cb1.getSaldo());//pego o valor total do saldo e saco 
        cb1.fecharConta();
        
        cb1.statusAtual();
        cb2.statusAtual();
    }
}
//o video parou aos 22 minutos.