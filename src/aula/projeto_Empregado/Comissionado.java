package aula.projeto_Empregado;

public class Comissionado extends Empregado {
    private double percentual_comissao;
    private double total_vendas;

    public double calcularSalario(double horas) {
        return 0.0;
    }



    




    public Comissionado(String nome, String cpf, double percentual_comissao) {
        super(nome, cpf);
        this.percentual_comissao = percentual_comissao;
       
    }








    public double getPercentual_comissao() {
        return percentual_comissao;
    }

    public void setPercentual_comissao(double percentual_comissao) {
        if ( percentual_comissao >= 0 && percentual_comissao <= 100) {
            this.percentual_comissao = percentual_comissao;
        } else {
            System.out.println("Erro no percentual vendas");
        }
        

    }

    public double getTotal_vendas() {
        return total_vendas;
    }

    public void setTotal_vendas(double total_vendas) {
        if (total_vendas >= 0) {
            this.total_vendas = total_vendas;
            
        } else {
            System.out.println("Erro no total_vendas");
        }

    }

    
}
