package Collections;
import java.util.*;

public class Example_Arraylist {
	public static void main(String[] args){
		ArrayList al= new ArrayList();
		al.add("Dhatri");
		al.add(1000.0);
		System.out.println(al);
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("1000");
		al1.add("Dhatri info");
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(1000);
		al2.add(1001);
		
		Employee emp=new Employee();
		emp.getId();
		emp.getName();
		
		ArrayList<Employee> alemp =new ArrayList<Employee>();
		alemp.add(emp);
		
		Iterator it =alemp.iterator();
		while(it.hasNext())
		{
			Employee emp1=(Employee)it.next();
			System.out.println(emp1.getId());
			System.out.println(emp1.getName());
		}
		
		
	}

}
