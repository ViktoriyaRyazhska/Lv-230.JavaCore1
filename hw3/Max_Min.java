import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Тарас on 12.03.2017.
 */
public class Max_Min {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number 1");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter number 2");
        int b = Integer.parseInt(br.readLine());
        System.out.println("Enter number 3");
        int c = Integer.parseInt(br.readLine());
        if (a>b & a>c & b>c ){
            System.out.println("The maximal value is"+'\t'+a+'\n'+"The minimal value is"+'\t'+c);
        }
        if (a>b & a>c & b<c ){
            System.out.println("The maximal value is"+'\t'+a+'\n'+"The minimal value is"+'\t'+b);
        }
        if (b>a & b>c & a>c){
            System.out.println("The maximal value is"+'\t'+b+'\n'+"The minimal value is"+'\t'+c);
        }
        if (b>a & b>c & a<c){
            System.out.println("The maximal value is"+'\t'+b+'\n'+"The minimal value is"+'\t'+a);
        }
        if (c>a &c>b & a>b ){
            System.out.println("The maximal value is"+'\t'+c+'\n'+"The minimal value is"+'\t'+b);
        }
        if (c>a &c>b & a<b ){
            System.out.println("The maximal value is"+'\t'+c+'\n'+"The minimal value is"+'\t'+a);
        }
        if (a==b & a==c & b==c ){
            System.out.println("The values are equal");
        }
        if (a==b & a>c){
           System.out.println("The values"+'\t'+a+'\t'+"and"+'\t'+b+'\t'+"are equal ,"+'\t'+"the minimal is"+'\t'+c);
        }
        if (b==c & b>a) {
            System.out.println("The values" + '\t' + b + '\t' + "and" +
                    '\t' + c + '\t' + "are equal ," + '\t' + "the minimal is" + '\t' + a);
        }
        if (a==c & a>b ){
            System.out.println("The values" + '\t' + b + '\t' + "and" +
                    '\t' + c + '\t' + "are equal ," + '\t' + "the minimal is" + '\t' + a);
        }
        if (a==b & a<c){
            System.out.println("The values"+'\t'+a+'\t'+"and"+'\t'+b+'\t'+"are equal ,"+'\t'+"the maximal is"+'\t'+c);
        }
        if (b==c & b<a) {
            System.out.println("The values" + '\t' + b + '\t' + "and" +
                    '\t' + c + '\t' + "are equal ," + '\t' + "the maximal is" + '\t' + a);
        }
        if (a==c & a<b ){
            System.out.println("The values" + '\t' + b + '\t' + "and" +
                    '\t' + c + '\t' + "are equal ," + '\t' + "the maximal is" + '\t' + a);
        }
    }
}