package misc;

public class CharacterAt {
	public static void main(String[] args) {
		String stringVar = "This food";
		String stringVar2 = " is bad";
		
		char firstInitial = stringVar.charAt(7);
		
		System.out.println(firstInitial);
		System.out.println(stringVar.concat(stringVar2));
		System.out.println(1 + stringVar);
	}
}
