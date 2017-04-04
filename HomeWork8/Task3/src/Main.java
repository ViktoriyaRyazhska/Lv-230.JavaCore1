import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number - ");
		String course = in.nextLine();
		Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
		Matcher m = p.matcher(course);
		in.close();
		while (m.find()) {
			System.out.print(course.substring(m.start(), m.end()));
		}
	}
}
