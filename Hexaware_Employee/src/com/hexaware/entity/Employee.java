package com.hexaware.entity;

public class Employee {
	private int eno;
	private String ename;
	private Salary sal;

	public Employee() {
		
	}
	
	public Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setSal(Salary sal) {
		this.sal = sal;
	}
	public Salary getSal() {
		return sal;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	
	

	
}
