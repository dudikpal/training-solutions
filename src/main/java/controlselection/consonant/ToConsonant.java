package controlselection.consonant;

import typeconversion.whichtype.Type;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ToConsonant {

    public static void main(String[] args) {

        ToConsonant toConsonant = new ToConsonant();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy betűt:");
        char inputChar = scanner.nextLine().charAt(0);

        System.out.println("A beírt betű: " + (toConsonant.backChar(inputChar) == inputChar ? inputChar : inputChar + ", a következő betű: " + toConsonant.backChar(inputChar)));
    }

    public char backChar(char inputChar) {

        char[] lettersArray = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] vowelArray = new char[]{'a', 'e', 'i', 'o', 'u'};
        int returnIndex = new String(lettersArray).indexOf(inputChar);

        for (char letter: vowelArray) {
            if (letter == inputChar) {
                returnIndex++;
                break;
            }
        }

        return lettersArray[returnIndex];
    }
}