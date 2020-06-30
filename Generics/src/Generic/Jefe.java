package Generic;

public class Jefe extends Empleado {
    public Jefe(String nombre, int edad, int salario){
        super(nombre,edad,salario);
    }
    double incentivo (double inc){
        return inc;
    }
}
