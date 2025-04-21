package aulapratica10copia;
// SE QUIZER LEIA O QUE ESTÁ ANOTADO ABAIXO.
/**
 * Estava revendo os conteudos e percebi que o código da aula 10 não estava pronto 
 * decidi fazer tudo denovo para me testar, tive que pesquisar algumas coisas para
 * relembrar, alguns coisas a se evitar e também aprendi algo novo: 
 * - sobrescrever o método para que ele seja complementado(no meu caso, usei isso 
 *  nas subclasses para adicionar informação no metodo detalhes de acordo com o 
 *  que cada subclasse precisava). Para isso usei a palavra "super" que faz
 * referência a classe mãe.
 * 
 * -eu queria ainda fazer com que as informações a serem inseridadas fossem feitas
 * por meio do console armazenadas em uma variável e lançada como parânmetros no 
 * na chamada do construtor da classe. porém só sabia de uma possibilidade de fazer
 * isso que era acrescentar a Classe Scanner dentro do construtor junto ao System
 * outprint, o que não é uma boa prática.
 * - a solução é fazer isso por meio de métodos estáticos, que pertence à classe
 * e não a uma instância específica da classe, podem ser chamados sem que a classe
 * tenha sido instância.
 * - VOU FAZER MAIS UM PROJETO IDENTICO, USANDO O METODO ESTATICO PARA DEMOSNTRAR 
 * A DIFERENÇA E PARA SEPARAR EM PASSOS MENORES O QUE APRENDI.
 */

import java.util.Scanner;

public class AulaPratica10Copia {

    public static void main(String[] args) {
        
        /**Scanner scanner = new Scanner(System.in);
         * System.out.println("Digite o nome: ");
         * String nome = scanner.nextLine();
         * System.out.println("digite a idade: ");
         * int idade = scanner.nextInt();
         * System.out.println("Digite o sexo(M/F): ");caso não m/f resultado indefinido
         * char sexo = scanner.next().charAt(0); // aprendi no chat gpt
         */
        
        Pessoa p1 = new Pessoa("jeferson", 22, 'M');
        System.out.println(p1.detalhes());
        System.out.println("");
        //----------------------------------------------------------------------
        //respectivamente insira: nome, idade,sexo, nº da matrícula, curso
        Aluno p2 = new Aluno("joão", 22, 'm', 55, "Advocacia");
        System.out.println(p2.detalhes());
        //----------------------------------------------------------------------
        Aluno p001 = new Aluno("Gustavo", 24, 'w', 69, "Design");
        System.out.println(p001.detalhes());
        System.out.println("");
        //----------------------------------------------------------------------
        //respectivamente insira: nome,idade,sexo,,especialidade
        Professor p3 = new Professor("Maria", 38, 'F', "Química");
        System.out.println(p3.detalhes());
        System.out.println("");
        //----------------------------------------------------------------------
        // respectivamente insira: nome,idade,sexo,cargo(função)
        Funcionario p4 = new Funcionario("Graça", 50, 'f', "Limpeza");
        System.out.println(p4.detalhes());
        //----------------------------------------------------------------------
        Funcionario p002 = new Funcionario("Ricardo", 48, 'm', "Zelador");
        System.out.println(p002.detalhes());
    }
    
                //ANOTAÇÕES PARA APRENDIZADO E LEMBRAMÇA
   
    /**
     * Inserir um Scanner no construtor para capturar dados diretamente do usuário 
     * pode funcionar, mas não é uma prática comum nem recomendada, especialmente 
     * em projetos maiores ou em situações onde a classe será usada em diferentes 
     * contextos (como APIs ou sistemas backend).
     *
     *Problemas com essa abordagem:
     *
     *-Dificulta a reutilização do código, já que você está acoplando a classe 
     * Pessoa a um fluxo de entrada específico.
     * 
     *-Menor flexibilidade para criar objetos em outros cenários 
     * (como testes automáticos ou leitura de dados de arquivos).
     */
    
    /**
     * Por que evitar System.out.println() em construtores?
     *
     *-Acoplamento ao fluxo de saída:
     *Assim como no caso de usar Scanner para entrada de dados, usar 
     * System.out.println() acopla a classe a um fluxo de saída específico, 
     * tornando-a menos reutilizável em diferentes contextos (por exemplo, 
     * em APIs, testes ou sistemas que não usam um terminal para saída).
     * 
     * -Dificulta testes automáticos:
     * 
     *Quando você imprime algo diretamente no console no momento da criação do objeto, 
     * pode complicar os testes automáticos (unitários) porque os testes geralmente 
     * não esperam interagir diretamente com o fluxo de saída.
     * 
     * -Separa responsabilidades:
     * 
     *A responsabilidade de um construtor deve ser apenas inicializar o objeto. 
     *Qualquer coisa que vá além disso, como exibir mensagens, viola o princípio de 
     * responsabilidade única (SRP, Single Responsibility Principle).
     * 
     * -Impacto na performance e legibilidade:
     * 
     *Mensagens de depuração ou logs desnecessários no console podem poluir a saída e 
     * tornar o código menos legível.
     */
}