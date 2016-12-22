package DesignPatterns;

import java.util.Scanner;

public interface FactoryMethod {
	public void draw();
}

class Rectangle implements FactoryMethod {
  @Override
	public void draw() {
		System.out.println("Rectangle shape Drawn");

	}
}

	class Triangle implements FactoryMethod {
      @Override
		public void draw() {
			System.out.println("Drwan the Triangle");

		}

	}
	  class FactoryMethodImp {
		public static FactoryMethod getType(String draw)
		{
			if(draw==null)
			{	
			return null;
			}
		else if(draw.equals("rectangle"))
		{
			return new Rectangle();
		} else if(draw.equals("triangle"));

		{
			return new Triangle();
		}
	}
}
	  class Test 
	  {
		  public static void main(String[] args){
			  Scanner scan =new Scanner(System.in);
			  System.out.println("1.Rectangle/ 2.Triangle ");
			  int choice = scan.nextInt();
			 // int choice = 0;
			switch(choice)
			  {
			case 1: FactoryMethod fm=FactoryMethodImp.getType("rectangle");
			         fm.draw();
			         break;
			case 2: FactoryMethod fm1=FactoryMethodImp.getType("Triangle");
			        fm1.draw();
			        break;
			
				
			  }
		  }
	  }
