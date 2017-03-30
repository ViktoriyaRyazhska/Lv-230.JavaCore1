package yuaremchuk.olga.person;

public class GroupOfPersons {

	public static void main(String[] args) {
		Person per1 = new Person ("Andrew", 1990);
		Person per2 = new Person ("Sophie", 1987);
		Person per3 = new Person ("Anton", 1992);
		Person per4 = new Person();
		per4.inputInfo("Ann", 1992);
		Person per5 = new Person();
		per5.setName("Oleg");
		per5.setBirthYear(1993);
		
		per2.changeName("Nick");
		
		per1.outputInfo();
		per2.outputInfo();
		per3.outputInfo();
		per4.outputInfo();
		per5.outputInfo();
		
	}

}
