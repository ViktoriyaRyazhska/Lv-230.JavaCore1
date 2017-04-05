package HW7;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T1 {

	 public static void main(String[] args) throws IOException {
		 
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Input US currency: ");
	        
	        String dolar = scan.nextLine();
	        
	        Pattern pattern = Pattern.compile("\\$(\\d*)(\\.\\d{0,2})?");
	        
	        Matcher matcher = pattern.matcher(dolar);

	        while (matcher.find()) {
	            System.out.print(dolar.substring(matcher.start(), matcher.end()));
	        }
	    }
}