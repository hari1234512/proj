package com.harish;

public class LoginJava {

	public boolean authenticate(String userId, String password){
		if(password==null || password.trim()==""){
			return false;
		}
		return true;

	}

}
