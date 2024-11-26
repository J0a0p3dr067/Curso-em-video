package aula6;

public class mainControleRemoto {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.maisVolume();
        c.fecharMenu();
        c.play();
        c.maisVolume();

        c.abrirMenu();
    }
}
