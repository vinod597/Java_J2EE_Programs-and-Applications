package Examples;

public class Constructor {
	Constructor()
	{
		this(5,7);
		System.out.println("Default Constructor");
	}
	Constructor(int i)
	{
		
		System.out.println("One arg Constructor: " +i);
	}
	Constructor(int i ,int j)
	{
		this(5);
		System.out.println("Two arg Constructor: " +(i+j));
	}
	

	public static void main(String[] args) {
		
		Constructor ct = new Constructor();
	
		//	Constructor ct1 = new Constructor(3);
		//Constructor ct2 = new Constructor(5,7);
		
	}

}
