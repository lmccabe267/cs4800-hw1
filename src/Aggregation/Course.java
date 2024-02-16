package Aggregation;

public class Course {
	private String name;
	private TextBook bookOne, bookTwo;
	private Instructor instructorOne, instructorTwo;
	
	public Course(String name) {
		this.name = name;
	}
	
	public Course(String name, TextBook bookOne, TextBook bookTwo, Instructor instructorOne, Instructor instructorTwo) {
		this.name = name;
		this.bookOne = bookOne;
		this.bookTwo = bookTwo;
		this.instructorOne = instructorOne;
		this.instructorTwo = instructorTwo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Course Name: " + name + "\n\nInstructor One: " + 
	instructorOne + "\n\nInstructor Two: " + instructorTwo + "\n\nTextbook One: " + bookOne + "\n\nTextbook Two: " + bookTwo;
	}
}
