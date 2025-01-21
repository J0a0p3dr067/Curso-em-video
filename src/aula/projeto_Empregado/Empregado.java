package aula.projeto_Empregado;

public abstract class Empregado {
    protected String nome;
    protected String cpf;
    protected double valor_hora;


    
    

   
    
    Empregado() { };

    

    public Empregado(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
       
    }



    @Override
    public String toString() {
        return "Empregado [nome=" + nome + ", cpf=" + cpf + ", valor_hora=" + valor_hora + "]";
    }

    public abstract double calcularSalario(double horas);

     

 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getValor_hora() {
        return valor_hora;
    }
    public void setValor_hora(double valor_hora) {
        if (valor_hora >= 0) {
            this.valor_hora = valor_hora;
            
        } else {
            System.out.println("ERRO no valor_hora");
        }
    }


    
}
