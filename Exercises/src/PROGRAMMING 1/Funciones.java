public class Funciones {

    public static void main(String[] args) {

        int num1=3;
        int num2=3;

        suma(num1,num2);//la funció tambien se puede guardar en una variable
        //ejemplo: int resultado= suma(num1,num2).
        char caracter='4';
        System.out.println("El caracter "+ caracter+" tiene asociado el codigo "+ devolver_ascii(caracter));
        holamundo();

        if(mayor_que_cero(0)){

            System.out.println("El numero es mayor que cero");
        }else {

            System.out.println("El numero es mas pequeño que cero");
        }

        System.out.println("El resultado es "+ suma(num1,num2));

        int min=0;
        int max=10;

        int aleatorio=numero_aleatorio(min,max);

        for(int i=0;i<7;i++){

            System.out.println(aleatorio);

        }


    }

    public static void holamundo(){

        System.out.println("Hola Mundo");
    }

    public static int suma(int a, int b){

        return a+b;
    }

    public static boolean mayor_que_cero(int num){

        return num>0;
    }

    public static int devolver_ascii(char caracter){

        return (int) caracter;

    }

    public static int numero_aleatorio(int minimo, int maximo){

        return  (int) Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));

    }
}
