package curso_em_video.aula2;

public class mainCaneta {
    public static void main(String [] args) {

        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);

        c1.setModelo("PIC");
        c1.setCor("Azul");
        c1.setPonta(0.5f);
        c1.carga = 80;


        c1.destampar();
        c1.status();
        c1.rabiscar();

        // Caneta c2= new Caneta();
        // c2.modelo="pirata";
        // c2.tampar();
        // c2.rabiscar();
        // c2.status();

    }
}
