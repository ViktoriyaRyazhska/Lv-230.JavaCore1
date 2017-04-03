package HW4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Car[] car = new Car[4];

		car[0] = new Car("Ford",2016, 2900);
		car[1] = new Car("Peugeout",2000, 3100);
		car[2] = new Car("BMW",2013, 1700);
		car[3] = new Car("Bentley",2005, 1900);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter year of car: ");
		int year = Integer.parseInt(br.readLine());

		for (int i = 0; i < car.length; i++) {
			if (year == car[i].getYearOfProduct()) {
				System.out.println(car[i]);
			}
		}
	Car sort;
		
		for (int i = 0; i < car.length-1; i++) {
			for (int j = i+1; j < car.length; j++) {
				if (car[i].getYearOfProduct()<car[j].getYearOfProduct()) {
					sort=car[i];
					car[i]=car[j];
					car[j]=sort;
					
				}
			}
		}
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
	}
}

