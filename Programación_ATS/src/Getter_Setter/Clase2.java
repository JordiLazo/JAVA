package Getter_Setter;

public class Clase2 {
    public static void main(String[] args) {
        Clase1 objeto1=new Clase1();
        objeto1.SetEdad(15);
        objeto1.setNombre("Jordi");
        System.out.println("que tal"+ objeto1.getNombre());
        System.out.println("hola"+objeto1.GetEdad());

    }
}
