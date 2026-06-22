public class cuadrodeasteriscos {
    public static void main(String[] args) {

        for (int fila = 1; fila <= 5; fila++) {
            for (int col = 1; col <= 5; col++) {

                if (fila == 1 || fila == 5 || col == 1 || col == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}
