import java.util.Scanner;
public class Personal_information{
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("What is you name?");
        String name = in.next();
        System.out.println("How old are you?");
        int age = in.nextInt();
        System.out.println("where you live?");
        String adress = in.next();
        System.out.println("Personal information:");
        System.out.println("Name - " + name);
        System.out.println("Age - "+ age);
        System.out.println("Adress - "+adress);
    }
}