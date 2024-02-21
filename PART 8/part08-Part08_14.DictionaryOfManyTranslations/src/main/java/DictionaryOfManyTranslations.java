import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String> > dictionary;

    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation){
        //creating empty list for new words
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word){
        if (this.dictionary.get(word) == null) {
            return new ArrayList<>();
        }
        return this.dictionary.get(word);
    }

    public void remove(String word){
        this.dictionary.remove(word);
    }

}
