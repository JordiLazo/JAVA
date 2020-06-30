package Constante_Final;

public class Persona {

    private final String nombre;
    private int edad=45;

    public Persona(String nombre, int edad){//Constructor
        this.edad=edad;
        this.nombre=nombre;
    }
    public void mostrarDatos(){
        System.out.println("Mi nombre es:"+nombre);
        System.out.println("Mi edad es:" +edad);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }
}
