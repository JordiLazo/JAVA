import java.util.Random;

public class Suma_Arrays {
    public static void main(String[] args) {
        Random R= new Random();
        int [] array=new int [10];
        for (int i=0;i<10;i++){
            array[i]=R.nextInt(10);
            System.out.println(array[i]);
        }
        int suma=0;
        for(int i=0;i<10;i++){
            suma=suma+array[i];
        }
        System.out.println("La suma de la array es: "+suma);
    }
}
