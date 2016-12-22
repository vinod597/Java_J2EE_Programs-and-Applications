import java.io.Serializable;

public class EmployeeId implements Serializable {

	private static int empNum = 0;

	public static int base_sal = 1000;

	public static int getBase_sal() {
		return base_sal;
	}

	public static synchronized void setBase_sal(int base_sal) {
		//Employee.base_sal = base_sal;
	}

	public int id;
	public String name;
	public String type;

	public int getId() {
		return id;
	}

	public static int getUniqueEmpId() {
		empNum = empNum + 1;
		return empNum;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	protected void finalize() throws Throwable {
        try {
            // resource cleanup
        } catch(Throwable th) {
            throw th;
        } finally {
            super.finalize();
        }
	}
	public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        EmployeeId emp = new EmployeeId();
        emp.setId(EmployeeSample.getUniqueEmpId());
        emp.setName("ABC");
        emp.setType("Regular");
 
        EmployeeId emp1 = new EmployeeId();
        emp1.setId(EmployeeSample.getUniqueEmpId());
        ((EmployeeId) emp1).setName("DEF");
        emp1.setType("Regular");
 
        System.out.println("ID: " + emp.getId() + " Name: " + emp.getName() + " Type: " + emp.getType());
        System.out.println("ID: " + emp1.getId() + " Name: " + emp1.getName() + " Type: " + emp1.getType());
    }
} 


