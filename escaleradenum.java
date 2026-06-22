public class escaleradenum {
    public static void main(String[] args) {

        int contador = 1;

        for (int fila = 1; fila <= 5; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print(contador + " ");
                contador++;
            }
            System.out.println();
        }

    }
}
