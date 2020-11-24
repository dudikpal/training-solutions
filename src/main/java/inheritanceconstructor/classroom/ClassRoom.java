package inheritanceconstructor.classroom;

public class ClassRoom extends Room{

    private Facility facility;

    public ClassRoom(String location, int capacity, Facility facility) {
        super(location, capacity);
        this.facility = facility;
    }

    public boolean isSuitable(Course course) {
        if (super.getCapacity() < course.getParticipants() || !getFacility().equals(course.getFacilityNeeded())) {
            return false;
        }
        return true;
    }

    public Facility getFacility() {
        return facility;
    }
}
