import java.util.HashSet;
import java.util.Set;
public class First {
	public void setFirst(Set set1, Set set2) {
		Set set = new HashSet(set1);
		set.addAll(set2);
		System.out.println("SetFirst = " + set);
	}

	public void cross(Set set1, Set set2) {
		Set set = new HashSet(set1);
		set.retainAll(set2);
		System.out.println("Cross  = " + set);
	}

}
