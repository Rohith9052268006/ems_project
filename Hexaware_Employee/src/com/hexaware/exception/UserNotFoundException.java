package com.hexaware.exception;

public class UserNotFoundException extends Exception{
	public UserNotFoundException() {
		System.out.println("User is not found!!!");
	}
	public UserNotFoundException(String s) {
		System.out.println(s);
	}
	@Override
	public String toString() {
		return "User Not found tostring method";
		
	}
}
