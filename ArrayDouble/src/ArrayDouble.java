public class ArrayDouble {
    public static void main(String[] args) {
        double[] precios = {99.99, 45.50, 120.0, 15.75};
        double total = 0;

        for (double precio : precios) {
            total += precio;
        }

        System.out.println("La suma total de los precios es: $" + total);
    }
}