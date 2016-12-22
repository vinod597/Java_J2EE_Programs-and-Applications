package Inheritance;

public class First1 {
	int x,y;
	public void functionOne(int x,int y)
	{
		this.x=x+y;
		this.y=this.x+this.y;
	}
}
class Third extends First1
{
	int x,y;
	public void functionTwo(int x,int y)
	{
		this.x=x+y;
		this.y=x*y;
	}
}
class Second1 extends Third
{
	int x;
	public void display()
	{
		System.out.println("X value = "+x);
		System.out.println("Y value = "+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second1 sc = new Second1();
		sc.functionOne(2, 3);
		sc.display();
		
		Third t = new Third();
		t.functionTwo(5, 7);
		// t.display();
		
		System.out.println("x value =" +sc.x);
		System.out.println(sc.y);
		System.out.println(t.x);
		System.out.println(t.y);
	}

}
 