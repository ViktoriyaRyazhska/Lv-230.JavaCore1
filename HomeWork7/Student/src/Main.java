import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		Student student = new Student();
		List<Student> list = new ArrayList<>();
		list.add(new Student("Slavik", 4));
		list.add(new Student("Diana", 2));
		list.add(new Student("Andriy", 5));
		list.add(new Student("lilia", 4));
		list.add(new Student("Oles", 5));

		
		System.out.println("Sorting the name:");
		list.sort(student.getNameComparator());
for (Student student2 : list) {
			System.out.println(student2);
		}
System.out.println("Sorting Exchange:");
		list.sort(student.getCourseComparator());
for (Student student2 : list) {
			System.out.println(student2);
		}
	}

}
