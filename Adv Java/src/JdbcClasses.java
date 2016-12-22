import java.sql.*;
public class JdbcClasses {
	public static void main (String[] args) throws SQLException, ClassNotFoundException{
		// Load the driver
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		// Create connection
		Connection con = DriverManager.getConnection("jdbc:odbc;vinod","system","vinod");
		System.out.println("connection is created");
		// write statement to execute the query
		Statement st =con.createStatement();
		// write the query
		String q1 ="create table emp(eid number,ename varchar2(30),esal number)";
		// Execute the statement using execute query
		int x =st.executeUpdate(q1);
		System.out.println("table is created succesfully");
		// close the connection
		con.close();
	}

}
