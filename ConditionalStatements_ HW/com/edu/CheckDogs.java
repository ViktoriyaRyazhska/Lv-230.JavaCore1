package com.edu;

public class CheckDogs {
	
private  int oldestDog;

Dog dog1 = new Dog("Alfi","Affenpinscher", 5);
Dog dog2 = new Dog("Body","Cane_Corso", 6);
Dog dog3 = new Dog("Caren","Doberman_Pinscher", 10);


public void checkTheSameNames(){
if(dog1.equals(dog2) ||
   dog1.equals(dog3) || 
   dog2.equals(dog3))
{
	System.out.println("We have two dogs with the same names!");
}
}

public String checkOldestDog(){
	
	String s = null;
	
oldestDog = dog1.getAge() <= dog2.getAge() ? dog2.getAge() : dog1.getAge();
oldestDog = oldestDog <= dog3.getAge() ? dog3.getAge() :  oldestDog;

if(oldestDog == dog1.getAge()){
System.out.println(dog1.getName() + " " + dog1.getBreed());
s = "The oldest dog are first";
}

else if(oldestDog == dog2.getAge()){
System.out.println(dog2.getName() + " " + dog2.getBreed());
s = "The oldest dog are second.";
	}

else{
System.out.println(dog3.getName() + " " + dog3.getBreed());
s = "The oldest dog are third.";
}
return s;
}
	}

