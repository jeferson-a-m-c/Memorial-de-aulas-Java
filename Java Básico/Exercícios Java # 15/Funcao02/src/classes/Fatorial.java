package classes;
         
public class Fatorial {           
                                  //A classe Fatorial tem 3 atributos :
    private int num = 0;          //o número que quero achar o fatorial; 
    private int fat = 1;          //o própio fatorial;
    private String formula = "";  //e a fórmula/calculo do fatorial.
                                  
    public void setValor(int n){  //MÉTODO setValor para preencher o valor, cal
        num = n;                  //cular o fatorial e atribuir fórmula.
        int f = 1;
        String s = "";
        for (int c = n; c > 1; c--){
            f *= c;
            s += c +" x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    public int getFatorial(){      //getFatorial para pegar o valor de Fatorial
        return fat;
    }
    public String getFormula(){    //getFormula para pegar a formula
        return formula;
    }
}
