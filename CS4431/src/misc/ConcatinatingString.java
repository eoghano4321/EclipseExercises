package misc;

import java.util.Scanner;

public class ConcatinatingString {
	public static void main(String[] args) {
		String question = "How helpful is the video?";
		String choice1 = "Very";
		String choice2 = "Slightly";
		String choice3 = "Not Very";
		System.out.println(question);
		System.out.println("Choose one of the following: " + choice1 + "; " + choice2 + "; " + choice3 + ".");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		if(choice1.toLowerCase().equals(input.toLowerCase())) {
			System.out.println("Thanks alot");
		}else {
			System.out.println("Why bad?");
		}
		Scanner scanner2 = new Scanner(System.in);
		String input2 = scanner2.next();
		System.out.println("Thank you for your feedback: " + input2);
	}
	
}
