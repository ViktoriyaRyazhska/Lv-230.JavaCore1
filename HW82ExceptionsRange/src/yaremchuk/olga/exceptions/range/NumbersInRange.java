package yaremchuk.olga.exceptions.range;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersInRange {
	
	
	static int readNumber(int start, int end) throws MyExceptions, NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter int number ");
		int a = Integer.parseInt(br.readLine());
		
		if((a >=  start)&(a <= end)){
			return a;
		}else{
			throw new MyExceptions("Wrong number format: you out of range or entered not number character");
		}
	}
	
	public static void sortArr(int[] arr){
		int t = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i] > arr[j]){
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		int [] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			try{
				arr[i]=readNumber(1, 100);
			}catch(MyExceptions e1){
				System.err.println(e1);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		sortArr(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
