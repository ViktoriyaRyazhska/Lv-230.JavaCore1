package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		// display the longest word in the sentence

		System.out.println("Enter text:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();

		String t[] = text.split(" ");
		int max = 0;
		int j = 0;
		for (int i = 0; i < t.length; i++) {
			if (!t[i].isEmpty()) {
				if (t[i].length() > max) {
					max = t[i].length();
					j = i;

				}

			}
		}

		System.out.println(t[j]);

		// determine the number of its letters

		for (int i = 0; i < t.length; i++) {
			if (!t[i].isEmpty()) {
				System.out.print(t[i].length() + " ");
			}
		}

		// bring the second word in reverse order

		for (int i = 0; i < t.length; i++) {
			if (!t[i].isEmpty()) {
			
				System.out.println();
				StringBuilder sb = new StringBuilder(t[1]);
				System.out.println(sb.reverse().toString());
				break;
			}
		}

	}

}
