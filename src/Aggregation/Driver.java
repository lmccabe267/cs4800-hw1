package Aggregation;

public class Driver {
	public static void main(String[] args) {
		TextBook bookOne = new TextBook("Clean Code", "Liam McCabe", "Scholastic");
		TextBook bookTwo = new TextBook("Dirty Code", "Bob Smith", "Library Books");
		Instructor instructorOne = new Instructor("Dima", "Davarpanah", "3-2636");
		Instructor instructorTwo = new Instructor("Keivan", "Navi", "8-325");
		Course course = new Course("Software Engineering", bookOne, bookTwo, instructorOne, instructorTwo);
		System.out.println(course);
	}
}
