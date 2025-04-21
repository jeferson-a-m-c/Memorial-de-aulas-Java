
package meuexerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author jeferson
 */
public class MeuExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, cont = 0, par = 0 , impar = 0, par_impar, maior = 0, soma = 0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>digite um número: <br><hr><em>zero interrompe</em></html>", "Entrada de Dados", JOptionPane.INFORMATION_MESSAGE));
//muita atenção aos parenteses, Com a string "entrada de dados eu estou alterando o titulo da janela que antes era "input"        
        par_impar = n % 2;
        if (par_impar == 0){
            par += 1;
        }else
            impar += 1;
        if (n > 10){
            maior += 1;
        }
        soma += n;
        cont +=1;
        } while (n != 0);
        
        cont -= 1;/*tenho que fazer esta subtração porque o zero é sempre contado como um nº
        e não quero que ele influa nos resutados.*/
        
        par -= 1;/*estou fazendo esta subtração, pois não quero que o zero seja contado
        como nº par e posso fazer isso porque ele sempre será usado para fechar a janela*/
        
        float media = (float)soma/cont;/*se eu não converter os valores a divisão 
        para float(soma e contador) o resultado não é correto. E naturalmente a nunca é 
        do tipo inteiro.*/
        
        JOptionPane.showMessageDialog(null, String.format("<html>total de valores: %d" + "<br><hr>" +
                "todal de números pares: %d" + "<br><hr>" + 
                        "total de números ímpares: %d" + "<br><hr>" + 
                            "acima de DEZ: %d" + "<br><hr>" + 
                                "a soma é: %d" + "<br><hr>" +
                                    "a media é : %.4f" + "</html>",
                cont, par, impar, maior, soma, media),"Resultado Final",JOptionPane.INFORMATION_MESSAGE);
        /*queria formatar o valor da media para ter no máximo 4 casas decimais, usando %.4f
        consegui com a ajuda do chatgpt*/
 
    }
   
}
