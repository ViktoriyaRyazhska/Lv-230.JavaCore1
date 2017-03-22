package com.edu3;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee [] workers = new Employee [4];
		workers [0] = new ContractEmployee("1", "Akakij", "44444",10000);
		workers [1] = new SalariedEmployee("2", "Borys", "54555",55, 163);
		workers [2] = new ContractEmployee("3", "Varvara", "66666",8200);
		workers [3] = new SalariedEmployee("4", "Navuhodonosor", "69696", 64, 154);
		
		Employee sort;
		
	for(int i = 0; i < workers.length;i++){
		for (int j = i + 1; j < workers.length;j++){
			if(((Calculation) workers[i]).calculatePay() < ((Calculation) workers[j]).calculatePay()){
				
				sort = workers[i];
				workers [i] = workers [j];
				workers[j] = sort;
			}
		}
	}	

		for(Employee print : workers){
			System.out.println(print);
		}
}
}