package com.sort.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortWithJava8 {
	
	
	public static void main(String[] args) {
		
		Employee emp = new Employee("Ashraf", "Ali");
		Employee emp1 = new Employee("Ashraf", "Ali");
		Employee emp2 = new Employee("Ashraf", "Ali");
		
		List<Employee> list = Arrays.asList(emp);
		list.add(emp1);
		list.add(emp2);
		
		//list.stream().sorted
		
		
	}

}
