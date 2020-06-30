package POO;

import javax.swing.*;

public class Uso_Coche  {

    public static void main(String[] args) {

        /*Coche Renault=new Coche(); //INSTANCIAR UNA CLASE
        Renault.largo=3000;

        System.out.println(Renault.dime_largo());*/

        Coche micoche=new Coche();//INSTANCIAR UNA CLASE

        micoche.establecer_color(JOptionPane.showInputDialog("Introduce color"));

        System.out.println(micoche.dime_datos_generales());


        System.out.println(micoche.dime_color());

        micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));

        System.out.println(micoche.dime_asientos());

        micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));

        System.out.println(micoche.dime_climatizador());

        System.out.println(micoche.dime_peso_coche());

        micoche.configura_climatizador("si");

        System.out.println("El precio final del coche "+ micoche.precio_coche());


    }
}
