package com.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_email {
	public static void main(String[] args) {
		System.out.println("Welcome to Sample Email Test");
		
		String email = "abc.100@yahoo.com";
		String regex1 = "^[a-zA-Z]+([.][0-9A]+)*@[a-zA-Z]+[.][a-zA-Z]{2}$";
			 
			Pattern p = Pattern.compile(regex1);
	        Matcher m = p.matcher(email);
	        boolean r = m.matches();
	        if (r)
	        	System.out.println("Valid Email");
	        else
	        	System.out.println("Invalid Email");
	}

}
