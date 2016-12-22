package Examples;

public class StaticNonStatic {
	int i,j;
	static float f1,f2;
	static boolean flag;
	
 public int functionOne(float f1,float f2){
	 i=(int)f1;
	 j=i+(int)f2;
	return i+j;
	 
 }
 public void functionTwo(){
	 int k;
	 k=functionOne(f1,f2);
	 System.out.println("K value:" +k);
 }
 public static float functionThree(int i,int j){
	 return i+j;
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNonStatic sns = new StaticNonStatic();
		sns.f1 = functionThree(2,5); 
		sns.f2 = sns.f1+f1;
		sns.functionTwo();
		
		System.out.println("f1 value = "+f1);
		System.out.println("f2 value = "+f2);
		if(sns.i>sns.j)
		{
			sns.flag = true;
		}else
			sns.flag= false;
		if(flag)
		{
			System.out.println("Hi");
		}else
			System.out.println("Hellow");
			
		}

	}


