import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Employee> test = new HashMap<String, Employee>();

        test.put("47E",new Employee("Ana"));
        test.put("89G",new Employee("Jordi"));
        test.put("49T",new Employee("Esther"));
        test.put("48F",new Employee("Yolanda"));

        System.out.println(test);

        test.remove("89G");
        System.out.println(test);

        test.put("89G",new Employee("Lazo"));//Reemplaza valor de la K y V

        System.out.println(test);

        System.out.println(test.entrySet());

        for(Map.Entry<String,Employee> entrada: test.entrySet()){
            String clave = entrada.getKey();
            Employee valor = entrada.getValue();
            System.out.println("Clave="+clave+"Valor="+valor);

        }
    }
}
