package DesignPatterns;

public class SingleTon {
	public static SingleTon singleobj=new SingleTon();
	private SingleTon()
	{
		
	}
	public static SingleTon getInstance()
	{
		return singleobj;
		
	}
	public void display()
	{
		System.out.println("This is singleton class");
	}

/*public class Example{
	public void display1()
	{
		SingleTon s1=new SingleTon();
		s1.display();
	}
} */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SingleTon.getInstance().display();
       //singleobj.new Example();
       
	}

}
