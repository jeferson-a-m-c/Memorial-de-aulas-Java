/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapratica14;

/**
 *
 * @author jeferson
 */
public class AulaPratica14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, 'm' ,"jubi");
        g[1] = new Gafanhoto("Creuza", 12, 'f', "creuzita");
        /**
         * como funciona a agregação? a agregação permite que uma instância de 
         * outra classe seja passada como um atributo
         */
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0],v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0],v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
        /**System.out.println("Vídeo\n------------------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        System.out.println("Gafanhoto\n--------------------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
    
}
