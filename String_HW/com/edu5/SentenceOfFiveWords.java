package com.edu5;

import java.util.Scanner;

public class SentenceOfFiveWords {

	public static void main(String[] args){
		
		System.out.println("Please, enter the sentence of five words: ");
		
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();	
		
		String aSentence[] = sentence.split(" ");
		
		if(aSentence.length <= 1){
			System.out.println("You enter less then two words!");
		}
		
		else{
		for(int a = 0; a < aSentence.length;a++){
			int b = aSentence[a].length();
			System.out.println("Tne number of word ¹ " + (a + 1) +" is - " + b);
		}
		System.out.println();
		
		StringBuffer sbf = new StringBuffer(aSentence[1]);
        System.out.println("The second word in reverse order: " + sbf.reverse());
        System.out.println();
		
		String sort;
		
		for(int i = 0;i < aSentence.length;i++){
			for (int j = i + 1; j < aSentence.length;j++){
				if( aSentence[i].length() <  aSentence[j].length()){
					
					sort = aSentence[i];
					aSentence [i] = aSentence [j];
					aSentence[j] = sort;
				}
			}
		}
		
		System.out.println("The longest word in the sentence: " + aSentence[0]);
	}
  }
}
