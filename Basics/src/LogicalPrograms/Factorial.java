package LogicalPrograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		int i,n = 0,fact = 1;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter The Factorial no :  ");
		 n = scn.nextInt();
		for(i =1;i<=n;i++)
		{
			fact = fact * i;
		 	
		}
		System.out.println("Factorial no is :" +fact);

	}

}
