import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Тарас on 12.03.2017.
 */
public class Range {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number 1");
        float a = Float.parseFloat(br.readLine());
        System.out.println("Enter number 2");
        float b = Float.parseFloat(br.readLine());
        System.out.println("Enter number 3");
        float c =Float.parseFloat(br.readLine());
        if (a>= -5 & a<= 5){
            System.out.println("Number 1 belongs to the range");
        }else System.out.println("Number 1 not belong to the range");
        if (b>=-5 & b<= 5){
            System.out.println("Number 2 belongs to the range");
        }else System.out.println("Number 2 not belong to the range");
        if (c>=-5 & c<= 5){
            System.out.println("Number 3 belongs to the range");
        }else System.out.println("Number 3 not belong to the range");

    }
}
