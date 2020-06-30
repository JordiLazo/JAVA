//Miembros estaticos de una clase
package Static;

public class Static_1 {
    private static String frase="Bona nit";//frase es un atributo estatico, es decir, no le pertenece a los objetos, le pertenece a la clase

    public static void main(String[] args) {
        Static_1 objeto1=new Static_1();
        Static_1 objeto2=new Static_1();

        objeto2.frase="buenos dias";

        System.out.println(objeto1.frase);
        System.out.println(objeto2.frase);
    }
}
