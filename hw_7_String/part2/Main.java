package fdf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		//Enter a sentence that contains the words between more than one space.
		//Convert all spaces, consecutive, one. For example,
		//if we introduce the sentence "I    am      learning     Java   Core», "
			//	+ "we have to get the "I'm learning Java Core»

		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter a sentence that contains the words between more than one space");
//		
//		Pattern p = Pattern.compile("[\\s]+");
//		
//		Matcher m = p.matcher(br.readLine());
//		
//		p.matcher(br.readLine()).replaceAll(" ").trim();
		
		
    	
    	
    	String x = br.readLine();

		while(x.contains("  ")) {
		    
			String replace = x.replace("  ", " ");
		   
			x=replace;

		}
		System.out.println(x);
		
		
		
	}

}
