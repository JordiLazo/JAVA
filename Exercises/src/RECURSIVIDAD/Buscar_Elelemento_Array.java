package src.Recursividad;

public class Buscar_Elelemento_Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4,5};
        int elemento_a_buscar = 5;
        int elemento_encontrado = posicion_array(array, elemento_a_buscar, 0);
        System.out.println(elemento_encontrado);
    }

    public static int posicion_array(int[] array, int elemento_buscar, int indice) {

        if (array[indice] == elemento_buscar) {

            return indice;

        }else {
             return posicion_array(array,elemento_buscar,indice+1);

        }

    }
}