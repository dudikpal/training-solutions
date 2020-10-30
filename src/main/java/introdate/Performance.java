package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {
    private LocalDate date;
    private String artist;
    private LocalTime startTime, endTime;

    public Performance() {
        this.date = LocalDate.of(2022, 6, 15);
        this.artist = "Cumbawamba";
        this.startTime = LocalTime.of(15, 00);
        this.endTime = LocalTime.of(16, 55);
    }

    public LocalDate getDate() {
        return date;
    }

    public String getArtist() {
        return artist;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getInfo() {
        return artist + ": " + date + " " + startTime + " - " + endTime;
    }
}
