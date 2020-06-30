//Encapsulamiento y métodos accesores (GETTER y SETTER)
package Getter_Setter;

public class Clase1 {

    private int edad;
    private String nombre;

    public void SetEdad(int edad){//Método Setter: Establecemos la edad
        this.edad=edad;
    }

    public int GetEdad(){//Método Getter: Mostramos la edad
        return edad;
    }

    public String getNombre() {//GETTER
        return nombre;
    }

    public void setNombre(String nombre) {//SETTER
        this.nombre = nombre;
    }
}
