package com.edu.project;

import java.util.HashMap;
import com.edu.project.User;

public class LoginService {
	
	HashMap<String, String> users = new HashMap<String, String>();
	
public LoginService(){
		users.put("andron", "Andrij Rozenko");
		users.put("bodjapavuk", "Bohdan Pavljuchenko");
		users.put("varenyk", "Vasyl Remisnyk");
	}
	
public boolean authenticate(String userId, String password){
	
	if(password == null || password.trim() == ""){
		return false;
	}
	return true;
}

public User getUserDetails(String userId){
	User user = new User();
	user.setUserName(users.get(userId));
	user.setUserId(userId);
	return user;
}
}
