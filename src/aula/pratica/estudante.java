package aula.pratica;
public class estudante {
    private int matricula;
    private String nome;
    private String curso;
    private int idade;
    private int nota1;
    private int nota2;
    private int n_alunos = 0;

    estudante(String nome, String curso, int idade) {
        this.nome = nome;
        this.curso = curso;
        this.setIdade(idade);
        this.setNota1(0);
        this.setNota2(0); 
        
    }


    public int getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }



    public int getIdade() {
        return idade;
    }

    public boolean setIdade(int idade) {
        if(idade > 0) {
            this.idade = idade;
            return true;
        }
        return false;
    }




    public int getNota1() {
        return nota1;
    }

    public boolean setNota1(int nota1) {
        if (nota1 >= 0 && nota1 <= 100) {
            this.nota1 = nota1;
            return true;
        }
        return false;
    }

   

    public int getNota2() {
        return nota2;
    }

    public boolean setNota2(int nota2) {
        if (nota2 >= 0 && nota2 <= 100) {
            this.nota2 = nota2;
            return true;
        }
        return false;
        
    }

    public boolean MaiorIdade () {
        return this.idade >= 18;
    }

    public int media() {
        return (this.nota1 + this.nota2) / 2;
    }

    public boolean aprovado() {
        return this.media() >= 70;
    }


    

    
    public int getN_alunos() {
        return n_alunos;
    }
   
}
