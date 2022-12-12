package misc;

import java.util.Scanner;

public class ReadingString {
	public static void main(String[] args) {
		double GPA = 3.4;
		String firstName = "Steve";
		String lastName = "Jobs";
		System.out.println(firstName + " " + lastName + " has a GPA of "+ GPA);
		System.out.println("What do you want to update it to?");
		Scanner input = new Scanner(System.in);
		GPA = input.nextDouble();
		
		System.out.println(firstName + " " + lastName + " has a new GPA of "+ GPA);
	}
}
