package com.hexaware.dao;
import java.io.IOException;
import java.sql.*;

import com.hexaware.entity.Employee;
import com.hexaware.util.DBConnUtil;
public class EmployeeDao {
	Connection c;
	Statement s;
	PreparedStatement ps;
	ResultSet rs;
	public void addEmployee(Employee emp) throws SQLException, IOException {
		c=DBConnUtil.getMyDBConnection();
		ps=c.prepareStatement("insert into employee values(?,?,?)");
		ps.setInt(1,emp.getEno());
		ps.setString(2, emp.getEname());
		ps.setFloat(3,emp.getSal().getBasic());
		int c=ps.executeUpdate();
		System.out.println(c+" rows executed successfully");
	}
	public void viewEmployee() throws SQLException, IOException {
		c=DBConnUtil.getMyDBConnection();
		s=c.createStatement();
		rs=s.executeQuery("select * from Employee");
		while(rs.next()) {
			System.out.println("EmpNo : "+rs.getInt(1));
			System.out.println("EmpName "+rs.getString(2));
			System.out.println("Employee Salary : "+rs.getFloat(3));
		}
	}
	public void updateEmployee(Employee emp) throws SQLException, IOException {
		try {
			c=DBConnUtil.getMyDBConnection();
			ps=c.prepareStatement("update employee set ename=? where eno=?");
			ps.setString(1, emp.getEname());
			ps.setInt(2, emp.getEno());
			int x=ps.executeUpdate();
			System.out.println("Updated successfully");
		}catch(SQLException e) {
			System.out.println("Error!!!");
		}
	}
	public void deleteEmployee(int empid) throws SQLException, IOException {
		try {
			c=DBConnUtil.getMyDBConnection();
			ps=c.prepareStatement("delete employee where eno=?");
			ps.setInt((1), empid);
			System.out.println("deleted successfully");
		}catch(SQLException e) {
			System.out.println("Error!!!");
		}
	}
	
}
