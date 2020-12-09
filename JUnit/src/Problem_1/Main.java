package Problem_1;

public class Main {

    public static void main(String[] args) {
        DictionaryImpl dictionary = new DictionaryImpl();
        dictionary.defineWord("Casa","es una choza");
        dictionary.defineWord("Casa","es un hospital");
        dictionary.defineWord("Casa","es el perro");
        dictionary.defineWord("Jordi","soy yo");
        dictionary.defineWord("Peters","da peters");
        dictionary.defineWord("Ps5","es la millor consola");

        try {
            System.out.println(dictionary.getDefinitions("Peters"));
        } catch (NotDefinedException e) {
            e.printStackTrace();
        }
        dictionary.printHashmapKeys();
    }
}
