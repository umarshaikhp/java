package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int compareTo(Student o) {
		if (age==o.age) {
			return 0;
		}
		else if (age<o.age) {
			return 1;
			
		}
		else {
			return -1;
		}
		// TODO Auto-generated method stub

	}

		
	}

public class TestSort3 {

	public static void main(String[] args) {
		ArrayList<Student> l1 = new ArrayList<Student>();
		l1.add(new Student(3, "umar", 22));
		l1.add(new Student(2, "khalid bhai", 21));
		l1.add(new Student(1, "farid bhai", 30));
		Collections.sort(l1);
		for(Student i:l1) {
			System.out.println(i.rollno+ " "+i.name+" "+i.age);
		}
		// TODO Auto-generated method stub

	}


}
