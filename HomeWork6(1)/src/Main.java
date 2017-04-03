
public class Main {

	public static void main(String[] args) {
Employee[] employeeArray = new Employee[4];
		
		employeeArray[0] = new SalariedEmployee("1", "Andriy", 10, 100);
		employeeArray[1] = new SalariedEmployee("2", "Roman", 45, 110);
		employeeArray[2] = new ContractEmployee("3", "Oleh", "twe8", 102, 54);
		employeeArray[3] = new ContractEmployee ("4", "Alla", "45ds", 47, 70);

		
		
		
		for (int i=0; i<employeeArray.length; i++){
			Calculate tmp = (Calculate) employeeArray[i];
			System.out.println(tmp);
		}
		

	}

}
