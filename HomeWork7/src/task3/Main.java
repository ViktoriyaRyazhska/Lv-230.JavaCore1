package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter text:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		String pattern = "\\$(\\d*)(\\.\\d{0,2})?";

		Pattern pat = Pattern.compile(pattern);
		Matcher m = pat.matcher(text);

		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()) + "  ");
		}

	}

}
