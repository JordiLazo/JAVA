package src.Recursividad;

public class Recorrer_Array {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7};
        mostrarArrayRecursivo(array,0);
    }

    public static void mostrarArrayRecursivo(int [] array, int indice ){

        if(indice!=array.length){

            System.out.println(array[indice]);
            mostrarArrayRecursivo(array,indice+1);
        }

    }
}
