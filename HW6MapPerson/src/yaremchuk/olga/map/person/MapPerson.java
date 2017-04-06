package yaremchuk.olga.map.person;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.print.DocFlavor.STRING;

public class MapPerson {

	public static void main(String[] args) {
		
		String key = null;
		String value = null;
		int count = 0;
		HashMap<String, String> personMap = new HashMap<String, String>();
		
		personMap.put("Ivanenko","Ivan");
		personMap.put("Kolpakov","Orest");
		personMap.put("Stepanenko","Andrew");
		personMap.put("Kvit","Oleg");
		personMap.put("Ostapenko","Anna");
		personMap.put("Iv","Victor");
		personMap.put("Tymoschuk","Vlad");
		personMap.put("Yaremchuk","Olga");
		personMap.put("Losa","Nazar");
		personMap.put("Alexandrovich","Orest");
		
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			value = entry.getValue();
				for (Map.Entry<String, String> entry2 : personMap.entrySet()) {
					if (entry.getValue().equals(value)) {
						count++;
					}						
				}
			if(entry.getValue().equals("Orest")){
				key = entry.getKey();
			}
		}
		
		if (count > 10){
			System.out.println("There are persons with the same name");
		}
		personMap.remove(key);
		
//		for (Map.Entry<String, String> entry : personMap.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
	}

}
