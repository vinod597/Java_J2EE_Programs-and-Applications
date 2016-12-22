package EmployeeProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import EmployeeProject.UpdateException.AllException;

public class Test implements Serializable {
	Scanner scan = new Scanner(System.in);
	static Employee[] empArray = new Employee[2];

	public void insert() {
		Scanner scan = new Scanner(System.in);
		Employee empBean;
		for (int i = 0; i <= empArray.length - 1; i++) {
			empBean = new Employee();
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

			empArray[i] = empBean;
			// calling Serailization Method
			serialization();

		}

		for (int i = 0; i <= empArray.length - 1; i++) {
			Employee emp = (Employee) empArray[i];
			System.out.println(i + 1 + " Employee details");
			System.out.println("Id = " + emp.getEid());
			System.out.println("Name = " + emp.getEname());
			System.out.println("Salary= " + emp.getEsal());
			System.out.println("location= " + emp.getEloc());
			System.out.println("Experiance= " + emp.getEexp());

		}
		System.out.println();
	}

	// Created serialization Method

	public static void serialization() {
		try {
			FileOutputStream fos = new FileOutputStream(new File("D:/employee.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(empArray);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Serialization completed");
		System.out.println();

	}

	public static void deserialization() throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("D:/employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Employee[] emp1 = (Employee[]) obj;

		for (int i = 0; i <= empArray.length - 1; i++) {
			Employee emp2 = emp1[i];
			System.out.println("After deserialzation");
			System.out.println("Id = " + emp2.getEid());
			System.out.println("Name = " + emp2.getEname());
			System.out.println("Salary= " + emp2.getEsal());
			System.out.println("location= " + emp2.getEloc());
			System.out.println("Experiance= " + emp2.getEexp());
		}
	}

	// For Updating
	public void update() throws IOException, ClassNotFoundException, UpdateException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Update the employee details");
		System.out.println("Enter the Employee id: ");
		int tempId = scan.nextInt();

		for (int i = 0; i <= empArray.length - 1; i++) {
			Employee emp = (Employee) empArray[i];
			if (empArray[i] == null) {
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

					empArray[i] = emp;

				}
			}
		}
		for (int i = 0; i <= empArray.length - 1; i++) {
			Employee emp = (Employee) empArray[i];
			System.out.println(i + 1 + " Employee details");
			System.out.println("Id = " + emp.getEid());
			System.out.println("Name = " + emp.getEname());
			System.out.println("Salary= " + emp.getEsal());
			System.out.println("location= " + emp.getEloc());
			System.out.println("Experiance= " + emp.getEexp());
			System.out.println();

			serialization();
		}

	}

	public void delete() throws AllException {
		System.out.println("Enter the employee id");
		int tempId = scan.nextInt();
		for (int i = 0; i <= empArray.length - 1; i++) {
			Employee emp = (Employee) empArray[i];

			if (empArray[i] == null) {
				throw new UpdateException().new AllException();
			} else {
				if (tempId == emp.getEid()) {
					empArray[i] = null;
					System.out.println("Deleted Sucessfully");
				}
			}
		}
		for (int i = 0; i <= empArray.length - 1; i++) {
			if (empArray[i] != null) {

				Employee emp = (Employee) empArray[i];
				System.out.println(i + 1 + " Employee details");
				System.out.println("Id = " + emp.getEid());
				System.out.println("Name = " + emp.getEname());
				System.out.println("Salary= " + emp.getEsal());
				System.out.println("location: " + emp.getEloc());
				System.out.println("Experiance= " + emp.getEexp());
				System.out.println();
				serialization();
			}

		}
	}

	public void loan() throws AllException {
		System.out.println("Enter the Employee id: ");
		int tempId = scan.nextInt();
		for (int i = 0; i <= empArray.length - 1; i++) {
			Employee emp = (Employee) empArray[i];

			if (empArray[i] == null) {
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
		for (int i = 0; i <= empArray.length - 1; i++) {
			Employee emp = (Employee) empArray[i];
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
		for (int i = 0; i <= empArray.length - 1; i++) {
			Employee emp = (Employee) empArray[i];

			if (empArray[i] == null) {
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

	public static void main(String[] args) throws ClassNotFoundException, IOException, Exception {
		// TODO Auto-generated method stub
		Test t = new Test();
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1-Insert");
			System.out.println("2-For Update");
			System.out.println("3- For Delete");
			System.out.println("4-Apply for Loan");
			System.out.println("5- view");
			System.out.println("6-Exit");
			System.out.println("7-deserialization");
			System.out.println("Enter your choice: ");
			int no = scan.nextInt();
           if(no<8){
			switch (no) {
			case 1: {
				// System.out.println("Enter no of Employees: ");
				t.insert();
			}
				break;
			case 2: {

				t.update();
			}
				break;
			case 3:
				t.delete();
				break;
			case 4:
				t.loan();
				t.emi();
				break;

			case 5:
				t.view();
				break;

			case 6:
				t.exit();
				break;

			case 7:
				deserialization();

			}

		}else{
			System.out.println("Enter the choice between 1 to 7");
		}

	}
}
}
