public class numeroporfila {
    public static void main(String[] args) {

        for (int fila = 1; fila <= 5; fila++) {
            for (int num = 1; num <= fila; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
