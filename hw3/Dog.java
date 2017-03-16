import java.io.IOException;

public class Dog {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    private Breed breed;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public Dog() {

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\t' +
                ", breed=" + breed +'\t'+
                ", age=" +'\t'+ age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (age != dog.age) return false;
        if (!name.equals(dog.name)) return false;
        return breed == dog.breed;

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + breed.hashCode();
        result = 31 * result + age;
        return result;
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public static void main(String[] args) throws IOException {
        Breed breed = null;
        Dog dog1 = new Dog("Sharik", breed.Airedale_Terrier, 5);
        Dog dog2 = new Dog("Rex", breed.Bolognese, 7);
        Dog dog3 = new Dog("Cesar", breed.Chihuahua, 11);
        if (dog1.equals(dog2) || dog1.equals(dog3)) {
            System.out.println("Two dogs have the same names");
        } else if (dog2.equals(dog3)) {
            System.out.println("Two dogs have the same names");
        } else {
            System.out.println("All dogs have the different names");
        }
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        if (dog1.getAge()>dog2.getAge()& dog1.getAge()>dog3.getAge()){
            System.out.println("The oldest dog is"+'\t'+dog1.getBreed()+'\t'+"Called"+'\t'+dog1.getName());
        }else  if (dog2.getAge()>dog3.getAge()) {
            System.out.println("The oldest dog is" + '\t' + dog2.getBreed() + '\t' + "Called:" + '\t' + dog2.getName());
        }else {System.out.println("The oldest dog is" + '\t' + dog3.getBreed() +
                '\t' + "Called" + '\t' + dog3.getName());}
    }
}