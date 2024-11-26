package curso_em_video.aula5;

public class mainContaBanco {
    public static void main(String[] args){
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(11111);
        p1.setDono("jubilei");
        p1.abriConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(22222);
        p2.setDono("Creuza");
        p2.abriConta("CP");


        p1.depositar(100);
        p2.depositar(500);

        p2.sacar(100);

        p1.fecharConta();
        
        p1.estado();
        p2.estado();

    }
    
}
