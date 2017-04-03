import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		First one = new First();
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(6);
		set1.add(4);
		Set<Integer> set2 = new HashSet<>();
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		    
		one.setFirst(set1, set2);  
		one.cross(set1, set2);
		  

	}

}
