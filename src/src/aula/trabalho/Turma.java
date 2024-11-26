
package aula.trabalho;
import java.util.ArrayList;



public class Turma {
    // formada por um conjunto de alunos
    // atributo: uma lista de alunos
    // em que alunos são objetos da classe Aluno

    private String curso;           // curso da Turma
    private int periodo;            // período da Turma
    private String disciplina;      // disciplina da Turma

    private ArrayList<Aluno> alunos;  // lista de alunos da Turma

    // utilizado para imprimir todos os alunos da Turma
    private static final int TODOS_ALUNOS = 2;

    // construtor da classe - define curso, período e disciplina
    Turma(String curso, int periodo, String disciplina) {
        this.setCurso(curso);
        this.setPeriodo(periodo);
        this.setDisciplina(disciplina);

        // criando a instância de ArrayList<Aluno>
        // alunos é uma referência a um objeto da classe
        // ArrayList, que abstrai o conceito de um vetor
        // redimensionável de objetos da classe Aluno
        this.alunos = new ArrayList<Aluno>();
    }

    // método que adiciona um Aluno à Turma
    public void adicionarAluno(Aluno aluno) {
        if(aluno != null) {
            // adiciona o aluno na lista de alunos (ArrayList)
            // de um objeto da classe Turma
            this.alunos.add(aluno);
        }
    }

    //*********************************************** */
    //*********************************************** */
    //*********************************************** */

    // método que retorna o número de alunos da Turma
    public int getNAlunos() {
        return this.alunos.size();
    }

    // método que remove um aluno da Turma pela sua matrícula
    // retorna Aluno aluno removido
    public Aluno removeAluno(int matricula) {
        // verifica se matrícula é válida
        if(matricula > 0) {
            // busca índice do aluno na Turma pela matrícua
            int index = this.buscaIndexAluno(matricula);

            if(index != -1) {               // se aluno encontrado
                return this.alunos.remove(index);  // remove aluno pelo seu índice
                
            }
        } else {
            System.out.println(" ERRO: matrícula inválida!!");
        }

        return null;
    }

    // método que retorna o índice do aluno no ArrayList
    // a busca pelo aluno é realizada por sua matrícula
    // método privado: não tem utilidade fora do
    // interior da classe (método auxiliar da classe)
    private int buscaIndexAluno(int matricula) {
        // verifica se matrícula é válida        
        if(matricula > 0) {
            int n_alunos = this.getNAlunos();       // número de alunos na turma

            // percorre a lista de alunos
            for(int i = 0; i < n_alunos; i++) {
                // compara matrícula
                if(this.alunos.get(i).getMatricula() == matricula) {
                    return i;       // aluno encontrado (retorna seu índice na lista)
                }
            }
        } else {
            System.out.println(" ERRO: matricula invalida!!");
        }

        return -1;  // aluno não encontrado
    } 

    // método que retorna um objeto da classe Aluno que possui
    // um determinado número de matrícula
    // retorna nulo caso não encontrado
    public Aluno getAluno(int matricula) {
        // verifica se matrícula é válida
        if(matricula > 0) {
            // percorre a ArrayList de alunos (foreach)
            for (Aluno aluno : this.alunos) {
                // compara matricula de aluno
                if(aluno.getMatricula() == matricula) {
                    return aluno;   // aluno encontrado
                }
            }   
        } else {
            System.out.println(" ERRO: matricula invalida!!");
        }  

        return null;  // aluno não encontrado (retorna nulo)
    }
    
    // método que imprime em tela todos os alunos da Turma
    public void imprimirAlunos() {   
        // chama o método imprimirAlunos para imprimir
        // todos os alunos da Turma
        this.imprimirAlunos(Turma.TODOS_ALUNOS);
    }

    // método que efetua a impressão dos alunos da Turma
    // de acordo com o seu status: Aprovado, Prova Final
    // e Reprovado. O método também pode imprimir todos
    // os alunos da turma, independente de seu status
    public void imprimirAlunos(int statusAlunos) {
        // lista de alunos a ser impressa
        ArrayList<Aluno> imprime_alunos; 

        // determina qual lista de aluno deve ser
        // impressa a partir do status dos alunos
        switch(statusAlunos) {
            case Aluno.STATUS_APROVADO:
                // obtem lista de alunos aprovados
                imprime_alunos = this.alunosAprovados();
                break;
            case Aluno.STATUS_PROVA_FINAL:
                // obtem lista de alunos em prova final
                imprime_alunos = this.alunosProvaFinal();
                break;
            case Aluno.STATUS_REPROVADO:
                // obtem lista de alunos reprovados
                imprime_alunos = this.alunosReprovados();
                break;
            default:
                // lista de todos os alunos da Turma
                imprime_alunos = this.alunos;
                break;
        }

        // imprime todos os alunos da lista
        System.out.println("****************************************");
        for (Aluno aluno : imprime_alunos) {
            aluno.imprimir();   // chamada do método imprimir para cada aluno
            System.out.println("****************************************");
        }        
    }

    // método que imprime um aluno específico dada o
    // seu número de matrícula
    public void imprimeAluno(int matricula) {
        // verifica se matricula é válida
        if (matricula > 0) {     
            // busca Aluno por sua matrícula
            Aluno aluno = this.getAluno(matricula);
            if(aluno != null) {
                aluno.imprimir();   // imprime Aluno
            } else {
                System.out.println(" Aluno inexistente!");
            }
        } else {
            System.out.println(" ERRO: matricula invalida!!");
        }
    }

    // método que retorna lista de alunos aprovados da Turma
    public ArrayList<Aluno> alunosAprovados() {
        return buscaPorStatus(Aluno.STATUS_APROVADO);
    }

    // método que retorna lista de alunos reprovados da Turma
    public ArrayList<Aluno> alunosReprovados() {
        return buscaPorStatus(Aluno.STATUS_REPROVADO);
    }    

    // método que retorna lista de alunos em prova final da Turma
    public ArrayList<Aluno> alunosProvaFinal() {
        return buscaPorStatus(Aluno.STATUS_REPROVADO);
    }  

    // método que retorna lista de alunos de acordo com
    // o status requisitado: Aprovado, Prova Final, Reprovado
    private ArrayList<Aluno> buscaPorStatus(int status) {
        // ArrayList de alunos
        ArrayList<Aluno> listaStatus = new ArrayList<>();

        // percorre todos os alunos da turma
        for (Aluno aluno : this.alunos) {
            // compara status do aluno com o status requisitado
            if(aluno.status() == status) {
                listaStatus.add(aluno);
            }
        }

        // retorna lista de alunos
        return listaStatus;
    }

    // método que imprime informações sobre a Turma
    // todosAlunos = true imprime os alunos da Turma
    public void imprimir(boolean todosAlunos) {
        System.out.println("\n *#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#");
        System.out.println("  ##               TURMA               ##");
        System.out.println(" *#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#");
        System.out.println("  -> Curso: " + this.getCurso());
        System.out.println("  -> Periodo: " + this.getPeriodo());
        System.out.println("  -> Disciplina: " + this.getDisciplina());

        if(todosAlunos) {
            System.out.println("\n---------------------------------------- ");
            System.out.println("            ALUNOS DA TURMA        ");
            this.imprimirAlunos(Turma.TODOS_ALUNOS);
        }
    }

    //*********************************************** */
    //*********************************************** */
    //*********************************************** */

    // método get que retorna o curso da Turma
    public String getCurso() {
        return this.curso;
    }

    // método set que define o curso da Turma
    public void setCurso(String curso) {
        this.curso = curso;
    }

    // método get que retorna o periodo da Turma
    public int getPeriodo() {
        return this.periodo;
    }

    // método set que define o periodo da Turma
    public void setPeriodo(int periodo) {
        // validação do valor do período da Turma
        if(periodo > 0 && periodo <= 7) {
            this.periodo = periodo;
        } else {
            System.out.println(" ERRO: periodo invalido!!");
        }        
    }

    // método get que retorna a disciplina da Turma
    public String getDisciplina() {
        return this.disciplina;
    }

    // método set que define a disciplina da Turma
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}

