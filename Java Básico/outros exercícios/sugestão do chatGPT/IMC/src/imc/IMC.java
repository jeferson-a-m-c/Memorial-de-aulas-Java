/*8-Calculadora de IMC
Desenvolva uma calculadora de Índice de Massa Corporal (IMC) 
que permita ao usuário inserir seu peso e altura e calcule 
seu IMC usando operações aritméticas.*/
package imc;

import java.util.Scanner;

public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("digite o peso em kg: ");
        float peso = tec.nextFloat();
        System.out.print("digite a altura em metros: ");
        float altura = tec.nextFloat();
        double imc = peso / (Math.pow(altura, 2));
        System.out.print("O IMC desta pessoa é " + imc + ". ");
        if (imc < 17 ){
            System.out.println("Desnutrição!!!");
        }else if (imc >= 17 && imc < 18.5){
            System.out.println("Abaixo do peso!");
        }else if (imc >= 18.5 && imc < 25){
            System.out.println("Pessoa saudável");
        }else if (imc >= 25 && imc < 30){
            System.out.println("Sobrepeso!");
        }else if (imc >= 30 && imc < 35){
            System.out.println("Obesa!!");
        }else if (imc >= 35 && imc < 40){
            System.out.println("Obeso classe 2");
        }else
            System.out.println("Obeso classe 3 (Móbido)");
    }
    
}
