public class insercion {

    public static void main(String[] args) {
        int array[]={2,3,1,9,7};
        int i, pos, aux;

        for(i=0;i<array.length;i++){
            pos=i;
            aux=array[i];

            while ((pos>0) && (array[pos-1]>aux)){
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos]=aux;
        }
        System.out.print("Orden ascendente\n");

        for(i = 0; i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}
