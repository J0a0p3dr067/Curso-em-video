package aula.pratica;


import java.util.Scanner;
import java.util.Random;

public class MainTurma {
    public static void main(String[] args) {
        int n_alunos;                            // número de alunos
        boolean todosAlunos = true;              // para impressão    
        Scanner scan = new Scanner(System.in);   // para entrada de dados
        
        // instanciação de uma turma
        Turma turma = new Turma("TADS",2,"POO");    

        // entrada de número de alunos da turma
        System.out.print(" => Digite o numero de alunos da Turma: ");
        n_alunos = scan.nextInt();

        MainTurma.preencherTurma(n_alunos,turma);   // preenchimento da Turma
        turma.imprimir(todosAlunos);                // imprime Turma e seus Alunos

        // imprime somente alunos aprovados
        System.out.println("\n\n========== ALUNOS APROVADOS ============");
        turma.imprimirAlunos(Aluno.STATUS_APROVADO);
        

        // exemplo de operação de remoção de aluno
        int matriculaRemover;   // matricula de aluno a ser removido
        System.out.print("\n => Deseja remover qual aluno <matricula>? ");
        matriculaRemover = scan.nextInt();  

        Aluno alunoRemovido = turma.removeAluno(matriculaRemover);      
        System.out.println(" -------------------------------------------");
        System.out.println("             ALUNO TRANSFERIDO");
        System.out.println(" -------------------------------------------");
        alunoRemovido.imprimir();

        // exibe número de alunos da Turma (confirmando remoção)
        System.out.println("\n => Número de alunos na turma: " + turma.getNAlunos());

        scan.close();  // fechando o Scanner
    }

    // método privado estático utilizado para preencher a turma
    // com alunos criados automaticamente: nomes padronizados
    // e notas randômicas
    // observação: um método estático da classe só pode chamar 
    // outros métodos da classe que TAMBÉM sejam estáticos. 
    // o main é um método estático.
    private static void preencherTurma(int n_alunos, Turma turma) {     
        for (int i = 1; i <= n_alunos; i++) {
            String nomeAluno = "Aluno " + i;
            Aluno aluno = new Aluno(nomeAluno);

            aluno.setNotas(geraNota(2.5,10), geraNota(3,10));
            turma.adicionarAluno(aluno);
        }
    }

    // método privado estático que retorna um double entre min e max
    // observação: um método estático da classe só pode chamar 
    // outros métodos da classe que TAMBÉM sejam estáticos. 
    // o main é um método estático.    
    private static double geraNota(double min, double max) {
        Random r = new Random();      // cria objeto Random

        // retorna número entre min e max
        return  (max - min) * r.nextDouble() + min;
    }
}
    

