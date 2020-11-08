package controliteration.dictionary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dictionary {

    private List<DictionaryItem> dictionaryItems = new ArrayList<>();

    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();

        dictionary.addItem("jó", List.of("good", "nice", "right"));
        dictionary.addItem("rossz", List.of("bad", "unfair", "ugly"));
        System.out.println(dictionary.dictionaryItems);

        dictionary.addItem("jó", List.of("good", "fine"));
        System.out.println(dictionary.dictionaryItems);

        System.out.println(dictionary.findTranslations("jó"));
    }

    public void addItem(String word, List<String> translations) {
        boolean hasWord = false;
        for (DictionaryItem item: dictionaryItems) {
            if(word.equals(item.getWord())) {
                item.addTranslations(translations);
                hasWord = true;
            }
        }
        if (!hasWord) {
            dictionaryItems.add(new DictionaryItem(word, translations));
        }
    }

    public List<String> findTranslations(String word) {

        for (DictionaryItem item: dictionaryItems) {
            if (item.getWord().equals(word)) {
                return item.getTranslations();
            }
        }
        return Collections.emptyList();
    }
}
