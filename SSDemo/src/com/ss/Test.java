package com.ss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		DataBaseOperations dbo=new DataBaseOperations();
		while(true){
		System.out.println("1.Insert Data ");
		System.out.println("2.View ");
		System.out.println("3.Update ");
		System.out.println("4.Delete ");
		//System.out.println("1.Insert Data ");
		int no=input.nextInt();

	   switch(no){
	   case 1:{
		   dbo.insertDataUsingPrepared();
	   }
	   case 2:
	   { 
		   dbo.view();
	   }break ;
	   case 3:{
		   dbo.update();
	   }
	   case 4:{
		   dbo.delete();
	   }
		   
	   }
		
		/*int result=dbo.insertData(employeeBean);
		
		int result=dbo.insertDataUsingPrepared(employeeBean);
		System.out.println(result+ " data inserted");
		
		System.out.println("Enter Employee id to update: ");
		int employeeId1 = input.nextInt();
		ArrayList<Employee> listofEmp1 = dbo.update(employeeId1);
		 Iterator<Employee> itr=listofEmp1.iterator();
		 Employee employee=null;
		 System.out.println("Id \t Name \t salary \t");
		  while(itr.hasNext())
		  {
			  employee=(Employee)itr.next();
			  
			  System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmployeeSlary());
		  }
		
		System.out.println("enter employee Id to search");
		int employeeId=input.nextInt();
	     ArrayList<Employee> listOfEmp=  dbo.search(employeeId);
		  Iterator<Employee> itr=listOfEmp.iterator();
		 Employee employee=null;
		 System.out.println("Id \t Name \t salary \t");
		  while(itr.hasNext())
		  {
			  employee=(Employee)itr.next();
			  
			  System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmployeeSlary());
		  }*/
		  
	}

}
}
