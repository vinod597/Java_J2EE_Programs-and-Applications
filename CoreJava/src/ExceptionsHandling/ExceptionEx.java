package ExceptionsHandling;

public class ExceptionEx {
	int j;
	int i[]=new int[2];
	A a;
	public void function()
	{
		
		
		//j=1/i[0];
		//a.i=j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionEx ee=new ExceptionEx();
		ee.function();
		try{
			ee.i[3]=5;
		
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("This will not divided");
		}catch(ArithmeticException np){
			System.out.println("Nul point");
		}catch(Exception e){
			System.out.println("Exception");
		}

	}
	class A{

	 int i,j;
		
	}

}
