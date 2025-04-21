/**
 * eu poderia fazer com que os dados de cada objetos criado aparecesse por completo
 * e não somente o que se herda através da classe Pessoa, mas eu não quero sair
 * do rumo em que a aula está indo, por isso, irá ficar assim mesmo.  na AULA10
 * TENTATIVA SOLO eu fiz com que toSting() fosse sobrescrito em cada classe para 
 * que atendesse as necessidade de cada uma.
 */
package aulapratica11b_heranca_part2;

/**
 *
 * @author jeferson
 */
public class AulaPratica11b_Heranca_part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //não se pode intansciar uma classe abastrata, criar um objeto.
        //Pessoa p1 = new Pessoa(); // pessoa is abstract; cannot initialized
        
        /**use a palavra final para impedir que metodos sejam SOBRESCRITOS e que
         * classes TENHAM FILHOS( não pode ser herdada)
         * Exemplo: " public final class Bolsista extends Aluno "
         * Exemplo2: " public final String toString() "
         */
        
        //Herança de Implementação
        Visitante v1 = new Visitante();
        v1.setNome("juvenal");
        v1.setIdade(22);
        v1.setSexo("Masculino");
        System.out.println(v1.toString());
        
        //Herança para a Diferença
        Aluno a1 = new Aluno();     //Aluno tem tudo que Pessoa Tem, mas ele 
        a1.setNome("Cláudio");      //Também tem caracteristicas, específicas dele
        a1.setMatricula(1111);      //o que o torna uma Especialização de Pessoa
        a1.setCurso("informática"); // e Pessoa uma Generalização de Aluno
        a1.setIdade(16);
        a1.setSexo("Masculino");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(1112);
        b1.setCurso("Engenharia");
        b1.setBolsa(12.5f);
        b1.setSexo("Masculino");    //@Override-->Sobrepor
        b1.pagarMensalidade();      //este método sobrepõe o método de mesmo no 
                                    //da classe Aluno.
        Tecnico t1 = new Tecnico();
        t1.setNome("Ziraldo");
        t1.setMatricula(1113);
        t1.setRegistroProfiddional(00001);
        t1.setIdade(30);
        t1.setCurso("Metalurgia");
        t1.setSexo("masculino");
        t1.praticar();
        
    }                               
}
