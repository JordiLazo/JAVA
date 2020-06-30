package src.SORTEDSET;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSets {
    public static void main(String[] args) {
        SortedSet sorted = new TreeSet();
        sorted.add(78);
        sorted.add(98);
        sorted.add(0);
        sorted.add(45);
        sorted.add(1000);

        System.out.println(sorted);
        Iterator i = sorted.iterator();
        while(i.hasNext()){
            Object e = i.next();
            System.out.println(e);
        }
    }
}
