package exceptions.faults;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FaultList {

    private List<String> report = new ArrayList<>();

    public List<String> processLines(List<String> lines) {
        isNull(lines);
        for (String line: lines) {
            processLine(line);
        }
        return report;
    }

    private void processLine(String line) {
        if (isComment(line)) {
            return;
        }
        if (wordCountError(line)) {
            report.add(line.split(",")[0] + "," + ProcessingResult.WORD_COUNT_ERROR.getCode());
            return;
        }
        if (isValueAndDateError(line)) {
            report.add(line.split(",")[0] + "," + ProcessingResult.VALUE_AND_DATE_ERROR.getCode());
            return;
        }
        if (isValueError(line)) {
            report.add(line.split(",")[0] + "," + ProcessingResult.VALUE_ERROR.getCode());
            return;
        }
        if (isDateError(line)) {
            report.add(line.split(",")[0] + "," + ProcessingResult.DATE_ERROR.getCode());
            return;
        }
    }

    private boolean isValueAndDateError(String line) {
        if (isValueError(line) && isDateError(line)) {
            return true;
        }
        return false;
    }

    private boolean isDateError(String line) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.");
        if (dateFormat.parse(line.split(",")[2], new ParsePosition(0)) == null) {
            /*DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy.MM.dd.");
            LocalDate.parse("1998.04.3a.", dateFormat);*/
            return true;
        }
        return false;
    }

    private boolean isValueError(String line) {
        try {
            Double.parseDouble(line.split(",")[1]);
            return false;
        } catch (NumberFormatException ex) {
            return true;
        }
    }

    private boolean wordCountError(String line) {
        if (line.split(",").length != 3) {
            return true;
        }
        return false;
    }

    private boolean isComment(String line) {
        for (char item: line.split(",")[0].toCharArray()) {
            if (!Character.isDigit(item)) {
                return true;
            }
        }
        return false;
    }

    private void isNull(List<String> lines) {
        if (lines == null) {
            throw new IllegalArgumentException();
        }
    }
}
