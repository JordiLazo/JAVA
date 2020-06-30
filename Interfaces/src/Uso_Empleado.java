import java.util.Arrays;

public class Uso_Empleado {
    public static void main(String[] args) {

        Empleado[] misEmpleados = new Empleado[7];
        Jefatura jefe_RRHH = new Jefatura("Juan",55000,2006,9,25);
        jefe_RRHH.estableceIncentivos(2570 );
        misEmpleados[0] = new Empleado("Ana", 30000, 2000, 7, 7);
        misEmpleados[1] = new Empleado("Carlos", 50000, 1995, 6, 15);
        misEmpleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
        misEmpleados[3] = new Empleado("Antonio", 47500, 2009, 11, 9);
        misEmpleados[4] = jefe_RRHH;//Poliformismo en accion
        misEmpleados[5] = new Jefatura("Maria",95000,1999,5,26);
        misEmpleados[6] = new Jefatura("Jordi",10000,1994,5,17);

        Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];//Casting transformar objeto de empleados a jefatura
        jefa_Finanzas.estableceIncentivos(55000);
        System.out.println(jefa_Finanzas.tomar_decisiones("despido"));
        System.out.println(jefa_Finanzas.motivar("as"));
        //System.out.println(misEmpleados[3].tomar_decisiones("contratado"));
        //Podemos implementar la interfaz "Jefes" a empleados.

        System.out.println(misEmpleados[3].dameNombre()+ " tiene un bonus de: "
        + misEmpleados[3].establece_bonus(200));

        System.out.println("El jefe"+jefa_Finanzas.dameNombre()+"tiene un bonus de: "
        +jefa_Finanzas.establece_bonus(500));
        for(Empleado e: misEmpleados){
            e.subeSueldo(5);
        }
        Arrays.sort(misEmpleados);//implementar interfaz Comparable

        for(Empleado e: misEmpleados){
            System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo() + " Fecha de Alta: " + e.dameFechaContrato());
        }
    }
}