
import java.util.Scanner;




public class Main {
	public static void main(String[] args) {
//task1		
		int month_day[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Vvedit chislo month - ");
		
		int month = in.nextInt();
		
for (int i=0; i<=month_day.length;i++){
	if (i==month-1)
	System.out.println(month_day[i]);

}

//task2
   int [] arr ={10,-6,74,46,-7,10,5,7,4,-7};
int sum=0;
   for (int i=0; i<=4;i++){
	  if (arr[i]>=0){
			sum +=arr[i];		
     }
	  }

   System.out.println(sum);
   
   //task3
   int [] arrs = {10,7,78,97,-1};
   int i = 0;
   int pos =0;
   int min = arrs[0];
   int imin = 0;
   int j = 0;
		while (i < arrs.length) {
			if(arrs[i]>0){
				pos++;
				if(pos==2){
		System.out.println("position of second positive number - "+(i+1) );			

				}
				}
			i++;
		}
		while (j < arrs.length) {
			if (arrs[j] < min) {
				min = arrs[j];
				imin = j;
				
			}
			j++;

		}
		System.out.println("minimum "+min+" and its position in the array "+ (imin+1));
		
 //task4
		int sum1=0;
		int product=0;
		for (int a=0;a<arrs.length;a++){
			if(arrs[a]>=0){
				sum1 += arrs[a];
				product++;
				System.out.println("Organize entering integers until the first negative number - "+arrs[a]);
				}
				else if(arrs[a]<0){
					break;
				}
		
			}
		System.out.println("Count the product of all entered even numbers - "+(product+1));
		System.out.println("Suma the product of all entered even numbers - "+sum1);

			
		
		
		//task5 
		Car[] cars = new Car[4];
		cars[0] = new Car("BMW", 1994, 100);
		cars[1] = new Car("Fiat", 2001, 110);
		cars[2] = new Car("Mersedes", 2004, 120);
		cars[3] = new Car("ZAZ Forza", 2017, 40);
	System.out.println("Enter year - ");
	int year = in.nextInt();
	for (int s=0; s<cars.length; s++) {
		if (cars[s].getYear() == year) {
		
			System.out.println(cars[s]);
		}
	
	}
	in.close();

	}
	
	}
	
	
	
	
	
	

	


	

	
	
