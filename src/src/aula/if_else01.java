package aula;
public class if_else01 {
    public static void main(String[] args) {

        int produto = 1;

        for (int i = 100; i <= 1000; i++) {


            if (i % 7 == 0) {
                produto *= i;
                System.out.println(i);
            }
      
        }
    }
}
