package observer;

import command.ExercisePosition;

public interface Observable {
    void subscribe(Observer... exerciseSubscriber);
    void unsubscribe(Observer... exerciseSubscriber);
    void notifyObservers();
    ExercisePosition getUpdate();
}
