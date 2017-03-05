import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Тарас on 05.03.2017.
 */

public class PhoneCall {
    public static  void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("----------------------------------------------------");
        System.out.println("Enter the price of first call per minute");
        int c1 = Integer.parseInt(br.readLine());
        System.out.println("----------------------------------------------------");
        System.out.println("Enter the time of a call");
        int t1 = Integer.parseInt(br.readLine());
        System.out.println("----------------------------------------------------");
        System.out.println("Enter the price of second call per minute");
        int c2 = Integer.parseInt(br.readLine());
        System.out.println("----------------------------------------------------");
        System.out.println("Enter the time of a call");
        int t2 = Integer.parseInt(br.readLine());
        System.out.println("----------------------------------------------------");
        System.out.println("Enter the price of third call per minute");
        int c3 = Integer.parseInt(br.readLine());
        System.out.println("----------------------------------------------------");
        System.out.println("Enter the time of a call");
        int t3 = Integer.parseInt(br.readLine());
        System.out.println("----------------------------------------------------");
        int m = c1*t1;
        int n = c2*t2;
        int k = c3*t3;
        int l = m+n+k;
        System.out.println("Cost of 1 call "+m);
        System.out.println("Cost of 2 call "+n);
        System.out.println("Cost of 3 call "+k);
        System.out.println("Cost of all calls "+l);
        System.out.println("----------------------------------------------------");
    }
}

