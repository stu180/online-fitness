package command;

public class StandUpExercise implements Exercise {

	private FitGuy fitGuy;

	public StandUpExercise(FitGuy fitGuy) {
		this.fitGuy = fitGuy;
	}

	@Override
	public void execute() {
		fitGuy.standUp();
	}
}
