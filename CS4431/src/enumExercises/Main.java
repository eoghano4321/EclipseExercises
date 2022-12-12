package enumExercises;

public class Main {
	public static void main(String[] args) {
		MathHelper helper = new MathHelper(100);
		
		try {
			while(true) {
				float input = helper.doMath("Enter a number: ", Operators.DIVIDE);
				float total = helper.getTotal();
				String message = String.format(
					"Entered: %f, total = %f", input, total
				);
				System.out.println(message);
			}
		}
		catch(NumberFormatException e){
			System.out.println("Done");
		}
	}
}
