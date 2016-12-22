package EmployeArraylistForEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import EmployeArraylist.EmployeA;
import EmployeArraylist.Employee;
import EmployeeProject.UpdateException;
import EmployeeProject.UpdateException.AllException;

public class EmployeFor {
	Scanner scan = new Scanner(System.in);
	//Employ emp = new Employ();
	static ArrayList<Employ> alemp =new ArrayList<Employ>();
     
	public void insert() {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i <= alemp.size(); i++) {
		//	Employ emp = new Employ();
			System.out.println("new one");
			System.out.println("Enter employee id: /n" +"Enter name: ");
			alemp.add(new Employ(i, null, i, null, i, i, i));
			System.out.println("Enter name: ");
			alemp.add(scan.nextInt(), null);
			System.out.println("Enter salary: ");
			alemp.add(scan.nextInt(), null);
			System.out.println("Enter the location: ");
			alemp.add(scan.nextInt(), null);
			System.out.println("Enter the Experiance : ");
			alemp.add(scan.nextInt(), null);
			
           break;
		}
			Iterator it=alemp.iterator();
			while(it.hasNext())
			{
		  for(Employ aa:alemp){
			  System.out.println(aa);
			  System.out.println();
			  
			  
		  }
		

		}
		System.out.println();
	
		}
	//}
	public void update() throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("Update the employee details");
		System.out.println("Enter the Employee id: ");
		int tempId = scan.nextInt();

		for (int i = 0; i <= alemp.size(); i++) {
			Iterator it=alemp.iterator();
			EmployeA emp = (EmployeA)it.next();
			if (alemp == null) {
				throw new UpdateException();
			} else {
				if (tempId == emp.getEid()) {
					System.out.println("Enter name to update: ");
					emp.setEname(scan.next());
					System.out.println("Enter the Salary to update:");
					emp.setEsal(scan.nextDouble());
					System.out.println("Enter the Location to update: ");
					emp.setEloc(scan.next());
					System.out.println("Enter the Experiance to update");
					emp.setEexp(scan.nextDouble());

					//alemp.add(emp);
                   break;
				}
			}
		}
		Iterator it=alemp.iterator();
		while(it.hasNext())
		{
	
		EmployeA emp = (EmployeA)it.next();
		System.out.println(" Employee details");
		System.out.println("Id = " + emp.getEid());
		System.out.println("Name = " + emp.getEname());
		System.out.println("Salary= " + emp.getEsal());
		System.out.println("location= " + emp.getEloc());
		System.out.println("Experiance= " + emp.getEexp());
		break;

	}

	}
	

	public void delete() throws AllException {
		System.out.println("Enter the employee id");
		int tempId = scan.nextInt();
		for (int i = 0; i <=alemp.size(); i++) {
			Iterator it=alemp.iterator();
			EmployeA emp = (EmployeA)it.next();

			if (alemp == null) {
				throw new UpdateException().new AllException();
			} else {
				if (tempId == emp.getEid()) {
					alemp  = null;
					System.out.println("Deleted Sucessfully");
				}
			}
		}
		for (int i = 0; i <= alemp.size(); i++) {
			if (alemp != null) {
              Iterator it=alemp.iterator();
				EmployeA emp = (EmployeA)it.next();
				System.out.println(i + 1 + " Employee details");
				System.out.println("Id = " + emp.getEid());
				System.out.println("Name = " + emp.getEname());
				System.out.println("Salary= " + emp.getEsal());
				System.out.println("location: " + emp.getEloc());
				System.out.println("Experiance= " + emp.getEexp());
				System.out.println();
				
			}

		}
	}

	public void loan() throws AllException {
		System.out.println("Enter the Employee id: ");
		int tempId = scan.nextInt();
		for (int i = 0; i <=alemp.size(); i++) {
			Iterator it=alemp.iterator();
			EmployeA emp = (EmployeA)it.next();

			if (alemp == null) {
				throw new UpdateException().new AllException();
			} else {
				if (tempId == emp.getEid()) {
					if (emp.getEexp() <= 2 && emp.getEsal() <= 240000) {

						System.out.println("you can get loan amount is : " + emp.getEsal() / 2);
						emp.setEloan(emp.getEsal() / 2);
						System.out.println("Emi= " + ((emp.getEloan() * 0.14) + emp.getEloan()) / 9);

					} else if (emp.getEexp() > 2 && emp.getEsal() >= 300000) {
						System.out.println("you are eligible for- " + 3 * emp.getEsal() / 4);
						emp.setEloan(3 * emp.getEsal() / 4);
						System.out.println("Emi= " + ((emp.getEloan() * 0.14) + emp.getEloan()) / 9);

					} else {
						System.out.println("you are not eligible");
					}
					System.out.println();
					System.out.println("dsfsdgf" + emp.getEmi());
				}
			}
		}
	}

	public void emi() {
		System.out.println("Enter the Employee id: ");
		int tempId = scan.nextInt();
		for (int i = 0; i <= alemp.size(); i++) {
			Iterator it=alemp.iterator();
			EmployeA emp = (EmployeA)it.next();
			if (tempId == emp.getEid()) {
				// double sal =emp.getEsal()/12;
				double emi = ((emp.getEloan() * 0.14) + emp.getEloan()) / 9;
				emp.setEmi(emi);
				System.out.println("Monthly emi of employee: " + tempId + " is " + emp.getEmi());
				// empArray[i] = emp;
			}
		}
	}

	public void view() throws AllException {

		System.out.println("Enter the Employee id: ");
		int tempId = scan.nextInt();
		for (int i = 0; i <=alemp.size(); i++) {
			Iterator it=alemp.iterator();
			EmployeA emp = (EmployeA)it.next();

			if (alemp == null) {
				throw new UpdateException().new AllException();
			} else {

				if (tempId == emp.getEid()) {
					System.out.println("dsfsdgf" + emp.getEmi());
					double sal = emp.getEsal() / 12;

					double total = sal - emp.getEmi();
					// emp.setEsal(total);
					System.out.println("Id = " + emp.getEid());
					System.out.println("Name = " + emp.getEname());
					System.out.println("Salary per annum = " + emp.getEsal());
					System.out.println("location = " + emp.getEloc());
					System.out.println("Experiance = " + emp.getEexp());
					System.out.println("Loan amount = " + emp.getEloan());
					System.out.println("Your monthly salary is: " + sal);
					System.out.println("Monthly emi of employee: " + emp.getEmi());
					System.out.println("Take home salary is: " + total);
					// empArray[i] = emp;
					System.out.println();

				}
			}
		}

	}

	public void exit() {
		System.exit(0);
	}
	

	

public static void main(String[] args) throws Exception 
{
	// TODO Auto-generated method stub
	EmployeFor t = new EmployeFor();
	while (true)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("1-Insert");
		System.out.println("2-For Update");
		System.out.println("3- For Delete");
		System.out.println("4-Apply for Loan");
		System.out.println("5- view");
		System.out.println("6-Exit");
		System.out.println("7-deserialization");
		System.out.println("new task");
		System.out.println("Enter your choice: ");
		int no = scan.nextInt();
       if(no<8)
       {
		switch (no)
		{
		case 1: {
			// System.out.println("Enter no of Employees: ");
			t.insert();
			break;
		}
		case 2:
		{
			t.update();
			break;
		}
		
		}
       }
	}
}
}
