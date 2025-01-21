package curso_em_video.aula12;

public class Lobo extends Cachorro {
    public void reagir( String frase) {
        if (frase =="toma comida" || frase == "ola") {
            System.out.println("Abanar o rabo");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min) {

        if (hora < 12) {
            System.out.println("Abanar");
        } else if ( hora >= 18) {
            System.out.println("ignorar");
        } else {
            System.out.println("Abanar e Latir");
        }
    }

    public void reagir( boolean dono) {

        if ( dono == true) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
        }
    }

    public void reagir ( int idade, float peso) {
        if (idade < 5) {
            if (idade < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }

            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("ignorar");
            }
        }
    }

    
}
