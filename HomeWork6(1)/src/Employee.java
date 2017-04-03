
public class Employee {
	String employeeID;
	String name;
	public Employee(String employeeID, String name) {
		super();
		this.employeeID = employeeID;
		this.name = name;
	}
	
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + "]";
	}
	}
