import javax.swing.*;

public class Uso_Bucle_Each {
    public static void main(String[] args) {

        String [] paises=new String[8];

        for(int i=0;i<8;i++){
            paises[i]= JOptionPane.showInputDialog("Introduce pais "+(i+1));
        }


        //String[] paises={"España","México","Colombia","Perú","Chile","Argentina","Ecuador","Venezuela"};

        /*for(int i=0;i<paises.length;i++){ //Inicializamos el bucle FOR//
            System.out.println("El país "+(i+1)+" es " + paises[i]);
        }*/
        for(String elemento:paises){ // Inicializamos el bucle FOR EACH//
            System.out.println("País: "+elemento);

        }





    }

}
