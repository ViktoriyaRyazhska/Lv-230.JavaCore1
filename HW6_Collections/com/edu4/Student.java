package com.edu4;

import java.util.Comparator;

public class Student {

	private String name;
	private int course;
	
    static NameComparator nameComparator = 
			new NameComparator( );
    
    static —ourseComparator courseComparator = 
			new —ourseComparator();
    
    public static Comparator getNameComparator( ) {
       return nameComparator;
       }
    
    public static Comparator get—ourseComparator( ) {
       return courseComparator;
       }

    static class NameComparator implements Comparator {
	  public int compare(Object o1, Object o2) {
	    return ((Student)o1).name.compareTo(((Student)o2).name);
	  }
	}

	static class —ourseComparator implements Comparator {
	  public int compare(Object o1, Object o2) {
	    return ((Student)o1).getCourse() - ((Student)o2).getCourse();
	  }
	}
	
	public Student(String name, int course) {
		
		this.name = name;
		this.course = course;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (course != other.course)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
}
