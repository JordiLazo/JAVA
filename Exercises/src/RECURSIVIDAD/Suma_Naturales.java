package src.Recursividad;

public class Suma_Naturales {
    public static void main(String[] args) {

        int n=9;
        int resultado=sumaRecursiva(n);

        System.out.println(resultado);

    }
    public static int sumaRecursiva(int numero){
        int resultado=0;

        if(numero==1){

            return 1;
        }else {
            resultado+=numero+sumaRecursiva(numero-1);
        }


        return resultado;

    }

}
