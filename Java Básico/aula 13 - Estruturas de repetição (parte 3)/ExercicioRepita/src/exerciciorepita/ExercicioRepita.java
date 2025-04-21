/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author jeferson
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//EXEMPLIFICANDO PARTE A PARTE:mostrando mensagens.

        //JOptionPane.showMessageDialog(null, args);// null é o nome da janela, mas com não tenho janela nenhuma deixarei nulo(null).
        //JOptionPane.showMessageDialog(null, args);//TIPO DE PAINEL SHOWMESSAGEDIALOG(NULL, ARGS);
        //JOptionPane.showMessageDialog(null, "Olá Mundo!");//ESCREVE NA TELA "OLÁ MUNDO!"
        //JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas vindas")//ESCREVE OLÁ MUNDO E SUBSTITUI MESSAGE
        //JOptionPane.showMessageDialog(null, "Olá Mundo! ", "Boas Vindas", JOptionPane.WARNING_MESSAGE);//MUDA O ÍCONE
        //JOptionPane.showMessageDialog(null, "Olá Mundo! ", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);//OUTRA OPÇÃO DE ICONE
        //JOptionPane.showMessageDialog(null, "Olá Mundo! ", "Boas Vindas", JOptionPane.ERROR_MESSAGE);//OUTRA OPÇÃO DE ÍCONE.

//EXEMPLIFICANDO PARTE A PARTE:solicitando coisas.

        //JOptionPane.showInputDialog(null, args);//estrutura básica para receber uma variável
        /*int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));//POSSO ATRIBUÍ-LO A UMA VARIÁVEL
 E NESSE CASO HÁ A NESCESSIDADE DE FAZER A CONVERSÃO DE sTRING PARA INTEIRO.*/
        
        /*int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));
        JOptionPane.showMessageDialog(null, "você digitou o valor " + n);// aqui eu combino ambos*/
        
//COMO VAI SER FEITO O EXERCÍCIO PROPOSTO, RESUMIDAMENTE:
        
        int n, s =0 ;
        do{
//não posso declarar uma variável dentro de uma estrutura de repetição.
        n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));
        s += n;
        
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>RESULTADO FINAL<hr>"
                + "<br>A soma dos valores é: " + s + "</html>");

//FUNÇÕES HERSDADAS DO HTML <hr>, <br> e <em>

/*<hr> ACRESCENTA UMA LINHA HORIZONTAL 
<br> QUEBRA A LINHA ABRE UM PARÁGRAFO
<em></em> MUDA A FONTE PARA ITÁLICO*/

    } 
}
