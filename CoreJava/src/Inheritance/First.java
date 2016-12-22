package Inheritance;

public class First {
	int x,y;
	
	public void functionOne(int x,int y)
	{
		this.x=x+y;
		this.y=this.x+this.x;
		
	}
}
class Second extends First
{
	public void display()
	{
		System.out.println("X value = "+x);
		System.out.println("Y value = "+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second sc =new Second();
		sc.functionOne(2, 3);
		sc.display();
		
		First f =new First();
		f.functionOne(5, 10);
		//f.display();
		
		System.out.println("x value ="+f.x);
		System.out.println("y value ="+f.y);

	}

}
