package statemachine.elevator;

public class FirstFloorOpen implements ElevatorState{

    public FirstFloorOpen(Elevator elevator) {
        // FFO esetén nem veszi figyelembe a GF hívógombot
        elevator.setCalledOnFirstFloor(false);

        if (elevator.isCalledOnGroundFloor()) {
            elevator.setDirection(Direction.DOWN);
        }
        // ha most jött fel GF-ről, és nincs DOWN hívás, akkor NONE, hogy a work() leálljon
        if (elevator.getDirection() == Direction.UP) {
            elevator.setDirection(Direction.NONE);
        }
    }

    @Override
    public void changeState(Elevator elevator) {
        elevator.setState(new FirstFloorClosed());
    }

    @Override
    public String getStateInfo() {
        return "First Floor Open";
    }
}
