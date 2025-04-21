package javaapplication9.pkg1;

public class JavaApplication91 {
    
    public static void main(String[] args) {
     int n1 = 8;
        int n2 = 9;
        int n3 = 7;
        float m1 = ( n1 + n2 + n3 ) / 3 ;
        System.out.printf(" A 1º média é igual a : %.2f \n ", m1);
        
        int n4 = 4;
        int n5 = 5;
        int n6 = 6;
        float m2 = ( n4 + n5 + n6 ) / 3;
        System.out.printf(" A 2º média é igual a : %.2f \n ", m2);
        
        float somaMedia = m1 + m2;
        float mediaMedia = somaMedia / 2;
        
        System.out.printf(" A soma das médias é igual a %.2f: ", somaMedia);
        System.out.printf("e a media das médias 1 e 2 é igual a : %.2f\n ", mediaMedia);
        
        /*como disse no projeto javaapplication9 eu formatei a média para que seja 
        exibida com duas casas decimais após a vírgula.*/
    }
    
}
