import java.util.Scanner;

public class entrada_ejemplo1 {
    public static void main (String[]args){
        System.out.println("Introduce tu nombre");
        Scanner entrada=new Scanner(System.in);
        String nombre_usuario=entrada.nextLine();

        System.out.println("Introduce tu edad");

        int edad_usario=entrada.nextInt();
        System.out.println("Hola"+nombre_usuario+"el año que viene tendras"+(edad_usario+1+"años"));
    }
}
