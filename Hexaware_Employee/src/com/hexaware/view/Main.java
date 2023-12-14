package com.hexaware.view;

import java.util.Scanner;
import com.hexaware.controller.EmployeeController;
import com.hexaware.controller.EmployeeInterface;
import com.hexaware.exception.UserNotFoundException;

import java.io.*;
import java.sql.SQLException;
public class Main {

	public static void main(String[] args) throws SQLException,IOException{
		Scanner sc=new Scanner(System.in);
		EmployeeInterface ec=new EmployeeController();
		ec.validate();
		String ch="";
		do {
			System.out.println("Enter your choice");
			System.out.println("1.Add Employee");
			System.out.println("2.View Employee");
			System.out.println("3. Update Employee Details");
			System.out.println("4. Delete employee");
			int choice=sc.nextInt();
				switch(choice) {
				case 1:{
					ec.addEmployee();
					break;
				}
				case 2:{
					ec.viewEmployee();
					break;
				}
				case 3:{
					ec.updateEmployee();
					break;
				}
				case 4:
					ec.deleteEmployee();
					break;
				default:{
					System.out.println("Enter correct choice");
				}
			}
			System.out.println("Do you want to continue? Y/N");
			ch=sc.next().toLowerCase();	
		}while(ch.equals("y"));
		System.out.println("Thanks for using our system!!!");
	}

}
