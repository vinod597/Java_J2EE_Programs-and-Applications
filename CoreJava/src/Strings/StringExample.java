package Strings;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 =new String("Dhatri");
		String s2= "dhatri";
		String s3 = new String("Dhatri");
		String s4 ="dhatri";
		
		String t1 =new String("Dhatri");
		String t2="Infosys";
		String t3= new String("Tcs");
		String t4="543215";
		
		if(s1.equals(s4))
		{
			System.out.println("Content same");
		}
		else
			System.out.println("Diff content");
		if(s1==s2)
		{
			System.out.println("Same ref");
		}
		else
			System.out.println("diff ref");
		if(s2==s4)
		{
			System.out.println("Both same");
		}
		else
			System.out.println("Diff");
		
		if(t1.equals(t3))
		{
			System.out.println("same t1 eq t3");
			
		}else
			System.out.println("Diff t1 e t3");
		if(t1==t4)
		{
			System.out.println("same");
		}
		else
			System.out.println("diff");
		

	}

}
 