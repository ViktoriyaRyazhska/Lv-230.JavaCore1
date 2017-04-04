package com.edu4;

import java.util.ArrayList;
import java.util.List;

import com.edu4.Student.NameComparator;
import com.edu4.Student.ÑourseComparator;

public class StudentMain {

	public void printStudents (List <Student> students, Integer course){
		        for(Student student:students){
		            if(student.getCourse()==course){
		                System.out.println(student);
		            }
		    }
	}
	
	 public static void main(String [] args){
			
			List <Student> students = new ArrayList <Student>();
			
			students.add(new Student("Andrij Artemov", 37));
			students.add(new Student("Bohdan Bodnarchyk", 28));
			students.add(new Student("Vasyl Voloshyn", 37));
			students.add(new Student("Hrygorij Hrygorenko", 37));
			students.add(new Student("Dmytro Macko", 28));
			
			System.out.println("Order students by name: ");
			
			students.sort(new NameComparator());
		    for (Student student : students) {
		        System.out.println(student);
		    }
		    
		    System.out.println();
		    System.out.println("Order students by numbers of courses: ");
		    
		    students.sort(new ÑourseComparator());
		    for (Student student : students) {
		        System.out.println(student);
		    }
	  }	
}
