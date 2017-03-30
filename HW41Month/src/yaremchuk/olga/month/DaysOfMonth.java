package yaremchuk.olga.month;

import java.util.Scanner;

public class DaysOfMonth {
	public static void main(String[] args) {
		
		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //amount of days in the mounth
		int mounthNumb; //mounth number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the number of month.");
		mounthNumb = Integer.parseInt(sc.nextLine());
		
		if ((mounthNumb > 0)&(mounthNumb < 13)){
			System.out.println("There are " + days[mounthNumb-1] + " in the month number " + mounthNumb);
		}else{
			System.out.println("Wrong number, there is no such number of month.");
		}
		
	}

}
