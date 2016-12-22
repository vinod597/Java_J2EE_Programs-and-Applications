package Abstraction;

public abstract class Calculator {
	int a,b;
	public int sum(int a,int b)
	{
		this.a=a;
		this.b=b;
		return this.a+this.b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public abstract int mul(int a,int b);
	public abstract int div(int a,int b);
}
abstract class Cal extends Calculator
{
	@Override
	public int mul(int a, int b) {
		
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	public abstract int division(int a,int b);
	
}
	
	class Cal1 extends Cal
	{

		@Override
		public int division(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
		
	}
public class Test
{
	public static void main(String[] args)
	{
		Cal1 c= new Cal1();
		System.out.println(c.sub(2, 5));
		System.out.println(c.sum(5, 7));
		System.out.println(c.mul(5, 2));
		System.out.println(c.div(7, 3));
	}
}

