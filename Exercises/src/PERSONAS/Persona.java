package src.PERSONAS;

public class Persona {

    //Atributos
    String nombre;
    int edad;

    //Métodos

    public Persona(String nombre, int  edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public void mostrarDatos(){

        System.out.println("El nombre es "+ nombre);
        System.out.println(("La edad del usuario es "+edad));
    }


}
