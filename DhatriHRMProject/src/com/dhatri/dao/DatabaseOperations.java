package com.dhatri.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dhatri.bean.EmpBean;
import com.dhatri.bean.EmpCompany;

public class DatabaseOperations {
	java.sql.Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;

	public DatabaseOperations() {
		connection = MyConnection.GetInstance().connection;
	}

	public int insertdata(EmpBean empbean) {
		int result = 0;
		String query = "insert into employeedtls values(?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, empbean.getId());
			preparedStatement.setString(2, empbean.getFrist_name());
			preparedStatement.setString(3, empbean.getLast_name());
			preparedStatement.setString(4, empbean.getDate_of_birth());
			preparedStatement.setLong(5, empbean.getMobile());
			preparedStatement.setString(6, empbean.getEmail());
			preparedStatement.setLong(7, empbean.getAlt_mobile());
			preparedStatement.setString(8, empbean.getAlt_email());
			preparedStatement.setString(9, empbean.getPrsnt_address());
			preparedStatement.setString(10, empbean.getPrmnt_address());
			preparedStatement.setString(11, empbean.getFather_name());
			preparedStatement.setString(12, empbean.getFather_occupation());
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public int insertEmployeeCompany(EmpCompany combean) {
		int result = 0;
		String query = "insert into employeecompany values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, combean.getId());
			preparedStatement.setFloat(2, combean.getExperiance());
			preparedStatement.setString(3, combean.getPast_company());
			preparedStatement.setFloat(4, combean.getPeriod());
			preparedStatement.setString(5, combean.getDate_of_join());
			preparedStatement.setDouble(6, combean.getCtc());
			preparedStatement.setDouble(7, combean.getPast_ctc());
			preparedStatement.setDouble(8, combean.getAdv_sal());
			preparedStatement.setString(9, combean.getAdv_sal_date());
			preparedStatement.setString(10, combean.getAdv_sal_terms());
			preparedStatement.setString(11, combean.getDesignation());
			preparedStatement.setString(12, combean.getTechnologies());
			preparedStatement.setString(13, combean.getPast_hike_date());
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<EmpBean> userview(String employeeId) {
		ArrayList<EmpBean> employeeList = new ArrayList<EmpBean>();
		String query = "select * from employeedtls where Id=?";

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, employeeId);

			resultSet = preparedStatement.executeQuery();
			System.out.println("after the resultset");
			EmpBean empBean = null;
			while (resultSet.next()) {
				System.out.println("after while");
				empBean = new EmpBean();
				empBean.setId(resultSet.getString(1));
				empBean.setFrist_name(resultSet.getString(2));
				empBean.setLast_name(resultSet.getString(3));
				empBean.setDate_of_birth(resultSet.getString(4));
				empBean.setMobile(resultSet.getLong(5));
				empBean.setEmail(resultSet.getString(6));
				empBean.setAlt_mobile(resultSet.getLong(7));
				empBean.setAlt_email(resultSet.getString(8));
				empBean.setPrsnt_address(resultSet.getString(9));
				empBean.setPrmnt_address(resultSet.getString(10));
				empBean.setFather_name(resultSet.getString(11));
				empBean.setFather_occupation(resultSet.getString(12));

				employeeList.add(empBean);
				System.out.println(employeeList);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeList;
	}

	
	public ArrayList<EmpCompany> companyView(String employeeId) {
		ArrayList<EmpCompany> employeeList = new ArrayList<EmpCompany>();
		String query = "select * from employeecompany where Eid=?";

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, employeeId);

			resultSet = preparedStatement.executeQuery();
			System.out.println("after the resultset");
			EmpCompany comBean = null;
			while (resultSet.next()) {
				System.out.println("after while");
				comBean = new EmpCompany();
				comBean.setId(resultSet.getString(1));
				comBean.setExperiance(resultSet.getFloat(2));
				comBean.setPast_company(resultSet.getString(3));
				comBean.setPeriod(resultSet.getFloat(4));
				comBean.setDate_of_join(resultSet.getString(5));
				comBean.setCtc(resultSet.getDouble(6));
				comBean.setPast_ctc(resultSet.getDouble(7));
				comBean.setAdv_sal(resultSet.getDouble(8));
				comBean.setAdv_sal_date(resultSet.getString(9));
				comBean.setAdv_sal_terms(resultSet.getString(10));
				comBean.setDesignation(resultSet.getString(11));
				comBean.setTechnologies(resultSet.getString(12));
				comBean.setPast_hike_date(resultSet.getString(13));

				employeeList.add(comBean);
				System.out.println(employeeList);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeList;
	}
	
	
	public ArrayList<EmpBean> search3(String email) {
		ArrayList<EmpBean> employeeList = new ArrayList<EmpBean>();
		System.out.println(email);
		String query = "select * from employeedtls where Email=?";

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email);

			resultSet = preparedStatement.executeQuery();
			System.out.println("after the resultset");
			EmpBean empBean = null;
			while (resultSet.next()) {
				System.out.println("after while");
				empBean = new EmpBean();
				empBean.setId(resultSet.getString(1));
				empBean.setFrist_name(resultSet.getString(2));
				empBean.setLast_name(resultSet.getString(3));
				empBean.setDate_of_birth(resultSet.getString(4));
				empBean.setMobile(resultSet.getLong(5));
				empBean.setEmail(resultSet.getString(6));
				empBean.setAlt_mobile(resultSet.getLong(7));
				empBean.setAlt_email(resultSet.getString(8));
				empBean.setPrsnt_address(resultSet.getString(9));
				empBean.setPrmnt_address(resultSet.getString(10));
				empBean.setFather_name(resultSet.getString(11));
				empBean.setFather_occupation(resultSet.getString(12));

				employeeList.add(empBean);
				System.out.println(employeeList);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeList;
	}

	public int delete(EmpCompany comBean, EmpBean empBean) {
		int result = 0;
		int result1 = 0;
		String query = "delete from employeedtls where Id=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, empBean.getId());
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query1 = "delete from employeecompany where Eid=?";
		try {
			preparedStatement = connection.prepareStatement(query1);
			preparedStatement.setString(1, comBean.getId());
			result1 = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int updateData(EmpBean empBean) {
		int result = 0;
		String query = "update employeedtls set FName=?,Lname=?,Dob=?,Mobile=?,Email=?,Altmobile=?,Altemail=?,prsntaddress=?,prmntaddress=?,Fathername=?,FatherOccupation=? where Email=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, empBean.getFrist_name());
			preparedStatement.setString(2, empBean.getLast_name());
			preparedStatement.setString(3, empBean.getDate_of_birth());
			preparedStatement.setLong(4, empBean.getMobile());
			preparedStatement.setString(5, empBean.getEmail());
			preparedStatement.setLong(6, empBean.getAlt_mobile());
			preparedStatement.setString(7, empBean.getAlt_email());
			preparedStatement.setString(8, empBean.getPrsnt_address());
			preparedStatement.setString(9, empBean.getPrmnt_address());
			preparedStatement.setString(10, empBean.getFather_name());
			preparedStatement.setString(11, empBean.getFather_occupation());
			preparedStatement.setString(12, empBean.getEmail());

			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
