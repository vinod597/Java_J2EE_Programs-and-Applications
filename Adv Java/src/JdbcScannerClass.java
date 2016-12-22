import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcScannerClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/dhatridb","root","root");
		Statement st =con.createStatement();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Table name");
		String tname = scn.next();
		
		String q1="Create table"+tname+"(eid number,ename varchar2 (30),esal number)";
		int x =st.executeUpdate(q1);
		System.out.println("Table is created"+tname);
		
		while(true){
			System.out.println("Enter emp id:");
			int eid =scn.nextInt();
			
			System.out.println("Enter ename:");
			String ename= scn.next();
			
			System.out.println("Enter esal:");
			float esal =scn.nextFloat();
			
			String q2="insert into "+tname+"values("+eid+","+ename+","+esal+")";
			System.out.println(q2);
			st.executeUpdate(q2);
			System.out.println("Values are inserted");
			System.out.println("Do you want one more record yes/no");
			String option =scn.next();
			
			if (option.equals("no"))
			{
				break;
			}
			System.out.println("Enter the table you want drop");
			String droptable = scn.next();
			String q3="drop table"+droptable;
			st.executeUpdate(q3);
			System.out.println("Table droped succesfully");
			con.close();
		}
		

	}

}
