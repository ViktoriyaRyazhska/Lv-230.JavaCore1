package task1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		
		Set<Integer> set1= new HashSet<Integer>();
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(8);
		set1.add(9);
		
		Set<Integer> set2= new HashSet<Integer>();
		set2.add(8);
		set2.add(9);
		set2.add(10);
		set2.add(11);
		set2.add(12);
		
		
		System.out.println(union(set1, set2));
		
		System.out.println(intersect(set1, set2));
		
	}
	
	public static Set union(Set set1, Set set2)  {
		Set set = new HashSet<>(set1);
		set.addAll(set2);
		
		return set;
	}
	
	public static Set intersect(Set set1, Set set2) {
		Set set = new HashSet<>(set1);
		set.retainAll(set2);
		return set;
	}

}
