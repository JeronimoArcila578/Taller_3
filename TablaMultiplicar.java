import java.util.Scanner;


public class TablaMultiplicar {
   public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
           mostrarTablaMultiplicar(scanner);
       }
   }

   public static void mostrarTablaMultiplicar(Scanner scanner) {
       System.out.print("Ingrese el número para mostrar su tabla de multiplicar: ");
       int num = scanner.nextInt();
       System.out.println("\n--- Tabla de multiplicar del " + num + " ---");
       // Usamos un ciclo for para recorrer del 1 al 10 (o hasta el número que prefieras)
       for (int i = 1; i <= 10; i++) {
           System.out.println(num + " x " + i + " = " + (num * i));
       }
   }
}
    

