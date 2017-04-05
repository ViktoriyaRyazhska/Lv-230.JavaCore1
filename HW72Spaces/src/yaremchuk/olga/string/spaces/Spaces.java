package yaremchuk.olga.string.spaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spaces {
	public static void main(String[] args) throws IOException {
		
		String text;
		String newText;
		String character;
		int count = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter tentence with many spaces ");
		text = br.readLine();
		
		newText = (text.trim()).substring(0, 1);
		
		for (int i = 1; i < text.length(); i++) {
			character = text.substring(i, i+1);
			if (character.equals(" ")){
				count++;
				if (count <= 1){
					newText += character;
				}
			}else{
				count = 0;
				newText += character;
			}
			
			
		}
		System.out.println(newText);
	}

}
