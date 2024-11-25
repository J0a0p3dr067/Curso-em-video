package aula;
import java.util.Scanner;

public class repetiçao02 {
    public static void main(String [] args){ 
        float numero = 1;
        float soma = 0;
        int divisor = -1;
        float resultado = 0;

        Scanner scan = new Scanner (System.in);

        while(numero != 0) {
            System.out.print("Digite um numero: ");
            numero = scan.nextFloat();
            divisor++;
           soma = numero + soma;
        }

        resultado = soma / divisor;
        
        System.out.println("Sua media é " + resultado);
       
    }
}
