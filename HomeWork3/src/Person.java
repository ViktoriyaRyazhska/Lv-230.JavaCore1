import java.util.Scanner;


public class Person {
private String name;
private int birthYear;
static int number = 0;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBirthYear() {
	return birthYear;
}
public void setBirthYear(int birthYear) {
	this.birthYear = birthYear;
}
public Person (){
	number++;
}
public Person(String name, int birthYear) {
	
	this.name = name;
	this.birthYear = birthYear;
	number++;
}
public int age(){
	return 2017 - birthYear;
}

Scanner in = new Scanner (System.in);
public void input() {
System.out.println("Enter information about a person (name) -");
 String name = in.nextLine();
 System.out.println("Enter information about a person (year) -");
 int year = in.nextInt();
 this.name= name;
 this.birthYear = year;
 
}

	
public void output(){
		System.out.println("Information about person");
		System.out.println("Name - "+name);
		System.out.println("Year of birth - " + birthYear);
		System.out.println("Number of years - " + age());


}
public void changeName(){

	System.out.println("Enter a new name");
	String name = in.nextLine();
            this.name = name;
	
}
@Override
public String toString() {
	return "Person [name=" + name + ", birthYear=" + birthYear + "]";
}
}
