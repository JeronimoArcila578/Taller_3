import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║           MENU PRINCIPAL              ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║ 1. Suma n-esimo termino de fibonacci  ║");
            System.out.println("║ 2. Calcular el n-esimo numero primo   ║");
            System.out.println("║ 3. Raices de ecuacion cuadratica      ║");
            System.out.println("║ 4. Calcular promedio de n numeros     ║");
            System.out.println("║ 5. Salir                              ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese n: ");
                int n = sc.nextInt();
                int a = 0, b = 1, suma = 0;
                for (int i = 1; i <= n; i++) {
                    suma = suma + a;
                    int siguiente = a + b;
                    a = b;
                    b = siguiente;
                }
                System.out.println("La suma es: " + suma);

            } else if (opcion == 2) {
                System.out.print("Ingrese n: ");
                int n = sc.nextInt();
                int contador = 0;
                int num = 1;
                while (contador < n) {
                    num++;
                    boolean primo = true;
                    for (int i = 2; i < num; i++) {
                        if (num % i == 0) {
                            primo = false;
                        }
                    }
                    if (primo) {
                        contador++;
                    }
                }
                System.out.println("El numero primo es: " + num);

            } else if (opcion == 3) {
                System.out.print("Ingrese a: ");
                double a = sc.nextDouble();
                System.out.print("Ingrese b: ");
                double b = sc.nextDouble();
                System.out.print("Ingrese c: ");
                double c = sc.nextDouble();

                double d = b * b - 4 * a * c;

                if (d > 0) {
                    double x1 = (-b + Math.sqrt(d)) / (2 * a);
                    double x2 = (-b - Math.sqrt(d)) / (2 * a);
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                } else if (d == 0) {
                    double x = -b / (2 * a);
                    System.out.println("Raiz doble: x = " + x);
                } else {
                    double parteReal = -b / (2 * a);
                    double parteImaginaria = Math.sqrt(-d) / (2 * a);
                    System.out.println("Raices complejas:");
                    System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
                    System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
                }

            } else if (opcion == 4) {
                System.out.print("Cuantos numeros: ");
                int n = sc.nextInt();
                double suma = 0;
                for (int i = 1; i <= n; i++) {
                    System.out.print("Numero " + i + ": ");
                    double num = sc.nextDouble();
                    suma = suma + num;
                }
                System.out.println("El promedio es: " + (suma / n));

            } else if (opcion == 5) {
                System.out.println("Saliendo...");

            } else {
                System.out.println("Opcion invalida");
            }

        } while (opcion != 5);
    }
}