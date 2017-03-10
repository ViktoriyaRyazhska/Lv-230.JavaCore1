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
    public static void input(){


    }

    public void changeName(){

    }

    public static void main(String[] args){
        Person p1 = new Person();
        p1.setName("Bob");
        p1.setBirthYear(1977);
        Person p2 = new Person("Jack",1985);
        Person p3 = new Person("Nick",1956);
        Person p4 = new Person("Olga",1998);
        Person p5 = new Person("Peter",1941);
        System.out.println(p1);
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
