public class manipular_string {
    public static void main(String[] args) {

        String palabras = "Felipe Juan Froilan de Todos los Santos";

        System.out.println("Mi nombre es:" + palabras);
        System.out.println("Mi nombre tiene: "+ palabras.length() + " letras");
        System.out.println("La primera letra de "+palabras +" es la " +palabras.charAt(0));
        int ultima_letra;
        ultima_letra=palabras.length();
        System.out.println("La ultima letra es la " +palabras.charAt(ultima_letra-1));
    }
}
