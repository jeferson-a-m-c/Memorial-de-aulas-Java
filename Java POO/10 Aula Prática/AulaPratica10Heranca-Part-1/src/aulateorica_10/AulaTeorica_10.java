package aulateorica_10;
/**
 * proxiama aula será feito sobreposição, eu não vi a aula e criei outra versão
 * do codigo porque achei que tinha acabado, acabou funcionando bem de qualquer
 * maneira
 * 
 */
public class AulaTeorica_10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("M");
        p4.setSexo("F");
        
        p2.setIdade(18);
        
        p2.setCurso("Informática");  // aqui será realizado mudanças para que
        p3.setSalario(2500.75f);     //seja possível visualizar essas informações
        p4.setSetor("Estoque");
        
        //p1.receberAumento(550.20f);   // aqui temos linhas que vão apresentar 
        //p2.mudarTrabalho();           //erro porque estão relacionando objtos
        //p4.cancelarMatricula();       //com métodos de outras subclasses a qual
                                        //não pertencem
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
