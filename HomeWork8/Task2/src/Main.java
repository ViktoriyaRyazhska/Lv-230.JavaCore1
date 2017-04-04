
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter type sentence");
		String contains = in.nextLine();
	  in.close();
	     System.out.println(contains.replaceAll(" +", " "));

		
	}
}


