import javax.swing.*;

public class Factorial {
    public static void main(String[] args) {
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        int resultado=1;
        for(int i=numero;i>0;i--){
            resultado=resultado*i;
        }
        System.out.println("El resultado es "+resultado);

    }
}
