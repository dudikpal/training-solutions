package collectionsmap;

import java.time.LocalDate;

public class Entry {

    private String ipAddress;
    private LocalDate entryDate;
    private String login;

    public Entry(String ipAddress, LocalDate entryDate, String login) {
        this.ipAddress = ipAddress;
        this.entryDate = entryDate;
        this.login = login;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public String getLogin() {
        return login;
    }
}
