package EmployeArraylist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.*;
import java.util.Scanner;

import EmployeArraylistForEach.Employ;
import EmployeeProject.Test;
import EmployeeProject.UpdateException;
import EmployeeProject.UpdateException.AllException;

public class Employee {
	Scanner scan = new Scanner(System.in);
	EmployeA emp=new EmployeA();
	static ArrayList<EmployeA> alemp =new ArrayList<EmployeA>();
     
	public void insert() {
		Scanner scan = new Scanner(System.in);
		EmployeA empBean;	
			empBean = new EmployeA();
			System.out.println("Enter employee id: ");
			empBean.setEid(scan.nextInt());
			System.out.println("Enter name: ");
			empBean.setEname(scan.next());
			System.out.println("Enter salary: ");
			empBean.setEsal(scan.nextDouble());
			System.out.println("Enter the location: ");
			empBean.setEloc(scan.next());
			System.out.println("Enter the Experiance : ");
			empBean.setEexp(scan.nextDouble());

			alemp.add(empBean);
			// calling Serailization Method
			//serialization();
		//for (int i = 0; i <= alemp.size(); i++) 
		//{
			Iterator it=alemp.iterator();
			while(it.hasNext())
			{
		
				for(EmployeA aa:alemp){
					  System.out.println("Employee Details Of Id " +aa.getEid());
					  System.out.println();
					  System.out.println("Id      : "+aa.getEid());
					  System.out.println("Name    : " +aa.getEname());
					  System.out.println("Salary  : "+aa.getEsal());
					  System.out.println("Loc     : "+aa.getEloc());
					  System.out.println("Exp     : "+aa.getEexp());
					  System.out.println();
		}
				  break;
	}
		
	
		}
	
	//}
	public void update() throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("Update the employee details");
		System.out.println("Enter the Employee id: ");
		int tempId = scan.nextInt();

		//for (int i = 0; i < alemp.size(); i++) {
			System.out.println("Test for fo loop");
			Iterator it=alemp.iterator();
			while(it.hasNext())
			{
			EmployeA emp = (EmployeA)it.next();
			if (alemp == null) {
				throw new UpdateException();
			} else {
				if (tempId == emp.getEid()) {
					System.out.println("654654654654");
					System.out.println("Enter name to update: ");
					emp.setEname(scan.next());
					System.out.println("Enter the Salary to update:");
					emp.setEsal(scan.nextDouble());
					System.out.println("Enter the Location to update: ");
					emp.setEloc(scan.next());
					System.out.println("Enter the Experiance to update");
					emp.setEexp(scan.nextDouble());

				//	alemp.add(emp);
				}
			}
		}
		Iterator it1=alemp.iterator();
		while(it1.hasNext())
		{
	
			for(EmployeA aa:alemp){
				  System.out.println("Employee Id " +aa.getEid());
				  System.out.println();
				  System.out.println("Id      : "+aa.getEid());
				  System.out.println("Name    : " +aa.getEname());
				  System.out.println("Salary  : "+aa.getEsal());
				  System.out.println("Loc     : "+aa.getEloc());
				  System.out.println("Exp     : "+aa.getEexp());
				  System.out.println();
	}break;
			  
}
	}
	

	public void delete() throws AllException {
		System.out.println("Enter the employee id");
		int tempId = scan.nextInt();
		Iterator it=alemp.iterator();
		while(it.hasNext())
		{
			EmployeA emp = (EmployeA)it.next();

			if (alemp == null) {
				throw new UpdateException().new AllException();
			} else {
				if (tempId == emp.getEid()) {
					alemp.remove(emp);
					System.out.println("Deleted Sucessfully");
				}
			}
		}
		
		while(it.hasNext())
		{
	
			for(EmployeA aa:alemp){
				  System.out.println("Employee Id " +aa.getEid());
				  System.out.println();
				  System.out.println("Id      : "+aa.getEid());
				  System.out.println("Name    : " +aa.getEname());
				  System.out.println("Salary  : "+aa.getEsal());
				  System.out.println("Loc     : "+aa.getEloc());
				  System.out.println("Exp     : "+aa.getEexp());
				  System.out.println();
	}
			  break;

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
	Employee t = new Employee();
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
		
		case 3:
		{
			t.delete();
			break;
		}
		case 4:
		{
			t.loan();
		}
		case 5:
		{
			t.view();
		}
		}
       }
	}
}
}
