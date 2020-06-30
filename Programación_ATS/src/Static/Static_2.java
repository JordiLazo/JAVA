package Static;

public class Static_2 {

    private static String frase="que tal mariposa";
    public static int suma(int a, int b){
        int suma=a+b;
        return suma;
    }

    public static void main(String[] args) {
        System.out.println(Static_2.frase);
        System.out.println(Static_2.suma(2,45));

    }
}
