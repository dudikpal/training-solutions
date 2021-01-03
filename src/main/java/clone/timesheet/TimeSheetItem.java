package clone.timesheet;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeSheetItem {

    private String employee;
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem timeSheetItem) {
        this.employee = timeSheetItem.getEmployee();
        this.project = timeSheetItem.getProject();
        this.from = timeSheetItem.getFrom();
        this.to = timeSheetItem.getTo();
    }

    public static TimeSheetItem withDifferentDay(TimeSheetItem timeSheetItem, LocalDate localDate) {
        TimeSheetItem result = new TimeSheetItem(timeSheetItem);
        result.from = LocalDateTime.of(localDate, result.from.toLocalTime());
        result.to = LocalDateTime.of(localDate, result.to.toLocalTime());
        return result;
    }

    public String getEmployee() {
        return employee;
    }

    public String getProject() {
        return project;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}
