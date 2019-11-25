package com.sk.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo2 {
	public static void main(String[] args) {
		System.out.println(4.0 * 1.1);
		List<Student> students = Arrays.asList(new Student(1, 3, "John"), 
				                               new Student(2, 3, "Jane"),
				                               new Student(3, 3, "Jack"));

		Consumer<Student> raiser = e -> {
			e.gpa = e.gpa * 10;
		};

		//raiseStudents(students, System.out::println);
		raiseStudents(students, raiser.andThen(e -> {System.out.println(e.gpa = e.gpa * 20);}));
	}

	private static void raiseStudents(List<Student> students, Consumer<Student> fx) {
		students.stream().forEach(fx);
		for (Student s : students) {
			fx.accept(s);
		}
	}

}

class Student {
	public int id;
	public double gpa;
	public String name;

	Student(int id, long g, String name) {
		this.id = id;
		this.gpa = g;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ">" + name + ": " + gpa;
	}
}