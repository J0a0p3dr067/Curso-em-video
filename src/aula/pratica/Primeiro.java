package aula.pratica;
import java.util.Scanner;

public class Primeiro {

    public static void main(String args[]) {

        System.out.println("hello world");

        int numero;
        double pi;
        String nome;
        Scanner scan = new Scanner(System.in);

        System.out.println("digite um numero: ");
        numero = scan.nextInt();

        System.out.println("digite o valor de pi: ");
        pi = scan.nextDouble();

        System.out.println("digite o seu nome: ");
        nome = scan.next();


        System.out.println("numero digitado " + numero + pi + nome);
    }
}