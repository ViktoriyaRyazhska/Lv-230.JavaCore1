package yaremchuk.olga.dogs;

public class DogShop {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog(2, "Fluffy", Breed.MALTESE);
		Dog dog2 = new Dog(1, "Doggy", Breed.DALMATIAN);
		Dog dog3 = new Dog(5, "Doggy", Breed.GOLDEN_RETRIEVER);
		
		if((dog1.getName().equals(dog2.getName()))|(dog1.getName().equals(dog3.getName()))|(dog2.getName().equals(dog3.getName()))){
			System.out.println("There are dogs with the same name.");
		}else{
			System.out.println("There are no dogs with the same name.");
		}
		
		if((dog1.getAge() < dog2.getAge())&(dog2.getAge() > dog3.getAge())){
			System.out.println("The oldest dog: " + dog2.getName() + " " + dog2.getBreed());
		}else{
			if(dog1.getAge() > dog3.getAge()){
				System.out.println("The oldest dog: " + dog1.getName() + " " + dog1.getBreed());
			}else{
				System.out.println("The oldest dog: " + dog3.getName() + " " + dog3.getBreed());
			}
		}
	}

}
