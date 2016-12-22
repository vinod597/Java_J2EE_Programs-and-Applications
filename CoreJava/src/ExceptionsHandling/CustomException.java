package ExceptionsHandling;

import java.util.Scanner;
class Test{
	public void fun()
	{
	  System.out.println("Print it");	
	}
}
 class AgeException extends Exception{
	public String toString()
	{
		return "Age should be greterthan 21";
		
	}
 }
 public class CustomException{
public static void main(String[] args) throws AgeException
   {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter your age to get a loan: ");
	int Age = scn.nextInt();
	if(Age>21){
		System.out.println("you are eligible to have a sip");
	}else
	{
		throw new AgeException();
	}
   }
 }


