package week7;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    HashMap<String, String> words;
    public Dictionary() {
        words = new HashMap<>();
    }

    public String translate(String word) {
        return this.words.getOrDefault(word, null);
    }
    public void add(String word, String translation)
    {
        words.put(word, translation);
    }

    public int amountOfWords() {
        return this.words.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translations = new ArrayList<>();
        for ( String key : words.keySet() ) {
            translations.add( key + "=" + words.get(key) );
        }
        return translations;
    }
}
