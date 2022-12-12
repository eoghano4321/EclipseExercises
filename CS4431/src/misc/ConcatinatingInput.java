package misc;

import java.util.Scanner;

public class ConcatinatingInput {
	public static void main(String[] args) throws InterruptedException {
		String question = "How satisfied are you with the module?";
		int a = 10;
		int b = 8;
		int c = 6;
		int d = 4;
		int e = 2;
		int f = 0;
		System.out.println(question);
		System.out.println("Choose one of the following: " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ".");
		Scanner in = new Scanner(System.in);
		String input = in.next();
		System.out.println("Thanks");
	}
}
