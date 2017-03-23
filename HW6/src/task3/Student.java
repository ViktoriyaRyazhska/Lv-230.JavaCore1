package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private int course;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(String name,int course) {
	
		this.name = name;
		this.course = course;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCourse() {
		return course;
	}


	public void setCourse(int course) {
		this.course = course;
	}


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (course != other.course)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
	
	public void printStudents (List<Student> students, int course) {
		
//		System.out.println("Enter number of course:");
//		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		// students = new ArrayList<>();
		 Iterator<Student> iterator = students.iterator();
		 while (iterator.hasNext()) {
			Student student =  iterator.next();
			if (student.getCourse()==course) {
				
				System.out.println(student);
			}
		}
	}

	public void sortByName(List<Student> students){
		
		students.sort(new CompareByName());
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	public void sortByCourse(List<Student> students){
	students.sort(new CompareByCourse());
	for (Student student : students) {
		System.out.println(student);
	}
	}
}
