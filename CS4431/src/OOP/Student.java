package OOP;

import java.time.format.DateTimeFormatter; 
import java.time.LocalDateTime;  

public class Student extends Person {
	private String favouriteModule;
	private String favouriteTA;
	private String schedule;
	public String course;
	
	public String getFavouriteModule() {
		return favouriteModule;
	}
	public void setFavouriteModule(String favouriteModule) {
		this.favouriteModule = favouriteModule;
	}
	public String getFavouriteTA() {
		return favouriteTA;
	}
	public void setFavouriteTA(String favouriteTA) {
		this.favouriteTA = favouriteTA;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String toString(int input) {
		return Integer.toString(input);
	}
	
	public Boolean shouldBeInClass() {  
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH");
		LocalDateTime now = LocalDateTime.now();  
		int timeAsInt = Integer.parseInt(formatter.format(now));
		if(timeAsInt <= 15 && timeAsInt >= 9) {
			return true;
		}else {
			return false;
		}
	}
	
}
