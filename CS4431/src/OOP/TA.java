package OOP;

public class TA extends Person {
	private String enrolledAs;
	private String[] officeHours;
	
	public String getEnrolledAs() {
		return enrolledAs;
	}
	public void setEnrolledAs(String enrolledAs) {
		this.enrolledAs = enrolledAs;
	}
	public String[] getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String[] officeHours) {
		this.officeHours = officeHours;
	}
	
	public String toString(int input) {
		return Integer.toString(input);
	}
	
	public Boolean isAvailable(int time) {
		if(time > 9) {
			return true;
		}
		else {
			return false;
		}
	}
}
