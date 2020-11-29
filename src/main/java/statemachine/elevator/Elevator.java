package statemachine.elevator;

import java.util.ArrayList;
import java.util.List;

public class Elevator {

    private Direction direction;
    private boolean calledOnGroundFloor;
    private boolean calledOnFirstFloor;
    private ElevatorState state;
    private List<String> history = new ArrayList<>();

    public Elevator() {
        // GFO alapállapotba állítja
        setState(new GroundFloorOpen(this));
        calledOnGroundFloor = false;
        calledOnFirstFloor = false;
        direction = Direction.NONE;
    }

    public Elevator(ElevatorState state) {
        // a paraméterként átadott állapotba állítja
        setState(state);
        calledOnGroundFloor = false;
        calledOnFirstFloor = false;
        direction = Direction.NONE;
    }

    public void work() {
        while (direction != Direction.NONE) {
            state.changeState(this);
        }
    }

    public void pushCallButtonOnFirstFloor() {
        calledOnFirstFloor = true;
        // ha áll, csak akkor állítja a directiont
        if (direction == Direction.NONE) {
            direction = Direction.UP;
        }
    }

    public void pushCallButtonOnGroundFloor() {
        calledOnGroundFloor = true;
        if (direction == Direction.NONE) {
            direction = Direction.DOWN;
        }
    }

    public void pushButtonToGoToFirstFloor() {
        if (state.getStateInfo().equals("Ground Floor Open")) {
            direction = Direction.UP;
        }
    }

    public void pushButtonToGoToGroundFloor() {
        if (state.getStateInfo().equals("First Floor Open")) {
            direction = Direction.DOWN;
        }
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public boolean isCalledOnGroundFloor() {
        return calledOnGroundFloor;
    }

    public void setCalledOnGroundFloor(boolean calledOnGroundFloor) {
        this.calledOnGroundFloor = calledOnGroundFloor;
    }

    public boolean isCalledOnFirstFloor() {
        return calledOnFirstFloor;
    }

    public void setCalledOnFirstFloor(boolean calledOnFirstFloor) {
        this.calledOnFirstFloor = calledOnFirstFloor;
    }

    public ElevatorState getState() {
        return state;
    }

    public void setState(ElevatorState state) {
        history.add(state.getStateInfo());
        this.state = state;
    }

    public String getHistory() {
        return history.toString();
    }
}
