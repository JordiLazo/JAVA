import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Comparable, Trabajadores{
    public int compareTo(Object e){
        Empleado cast = (Empleado) e;
        if(this.Id<cast.Id){
            return -1;
        }if(this.Id >cast.Id){
            return 1;
        }
        return 0;
    }
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;
    //Constructor empleado
    public Empleado(String nom,double sue, int agno, int mes, int dia){
        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
        altaContrato=calendario.getTime();
        ++IdSiguiente;
        Id= IdSiguiente;
    }


    public Empleado (String nom){//sobrecargar constructor
        this(nom,30000,2000,01,01);
    }


    public String dameNombre(){//GETTER
        return nombre + " Id:" + Id;
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

    //Interfaz de Trabajadores
    @Override
    public double establece_bonus(double gratificacion) {
        return Trabajadores.bonus_base+gratificacion;
    }
}

