import java.sql.*;


public class BatchUpdates {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/dhatridb","root","root");
		Statement st =con.createStatement();
		String q1= "Create table emp(eid number,ename varchar2(30),esal number)";
		String q2 ="insert into emp values(597,'vinod',30000)";
		String q3 ="insert into emp values(596,'tri',20000)";
		String q4 ="insert into emp values(594,'manu',20000)";
		String q5 ="update emp set esal=esal+300 where esal>20000";
		String q6 ="drop table emp";
		
		st.addBatch(q1);
		st.addBatch(q2);
		st.addBatch(q3);
		st.addBatch(q4);
		st.addBatch(q5);
		st.addBatch(q6);
		
		int[] x = st.executeBatch();
		
		for(int xx:x){
			System.out.println(xx);
		}
		con.close();

 	}

}
