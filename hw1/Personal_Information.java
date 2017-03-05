/**
 * Created by Тарас on 05.03.2017.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Personal_Information {
    public  static void main (String [] args)throws IOException {
        int age = 27;
        System.out.println("-------------");
        System.out.println("What is your name");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println("-------------");
        System.out.println("Where are you live " + name);
        String adress = br.readLine();
        System.out.println("-------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Adress: " + adress);
        System.out.println("-------------");
    }
}
