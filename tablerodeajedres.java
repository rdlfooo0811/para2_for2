public class tablerodeajedres {
    public static void main(String[] args) {

        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 4; col++) {

                if ((fila + col) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}
