package com.Evaluation3_Q4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username:");
		String username = sc.next();
		
		System.out.println("Enter password:");
		String password = sc.next();
		
		System.out.println("Enter mobile number:");
		String mobileNumber = sc.next();
		
		System.out.println("Enter email:");
		String email = sc.next();
		
		sc.close();
		
		
		boolean checkUserName = Pattern.matches("[a-zA-Z]{3,8}", username);
		boolean checkPass = Pattern.matches("[a-zA-Z0-9]{3,8}", password);
		boolean checkMobile = Pattern.matches("[6-9]{1}[0-9]{9}", mobileNumber);
//		boolean checkEmail = Pattern.matches("[@]", email);
		
		Pattern p = Pattern.compile("@");
		Matcher m = p.matcher(email);
		
		if(checkUserName && checkPass && checkMobile && m.find())
		{
			Customer c = new Customer();
			c.setUsername(username);
			c.setPassword(password);
			c.setMobileNumber(mobileNumber);
			c.setEmail(email);
			
			System.out.println("Customer username is: " + c.getUsername());
			System.out.println("Customer password is: " + c.getPassword());
			System.out.println("Customer mobile number is: " + c.getMobileNumber());
			System.out.println("Customer email is: " + c.getEmail());
		}
		else if(!checkUserName) {
			System.out.println("Username must be 3-8 character long and must contains albhapets only");
			
		}
		else if(!checkPass)
		{
			System.out.println("Password must be alpha-numeric and 3-8 character long.");
		}
		else if(!checkMobile) {
			System.out.println("Mobile number should be an Indian mobile number and contains 10 digits");
		}
		else if(!m.find()) {
			System.out.println("Entered email is not valid");
		}
		
	}
}
