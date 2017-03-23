package task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	

	public static void main(String[] args) {
		
		Map<String,	 String> personMap = new HashMap<>();
		personMap.put("Tre", "Vas");
		personMap.put("Kto", "Vas");
		personMap.put("Ish", "Olya");
		personMap.put("Hog", "Mykola");
		personMap.put("Kir", "Igor");
		personMap.put("Dys", "Orest");
		personMap.put("Sap", "Dima");
		personMap.put("hik", "Vas");
		personMap.put("Bob", "George");
		personMap.put("Min", "Stepan");
		
		System.out.println(personMap);
		
		
		Set<String> set = new HashSet<>(personMap.values());
		
		if ((personMap.size()-set.size())>=1) {
			System.out.println("There are  two persons with the same firstName ");
		}else {
			System.out.println("There are NOT  two persons with the same firstName ");
		}
	


		for (Map.Entry<String, String> entry1 : personMap.entrySet()) {
			if (entry1.getValue().equals("Orest")) {
				personMap.remove(entry1.getKey());
			}
			
		}
		System.out.println(personMap);
	}

}
