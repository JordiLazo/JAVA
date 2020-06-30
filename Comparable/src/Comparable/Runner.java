package Comparable;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Laptop> laptops= new ArrayList<>();
        laptops.add(new Laptop("Dell",16,800));
        laptops.add(new Laptop("Apple",8,1200));
        laptops.add(new Laptop("Acer",12,700));
        ListIterator<Laptop> it = laptops.listIterator();
        Collections.sort(laptops);

        for(Laptop l : laptops){
            System.out.println(l);
        }

    }
}
