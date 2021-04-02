package command;


import observer.Person;

public class FitnessInstructor extends Person {
    private static FitnessInstructor single_instance = null;


    private FitnessInstructor(String name) {
        super(name);
    }

    public static FitnessInstructor getInstance(String name) {
        if (single_instance == null) {
            single_instance = new FitnessInstructor(name);
        }
        return single_instance;
    }

    private Exercise exercise;

    public void setExercise(Exercise exercise) {
        System.out.println("Instructor shows new exercise");
        this.exercise = exercise;
    }

    public void startExercise() {
        System.out.println("Starting new exercise");
        this.exercise.execute();
    }

}
