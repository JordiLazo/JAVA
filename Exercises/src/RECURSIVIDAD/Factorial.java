package src.Recursividad;

public class Factorial {
    public static void main(String[] args) {
        int numero=5;
        int resultado= factorial(numero);
        System.out.println(resultado);
    }

    public static int factorial(int numero){

        int x=0;

        if(numero==0){
            return 1;
        }else {
            x=numero*factorial(numero-1);
        }
        return x;
    }
}
