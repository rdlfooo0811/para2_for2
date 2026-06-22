public class trianguloinvertido {
     public static void main(String[] args) {

        for (int fila = 5; fila >= 1; fila--) {
            for (int col = 1; col <= fila; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
