package lambdaintro;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OfficeDocumentReader {

    private static final String REGEXP = ".*\\.(docx|xlsx|pptx)$";

    public List<File> listOfficeDocuments(File path) {
        List<File> filteredFiles = new ArrayList<>();
        List<File> listOfFiles = List.of(path.listFiles());
        System.out.println(listOfFiles);
        for (File file: listOfFiles) {
            if (file.isFile() && (file.getName().toLowerCase().matches(REGEXP))) {
                filteredFiles.add(file);
            }
        }
        System.out.println(filteredFiles);
        return filteredFiles;
    }

    /*
    public List<File> listOfficeDocuments(File path) {
        List<File> files = Arrays.asList(path.listFiles(f -> f.isFile() && f.getName().toLowerCase().matches(REGEXP)));
        files.sort(Comparator.comparing(File::getName));
        return files;
    }
    */
}
