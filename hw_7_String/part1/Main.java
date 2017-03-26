package bvb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter");
		
		
		
		Pattern p = Pattern.compile("\\$[0-9]+(\\.\\d{0,2})?");
		
		String text = br.readLine();
		
		Matcher m = p.matcher(text);
		
		while (m.find()) {
			
			System.out.println(text.substring(m.start(), m.end()) + "  ");
		}

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
