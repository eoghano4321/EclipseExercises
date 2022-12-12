package misc;

public class TriangleChecker {
	public String check(int side1, int side2, int side3) {
		if(side1 <= 0 || side2 <= 0 || side3 <= 0) {
			return "INVALID";
		}
		if(side1 + side2 <= side3 || side1 + side3 <= side2 || side3 + side2 <= side1 ) {
			return "INVALID";
		}
		if((side1 == side2) && (side2 == side3)) {
			return "EQUILATERAL";
		}
		if((side1 == side2) || (side3 == side2) || (side1 == side3)) {
			return "ISOSCELES";
		}
		return "SCALENE";
		
	}
}
