import javax.swing.*;

public class Acceso_aplicacion {
    public static void main(String[] args) {
        String clave="Jordi";

        String pass="";

        while(clave.equals(pass)==false){
            pass= JOptionPane.showInputDialog("Introduce la contraseña, por favor.");
            System.out.println("La contraseña introducida es incorrecta");

            if (clave.equals(pass)==false){
                System.out.println("La contraseña introducida es incorrecta");
            }
        }
        System.out.println("Contraseña correcta.Acceso permitido");
    }
}