import java.util.Scanner;

/**
 * Created by Andriy on 11.03.2017.
 */
public class Call {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("The number of conventional units of the country c1");
        double c1 = in.nextDouble();
        System.out.println("The number of minutes of talks t1");
        double t1 = in.nextDouble();
        System.out.println("The number of conventional units of the country c2");
        double c2 = in.nextDouble();
        System.out.println("The number of minutes of talks t2");
        double t2 = in.nextDouble();
        System.out.println("The number of conventional units of the country c3");
        double c3 = in.nextDouble();
        System.out.println("The number of minutes of talks t3");
        double t3 = in.nextDouble();
        double challenge1 = c1*t1;
        double challenge2 = c2*t2;
        double challenge3 = c3*t3;
        double total = challenge1 + challenge2 + challenge3;
        System.out.println("The price of the first call - "+ challenge1+" cents");
        System.out.println("The price of the second call - "+ challenge1+" cents");
        System.out.println("The price of the third call - "+ challenge3+" cents");
        System.out.println("Price all calls - "+ total+" cents");


    }
}
