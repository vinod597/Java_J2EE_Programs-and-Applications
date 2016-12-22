package LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args){
		int n ,count ;
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the no : ");
		n=scn.nextInt();
		for(int i =1;i<=n;i++)
		{
			count =0;
			for(int j=2;j<=i/2; j++)
			{
				if(i%j==0)
				{
					count ++;
					break;
				}
			}
			if(count ==0)
			{
				System.out.println(i);
			}
		}
		
	}

			

	}

