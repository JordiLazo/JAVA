package src.MAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map mappy = new HashMap();

        mappy.put("Key1","Value1");
        mappy.put("Key2","Value2");
        mappy.put("Key3","Value3");
        mappy.put("Key4","Value4");
        mappy.put("Key5","Value5");
        mappy.put("Key6","Value6");
        System.out.println(mappy);
        System.out.println(mappy.get("Key6"));

        Iterator it = mappy.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry m = (Map.Entry) it.next();
            System.out.println(m.getKey()+" - "+m.getValue());
        }

    }
}
