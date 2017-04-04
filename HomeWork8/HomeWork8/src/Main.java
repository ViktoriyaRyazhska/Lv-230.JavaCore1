import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] arrs = new String[5];
		System.out.println("Enter five different words");
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = in.nextLine();
			sum += arrs[i].length();

			if (arrs[i].length() > count) {
				count = arrs[i].length();

			}

		}

		for (String sentence : arrs) {
			if (sentence.length() == count) {
				System.out.println("Most word - " + sentence);
			}
		}
		System.out.println("The sum of all letters = " + sum);
		System.out.println("The second word in reverse order =  " + new StringBuilder(arrs[1]).reverse());
	}
}
