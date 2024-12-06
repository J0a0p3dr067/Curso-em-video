package curso_em_video.aaula7;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso; 
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;


    }

    public void apresentar() {
       System.out.println("/////////////Apresentar//////////");
       System.out.println("Chegou a hora de lutador " + this.getNome());
       System.out.println("Vindo de " + getNacionalidade());
       System.out.println("Com " + getPeso() + "Kg e da categoria  " + getCategoria());
       System.out.println("Com " + getIdade() + " anos e medindo " + getAltura() + " m "); 
       System.out.println("E com " + getVitorias() + " vitorias ");
       System.out.println(getDerrotas() + " Derrotas ");
       System.out.println("e " + getEmpates() + " empates ");
    }

    public void status() {
        System.out.println("////////////status//////////");
        System.out.println("Nome: " + nome);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("peso: " + peso);
        System.out.println("Categoria: " + categoria);
        System.out.println("Vitorias: " + vitorias);
        System.out.println("Derrota: " + derrotas);
        System.out.println("Empates: " + empates);
    }
    public void ganharLuta() {
       this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    public void empatarLuta () {
        this.setVitorias(this.getVitorias() + 1);
    }




    public String getNome() {
        return nome;
    }
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
       

        if (this.peso < 52.2) {
            this.categoria = "invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
           this.categoria = "Medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }
 
}
