package yuaremchuk.olga.person;

public class Person {
	private String name;
	private int birthYear;
	
	public Person(){}
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
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
	
	public int age(int bYear){
		int age = 2017 - bYear;
		return (age);
	}
	
	public void inputInfo(String name, int birthYear){
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public void outputInfo(){
		System.out.println("Name - " + getName() + " birth year - " + getBirthYear());
	}
	
	public void changeName(String newName){
		name  = newName;
	}
	
	

}
