package ghgf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		//---Task 4
		
		List<String> arr = new ArrayList<String>();

		String fileName = "file1.txt";
		String fileName2 = "file2.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			
			String str = null;
			
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			while ((str = br.readLine()) != null) {
				arr.add(str);
			}

			
			
			String str2 = "number: " + arr.size() + "\n";
		
			String str3="";
			for (int i = 0; i < arr.size(); i++) {
					if (arr.get(i).length()>str3.length()) {
						str3 = arr.get(i);
					}
					Pattern p = Pattern.compile("[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}");

					Matcher m = p.matcher(arr.get(i));
					
					while (m.find()) {
						str2 =str2 + ("My Name is Sergii and my birthday is: "+ arr.get(i).substring(m.start(), m.end())+"\n");
					}
			}
			
			System.out.println(str3);
			
			str2 = str2 + ("the longest line is :"+ str3);

			
					
			fw = new FileWriter(fileName2);
			bw = new BufferedWriter(fw);
			bw.write(str2);
			
			
			
			bw.close();
			br.close();
		
		
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
