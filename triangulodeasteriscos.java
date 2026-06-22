public class triangulodeasteriscos {
    public static void main(String[] args) {
        for(int fila = 1; fila <= 5; fila++) {
            for(int columna = 1; columna <= 9; columna++) {
                   if (columna<=5-fila){
                       System.out.print("  ");} 
                   else if (columna>=5+fila){
                       System.out.print("  ");}
                   else{
                    System.out.print("* "); }              
                }
            System.out.println();
        }
    }
}


