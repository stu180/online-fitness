package command;

import observer.Observable;
import observer.Observer;
import observer.Person;

import java.util.ArrayList;
import java.util.List;

public class FitGuy extends Person implements Observable {
    public FitGuy(String name) {
        super(name);
        this.observers = new ArrayList<>();
    }

    private final List<Observer> observers;

    private ExercisePosition exercisePosition;

    public void standUp() {
        System.out.println("Starts going Up");
        this.exercisePosition = ExercisePosition.Up;
        this.notifyObservers();
    }

    public void layDown() {
        System.out.println("Starts going Down");
        this.exercisePosition = ExercisePosition.Down;
        this.notifyObservers();
    }


    @Override
    public void subscribe(Observer... exerciseSubscriber) {
        for (Observer observer : exerciseSubscriber) {
            this.observers.add(observer);
            observer.setExercise(this);
        }
    }

    @Override
    public void unsubscribe(Observer... exerciseSubscriber) {
        for (Observer observer : exerciseSubscriber) {
            this.observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

    public ExercisePosition getExercise() {
        return this.exercisePosition;
    }

    @Override
    public ExercisePosition getUpdate() {

        return this.getExercise();
    }
}
