package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.model.Employee;

public class EmployeeDAO {
		
	public static Connection  getConnection() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("DRIVER FOUND..");
		con=DriverManager.getConnection("jdbc:mysql://192.168.100.80:3306/"+"group036","group036","welcome");
		System.out.println("Connection Established ");
		return con;
	}
	public static int save(Employee e) {
		int i=0;
		try {
			Connection con=getConnection();
			PreparedStatement stmt=con.prepareStatement("insert into employee1"+"(name,password,email,phoneno)value(?,?,?,?)");
			stmt.setString(1,e.getName());
			stmt.setString(2, e.getPassword());
			stmt.setString(3, e.getEmail());
			stmt.setString(4, e.getPhoneno());
			
			i=stmt.executeUpdate();
		}catch(Exception e1) {
			return i;
		}
		return i;
	}

	public static boolean validateEmp(Employee e) throws SQLException, ClassNotFoundException
	{
		Connection con=getConnection();
		PreparedStatement pstmt=con.prepareStatement("select*from employee1 where name=?"+"and password=?");
		pstmt.setString(1,e.getName());
		pstmt.setString(2,e.getPassword());
		ResultSet rs=pstmt.executeQuery();
		boolean b=rs.next();
		return b;
		
	}}