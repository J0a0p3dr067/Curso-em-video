package aula.projeto_poo;

import java.util.Random;

public class UtilPontos {
    private static final int MIN_DEFESA_GOLEIRO = 10;
    private static final int MAX_DEFESA_GOLEIRO = 15;    
    private static final int MIN_DEFESA_FIXO = 7;
    private static final int MAX_DEFESA_FIXO = 12;
    private static final int MIN_DEFESA_ALA = 6;
    private static final int MAX_DEFESA_ALA = 10;
    private static final int MIN_DEFESA_PIVO = 5;
    private static final int MAX_DEFESA_PIVO = 8;

    private static final int MIN_ATAQUE_GOLEIRO = 1;
    private static final int MAX_ATAQUE_GOLEIRO = 3;
    private static final int MIN_ATAQUE_FIXO = 3;
    private static final int MAX_ATAQUE_FIXO = 7;
    private static final int MIN_ATAQUE_ALA = 6;
    private static final int MAX_ATAQUE_ALA = 12;    
    private static final int MIN_ATAQUE_PIVO = 8;
    private static final int MAX_ATAQUE_PIVO = 12;

    public static final int MAX_PONTUACAO = 15;
    public static final int MIN_PONTUACAO = 1;

    public static int pontosRandomDefesa(PosicaoFutsal posicao) {
        switch(posicao) {
            case GOLEIRO:
                return pontosRandom(UtilPontos.MIN_DEFESA_GOLEIRO, UtilPontos.MAX_DEFESA_GOLEIRO);
            case FIXO:
                return pontosRandom(UtilPontos.MIN_DEFESA_FIXO, UtilPontos.MAX_DEFESA_FIXO);             
            case ALA:
                return pontosRandom(UtilPontos.MIN_DEFESA_ALA, UtilPontos.MAX_DEFESA_ALA); 
            default:        // PIVO
                return pontosRandom(UtilPontos.MIN_DEFESA_PIVO, UtilPontos.MAX_DEFESA_PIVO); 
        }
    }

    public static int pontosRandomTecnico() {
        return pontosRandom(1,TecnicoFutsal.TECNICO_ESPECIALIDADE_MAXIMA);
    }

    public static int pontosRandomAtaque(PosicaoFutsal posicao) {
        switch(posicao) {
            case GOLEIRO:
                return pontosRandom(UtilPontos.MIN_ATAQUE_GOLEIRO, UtilPontos.MAX_ATAQUE_GOLEIRO);
            case FIXO:
                return pontosRandom(UtilPontos.MIN_ATAQUE_FIXO, UtilPontos.MAX_ATAQUE_FIXO);             
            case ALA:
                return pontosRandom(UtilPontos.MIN_ATAQUE_ALA, UtilPontos.MAX_ATAQUE_ALA); 
            default:        // PIVO
                return pontosRandom(UtilPontos.MIN_ATAQUE_PIVO, UtilPontos.MAX_ATAQUE_PIVO); 
        }       
    }

    private static int pontosRandom(int min, int max) {
        Random pontos = new Random();        
        return pontos.nextInt(max - min + 1) + min;
    }

    public static int lancarDados(int pontos) {
        return pontosRandom(1,pontos);
    }
}
