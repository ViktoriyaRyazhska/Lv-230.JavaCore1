
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Solve {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Task 1 (a)
		System.out.println("Vvedit chislo");
		float a = in.nextFloat();
		float b = in.nextFloat();
		float c = in.nextFloat();
		int max;
		int min;
		if (a>=-5 && a<=5){
			System.out.println("a belongs to the range [-5,5]"+a);
		}
		if (b>=-5 && b<=5){
			System.out.println("b belongs to the range [-5,5]"+b);
		}
		if (c>=-5 && c<=5){
			System.out.println("c belongs to the range [-5,5]"+c);
		}

		
		// task1 (b)
		
		
		System.out.println("Vvedit chislo");
		int d = in.nextInt();
		int e = in.nextInt();
		int j = in.nextInt();
	

if(d>e && d>j){
    max=d;
    System.out.println("max"+max);
}


if (e>d && e>j){
	max=e;
	System.out.println("max"+max);
}

if (j>d&&j>e){
	max = j;
	System.out.println("max"+max);
}
if(d<e && d<j){
    min=d;
    System.out.println("min"+min);
}


if (e<d && e<j){
	min=e;
	System.out.println("min"+min);
}

if (j<d&&j<e){
	min = j;
	System.out.println("min"+min);
}
// task 1 (c) 
System.out.println("Vvedit number Error -");
  int number = in.nextInt();
  Errors(number);
	}

  public static void Errors(int id) {
      switch (id) {
          case 400:
              System.out.println(HTTPError.BAD_REQUEST);
              break;
          case 401:
              System.out.println(HTTPError.UNAUTHORIZED);
              break;
          case 402:
              System.out.println(HTTPError.PAYMENT_REQUIRED);
              break;
          case 403:
              System.out.println(HTTPError.FORBIDDEN);
              break;
          case 404:
              System.out.println(HTTPError.NOT_FOUND);
              break;
          case 405:
        	  System.out.println(HTTPError.METHOD_NOT_ALLOWED);
          case 406:
        	  System.out.println(HTTPError.NOT_ACCEPTABLE);
          default:
              System.out.println("Incorrect number of the error.");
              break;
	}
}
}

