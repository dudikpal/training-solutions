package activity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Activities {

    private List<Activity> activities = new ArrayList<>();

    public List<Report> distancesByTypes() {
        List<Report> reports = new ArrayList<>();
        double bikingDistance = 0, hikingDistance = 0, runningDistance = 0, basketballDistance = 0;

        for (Activity activity: activities) {
            switch (activity.getType()) {
                case BIKING:
                    bikingDistance += activity.getDistance();
                    break;
                case HIKING:
                    hikingDistance += activity.getDistance();
                    break;
                case RUNNING:
                    runningDistance += activity.getDistance();
                    break;
                case BASKETBALL:
                    basketballDistance += activity.getDistance();
                    break;
            }
        }
        reports.add(new Report(ActivityType.BIKING, bikingDistance));
        reports.add(new Report(ActivityType.HIKING, hikingDistance));
        reports.add(new Report(ActivityType.RUNNING, runningDistance));
        reports.add(new Report(ActivityType.BASKETBALL, basketballDistance));
        return reports;
    }

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public int numberOfWithoutTrackActivities() {
        int counter = 0;
        for (Activity activity: activities) {
            if (activity.getType() == ActivityType.BASKETBALL) {
                counter++;
            }
        }
        return counter;
    }

    public int numberOfTrackActivities() {
        int counter = 0;
        for (Activity activity: activities) {
            if (activity.getType() != ActivityType.BASKETBALL) {
                counter++;
            }
        }
        return counter;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }
}
