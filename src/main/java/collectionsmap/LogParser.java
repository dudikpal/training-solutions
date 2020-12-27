package collectionsmap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogParser {

    private static final int NUMBER_OF_FIELDS = 3;
    private static final int POSITION_OF_IP = 0;
    private static final int POSITION_OF_DATE = 1;
    private static final int POSITION_OF_LOGIN = 2;
    private static final String SEPARATOR = ":";
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Map<String, List<Entry>> parseLog(String log) {
        List<String> lines = List.of(log.split("\n"));
        Map<String, List<Entry>> entries = new HashMap<>();
        for (String line: lines) {
            String[] datas = line.split(SEPARATOR);
            invalidInputLine(datas);
            Entry entry = new Entry(datas[POSITION_OF_IP], dateParser(datas[POSITION_OF_DATE]), datas[POSITION_OF_LOGIN]);
            addEntryToMap(entries, entry);
        }
        return entries;
    }

    private void invalidInputLine(String[] datas) {
        if (datas.length != NUMBER_OF_FIELDS) {
            throw new IllegalArgumentException("Incorrect log: incorrect number of fields");
        }
    }

    private LocalDate dateParser(String date) {
        try {
            return LocalDate.parse(date, DATE_FORMAT);
        } catch (DateTimeParseException pe) {
            throw new IllegalArgumentException("Incorrect log: incorrect date");
        }
    }

    private void addEntryToMap(Map<String, List<Entry>> entries, Entry entry) {
        if (!entries.containsKey(entry.getIpAddress())) {
            entries.put(entry.getIpAddress(), new ArrayList<>());
        }
        entries.get(entry.getIpAddress()).add(entry);
    }
}
