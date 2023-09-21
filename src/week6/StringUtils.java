package week6;

public class StringUtils {
    public StringUtils() {

    }
    public static boolean included(String word, String searched) {
        String wordIs = word.trim().toUpperCase();
        String searchedIs = searched.trim().toUpperCase();
        return wordIs.contains(searchedIs);
    }
}
