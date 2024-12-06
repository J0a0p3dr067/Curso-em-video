package curso_em_video.aaula7;

import java.util.Random;

public class luta {
    private Lutador desafiador, desafiante;
    private int rounds;
    private boolean aprovada;


    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            this.aprovada = true;
            this.desafiador = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiador = null; 
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada == true) {
            System.out.println("///// DESAFIADOR/////");
            desafiador.apresentar();
            System.out.println("///// DESAFIENTE //////");
            desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            // vencerdor = aleato0rio 1 ou 2
            switch (vencedor) {
                case 0:
                    System.out.println("empatou");
                    desafiador.empatarLuta();
                    desafiante.empatarLuta();
                    break;

                case 1:
                    System.out.println(desafiador.getNome());
                    desafiador.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiador.perderLuta();
                    break;
            }
        } else {
            System.out.println("Luta nao pode acontecer");
        }
    }

   
    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Lutador getDesafiador() {
        return desafiador;
    }

    public void setDesafiador(Lutador desafiador) {
        this.desafiador = desafiador;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    
}
