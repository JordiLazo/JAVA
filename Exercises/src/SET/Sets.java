package src.SET;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<Integer>numbers = new HashSet<Integer>();

        numbers.add(23);
        numbers.add(7);
        numbers.add(90);
        numbers.add(-5);
        numbers.add(90);
        numbers.add(67);
        System.out.println(numbers);
        TreeSet tree = new TreeSet<Integer>(numbers);
        System.out.println(tree);
    }
}
