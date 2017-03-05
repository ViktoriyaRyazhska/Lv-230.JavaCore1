package qwe.rty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("enter radius");
		

		int r = Integer.parseInt(br.readLine());
		double p;
		/*double pi=3.1415;*/
		
		double s;
		
		s= Math.PI*(r*r);
		p= (2*Math.PI)*r;
		
		System.out.println("area"+ " is"+" " + s);
		
		
		System.out.println("perimeter"+" "+ " is"+" "+p);
		
		
		System.out.println("What is your name?" );
		
		String name = br.readLine();

		System.out.println("Where are you live" + " " + name + "?"); 
		
		String live = br.readLine();
		
		System.out.println("nice to meet you" +" "+ name+ " " + "from"+ " " + live);
		
		double c1 = 1;
		double c2 = 2;
		double c3 = 3;
		
		
		
		System.out.println("Let's calculate how much you talk on the phone");
		System.out.println("What the duration of the call in Germany?");
		Double t1 = Double.parseDouble(br.readLine());
		
		System.out.println("What the duration of the call in USA?");
		Double t2 = Double.parseDouble(br.readLine());
		
		System.out.println("What the duration of the call in Poland?");
		Double t3 = Double.parseDouble(br.readLine());
		
		double man1 = c1*t1;
		double man2 = c2*t2;
		double man3 = c3*t3;
		double man4 = man1+man2+man3;
		
		
		
		System.out.println("the cost of calls to Germany" +" "+ man1 +"$");
		System.out.println("the cost of calls to USA" +" "+ man2 +"$");
		System.out.println("the cost of calls to Poland" +" "+ man3 +"$");
		System.out.println("the cost of all calls" +" "+ man4 +"$");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
