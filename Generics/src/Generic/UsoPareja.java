package Generic;

import java.util.ArrayList;
import java.util.EnumMap;

public class UsoPareja {

    public static void main(String[] args) {
        Pareja<Integer> uno = new Pareja<Integer>();

        uno.setPrimero(123);
        System.out.println(uno.getPrimero());

        Persona p1 = new Persona("Yolanda", 21);

        Pareja<Persona> persona = new Pareja<Persona>();
        persona.setPrimero(p1);
        System.out.println(persona.getPrimero());

        //int[] nombres = {98,2,56,78};
        String nombre[] = {"Jose", "Esther"};
        System.out.println(MisMatrices.getMenor(nombre));//no puedes crear array de entero tiene que ser de genericos

        //Empleado administrativa = new Empleado("Elena",45,15000);
        //Jefe directorcomercial = new Jefe("Ana",27,35000);
        //Empleado nuevoempleado = directorcomercial;
        Pareja<Empleado> administrativa = new Pareja<Empleado>();
        Pareja<Jefe> directorcomercial = new Pareja<Jefe>();

        Pareja.imprimirTrabajador(administrativa);
        Pareja.imprimirTrabajador(directorcomercial);


    }
}
