package yaremchuk.olga.string.words;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Words {
	
	public static void main(String[] args) throws IOException {
		
		String text;
		String character;
		String maxWord = null;
		String maxWord2 = null;
		String reverse;
		int firstCh1=0;
		int lastCh1=0;
		int length = 0;
		int max = 0;
		int max2 = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 5 words ");
		text = br.readLine();
		
		for (int i = 0; i <text.length(); i++) {
			character = text.substring(i, i+1);
			if (character.equals(" ")){
				lastCh1 = i-1;
				length = lastCh1 - firstCh1 + 1;
				
				
				if (max < length){
					max = length;
					maxWord = text.substring(firstCh1, (lastCh1+1));
				}else{
					if (max2 < length){
						max2 = length;
						maxWord2 = text.substring(firstCh1, (lastCh1+1));
					}
				}
				
				firstCh1 = i+1;
			}else{
				if(i == (text.length()-1)){
					lastCh1 = i;
					length = lastCh1 - firstCh1 + 1;
					
					if (max < length){
						max = length;
						maxWord = text.substring(firstCh1, (lastCh1+1));
					}else{
						if (max2 < length){
							max2 = length;
							maxWord2 = text.substring(firstCh1, (lastCh1+1));
						}
					}
				}
				
			}
			
		}	
		reverse = maxWord2.substring(0, 1);
		for (int i = 1; i <maxWord2.length(); i++) {
			reverse = maxWord2.substring(i, i+1) + reverse;
		}
		
		System.out.println("The are letters in the logest word: " + max);
		System.out.println("The longest word: " + maxWord);
		System.out.println("Reverse of the second longest word: " + reverse);
		
	}

}
