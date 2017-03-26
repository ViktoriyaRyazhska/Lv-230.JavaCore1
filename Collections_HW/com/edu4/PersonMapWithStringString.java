package com.edu4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonMapWithStringString {

	public static Map <String, String> personMap = new HashMap<String, String>();
	
	private static boolean hasDuplicates(Map<String, String> personMap){
		
		boolean status = false;
		
		    Set valueset = new HashSet(personMap.values());

		    if(personMap.values().size()!=valueset.size()){
		    status=true;
		    }
		    else{
		    status = false;
		    }
		    return status;
		}

	public static void main(String[] args) {
		
		personMap.put("Abramov", "Anton");
		personMap.put("Balenko", "Borys");
		personMap.put("Voznjak", "Vasyl");
		personMap.put("Hrygorenko", "Genadij");
		personMap.put("Davydenko", "Dmytro");
		personMap.put("Eremenko", "Evgen");
		personMap.put("Abramenko", "Evgen");
		personMap.put("Zuev", "Zynovij");
		personMap.put("Ljutyj", "Orest");
		personMap.put("Pasternak","Pavlo");
		
		System.out.println(personMap);
		
		System.out.println("There are at less two persons with the same "
				+ "firstName among these 10 people? - "+ hasDuplicates(personMap));
		
		personMap.values().remove("Orest");
		
		System.out.println(personMap);
	}
}
