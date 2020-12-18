package Problem_1;

import java.util.List;

public interface Dictionary {
    void defineWord(String word, String definition) throws AlreadyDefined, NotDefinedException;
    List<String> getDefinitions(String word)
        throws NotDefinedException;

}