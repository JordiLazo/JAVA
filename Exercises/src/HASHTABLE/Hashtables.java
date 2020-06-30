package src.HASHTABLE;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtables {
    public static void main(String[] args) {
        Hashtable t = new Hashtable();

        t.put("1","One");
        t.put("2","Two");
        t.put("3","Three");
        t.put("4","Four");

        System.out.println(t);

        Enumeration e= t.keys();

        while (e.hasMoreElements()){
            String key = (String)e.nextElement();
            System.out.println(key+":"+t.get(key));
        }

    }
}
