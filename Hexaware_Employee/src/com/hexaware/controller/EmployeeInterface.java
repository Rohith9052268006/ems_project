package com.hexaware.controller;

import java.io.IOException;
import java.sql.SQLException;

public interface EmployeeInterface {
	public void addEmployee() throws IOException;
	public void viewEmployee() throws IOException;
	public void updateEmployee() throws SQLException, IOException;
	public void deleteEmployee() throws SQLException, IOException;
	public void validate();
}
