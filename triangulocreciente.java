public class triangulocreciente {
     public static void main(String[] args) {

        for (int fila = 1; fila <= 5; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
