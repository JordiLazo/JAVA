package CompareTO;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Dell", 16, 800));
        laptops.add(new Laptop("Apple", 8, 1200));
        laptops.add(new Laptop("Acer", 12, 700));
        //ListIterator<Laptop> it = laptops.listIterator();
        Comparator<Laptop> com = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                if(o1.getPrice() > o2.getPrice()){
                    return -1;
                }else {
                    return 1;
                }
            }
        };

        Collections.sort(laptops, com);

        for(Laptop l :laptops){
                System.out.println(l);
            }

    }
}
