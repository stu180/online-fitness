package command;

public class LayDownExercise implements Exercise {

	private FitGuy fitGuy;
	
	public LayDownExercise(FitGuy fitGuy) {
		this.fitGuy = fitGuy;
	}

	@Override
	public void execute() {
		fitGuy.layDown();
	}


}
