package src.LIST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List cars = new ArrayList();
        cars.add("BMW");
        cars.add("Lucid Motors");
        cars.add("Honda");

        System.out.println(cars);
        //System.out.println(cars.get(0));

        for(int i=0;i<cars.size();i++)
        {
           System.out.println(cars.get(i));
        }

        List cars2 = new LinkedList();
        cars2.add("BMW");
        cars2.add("Lucid Motors");
        cars2.add("Honda");

        System.out.println(cars2);
        //System.out.println(cars.get(0));

        for(int i=0;i<cars2.size();i++)
        {
            System.out.println(cars2.get(i));
        }
    }
}
