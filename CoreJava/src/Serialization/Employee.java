package Serialization;
import java.io.*;

public class Employee implements Serializable {
	int eId;
	String eName;
	double eSal;
	
public static void Serialization() throws Exception{
	
	Employee employee= new Employee();
	employee.eId = 100;
	employee.eName = "Dhatri";
	employee.eSal= 25000.0;
	
	FileOutputStream fos = new FileOutputStream(new File("D:/serial.txt"));
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	   oos.writeObject(employee);
	   System.out.println("Serialization completed");
}
	   public static void deserialization() throws Exception
	   {
		   FileInputStream fis = new FileInputStream("D:/serial.txt");
		   ObjectInputStream ois = new ObjectInputStream(fis);
		   Object obj= ois.readObject();
		   Employee emp = (Employee)obj;
		   System.out.println("After deserialization");
		   System.out.println("Id =" +emp.eId);
		   System.out.println("Name = " +emp.eName);
		   System.out.println("Salary = "+emp.eSal);
		   
	   }
	   
	   


	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			//Serialization();
			deserialization();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
