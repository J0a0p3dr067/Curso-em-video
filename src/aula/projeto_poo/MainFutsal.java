package aula.projeto_poo;

import java.util.Scanner;
import java.util.ArrayList;

public class MainFutsal {

    public static void main(String [] args) throws InterruptedException {
        CampeonatoFutsal campeonato = new CampeonatoFutsal();
        Scanner in = new Scanner(System.in);
        int nTimes, visualizarGols;

        System.out.print("\n => Digite o número de times: ");
        nTimes = in.nextInt();

        MainFutsal.menuGeraCampeonato();
        campeonato.gerarCampeonato(nTimes);
  
        //campeonato.imprimirRodadas(false);
                
        campeonato.iniciarCampeonato();              
        campeonato.exibirTabelaClassificacao();
        
        System.out.println("\n >>>>> TIME CAMPEAO: " + campeonato.getCampeao().getNome());

        campeonato.exibirTabelaGoleadores();        

        ArrayList<JogadorFutsal> artilharia = campeonato.getArtilheiro();
        System.out.print("\n >>>>> ARTILHEIRO(S): ");
        for (JogadorFutsal jogadorFutsal : artilharia) {
            System.out.print(jogadorFutsal.getNome() + " ");
        }


        System.out.println("\n");
        System.out.print("\n => Visualizar os autores dos gols <1 - Sim, 0 - Não>? ");
        visualizarGols = in.nextInt();

        if(visualizarGols == 1) {
            campeonato.exibirGolsPorTime();
        }
        
        System.out.println();
        in.close();
    }

    private static void menuGeraCampeonato() throws InterruptedException{
        System.out.print("\n ***** GERANDO CAMPEONATO");
        for(int i = 0; i < 11; i++) {
            System.out.print(" .");
            Thread.sleep(250);
        }
        System.out.println();
    }    
}
