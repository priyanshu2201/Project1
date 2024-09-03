package com.citi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

		System.out.println("Hello World!\n");

		Employee emp1 = new Employee("AAA", 25, "Darbhanga", 50000);
		Employee emp2 = new Employee("BBB", 22, "Delhi", 90000);
		Employee emp3 = new Employee("CCC", 55, "Hyd", 80000);
		Employee emp4 = new Employee("DDD", 20, "Mumbai", 40000);
		Employee emp5 = new Employee("EEE", 45, "panjab", 20000);
		Employee emp6 = new Employee("FFF", 25, "UP", 70000);
		Employee emp7 = new Employee("GGG", 75, "Bihar", 40000);

		List<Employee> al = new ArrayList();

		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);
		al.add(emp6);
		al.add(emp7);

	
		al.stream().forEach(System.out::println);
		
		System.out.println("*****************************************!\n");
		
		Map<String, Double> map = al.stream().collect(Collectors.toMap(emp->emp.getName(), emp->emp.getSalary()));
		
		map.forEach((k,v)->System.out.println("key : "+k +" value : "+v));

	}
}
