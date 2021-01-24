package timesheet;

public class ReportLine {
    private Project project;
    private long time;

    public ReportLine(Project project, long time) {
        this.project = project;
        this.time = time;
    }

    public void addTime(long additionalTime) {
        time += additionalTime;
    }

    public Project getProject() {
        return project;
    }

    public long getTime() {
        return time;
    }
}
