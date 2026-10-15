import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingresa 1 para saludar o 2 para salir:");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("¡Hola! Bienvenido.");
            }
        } while (opcion != 2);

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}