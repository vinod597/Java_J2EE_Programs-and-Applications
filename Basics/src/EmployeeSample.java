import java.util.Scanner;

public class EmployeeSample {
    int [] array= new int [8];
    private static int empNum;
    private double empSal;
	private int id;
    void Test1(int e, double s){
        empNum = e;
        empSal = s;
    }
    public static int getUniqueEmpId() {
        empNum = empNum + 1;
        return empNum;
    }
    public void setId(int Id){
    	this.id=id;
    }
    public double getSalary(){
        return empSal;
    }

    public static void main(String[]args){
    	
        Scanner sc = new Scanner(System.in);
        EmployeeSample emp = new EmployeeSample();
        emp.setId(EmployeeSample.getUniqueEmpId());

        for(int i = 0;i<2;i++){
        System.out.println("Please enter your employee number:");
        int e = sc.nextInt();
        System.out.println("Please enter your salary:");
        double s= sc.nextInt();
    }
}
}