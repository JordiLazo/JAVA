import java.util.Scanner;

public class Adivina_Numero {
    public static void main(String[] args) {
        int aleatorio=(int)(Math.random()*100);
        //System.out.println(aleatorio);

        Scanner entrada_datos=new Scanner(System.in);

        int numero=0;

        int intentos=0;

        do{
            intentos++;

            System.out.println("Introduce un numero, por favor");
            numero=entrada_datos.nextInt();
            if(aleatorio<numero){
                System.out.println("El numero es mas bajo");
            }else if(aleatorio>numero){
                System.out.println("El numero mas alto");
            }
        }while(numero!=aleatorio);
        System.out.println("Correcto. Lo has conseguido en "+intentos+" intentos");
    }
}
