package interfaces.simplethread;

import java.util.List;

public class SimpleThread implements Runnable{

    @Override
    public void run() {
        while (nextStep()) {
            nextStep();
        }
    }

    private List<String> tasks;

    public SimpleThread(List<String> tasks) {
        this.tasks = tasks;
    }

    private boolean nextStep() {
        if (tasks.size() > 0) {
            tasks.remove(tasks.size() - 1);
            return true;
        }
        return false;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
