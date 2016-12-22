import java.sql.*;
public class EmployeeDetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/dhatridb","root","root");
		Statement st =con.createStatement();
		//table is created
		String q1="Create table emp(empid number,ename varchar(30),esal number)";
		int x = st.executeUpdate(q1);
		System.out.println("Table is created"+x);
		//inserting values
        String q2 = "insert into emp values(597,'vinod',30000)";
        String q3 = "insert into emp values(596,'Trinadh',20000)";
        String q4 = "insert into emp values(594,'vihar',30000)";
        st.executeUpdate(q2);
        st.executeUpdate(q3);
        st.executeUpdate(q4);
        System.out.println("Values are inserted");
        
        String q5= "Select 8 from emp";
        ResultSet set=st.executeQuery(q5);
        while(set.next())
        {
        	System.out.println(set.getInt(1)+"..."+set.getString("ename")+"..."+set.getFloat(3));
        	System.out.println("Date printed");
        	
        	//update the table
        	String q6="Update emp set esal=esal+200 where esal>10000)";
        	int y =st.executeUpdate(q6);
        	System.out.println("Records are updated"+y);
        	
        	//Drop the table
        	String q7="drop table emp";
        	int z =st.executeUpdate(q7);
        	System.out.println("table droped"+z);
        	
        	con.close();
        	
        }
        
        
	}

}
