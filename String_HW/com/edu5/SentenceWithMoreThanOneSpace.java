package com.edu5;

import java.util.Scanner;

public class SentenceWithMoreThanOneSpace {

	public static void main(String[] args) {
		
    System.out.println("Please, enter the sentence: ");
		
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		
		System.out.println();
		
	System.out.println("Converted sentence: " + sentence.replaceAll("\\s+", " "));

	}

}
