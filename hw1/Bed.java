/**
 * Created by Тарас on 05.03.2017.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bed {
    public static void main ( String [] args)throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is the radius of a circle");
        int radius = Integer.parseInt (br.readLine());
        double perimeter = 2*3.14*radius;
        System.out.println("Perimeter is "+ perimeter);
        double area = 3.14*radius*radius;
        System.out.println("Area is "+ area);
    }
}
