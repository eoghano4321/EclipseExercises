package enumExercises;

public class EnumTest {
	public static void main(String[] args) {
		CompassDirections direction = CompassDirections.EAST;
		if(direction == CompassDirections.EAST) {
			System.out.println("EAST");
		}
		for(CompassDirections myDirection : CompassDirections.values()) {
			System.out.println(myDirection);
		}
	}
}
