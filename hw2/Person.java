import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Тарас on 09.03.2017.
 */
 class Person {
    private String name;
    private int birthYear;
    public String n;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int getBirthYear() {
        return birthYear;
    }

    public void Age() {
        int m = 2017 - birthYear;
        System.out.println(name + '\t' +m);
    }

    public Person() {

    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\t' +
                ", birthYear=" + birthYear +
                '}';
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public  void input()throws IOException{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the name");
          this.name = br.readLine();
          System.out.println("Enter the year of birth");
          this.birthYear = Integer.parseInt(br.readLine());

    }

    public void changeName(String name)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a new name");
        this.name = br.readLine();
         this.name = name;
    }

    public static void main(String[] args)throws IOException {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        p1.input();
        p2.input();
        p3.input();
        p4.input();
        p5.input();
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        p1.Age();
        p2.Age();
        p3.Age();
        p4.Age();
        p5.Age();

    }
}
