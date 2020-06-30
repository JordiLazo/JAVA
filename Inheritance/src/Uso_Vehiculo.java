import javax.swing.*;

public class Uso_Vehiculo {
    public static void main(String[] args) {
        /*Coche micoche=new Coche();//INSTANCIAR UNA CLASE

        micoche.establecer_color(JOptionPane.showInputDialog("Introduce color"));

        System.out.println(micoche.dime_datos_generales());


        System.out.println(micoche.dime_color());

        micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));

        System.out.println(micoche.dime_asientos());

        micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));

        System.out.println(micoche.dime_climatizador());

        System.out.println(micoche.dime_peso_coche());

        micoche.configura_climatizador("si");

        System.out.println("El precio final del coche "+ micoche.precio_coche());*/
        Coche audi = new Coche();
        audi.establecer_color("azul");
        System.out.println(audi.dime_color());

        Furgoneta mercedes = new Furgoneta(7,580);
        mercedes.establecer_color("azul");
        mercedes.configura_asientos("si");
        mercedes.configura_climatizador("si");
        System.out.println(audi.dime_datos_generales()+" " +audi.dime_color());
        System.out.println(mercedes.dime_datos_generales() +" "+ mercedes.getFurgoneta());
    }
}
