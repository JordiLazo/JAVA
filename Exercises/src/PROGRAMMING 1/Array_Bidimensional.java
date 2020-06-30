public class Array_Bidimensional {
    public static void main(String[] args) {
        int [][] matrix=new int[2][2];
        matrix[0][0]=15;
        matrix[0][1]=30;
        matrix[1][0]=89;
        matrix[1][1]=55;

        for(int i=0;i<2;i++){
                System.out.println();
                for(int j=0;j<2;j++){
                    System.out.print(matrix[i][j]+" ");

                }
        }



    }
}
