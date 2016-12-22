package dhatri.employee;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		
		Employee[] empArray=new Employee[2];
		Employee empBean;
		for(int i=0;i<=1;i++)
		{
			empBean=new Employee();
		System.out.println("enter employee id");
		empBean.setId(sc.nextInt());
		System.out.println("enter name");
		empBean.setName(sc.next());
		empArray[i]=empBean;
		}
		
		for(int i=0;i<=1;i++)
		{
			Employee emp=(Employee)empArray[i];
			System.out.println(i+1 +" details");
			System.out.println("Id = "+ emp.getId());
			System.out.println("Name = " +emp.getName());
			
		}
		
	}

}
