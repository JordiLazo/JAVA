package src.VECTOR;

import java.util.Enumeration;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector vec = new Vector();
        vec.addElement(1);
        vec.addElement(2);
        vec.addElement("Hello");
        vec.addElement(3);
        vec.addElement(4);
        vec.addElement(5);
        vec.addElement(6);
        vec.addElement(7);
        vec.addElement(8);
        vec.addElement(9);
        vec.addElement(10);

        //System.out.println(vec);
        //System.out.println(vec.get(0));
        //System.out.println(vec.get(2));
        Enumeration e= vec.elements();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }



    }
}
