import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		int count = 0;
		int[] arr = new int[10];

		while (count < 10) {
		
			try {
				
				if (readNumber(1,100) != 0 ) {
					arr[count] = readNumber(1, 100);
					count++;
				}
			} catch (NumberFormatException e) {
				System.out.println("The number does not fit.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Entered number are: " + Arrays.toString(arr));
	}

	public static int readNumber(int start, int end) throws NumberFormatException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int number = in.nextInt();
		in.close();
		if (number > start || number < end) {
			System.out.println("good number");
		}

		return number;

	}

}
