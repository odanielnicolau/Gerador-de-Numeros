import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random generate = new Random();

        int i = 0;

        // while(true) -> loop infinito.
        // while (i < 6) -> loop com saída.

        // while (i < 6) {
        //     int number = generate.nextInt(60);
        //     System.out.println(number);
        //     i = i + 1; // ou você pode colocar "i++"
        // }

        // Também podemos utilizar o "for"
        // Se quiser utilizar "for" de forma infinita: for (;;)
        for (int x = 0; x < 10; x++) {
            int number = generate.nextInt(60);
            System.out.println(number);
        }

    }
}



