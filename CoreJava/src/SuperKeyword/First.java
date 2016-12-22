package SuperKeyword;

public class First {
	int a,b;
	public void function(int a, int b)
	{
		System.out.println("Void Function int a,b");
		this.a= a+b;
		this.b= a*b;
		
	}
	public void function(int b)
	{
		System.out.println("Void Function int b");
		a=this.b+b;
		b=a;
		
	}
}
class Second extends First
{
	int a,c;
	public void function(int a,int c)
	{
		super.function(a, c);
		super.a=c;
		this.a=a+c;
		this.c= a*c;
		System.out.println("Void Function int a,c");
	}
	}

class Third extends Second
{
	int c;
	public void function(int c)
	{
		super.function(c);
		super.c=c;
		this.c=c*c;
		a=this.c;
		b=a;
		System.out.println("Void Function int c");
	}
}
class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Third t =new Third ();
		t.function(10);
		t.function(2,5);
		
		First f =new Third();
		f.function(5);
		f.function(3,2);
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(f.a);
		System.out.println(f.b);
		//System.out.println(f.c);
		

	}

}
