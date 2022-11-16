package com.groupingby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpMain {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		Employee employee = new Employee();
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		
		employee.setDeptName("Test");
		employee.setId(1);
		employee.setName("Ashraf");
		
		employee1.setDeptName("Test");
		employee1.setId(1);
		employee1.setName("Harry");
		
		employee2.setDeptName("Test");
		employee2.setId(1);
		employee2.setName("Pirates");
		
		empList.add(employee);
		empList.add(employee1);
		empList.add(employee2);
		
		Map<String, List<Employee>> map = empList.stream().
				collect(Collectors.groupingBy(Employee::getDeptName));
		
		System.out.println(map);
		
		
	}

}
