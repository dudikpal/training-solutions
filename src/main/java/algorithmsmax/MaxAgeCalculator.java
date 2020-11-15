package algorithmsmax;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer trainerWithMaxAge(List<Trainer> trainers) {
        Trainer oldestTrainer = null;
        for (Trainer trainer: trainers) {
            if (oldestTrainer == null || trainer.getAge() > oldestTrainer.getAge()) {
                oldestTrainer = trainer;
            }
        }
        return oldestTrainer;
    }
}
