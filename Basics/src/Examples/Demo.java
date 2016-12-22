package Examples;

public class Demo {
    
	int[] i= new int[3];
	static int j;
	
	public void insertion()
	{
		for(int k=0; k<=2;k++)
		{
			i[k]=k;
			j=k+i[k];
		}
		int i=2;
		while(i>=0)
		{
			i=i+i;
			i--;
		}
		do
		{
			System.out.println("Do while");
			    i++;
			   
		}while(i<=0);
		}
	
public static void main(String[] args)
{
	Demo demo= new Demo();
	demo.insertion();
	
	if(j<demo.i[0])
	{
		System.out.println(j+ "Value is less");
	}
	if(j>demo.i[1])
	{
	  System.out.println("J is greter");	
	}
	else
	{
		System.out.println("J is less");
	}
	if(demo.i[0]>j)
	{
		System.out.println(demo.i[0]+ "value is greater");
	}
	else if(demo.i[1]>j)
	{
		System.out.println(demo.i[1]+" Is greater");
	}else
	{
		System.out.println(j+ "Is greater");
	}
}
}