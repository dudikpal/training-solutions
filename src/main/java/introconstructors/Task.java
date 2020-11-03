package introconstructors;

import java.time.DateTimeException;
import java.util.Date;

public class Task {

    private String title;
    private String description;
    private Date startDateTime;
    private int duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void start() {
        startDateTime = new Date();
    }

    public static void main(String[] args) {

        Task task = new Task("Címe", "szövege");
        task.start();
        System.out.println(task.getStartDateTime());
        task.setDuration(110);
        System.out.println(task.getDuration());
    }
}
