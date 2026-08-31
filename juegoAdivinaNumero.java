import java.util.Random;
import java.util.Scanner;

public class juegoAdivinaNumero {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int n, m, numero, intento;

        System.out.print("Ingrese n: ");
        n = teclado.nextInt();

        System.out.print("Ingrese m: ");
        m = teclado.nextInt();

        numero = random.nextInt(m - n + 1) + n;

        System.out.println("Adivina el numero entre " + n + " y " + m);

        do {
            System.out.print("Ingrese su intento: ");
            intento = teclado.nextInt();

            if (intento < numero) {
                System.out.println("El numero es mayor");
            } else if (intento > numero) {
                System.out.println("El numero es menor");
            } else {
                System.out.println("¡Ganaste!");
            }

        } while (intento != numero);

        teclado.close();
    }
}
