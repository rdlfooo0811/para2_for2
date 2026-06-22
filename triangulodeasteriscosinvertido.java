public class triangulodeasteriscosinvertido {
    public static void main(String[] args) {
        for(int fila = 0; fila < 5; fila++) {
            for(int columna = 1; columna <= 9; columna++) {
                   if (columna<=0+fila){
                       System.out.print("  ");} 
                   else if (columna>=10-fila){
                       System.out.print("  ");}
                   else{
                    System.out.print("* "); }              
                }
            System.out.println();
        }
    }
}


