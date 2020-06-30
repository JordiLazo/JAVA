package Generic;

public class MisMatrices {
    public static <E> String getElement(E[]a){
        return "El array tiene "+a.length+" elementos";
    }

    public static  <E extends Comparable<? super E>> E getMenor(E[] a){
        if(a==null || a.length==0){
            return null;
        }
        E elementoMenor = a[0] ;
        for(int i = 1; i<a.length;i++){
            if(elementoMenor.compareTo(a[i]) > 0){
                elementoMenor = a[i];
            }
        }
        return elementoMenor;
    }
}
