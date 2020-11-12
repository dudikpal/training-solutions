package stringmethods;

import javax.swing.*;

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        if ( str == null || str.isBlank()) {
            throw new IllegalArgumentException("Empty string!");
        }
        str = str.trim();

        return str.charAt(str.length() - 1);
    }

    public String findFileExtension(String fileName) {
        if (fileName == null || fileName.isBlank() || fileName.indexOf(".") == 0 || fileName.indexOf(".") == fileName.length() - 1) {
            throw new IllegalArgumentException("Invalid file name!");
        }
        fileName = fileName.trim();
        return fileName.substring(fileName.lastIndexOf('.'));
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        if (ext == null || fileName == null || ext.isBlank() || fileName.isBlank() || fileName.indexOf(".") == 0) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        ext = ext.trim();
        fileName = fileName.trim();

        return ext.equals(fileName.substring(fileName.lastIndexOf(".") + 1));
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        if (searchedFileName == null || actualFileName == null || searchedFileName.isBlank() || !searchedFileName.contains(".") || actualFileName.isBlank() || !actualFileName.contains(".")) {
            throw new IllegalArgumentException("Invalid argument!");
        }

        return searchedFileName.trim().toLowerCase().equals(actualFileName.trim().toLowerCase());
    }

    public String changeExtensionToLowerCase(String fileName) {
        if (fileName.isBlank()) {
            throw new IllegalArgumentException("Empty string!");
        } else if (fileName.indexOf(".") == 0 || fileName.indexOf(".") == fileName.length() - 1) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        fileName = fileName.trim();

        return fileName.substring(0, fileName.indexOf(".")).concat(".").concat(fileName.substring(fileName.indexOf(".") + 1).toLowerCase());
    }

    public String replaceStringPart(String fileName, String present, String target) {
        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("Empty string!");
        }
        return fileName.trim().replace(present, target);
    }




}
