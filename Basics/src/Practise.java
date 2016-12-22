
public class Practise {
	 float x,y;
	 static long l1,l2 ;


  Practise (float x,float y){
	  this.x= x;
	  this.y= y;
  }
  public float function(float x,float y){
	 l1 = (long)(x+y);
	 l2 = (long)(x*y);
	return l1+l2;
	  
  }
  public static Practise function1(long l1,long l2){
	  
	  Practise p = new Practise(3,5);
	  float k = p.function((float)l1,(float)l2);
	  Practise.l1= Practise.l1+l1;
	  Practise.l2= Practise.l2*l2;
	  System.out.println("k value:"+k);
	return p;
	  
  }

	public static void main(String[] args) {
		Practise pc =Practise.function1(5,6);
		System.out.println("X value:"+pc.x);
		System.out.println("Y value:"+pc.y);
		System.out.println("l1 value:"+l1);
		System.out.println("l2 value:"+Practise.l2);
		System.out.println("pc = "+pc);
	}

}
