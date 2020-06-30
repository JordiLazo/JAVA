package POO;
import java.util.*;

public class Uso_Empleado {

    public static void main(String[] args) {
        /*Empleado empleado1=new Empleado("Ivan ",85000,1990,12,17);
        Empleado empleado2=new Empleado("Pepo ",95000,1995,6,2);
        Empleado empleado3=new Empleado("Paco ",105000,2002,3,15);

        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);

        System.out.println("Nombre: "+ empleado1.dameNombre()+ "sueldo: " + empleado1.dameSueldo() + " Fecha de Alta: " +empleado1.dameFechaContrato());
        System.out.println("Nombre: "+ empleado2.dameNombre()+ "sueldo: " + empleado2.dameSueldo() + " Fecha de Alta: " +empleado2.dameFechaContrato());
        System.out.println("Nombre: "+ empleado3.dameNombre()+ "sueldo: " + empleado3.dameSueldo() + " Fecha de Alta: " +empleado3.dameFechaContrato());*/

        Empleado[] misEmpleados=new Empleado[3];

        misEmpleados[0]=new Empleado("Ivan", 85000, 1990,12,17);
        misEmpleados[1]=new Empleado("Pepo", 95000, 1995,6,2);
        misEmpleados[2]=new Empleado("Paco", 105000, 2002,3,15);

        for (int i=0;i<misEmpleados.length;i++){

            misEmpleados[i].subeSueldo(5);
        }

        for(int i=0;i<misEmpleados.length;i++){

            System.out.println("Nombre: " +misEmpleados[i].dameNombre()+" Sueldo: "+misEmpleados[i].dameSueldo()+" Fecha de Alta: "+misEmpleados[i].dameFechaContrato());
        }

    }
}

class Empleado{

    public Empleado(String nom,double sue, int agno, int mes, int dia){

        nombre=nom;

        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);

        altaContrato=calendario.getTime();


    }

    public String dameNombre(){//GETTER
        return nombre;
    }

    public double dameSueldo(){//GETTER

        return sueldo;
    }

    public Date dameFechaContrato(){//GETTER

        return altaContrato;
    }

    public void subeSueldo(double porcentaje){//SETTER

        double aumento=sueldo*porcentaje/100;

        sueldo+=aumento;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
}
