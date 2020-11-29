package statemachine.elevator;

public class GroundFloorOpen implements ElevatorState{

    public GroundFloorOpen(Elevator elevator) {
        // GFO esetén nem veszi figyelembe a GF hívógombot
        elevator.setCalledOnGroundFloor(false);

        if (elevator.isCalledOnFirstFloor()) {
            elevator.setDirection(Direction.UP);
        }
        // ha most jött le FF-ről, és nincs UP hívás, akkor NONE, hogy a work() leálljon
        if (elevator.getDirection() == Direction.DOWN) {
            elevator.setDirection(Direction.NONE);
        }
    }

    @Override
    public void changeState(Elevator elevator) {
        elevator.setState(new GroundFloorClosed());
    }

    @Override
    public String getStateInfo() {
        return "Ground Floor Open";
    }
}
