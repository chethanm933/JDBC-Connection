package com.employeedatabase;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.security.auth.kerberos.EncryptionKey;

public class EmployeeDataBaseConnector {

	public static void main(String[] args)  {
		
		String jdbc = "jdbc:mysql://localhost:3306/employee_db";
		String userName = "root";
		String password = "24681012"; 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("connection established successfully");
		} catch (ClassNotFoundException e) {
			System.out.println("MySQL connector not loaded :");
			e.printStackTrace();
		}
		
		Connection connection;
		try {
			connection = DriverManager.getConnection(jdbc, userName, password);
		} catch (SQLException e) {
			System.out.println("Connection Establish Failed :");
			e.printStackTrace();
		}
	}
		
		public static void listDbDrivers() {
			Enumeration<Driver> listDrivers = DriverManager.getDrivers();
			
				while(listDrivers.hasMoreElements()) {
					Driver driver = listDrivers.nextElement();
					System.out.println(driver.getClass().getName());
				
			}
		}
	
}
