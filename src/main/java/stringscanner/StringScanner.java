package stringscanner;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StringScanner {

    public int readAndSumValues(String intString, String delimiter) {
        if (isEmpty(intString)) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(intString);
        int sumNumbers = 0;

        if (!isEmpty(delimiter)) {
            sc.useDelimiter(delimiter);
        }

        try {
            while (sc.hasNext()) {
                sumNumbers += sc.nextInt();
            }
        } catch (InputMismatchException ex) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }

        return sumNumbers;
    }

    public int readAndSumValues(String intString) {
        return readAndSumValues(intString, null);
    }

    public String filterLinesWithWordOccurrences(String text, String word) {
        if (isEmpty(text) || word == null || "".equals(word)) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        Scanner scanner = new Scanner(text.trim());
        if (isEmpty(scanner.toString())) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains(word)) {
                sb.append(line);
                sb.append("\n");
            }
        }
        return sb.toString().trim();
    }

    private boolean isEmpty(String str) {
        if (str == null) {
            return true;
        }
        if (str.isBlank()) {
            return true;
        }
        return false;
    }
}
