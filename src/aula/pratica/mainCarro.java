package aula.pratica;
import java.util.Scanner;

public class mainCarro {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        Carro carro1 = new Carro();

        carro1.setAno(2021);
        carro1.setCor("Branco");
        System.out.print("QUal o modelo do carro: ");
        carro1.setModelo(scan.next());
        carro1.setLigado(true);

        carro1.desligar(); 

        carro1.pintar("preto");  

        carro1.exibir();


//         System.out.println("********* informaçoes ***********");
//         System.out.println("Ano do carro: " + carro1.ano);
//         System.out.println("cor do carro: " + carro1.cor);
//         System.out.println("modelo do carro: " + carro1.modelo);

scan.close();
  }

  
}


