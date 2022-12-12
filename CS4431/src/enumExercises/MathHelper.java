package enumExercises;



public class MathHelper {
	
	private float total;
	
	public MathHelper(float total) {
		this.total += total;
	}
	
	public float getTotal() {
		return total;
	}
	
	public float doMath(String prompt, Operators operation) throws NumberFormatException{
		String input = InputHelper.getInput(prompt);
		float value = Float.parseFloat(input);
		
		switch(operation) {
			case ADD:
				total += value;
				break;
			case SUBTRACT:
				total -= value;
				break;
			case DIVIDE:
				total /= value;
				break;
			case MULTIPLY:
				total *= value;
				break;
		}
		
		return value;
	}
}
