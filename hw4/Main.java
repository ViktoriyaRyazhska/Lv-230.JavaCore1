package rer.jhh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		//----------------------------   read 3 float numbers and check: 
		//are they all belong to the range [-5,5];


		
//		float f1;
//		float f2;
//		float f3;
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		

//		
//		System.out.println("Enter f1");
//		f1= Float.parseFloat(br.readLine());
//		System.out.println("Enter f2");
//		f2 =Float.parseFloat(br.readLine());
//		System.out.println("Enter f3");
//		f3 = Float.parseFloat(br.readLine());
//		
//		if(f1 >= -5 && f1 <= 5 && f2 >= -5 && f2 <= 5 && f3 >= -5 && f3 <= 5){
//				System.out.println("OK");
//			}else
//				System.out.println("BAD");
//	
//		

		
		
		
		
		
		
		
		//----------------------read 3 integer numbers and write max and min of them;

//		
//		int i1;
//		int i2;
//		int i3;
//		
//		System.out.println("Enter i1");
//		i1 = Integer.parseInt(br.readLine());
//		System.out.println("Enter i2");
//		i2 = Integer.parseInt(br.readLine());
//		System.out.println("Enter i3");
//		i3 = Integer.parseInt(br.readLine());
//		
//		
//		if(i1>i2 && i1>i3){
//			System.out.println("i1 max of them");
//		}else{
//			if(i2>i1 && i2>i3){
//				System.out.println("i2 max of them");
//			}else{
//				if(i3>i1 && i3>i2){
//					System.out.println("i3 max of them");
//			}
//		}
//		}
//		
//		if(i1<i2 && i1<i3){
//			System.out.println("i1 min of them");
//		}else{
//			if(i2<i1 && i2<i3){
//				System.out.println("i2 min of them");
//			}else{
//				if(i3<i1 && i3<i2){
//					System.out.println("i3 min of them");
//			}
//		}
//		}
		
		
				
	
		
		
		//----------------------read number of HTTP Error (400, 401,402, ...) and
		//                      write the name of this error (Declare enum HTTPError)

		
//		System.out.println("Enter number or error");
//		
//	switch(Integer.parseInt(br.readLine().trim())){
//	case 400: 
//		System.out.println(Error.Bad_Request.name());
//		break;
//	case 401:
//		System.out.println(Error.Unauthorized.name());
//		break;
//	case 402:
//		System.out.println(Error.Payment_Required.name());
//		break;
//	default:
//		System.out.println("wrong error");
//		break;
//		
//		}
	
		
		
		
		
		
		//-----------Ñreate class Dog with fields name, breed, age. 
		//           Declare enum for field breed. 
		//           Create 3 instances of type Dog. 
		//           Check if there is no two dogs with the same name. 
		//           Display the name and the kind of the oldest dog.
		
		
		
	/*	Dog dog1 = new Dog("Tom", Breed.York, 8);
		Dog dog2 = new Dog("Loky", Breed.Husky, 10);
		Dog dog3 = new Dog("Richard", Breed.Sheepdog, 6);
		
		
		if(dog1.equals(dog2) || dog1.equals(dog3) ){
			System.out.println("dogs have same names");
			
		}else{
			if(dog2.equals(dog3)){
				System.out.println("dogs have same names");
			
			}else{
				System.out.println("dogs have not same names");
			}
			
		}
		
		
		if(dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()){
			System.out.println("the oldest dog is  " + dog1.getName() + 
					"  "+"his kind " + Breed.York.name());
			
		}else{
			if(dog2.getAge() > dog3.getAge() && dog2.getAge() > dog1.getAge()){
				System.out.println("the oldest dog is  " + dog2.getName() + 
						"  "+"his kind " + Breed.Husky.name());
			}else{
				if(dog3.getAge() > dog1.getAge() && dog3.getAge() > dog2.getAge()){
					System.out.println("the oldest dog is  " + dog3.getName() + 
							"  "+"his kind " + Breed.Sheepdog.name());
			}
		}
		}
		*/
		
		
		Main.Rang();
		
		
		
	}

	
	
	
	
	

	//----------------------------   read 3 float numbers and check: 
	//are they all belong to the range [-5,5];


	
	float f1;
	float f2;
	float f3;
	
	
	
	
	public static void Rang() throws NumberFormatException, IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter f1");
	float f1= Float.parseFloat(br.readLine());
	System.out.println("Enter f2");
	float f2 =Float.parseFloat(br.readLine());
	System.out.println("Enter f3");
	float f3 = Float.parseFloat(br.readLine());
	
	if(f1 >= -5 && f1 <= 5 && f2 >= -5 && f2 <= 5 && f3 >= -5 && f3 <= 5){
			System.out.println("OK");
		}else
			System.out.println("BAD");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
