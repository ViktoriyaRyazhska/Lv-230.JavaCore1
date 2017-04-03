package HHT;
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException {
		
		Person person= new Person();
		person.input();
		
		person.output();
		
		person.age(2011);
		
		Person person2 = new Person("JOHN", 1999);
		person2.output();
		person2.age(2017);
		
		person2.changeName();
		
		person2.output();
		

	}

}
