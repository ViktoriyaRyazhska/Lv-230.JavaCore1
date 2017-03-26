package qwe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
	
		
		fiveWords();
		
		
		

	}
	
	
	public static void fiveWords() throws IOException{
		
		//Enter in the console sentence of five words. 
		//display the longest word in the sentence
		//determine the number of its letters
		//bring the second word in reverse order

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter sentence of five words");
		
		String w = br.readLine();
		
		//int lenght = w.length();
		
		//w = w.replace(" ", "-");
		String [] arr = w.split(" ");
		
		int longestWord = 0;
		String word = " ";
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > longestWord) {
				longestWord = arr[i].length();
				word = arr[i];
				
			}
			
		}
		System.out.println(word+ " - is the longest Word, it long is " +longestWord);
		
		
	//	ArrayList<String> list = new ArrayList<>();
		
	//	Collections.addAll(list, arr);
		
		
		

		
		
		StringBuilder sb = new StringBuilder(arr[1]);
		
		System.out.println(sb.reverse());
		
		
		
	}

}
