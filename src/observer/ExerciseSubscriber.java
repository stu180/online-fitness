package observer;

import command.ExercisePosition;

public class ExerciseSubscriber extends Person implements Observer {

    private Observable exercise;

    public ExerciseSubscriber(String name) {
        super(name);
    }

    @Override
    public void update() {

        if (exercise == null) {
            System.out.println(this.getName() + " has nothing to exercise");
            return;
        }

        ExercisePosition newExercise = exercise.getUpdate();
        System.out.println(this.getName() + ": received new exercise: " + newExercise);
    }

    @Override
    public void setExercise(Observable exercise) {
        this.exercise = exercise;
    }


}
