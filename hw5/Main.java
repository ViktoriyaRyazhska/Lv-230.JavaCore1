package edf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//-----------Ask user to enter the number of month.
				//Read the value and write the amount of days in this month
				//(create array with amount days of each month).
		
//		Main.choose();

		
		//-----Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.

	
//		Main.Calc();
		
		//--------Enter 5 integer numbers. Find 
		//position of second positive number;
		//minimum and its position in the array.
		
//		Main.Next();
		
//		Main.minV();
		
		
		//-----Organize entering integers until the first
		//negative number. Count the product of all entered even numbers.

		
//		FirstNegative();
		
		
		Car[] car = new Car[4];

		car[0] = new Car("volvo",2011, 2400);
		car[1] = new Car("mersedes",2000, 3000);
		car[2] = new Car("kia",2013, 1200);
		car[3] = new Car("opel",2005, 1900);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter year of car: ");
		int year = Integer.parseInt(br.readLine());

		for (int i = 0; i < car.length; i++) {
			if (year == car[i].getYearOfProdact()) {
				System.out.println(car[i]);
			}
		}
		
	
		
	Car sort;
		
		for (int i = 0; i < car.length-1; i++) {
			for (int j = i+1; j < car.length; j++) {
				if (car[i].getYearOfProdact()<car[j].getYearOfProdact()) {
					sort=car[i];
					car[i]=car[j];
					car[j]=sort;
					
				}
			}
		}
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}

	

	
	
	
	
	
	
	
	
	
	
	
	
	//-----------Ask user to enter the number of month.
			//Read the value and write the amount of days in this month
			//(create array with amount days of each month).

//	public static void choose() throws NumberFormatException, IOException{
	
	
		

		
		
//	int[] MounthDay = {31, 28, 31, 30, 31, 30, 
//			31, 31, 30, 31, 30, 31} ;
//	
//	BufferedReader br = new BufferedReader
//			(new InputStreamReader(System.in));
//	
//	System.out.println("Enter number of mounth");
//	
//	int n = Integer.parseInt(br.readLine());
//	
//	
//	for(int i = 0; i < MounthDay.length; i++){
//		
//		if(i == n-1){
//			
//			System.out.println(MounthDay[i]);
//			
//		}
//		
//	
//	}
	//}
	
	
	
	
	
	
	
	//-----------Enter 10 integer numbers. Calculate the sum of first 5 elements 
    // they are positive or product of last 5 element in the other case.
	
//	public static void Calc(){
		
		
		
//		
//		int [] c = {1,3,5,7,9,5,4,2,23,31};
//		int sum = 0;
//		
//		for(int i = 0 ; i <= 4 ; i++ ){
//			if(c[i] > 0){
//				sum = sum + c[i];
//			}
//			
//		}
//		System.out.println(sum);
//	}
	
	
	
	//--------------------------Enter 5 integer numbers. Find 
	//position of second positive number;
	//minimum and its position in the array.

	
//	public static void Next() throws NumberFormatException, IOException{
//		
//		BufferedReader br = new BufferedReader
//				(new InputStreamReader(System.in));
//		
//		
//		int [] nex = new int[5];
//		int position = 0;
//		
//		System.out.println("Enter 5 numbers by Enter");
//		for (int i = 0; i < nex.length; i++) {
//			nex[i] = Integer.parseInt(br.readLine());
//		}
//
//		for (int i = 0; i < nex.length; i++) {
//
//			if (nex[i] > 0) {
//				position++;
//				
//				if (position == 2) {
//					System.out.println("position is " + i);
//				}
//			}
//
//		}
//
//	
//	}
//		
//	public static void minV() throws NumberFormatException, IOException {
//		int[] arr = new int[5];
//		int min = arr[0];
//		int min1 = 0;
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter 5 numbers by Enter");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < min) {
//				min = arr[i];
//				min1 = i;
//			}
//		}
//		System.out.println("minimum is   " + min +"  "+ "position is " + min1);
//	}

		
	//-------Organize entering integers until the first negative number.
	//Count the product of all entered even numbers.
	
	
//	public static void FirstNegative() throws NumberFormatException, IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int[] arr = new int[5];
//		int count = 0;
//		
//		System.out.println("Enter 5 numbers by Enter");
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//			if (arr[i] < 0) {
//				System.out.println("Stop, you enter negativ number");
//				break;
//				
//			}
//			
//		} 
//	
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				count++;
//			}
//
//		}
//		System.out.println("count of all entered even numbers is " + count);
	
	
	
	
		
	
	
	
	
	
	
	}
}
