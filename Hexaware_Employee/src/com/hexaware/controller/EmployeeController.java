package com.hexaware.controller;

import com.hexaware.dao.EmployeeDao;
import com.hexaware.entity.*;
import com.hexaware.exception.UserNotFoundException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.*;

public class EmployeeController implements EmployeeInterface{
	Scanner sc=new Scanner(System.in);
	List<Employee> e=new ArrayList<Employee>();
	EmployeeDao empdao=new EmployeeDao();
	Employee emp;
	public void addEmployee() throws IOException {
		Employee emp=new Employee();
		
		System.out.println("Enter employee number");
		int eno=sc.nextInt();
		
		System.out.println("Enter employee name");
		String ename=sc.next();
		
		System.out.println("Enter the salary basic : ");
		int basic=sc.nextInt();
		
		emp.setEname(ename);
		emp.setEno(eno);
		Salary sal=new Salary();
		sal.setBasic(basic);
		sal.setHra();
		sal.setPf();
		sal.setGross();
		sal.setNet();
		
		emp.setSal(sal);
		try {
			empdao.addEmployee(emp);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		e.add(emp);
		System.out.println("Employee added Successfully");
	}
	
	public void viewEmployee() throws IOException{
		try {
			empdao.viewEmployee();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void validate(){
		try {
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			System.out.println("Enter username");
			String user=br.readLine();
			System.out.println("Enter password");
			String pass=br.readLine();
			if(user.equals("Rohith")&&pass.equals("pass")) {
				System.out.println("Welcome "+user);
			}
			else {				
				throw new UserNotFoundException();
			}
		}catch(UserNotFoundException e) {
			validate();
		}catch(IOException e) {
			System.out.println(e.getStackTrace());
		}
	}
	public void updateEmployee() throws SQLException, IOException {
		emp = new Employee();
		System.out.println("Enter your Emp number to update");
		int eno = sc.nextInt();
		emp.setEno(eno);

		System.out.println("Enter your Emp Name to update");
		String ename = sc.next();
		emp.setEname(ename);
		
		
		empdao.updateEmployee(emp);
	}
	public void deleteEmployee() throws SQLException, IOException {
		emp = new Employee();
		System.out.println("Enter your Emp number to delete");
		int eno = sc.nextInt();
		empdao.deleteEmployee(eno);
	}
}
