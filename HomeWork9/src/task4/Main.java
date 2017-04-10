package task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Externalizable;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		List<String> text = new ArrayList<String>();

		String fileName = "file1.txt";
		String fileName2 = "file2.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;

		
		
		try {
			String s = null;
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			while ((s = br.readLine()) != null) {
				text.add(s);
			}

			for (String string : text) {
				System.out.println(string);
			}

			String str = "number of line: " + text.size() + "\n";
			
		String example="";
			for (int i = 0; i < text.size(); i++) {
					if (text.get(i).length()>example.length()) {
						example=text.get(i);
					}
					Pattern pattern = Pattern.compile("[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}");
//					Pattern pattern= Pattern.compile("dd.MM.yyyy");
					Matcher m=pattern.matcher(text.get(i));
					
					while (m.find()) {
						str=str.concat("My Name is Vasyl. Birthday is: "+ text.get(i).substring(m.start(), m.end())+"\n");
					}
			}
			System.out.println(example);
			str=str.concat("the longest line is :"+example);

			
					
			fw = new FileWriter(fileName2);
			bw = new BufferedWriter(fw);
			bw.write(str);
			
			
			
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
