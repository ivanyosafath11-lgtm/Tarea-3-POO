public class ForEach {
    public static void main(String[] args) {
        String[] frutas = {"Manzana", "Pera", "Plátano", "Uva"};

        System.out.println("Lista de frutas:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }
    }
}