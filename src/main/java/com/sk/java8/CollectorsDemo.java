package com.sk.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Employee {
	private Integer id;
	private String name;
	private Double salary;
	private String department;
}

public class CollectorsDemo {

	public static void main(String[] args) {
		Stream<Employee> empStream = Stream.of(
				Employee.builder().id(1).name("sekhar").salary(8.5).department("IT").build(),
				Employee.builder().id(2).name("Jogi").salary(10.0).department("Management").build(),
				Employee.builder().id(3).name("Keerthi").salary(15.5).department("IT").build(),
				Employee.builder().id(4).name("Satya").salary(18.5).department("Management").build());
		/* Count No.of employees */
//		 System.out.println(empStream.count()); // No.of employees

		/* Accumulate names into a List */
		
//		List<String> names = empStream.map(e -> e.getName()).collect(Collectors.toList()); 
//		System.out.println(names);

		/* Accumulate names into a TreeSet */
		
//		Set<String> treeSet = empStream.map(e -> e.getName()).collect(Collectors.toCollection(HashSet::new));
//		Set<String> treeSet = empStream.map(e -> e.getName()).collect(Collectors.toCollection(() -> {return new TreeSet<String>();}));
//		Set<String> treeSet = empStream.map(e -> e.getName()).collect(Collectors.toCollection(TreeSet::new));
//		System.out.println(treeSet); 

		/* Compute sum of salaries of employee */
		
//		Double totSal = empStream.collect(Collectors.summingDouble(e -> {return e.getSalary();} ));
//		Double totSal = empStream.collect(Collectors.summingDouble(e -> e.getSalary()));
//		Double totSal = empStream.collect(Collectors.summingDouble(Employee::getSalary));
//		System.out.println(totSal);

		/* Convert elements to strings and concatenate them, separated by commas */
		
//		String name = empStream.map(x -> x.getName()).collect(Collectors.joining(","));
//		String name = empStream.map(Employee::getName).collect(Collectors.joining(","));
//		String name = empStream.map(Object::toString).collect(Collectors.joining(","));
//		System.out.println(name);

		/* Group employees by department */
		
//		Map<String, List<Employee>> groupEmpByDept = empStream.collect(Collectors.groupingBy(Employee::getDepartment));
//		System.out.println(groupEmpByDept);
		
		/* Compute sum of salaries by department */
		
		//Collectors.groupingBy(Employee::getDepartment, Collectors.summarizingDouble(Employee::getSalary))
//		Map<String, Double> groupEmpByDeptAndSal = empStream.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
//		System.out.println(groupEmpByDeptAndSal);
		
		/* Partition employees' salary into high and low */
		Map<Boolean, List<Employee>> partitionEmpSal = empStream.collect(Collectors.partitioningBy(e -> e.getSalary() > 10.0));
		System.out.println(partitionEmpSal);
	}

}
