public class BubbleSort {

    public static void main(String[] args) {
        int array[] = {5, 4, 2, 1};
        int i,aux;
        boolean stop=false;
        while (true) {
            stop=false;
            for (i = 1; i < array.length; i++) {
                if(array[i]< array[i-1]){
                    aux= array[i];
                    array[i]=array[i-1];
                    array[i-1]= aux;
                    stop=true;
                }
            }
            if(stop==false){
                break;
            }
        }
        for(i=0;i<array.length;i++){
            System.out.print(array[i]);

        }
    }
}
