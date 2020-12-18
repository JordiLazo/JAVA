package Problem_1;

public class Main {

    public static void main(String[] args) throws AlreadyDefined, NotDefinedException {
        DictionaryImpl dictionary = new DictionaryImpl();
        dictionary.defineWord("Casa","es una choza");
        dictionary.defineWord("Casa","es un hospital");
        dictionary.defineWord("Casa","es el perro");
        dictionary.defineWord("Jordi","soy yo");
        dictionary.defineWord("Peters","da peters");
        dictionary.defineWord("Ps5","es la millor consola");
        System.out.println(dictionary.getDefinitions("Casa"));
        System.out.println(dictionary.getDefinitions("Peters"));
        dictionary.defineWord("Casa","es una choza");
    }
}