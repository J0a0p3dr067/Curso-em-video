package aula.trabalho;
 


public class Aluno {
    private int matricula;   // matricula do aluno
    private String nome;     // nome do aluno
    private double nota1;    // nota1 do aluno
    private double nota2;    // nota2 do aluno

    // conta o número de alunos (instâncias)
    // utilizado para definir a matrícula automaticamente 
    private static int n_alunos = 0;

    // constantes da classe que definem status do aluno. 
    // aprovado, prova final, reprovado estão públicos, 
    // portanto podem ser utilizados diretamente a partir 
    // do nome da classe, mesmo fora da classe. São 
    // utilizados, por exemplo, pela classe Turma
    public static final int STATUS_APROVADO = 1;
    public static final int STATUS_PROVA_FINAL = 0;
    public static final int STATUS_REPROVADO = -1;

    // construtor da classe, definindo apenas o nome do Aluno
    // a matrícula é definida automaticamente pelo número de instâncias
    Aluno(String nome) {
        this.setNome(nome);
        Aluno.n_alunos++;           // incrementa número de alunos
        
        // define a matrícula do aluno
        this.matricula = Aluno.n_alunos;
    }

    // método estático (pertence a classe)
    // retorna número de objetos da classe instanciados
    public static int getNAlunos() {
        return Aluno.n_alunos;
    }

    // método get que retorna a matrícula do Aluno
    public int getMatricula() {
        return this.matricula;
    }

    // método get que retorna o nome do Aluno
    public String getNome() {
        return this.nome;
    }

    // método set que define o valor do atributo nome do Aluno
    public void setNome(String nome) {
        this.nome = nome;
    }

    // método get que retorna o valor da nota1 do Aluno
    public double getNota1() {
        return this.nota1;
    }

    // método set que define o valor da nota1 do Aluno
    public void setNota1(double nota1) {
        // validação da nota: deve estar entre 0 e 10 (double)
        if(nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            System.out.println(" ERRO: nota1 invalida!!");
        }
    }

    // método get que retorna o valor da nota2 do Aluno
    public double getNota2() {
        return this.nota2;
    }

    // método set que define o valor da nota2 do Aluno
    public void setNota2(double nota2) {
        // validação da nota: deve estar entre 0 e 10 (double)
        if(nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            System.out.println(" ERRO: nota2 invalida!");
        }
    }

    // método set que define os valores das notas 1 e 2 do Aluno
    public void setNotas(double nota1, double nota2) {
        this.setNota1(nota1);      // chama método set com validação
        this.setNota2(nota2);      // chama método set com validação
    }

    // método que retorna a média das notas do aluno
    public double calcularMedia() {
        return (this.getNota1() + this.getNota2()) / 2;
    }

    // método que retorna o status do aluno conforme sua média
    // retorna: 1 - aprovado, 0 - prova final, -1 - reprovado
    public int status() {
        double media = this.calcularMedia();    // calcula media

        // retorna o STATUS do aluno
        if(media >= 7) {
            return Aluno.STATUS_APROVADO;
        } else if(media >= 4) {
            return Aluno.STATUS_PROVA_FINAL;
        } else {
            return Aluno.STATUS_REPROVADO;
        }
    }

    //*********************************************** */
    //*********************************************** */

    // método que imprime em tela informações sobre o Aluno,
    // incluindo sua média e status
    public void imprimir() {
        System.out.println("  # Matricula: " + this.getMatricula());
        System.out.println("  # Nome: " + this.getNome());
        System.out.printf("  # Nota 1: %.1f\n", this.getNota1());
        System.out.printf("  # Nota 2: %.1f\n", this.getNota2());
        System.out.printf("  # Media: %.1f\n", this.calcularMedia());
        System.out.println("  # Status: " + this.statusToString());
    }

    // método que retorna o status do Aluno em formato
    // de String - Aprovado, Prova Final, Reprovado
    public String statusToString() {
        switch(this.status()) {
            case Aluno.STATUS_APROVADO:
                return "Aprovado";
            case Aluno.STATUS_PROVA_FINAL:
                return "Pova Final";
            default:
                return "Reprovado";
        }
    }
    //*********************************************** */
    //*********************************************** */
}