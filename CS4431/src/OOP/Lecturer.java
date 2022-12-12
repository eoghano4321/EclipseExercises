package OOP;

public class Lecturer extends Person {
	private String officeLocation;
	private String[] officeHours;
	
	
	public String getOfficeLocation() {
		return officeLocation;
	}
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	public String[] getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String[] officeHours) {
		this.officeHours = officeHours;
	}
	
	
}
