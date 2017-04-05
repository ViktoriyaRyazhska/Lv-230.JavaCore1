package edu6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadContextAboutCareer {

	public static void main(String[] args) {
		
        List<String> ListOfStrings = new ArrayList<>();
        String sCurrentLine;
        try (BufferedReader reader = new BufferedReader(new FileReader("src\\edu6\\file1.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src\\edu6\\file2.txt"))){

            while ((sCurrentLine = reader.readLine()) != null) {
            	ListOfStrings.add(sCurrentLine);
            }
            writer.write(ListOfStrings.size()+" - number of lines in file1.txt \n");
            writer.write(longestString(ListOfStrings)+'\n');
            writer.write("Hredil Orest, 20.07.1990");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String s:ListOfStrings){
            System.out.println(s);
        }
    }
    private static String longestString(List<String> strings){
        String longestString = strings.get(0);
        for(String s:strings){
            if(s.length()>longestString.length()) longestString = s;
        }
        return longestString;
    }
}
