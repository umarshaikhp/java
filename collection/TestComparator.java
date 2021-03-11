package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collector;

public class TestComparator {
	public static void main(String[] args) {
		ArrayList<Student1> l1 = new ArrayList<Student1>();
		l1.add(new Student1(20, "farid khan", 12));
		l1.add(new Student1(34, "akhlaque", 34));
		l1.add(new Student1(35, "shamshad", 30));
		
		Collections.sort(l1,new AgeComparator());
		for(Student1 i:l1) {
			System.out.println(i.rollno+" "+i.age+" "+i.name);
		}
	
	Collections.sort(l1, new NameComparator());
	for(Student1 i:l1) {
		System.out.println(i.name+" "+i.age+" "+i.rollno);
	}
	}
}
