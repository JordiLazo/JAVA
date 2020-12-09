package Problem_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DictionaryImpl implements Dictionary {
    HashMap<String, ArrayList<String>> dict;
    public DictionaryImpl(){
        this.dict = new HashMap<>();
    }

    @Override
    public void defineWord(String word, String definition) {
        if(word.equals("")){
            throw new IllegalArgumentException();
        }
        if (dict.containsKey(word)){
            ArrayList<String> tmp = dict.get(word);
            tmp.add(definition);
        }else {
            ArrayList<String> newlistofdefinitions = new ArrayList<>();
            newlistofdefinitions.add(definition);
            dict.put(word, newlistofdefinitions);
        }
    }

    @Override
    public List<String> getDefinitions(String word) throws NotDefinedException {
        if(dict.get(word) == null || word.equals("")){
            throw new NotDefinedException("Error, that word does not exits in the dictionary");
        }else{
            return dict.get(word);
        }
    }
    public void printHashmapKeys(){
        for ( String key : dict.keySet() ) {
            System.out.println(key);
        };

    }
}
