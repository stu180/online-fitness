import command.*;
import observer.ExerciseSubscriber;
import observer.Observer;

public class WorkOutMain {

    public static void main(String[] args) {
        FitnessInstructor fitnessInstructor = FitnessInstructor.getInstance("Ivan");
        FitGuy fitGuy = new FitGuy("Petar");
        Exercise standUpExercise = new StandUpExercise(fitGuy);
        Exercise layDownExercise = new LayDownExercise(fitGuy);

        Observer obs1 = new ExerciseSubscriber("Fitness maniac 01");
        Observer obs2 = new ExerciseSubscriber("Fitness maniac 02");
        Observer obs3 = new ExerciseSubscriber("Fitness maniac 03");

        fitGuy.subscribe(obs1, obs2, obs3);


        fitnessInstructor.setExercise(standUpExercise);
        fitnessInstructor.startExercise();

        fitnessInstructor.setExercise(layDownExercise);
        fitnessInstructor.startExercise();

        fitGuy.unsubscribe(obs1, obs2, obs3);

        System.out.println("Exercise over");
    }
}
