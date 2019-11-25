/**
 * 
 */
package com.sk.defult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Sekhar Keerthi
 *
 */
public class Demo2 {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Boolean b = true ? returnsNull() : false;
		System.out.println(b);*/
		
		Employee2 employee1 = new Employee2();
		employee1.setId(1001);
		employee1.setName("John");
		Employee2 employee2 = new Employee2();
		employee2.setId(1002);
		employee2.setName("Kelvin");
		List<Employee2> employeeList = new ArrayList<>();
		employeeList.add(employee2);
		employeeList.add(employee1);
		
		//Collections.sort(employeeList);

		System.out.println(employeeList.get(0).getName());
		System.out.println(employeeList.get(1).getName());
		int x = 5;
		System.out.println( x++ );
		System.out.println("\n" + ++x );

	}

	public static Boolean returnsNull() {
		return null;
	}
	
	
}
