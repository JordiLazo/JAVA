package LinkedTest;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> persona = new LinkedList<>();
        persona.add("Sandra");
        persona.add("Pepe");
        persona.add("Lazo");
        persona.add("Laura");
        System.out.println(persona.size());
        ListIterator<String> it = persona.listIterator();
        it.next();
        it.add("Aaron");
        for(String personas : persona){
            System.out.println(personas);
        }
    }
}
