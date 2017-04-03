import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Personal {
	public static void main(String[] args) throws IOException {
	Map<String, String> personMap = new HashMap<String, String>();
	personMap.put("Andriy", "Dobrianskiy");
	personMap.put("Oleh", "John");
	personMap.put("Slavick", "May");
	personMap.put("Igor", "Kay");
	personMap.put("Nina", "One");
	personMap.put("Andrew", "Dobrianskiy");
	personMap.put("Andriy", "Dobrianskiy");
	personMap.put("Andriy", "Dobrianskiy");
	personMap.put("Andriy", "Dobrianskiy");
	System.out.println(personMap);
	int count = 0;
	int count1 = 0;
	for (Map.Entry<String, String> entry : personMap.entrySet()) {
		for (Map.Entry<String, String> entry1 : personMap.entrySet()) {
			if (entry.getValue().equals(entry1.getValue())) {
				count++;
			}
			if (count > 1) {
				count1++;
			}
		}
	}
	if (count1 > 1) {
		System.out.println("More than two identical firstName");
	} else {
		System.out.println("No similar firstName");
	}
personMap.clear();
	

	}
	}
