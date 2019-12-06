package com.sk.all;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee2 emp1 = new Employee2(1, "Sekhar Keerthi");
		
		Employee2 emp2 = (Employee2) emp1.clone();
		
		System.out.println(emp2);

	}

}
