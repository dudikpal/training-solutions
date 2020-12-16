package iostringwriter;

import java.util.List;

public class LongWordService {

    public String writeWithStringWriter(List<String> words) {
        String result = "";
        for (int i = 0; i < words.size(); i++) {
            result  += words.get(i) + " " + words.get(i).length() + "\n";
        }
        return result;
    }
}
