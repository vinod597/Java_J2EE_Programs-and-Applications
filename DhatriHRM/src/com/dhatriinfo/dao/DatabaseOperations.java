package com.dhatriinfo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import com.dhatriinfo.bean.Employee;

public class DatabaseOperations {
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;

	public DatabaseOperations() {
		connection = MyConnection.GetInstance().connection;
	}
	public int insertData(Employee empBean) {
		int result = 0;
		// Employee empBean= new Employee();
		String query = "insert into employee values(?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, empBean.getEmployeeId());
			preparedStatement.setString(2, empBean.getEmployeeName());
			preparedStatement.setDouble(3, empBean.getEmployeeSalary());
			preparedStatement.setFloat(4, empBean.getExperiance());
			preparedStatement.setString(5, empBean.getLocation());
			preparedStatement.setDouble(6, empBean.getEmploan());
			preparedStatement.setDouble(7, empBean.getEmi());
			preparedStatement.setString(8, empBean.getEmail());
			preparedStatement.setString(9, empBean.getPassword());
			preparedStatement.setString(10, empBean.getDesignation());
			preparedStatement.setLong(11, empBean.getMobile());
			preparedStatement.setString(12, empBean.getAddress());
			
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	public int updateData(Employee empBean) {
		int result = 0;
		String query = "update employee set Name=?,Salary=?,Experiance=?,Location=?,Loan=? where Id=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			// preparedStatement.setString(1, empBean.getEmployeeId());
			preparedStatement.setString(1, empBean.getEmployeeName());
			preparedStatement.setDouble(2, empBean.getEmployeeSalary());
			preparedStatement.setFloat(3, empBean.getExperiance());
			preparedStatement.setString(4, empBean.getLocation());
			preparedStatement.setDouble(5, empBean.getEmploan());
			// preparedStatement.setDouble(7, empBean.getEmi());
			preparedStatement.setString(6, empBean.getEmployeeId());

			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public int delete(Employee empBean) {
		int result = 0;
		String query = "delete from employee where Id=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, empBean.getEmployeeId());
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}
	// Search by Id
	public ArrayList<Employee> search(String employeeId) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();

		String query = "select Id,Name,Salary,Experiance,Location,Loan,Emi from employee where Id=?";

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, employeeId);

			resultSet = preparedStatement.executeQuery();

			Employee empBean = null;
			while (resultSet.next()) {
				empBean = new Employee();
				empBean.setEmployeeId(resultSet.getString(1));
				empBean.setEmployeeName(resultSet.getString(2));
				empBean.setEmployeeSalary(resultSet.getDouble(3));
				empBean.setExperiance(resultSet.getFloat(4));
				empBean.setLocation(resultSet.getString(5));
				empBean.setEmploan(resultSet.getDouble(6));
				empBean.setEmi(resultSet.getDouble(7));
				employeeList.add(empBean);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeList;
	}

	// Method Search by name
	public ArrayList<Employee> search1(String employeeName) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();

		String query = "select Id,Name,Salary,Experiance,Location,Loan,Emi from employee where Name=?";

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, employeeName);

			resultSet = preparedStatement.executeQuery();

			Employee empBean = null;
			while (resultSet.next()) {
				empBean = new Employee();
				empBean.setEmployeeId(resultSet.getString(1));
				empBean.setEmployeeName(resultSet.getString(2));
				empBean.setEmployeeSalary(resultSet.getDouble(3));
				empBean.setExperiance(resultSet.getFloat(4));
				empBean.setLocation(resultSet.getString(5));
				empBean.setEmploan(resultSet.getDouble(6));
				empBean.setEmi(resultSet.getDouble(7));
				employeeList.add(empBean);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeList;
	}

	// Search by Salary
	public ArrayList<Employee> search2(double employeeSalary) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();

		String query = "select Id,Name,Salary,Experiance,Location,Loan,Emi from employee where Salary=?";

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setDouble(1, employeeSalary);

			resultSet = preparedStatement.executeQuery();

			Employee empBean = null;
			while (resultSet.next()) {
				empBean = new Employee();
				empBean.setEmployeeId(resultSet.getString(1));
				empBean.setEmployeeName(resultSet.getString(2));
				empBean.setEmployeeSalary(resultSet.getDouble(3));
				empBean.setExperiance(resultSet.getFloat(4));
				empBean.setLocation(resultSet.getString(5));
				empBean.setEmploan(resultSet.getDouble(6));
				empBean.setEmi(resultSet.getDouble(7));
				employeeList.add(empBean);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeList;
	}

	// Method For Loan Calculation
	public ArrayList<Employee> loan(String EmployeeId) {
		ArrayList<Employee> alist = new ArrayList<Employee>();
		Employee empBean = null;
		String query = "select * from employee where Id=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, EmployeeId);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				empBean = new Employee();
				empBean.setEmployeeId(resultSet.getString(1));
				empBean.setEmployeeName(resultSet.getString(2));
				empBean.setEmployeeSalary(resultSet.getDouble(3));
				empBean.setExperiance(resultSet.getFloat(4));
				empBean.setLocation(resultSet.getString(5));
				empBean.setEmploan(resultSet.getDouble(6));
				empBean.setEmi(resultSet.getDouble(7));
				alist.add(empBean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Iterator<Employee> it = alist.iterator();
		Employee ee = null;
		while (it.hasNext()) {
			ee = (Employee) it.next();
			if (empBean.getExperiance() <= 2 && empBean.getExperiance() > 1) {
				double insal = empBean.getEmployeeSalary() / 2;
				ee.setEmploan(insal);
				double emi = ((empBean.getEmploan() * 0.14 + empBean
						.getEmploan()) / 9);
				ee.setEmi(emi);
			} else if (empBean.getExperiance() > 2 && empBean.getExperiance() <=5) {
				
				double insal = (3 * ee.getEmployeeSalary() / 4);
				ee.setEmploan(insal);
				double emi = ((empBean.getEmploan() * 0.14 + empBean
						.getEmploan()) / 9);
				ee.setEmi(emi);
				System.out.println("Emi is"+ee.getEmi());
			}
			/*try {
				String query1 = "update employee set Loan=?,Emi=? where Id=?";
				preparedStatement = connection.prepareStatement(query1);
				preparedStatement.setDouble(1, ee.getEmploan());
				preparedStatement.setDouble(2, ee.getEmi());
				preparedStatement.setString(3, employeeId);
				int result = preparedStatement.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}*/
		}
		return alist;
	}
// Here updated the loan in database
 public ArrayList<Employee> updateLoan(String EmployeeId){
	 ArrayList<Employee> alist = loan(EmployeeId);
		Iterator<Employee> it = alist.iterator();
		Employee ee = null;
    System.out.println("In bussiness updateLoan top");
		while (it.hasNext()) {
			ee = (Employee) it.next();

			try {
				String query1 = "update employee set Loan=?,Emi=? where Id=?";
				preparedStatement = connection.prepareStatement(query1);
				preparedStatement.setDouble(1, ee.getEmploan());
				preparedStatement.setDouble(2, ee.getEmi());
				preparedStatement.setString(3, EmployeeId);
				
				int result = preparedStatement.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return alist;
}
 
 // here searching the data for user mail validation
 public ArrayList<Employee> search3(String email) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		System.out.println(email);
		String query = "select * from employee where Email=?";

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email);

			resultSet = preparedStatement.executeQuery();
            System.out.println("after the resultset");
			Employee empBean = null;
			while (resultSet.next()) {
				System.out.println("after while");
				empBean = new Employee();
				empBean.setEmployeeId(resultSet.getString(1));
				empBean.setEmployeeName(resultSet.getString(2));
				empBean.setEmployeeSalary(resultSet.getDouble(3));
				empBean.setExperiance(resultSet.getFloat(4));
				empBean.setLocation(resultSet.getString(5));
				empBean.setEmploan(resultSet.getDouble(6));
				empBean.setEmi(resultSet.getDouble(7));
				empBean.setEmail(resultSet.getString(8));
				empBean.setPassword(resultSet.getString(9));
				empBean.setDesignation(resultSet.getString(10));
				empBean.setMobile(resultSet.getLong(11));
				empBean.setAddress(resultSet.getString(12));
				
				employeeList.add(empBean);
				System.out.println(employeeList);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeList;
	}

}









