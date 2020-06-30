public class Array_Bidimensional_2 {
    public static void main(String[] args) {
        int[][] matrix = {{10, 15, 18}, {25, 29, 10}, {1, 2, 3}};

        for(int[]fila:matrix){
            System.out.println();
            for(int z:fila){
                System.out.print(z+" ");
            }
        }
    }
}
