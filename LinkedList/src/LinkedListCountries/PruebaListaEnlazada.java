package LinkedListCountries;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaListaEnlazada {
    public static void main(String[] args) {
        LinkedList<String> paises = new LinkedList<>();
        paises.add("España");
        paises.add("Colomobia");
        paises.add("Mexico");
        paises.add("Peru");

        LinkedList<String> capitales = new LinkedList<>();
        capitales.add("Madrid");
        capitales.add("Bogota");
        capitales.add("DF");
        capitales.add("Lima");

        //System.out.println(paises);
        //System.out.println(capitales);

        ListIterator<String> it_p = paises.listIterator();
        ListIterator<String> it_c = capitales.listIterator();

        while(it_c.hasNext()){
            if(it_p.hasNext()){
                it_p.next();
                it_p.add(it_c.next());
            }
        }


        System.out.println(paises);

        it_c=capitales.listIterator(); //vuelve a la posicion inicial
        while(it_c.hasNext()){
            it_c.next();

            if(it_c.hasNext()){
                it_c.next();
                it_c.remove();
            }
        }
        System.out.println(capitales);

        paises.removeAll(capitales);
        System.out.println(paises);
    }
}
