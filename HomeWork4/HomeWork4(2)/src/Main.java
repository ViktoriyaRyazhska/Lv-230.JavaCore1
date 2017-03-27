
public class Main {
	public static void main(String[] args) {
	Dog dog1 = new Dog("Denis", Breed.DINGO,46);
    Dog dog2 = new Dog("Rudy",Breed.GOLDEN_RETRIEVER,47);
    Dog dog3 = new Dog("Denis", Breed.WEST_SIBERIAN_LAIKA,49);
    
    
 
  
    if(dog1.getName().equals(dog2.getName())) {
       System.out.println("In the same first and second names");
       }
    
    if (dog1.getName().equals(dog3.getName())){
    	System.out.println("In the same first and third names");
    }
   
    if (dog2.getName().equals(dog3.getName())){
    	System.out.println("In the same second and third names");
    }
    
    if (dog1.getAge()>dog2.getAge()&& dog1.getAge()>dog3.getAge()){
    	System.out.println("Display the name and the kind of the oldest dog:");
    	System.out.println("Name - "+dog1.getName());
    	System.out.println("Breed - "+dog1.getBreed());
    }else    if (dog2.getAge()>dog3.getAge()){
    	System.out.println("Display the name and the kind of the oldest dog:");
    	System.out.println("Name - "+dog2.getName());
    	System.out.println("Breed - "+dog2.getBreed());
    }
    else{
    	System.out.println("Display the name and the kind of the oldest dog:");
    	System.out.println("Name - "+dog3.getName());
    	System.out.println("Breed - "+dog3.getBreed());
    }
   
    
    }
    


    
	
	}
		
	
		
	

		
	


