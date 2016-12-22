package Examples;

public class ThisKeyword {
	long l1,l2;
	static double d1,d2; 
	
	ThisKeyword()
	{
		d1= 1.5;
		d2= d1+1.5;
		
	}
	ThisKeyword(long l1,long l2)
	{
		this.l1=l1+l2;
		l2 = this.l1;
		this.l2= l2+this.l1;
	}
	public double functionOne(double d1, double d2)
	{
		ThisKeyword.d1=d1+d2;
		ThisKeyword.d2=d2+ThisKeyword.d1;
		return d1+d2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword te1 = new ThisKeyword();
		double d1=te1.functionOne(1.5, 1.5);
		
		ThisKeyword te2 = new ThisKeyword((long)d1,5);
		System.out.println("d1 value :"+d1);
		System.out.println("d2 value :" +d2);
		
		System.out.println("L1 & L2 Values in first obj:" +(te1.l1+te1.l2));
		System.out.println("L1 & L2 Values in second obj:"+(te2.l1+te2.l2));
		
		
		

	}

}
