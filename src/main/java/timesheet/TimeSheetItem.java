package timesheet;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeSheetItem {
    private final Employee employee;
    private final Project project;
    private final LocalDateTime beginDate;
    private final LocalDateTime endDate;

    public TimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate) {
        if (datesValidator(beginDate, endDate)) {
            this.beginDate = beginDate;
            this.endDate = endDate;
        } else {
            throw new IllegalArgumentException("Invalid date");
        }
        this.employee = employee;
        this.project = project;
    }

    public long hoursBetweenDates() {
        return Duration.between(beginDate, endDate).toHours();
    }

    private boolean datesValidator(LocalDateTime begin, LocalDateTime end) {
        return begin.toLocalDate().equals(end.toLocalDate()) && begin.isBefore(end);
    }

    public Employee getEmployee() {
        return employee;
    }

    public Project getProject() {
        return project;
    }

    public LocalDateTime getBeginDate() {
        return beginDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }
}
