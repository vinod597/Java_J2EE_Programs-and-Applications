package Strings;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter The Name : ");
		String s1 =scn.next();
		for( int i=0;i<=s1.length()-1;i++)
		{
			System.out.println(s1.charAt(i));
		} 
		
		System.out.println("Enter For Code : ");
		String s2 =scn.next();
		for(int i=0;i<=s2.length()-1;i++)
		{
			System.out.println(s2.codePointAt(i));
		}
			
		System.out.println("Enter For CodepointBefore : ");
		String s3 =scn.next();
		for(int i=0;i<=s3.length()-1;i++)
		{
			System.out.println(s3.codePointBefore(3));
		}
		
		
		System.out.println("Enter For CodepointBefore1 : ");
		String s4 =scn.next();
		int i1= s4.codePointBefore(3);
		System.out.println(i1); 
		
		System.out.println("Enter For CodepointCount : ");
		String s5 =scn.next();
		int i2= s5.codePointCount(0, 5);
		System.out.println(i2);
		
		System.out.println("Enter for Concat : ");
		String s6=scn.next();
		System.out.println(s6);
		System.out.println("Add value for Concat: ");
		String s7 =scn.next();
		String s =s6.concat(s7);
		System.out.println(s);
		
		System.out.println("Enter Contains Value: ");
		String n=scn.next();
		System.out.println("Contains or not : ");
		String n1=scn.next();
		System.out.println(n.contains(n1));
		
		System.out.println("Enter name:");
	    String name = scn.nextLine();
	    System.out.println(name.isEmpty());
	    
	    System.out.println("Enter name:");
	    String name1 = scn.nextLine();
	    if(name1.isEmpty())
	    {
	    	System.out.println("true");
	    }else
	    	System.out.println("String is not Empty");
	        System.out.println();
		    System.out.println("Length of String :"+name1.length());
		    System.out.println();
		    System.out.println("string value = " + name1.toUpperCase());
		    System.out.println();
		    System.out.println("string value = " + name1.toLowerCase());
	      
		char[] St1 = {'j', 'a', 'v', 'a',' ', 'c', 'o', 'd', 'e', 'd'};
	      String St2 = " k";
	      St2 = St2.copyValueOf( St1 );
	      System.out.println("Returned String: " + St2);
	      
	      St2 = St2.copyValueOf( St1, 2, 6 );
          System.out.println("Returned String: " + St2);
	      
	/*     System.out.println("Enter char: ");
	      char c =scn.next().charAt(0);
	      String St2 = "";
	      for(int i=0;i<=c;i++)
	      {
	    	  System.out.println(c.copyValueOf(St2);
	      }
	 */   
		System.out.println("Enter Name : ");
		String st=scn.next();
		System.out.println("Check Ends with: ");
		String v =scn.next();
		System.out.println(st.endsWith(v));
		System.out.println("Starts with : ");
		String v1=scn.next();
		System.out.println(st.startsWith(v1));
		
		System.out.println("Enter for Equals : ");
		String v3=scn.next();
		System.out.println("Equals : " +st.equals(v3));
		System.out.println("Equals Casesenstive: "+st.equalsIgnoreCase(v3));
		
		System.out.println("Enter Name : ");
		String st1=scn.next();
		System.out.println("HashCode: "+st1.hashCode());
		
		System.out.println("Indexof : "+st1.indexOf( 'o' ));
		System.out.println("Index Ch,I: "+st1.indexOf( 'o', 2 ));
		
		}
	}

