package LogicalPrograms;

import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int src = 0, dest = 1 ;
		Scanner scn = new Scanner(System.in);
		int[] n= {5,7,4,2,3};
		System.out.println("Enter the position to swap: " +src +" "+dest);
		 src  = scn.nextInt();
		 dest = scn.nextInt();

		int Temp =n[0];
		 n[0]=n[1];
		 n[1]= Temp;
		
		for(int i =0;i<n.length; i++)
		{
			System.out.print(n[i]+" ");
		}


	}
}
