import javax.swing.*;

public class entrada_numeros {
    public static void main(String[] args) {
        //double x=10000.0;
        String num1= JOptionPane.showInputDialog("Introduce un numero");
        Double num2=Double.parseDouble(num1);
        System.out.print("La raiz de " +num2+ " es ");
        System.out.printf("%1.4f ",Math.sqrt(num2));
    }
}
