import javax.swing.*;
import java.util.Scanner;

public class Areas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opcion:\n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
        int figura=entrada.nextInt();

        switch (figura){
            case 1:
                int lado= Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("El area del cuadrado es "+Math.pow(lado,2));
                break;
            case 2:
                int base=Integer.parseInt(JOptionPane.showInputDialog("Introdice la base"));
                int altura=Integer.parseInt(JOptionPane.showInputDialog("Introdduce la altura"));
                System.out.println("El area del rectangulo"+base*altura);
                break;
            case 3:
                base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura=Integer.parseInt(JOptionPane.showInputDialog("Introdice la altura"));
                System.out.println("El area del triangulo es"+(base*altura)/2);
                break;
            case 4:
                int radio=Integer.parseInt(JOptionPane.showInputDialog("Introdice el radio"));
                System.out.println("El area del circulo es");
                System.out.printf("%1.2f",Math.PI*(Math.pow(radio,2)));
                break;

                default:
                    System.out.println("La opcion no es correcta");
        }

    }
}
