public class ArrayEnteros {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Valores en el array de enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número en la posición " + i + ": " + numeros[i]);
        }
    }
}