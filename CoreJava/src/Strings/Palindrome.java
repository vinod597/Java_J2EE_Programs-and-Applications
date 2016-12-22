package Strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn1=new Scanner(System.in);
		System.out.println("Enter name: ");
		String p =scn1.next();
		StringBuffer sb=new StringBuffer(p);
		sb.reverse();
		System.out.println(sb);
		if(p.equals(sb))
		{
			System.out.println("Palindrome");
		}else
			System.out.println("Not Palindrome");
		
		
		

	}

}
