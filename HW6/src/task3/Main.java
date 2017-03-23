package task3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List< Student> students = new ArrayList<Student>();
		students.add(new Student("igor", 5));
		students.add(new Student("olya", 4));
		students.add(new Student("petya", 2));
		students.add(new Student("vasya", 2));
		students.add(new Student("stepan", 1));

		
		Student student = new Student();
		student.printStudents(students, 2);
		
		student.sortByName(students);
		
		student.sortByCourse(students);
	}

}
