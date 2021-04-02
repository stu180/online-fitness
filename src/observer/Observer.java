package observer;

public interface Observer {

    /**
     * Updates the exercise
     */
    void update();

    /**
     * Sets an exercise for all observers to do
     *
     * @param exercise the new exercise
     */
    void setExercise(Observable exercise);
}
