package com.collection;

import java.util.Comparator;

public class Student1 {
	int rollno;
	String  name;
	int age;
	public Student1(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	

}

class AgeComparator implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		if (o1.age==o2.age) {
			return 0;
		}
		else if (o1.age>o2.age) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}

class NameComparator implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
     return o1.name.compareTo(o2.name);
	}
}
