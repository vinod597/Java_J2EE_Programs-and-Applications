package Examples;

public class JavaBasics {
	long l1,l2;
	static double d1,d2;
	
	JavaBasics(long l1,long l2)
	{
		this.l1=l1+l2;
		this.l2= l1*l2;
	}
	JavaBasics()
	{
		this((long)d1,(long)d2);
		d1=l1;
		d2=l1;
	}
	public int functionOne(double d1,double d2)
	{
		int k=(int)d1+(int)d2;
		return k;
		
	}
	public static double functionTwo(int i)
	{
		JavaBasics jb= new JavaBasics();
		i=i+jb.functionOne(d1, d2);
		System.out.println(i);
		System.out.println(jb.l1);
		System.out.println(jb.l2);
		return 7.5;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         JavaBasics jb = new JavaBasics();
         double d1 = functionTwo(2);
         System.out.println(d1);
         System.out.println(jb.l1);
         System.out.println(jb.l2);
         System.out.println(jb);
	}

}
