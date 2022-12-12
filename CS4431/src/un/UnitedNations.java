package un;

import enumExercises.InputHelper;

public class UnitedNations {
	public static void main(String[] args) {
		Country country = new Country();
		String input = InputHelper.getInput("Where are you? ").toUpperCase();
		
		Countries output = Countries[input];
		
		country.weather(output);
		
		
	}
	
}
