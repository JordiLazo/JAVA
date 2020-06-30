package src.PROPERTIES;

import java.util.Iterator;
import java.util.Properties;

public class Propertie {
    public static void main(String[] args) {
        Properties films = new Properties();

        films.put("Star Wars","Revenge of the Jedi");
        films.put("Batman","The Dark Night");
        films.put("Lord of the rings","Two towers");
        System.out.println(films);
        System.out.println(films.get("Batman"));

        Iterator i = films.keySet().iterator();
        while(i.hasNext()){
            String key = (String)i.next();
            System.out.println(key+":"+films.getProperty(key));
        }
    }
}
