package yaremchuk.olga.university.project;

public class Student extends Person{
	
	private boolean isExcellent;
	private int grade;
	
	public Student(String name, String surName, int age, boolean isExcellent,
			int grade) {
		super(name, surName, age);
		this.isExcellent = isExcellent;
		
		
		if (isExcellent == true){
			makeRating(grade);
			System.out.println("Name: " + name + " Surname: " + surName + " Age: " + age + " Grade: " + grade);
		}else{
			System.out.println("This student is not an excellent student");
		}
	}
	
	
	public boolean isExcellent() {
		return isExcellent;
	}
	public void setIsExcellent(boolean isExcellent) {
		this.isExcellent = isExcellent;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	
	
	public void makeRating(int grade){
		
		if (grade > 98){
			System.out.println(getName() + " is one of the best student! Congradulation!!!");
		}else{
			this.grade = grade;
		}
		
		
	}

}
