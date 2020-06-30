
public class Perro {

    // ATRIBUTOS: información que todos los objetos de esta clase tienen y que ayuda a diferenciarlos entre sí
    String nombre;
    String raza;
    int edad;
    int felicidad = 0;
    int hambre = 100;

    // constructores: Tienen el nombre de la clase
    public Perro(String name, int age, String breed){
        this.nombre = name;
        this.edad = age;
        this.raza = breed;
    }

    //MÉTODOS: Son funciones que te permiten editar los ATRIBUTOS de los CONSTRUCTORES
    public int getEdad(){

        return this.edad+7;
    }

    public boolean esMayorDeEdad(){

        return (this.edad >= 18);
    }

    public void edad_y_nombre_final (int edad, String nombre){
        this.edad=edad;
        this.nombre=nombre;

        if(edad>=18){
            System.out.println("El perro "+ this.nombre+" es mayor de 18 años");
        }else {
            System.out.println("El perro "+this.nombre+" no es mayor de edad");
        }
    }

    public void renombrar(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public void pasear(){
        if(this.hambre > 0) {
            this.felicidad = this.felicidad + 1;
            this.hambre = this.hambre - 1;
            System.out.println("Hemos sacado a pasear al perro " + this.nombre + ". Su felicidad es " + this.felicidad + " y su hambre es " + this.hambre);
        } else {
            System.out.println("El perro se muere de hambre y te ha mandado a tomar por culo");
        }


    }

    public void alimentar(){
        this.hambre = this.hambre + 1;
        System.out.println("Hemos dado de comer a " + this.nombre + " y su hambre ahora es " + this.hambre);
    }

    public void morder(Perro perroObjetivo){
        perroObjetivo.felicidad = perroObjetivo.felicidad - 10;
        this.hambre = this.hambre + 10;
        System.out.println(this.nombre + " ha mordido a " + perroObjetivo.nombre + " y ahora la felicidad de " + perroObjetivo.nombre + " es " + perroObjetivo.felicidad +
                " y el hambre de " + this.nombre + " es " + this.hambre);
    }

}
