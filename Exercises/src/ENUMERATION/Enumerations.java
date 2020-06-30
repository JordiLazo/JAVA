package src.ENUMERATION;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerations {
    public static void main(String[] args) {
        Enumeration months;

        Vector vec = new Vector();
        vec.add("January");
        vec.add("Febraury");
        vec.add("March");
        vec.add("April");
        vec.add("May");
        vec.add("June");
        vec.add("July");
        vec.add("August");
        vec.add("September");
        vec.add("October");
        vec.add("November");
        vec.add("December");

        months = vec.elements();

        while (months.hasMoreElements()){
            System.out.println(months.nextElement());
        }
    }
}
