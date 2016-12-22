package com.ss;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//import com.mysql.jdbc.Statement;

public class DataBaseOperations {
	Connection connection;
	java.sql.Statement statementRef;
	PreparedStatement statement;
	ResultSet resultSet;
	Employee employeeBean = new Employee();
	Scanner input = new Scanner(System.in);

	public DataBaseOperations() {
		connection = MyConnection.getInstance().connection;
	}

	public int insertData(Employee employee) {
		int result = 0;

		String query = "insert into employee values(" + employee.getEmployeeId() + ',' + "'"
				+ employee.getEmployeeName() + "'," + employee.getEmployeeSlary() + ")";
		try {
			statementRef = connection.createStatement();
			result = statementRef.executeUpdate(query);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;

	}

	public void insertDataUsingPrepared() {

		System.out.println("enter employee Id");
		employeeBean.setEmployeeId(input.nextInt());
		System.out.println("enter employee name");
		employeeBean.setEmployeeName(input.next());
		System.out.println("enter employee salary");
		employeeBean.setEmployeeSlary(input.nextDouble());
		String query = "insert into employee values(?,?,?)";
		try {
			statement = connection.prepareStatement(query);
			statement.setInt(1, employeeBean.getEmployeeId());
			statement.setString(2, employeeBean.getEmployeeName());
			statement.setDouble(3, employeeBean.getEmployeeSlary());
			statement.executeUpdate();

			System.out.println("Data Inserted");
			System.out.println(employeeBean.getEmployeeId() + "\t" + employeeBean.getEmployeeName() + "\t"
					+ employeeBean.getEmployeeSlary());
			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update() {
		// ArrayList<Employee> listofEmployee= new ArrayList<Employee>();
		// Employee employeeRef =null;
		System.out.println("Enter Employee id : ");
		int employeeId = input.nextInt();
		String query = "update employee set employeeName = ?,employeeSlary =? where employeeId = ?";
		System.out.println("Enter Name to update:");
		String employeeName = input.next();
		System.out.println("Enter Salary to update: ");
		double employeeSlary = input.nextDouble();
		try {
			statement = connection.prepareStatement(query);
			statement.setString(1, employeeName);
			statement.setDouble(2, employeeSlary);
			statement.setInt(3, employeeId);
			statement.executeUpdate();
			System.out.println(employeeBean.getEmployeeId() + "\t" + employeeBean.getEmployeeName() + "\t"
					+ employeeBean.getEmployeeSlary());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void delete() {
		String query = "delete from employee where employeeId=?";
		System.out.println("Enter the id to delete: ");
		int employeeId = input.nextInt();

		try {
			statement = connection.prepareStatement(query);
			statement.setInt(1, employeeId);
			statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void view() {
		// ArrayList<Employee> listOfEmployee=new ArrayList<Employee>();

		// Employee employeeRef=null;

		String query = "select * from employee";

		try {
			statement = connection.prepareStatement(query);
			resultSet = statement.executeQuery();

			while (resultSet.next()) {
				// employeeRef=new Employee();
				employeeBean.setEmployeeId(resultSet.getInt(1));
				employeeBean.setEmployeeName(resultSet.getString(2));
				employeeBean.setEmployeeSlary(resultSet.getDouble(3));

				System.out.println(employeeBean.getEmployeeId() + "\t" + employeeBean.getEmployeeName() + "\t"
						+ employeeBean.getEmployeeSlary());
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
//	public void loan(){
//		ArrayList<Employee> listOfEmployee = search1
//		 Iterator itr= listOfEmployee.iterator();
//		
//	}

	public ArrayList<Employee> search1() {
		ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();

		Employee employeeRef = null;
		System.out.println("enter employee Id to search");
		int employeeId = input.nextInt();

		String query = "select * from employee where employeeId=?";

		try {
			statement = connection.prepareStatement(query);

			statement.setInt(1, employeeId);

			resultSet = statement.executeQuery();

			while (resultSet.next()) {
				employeeRef = new Employee();
				employeeRef.setEmployeeId(resultSet.getInt(1));
				employeeRef.setEmployeeName(resultSet.getString(2));
				employeeRef.setEmployeeSlary(resultSet.getDouble(3));

				listOfEmployee.add(employeeRef);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listOfEmployee;
	}

}
