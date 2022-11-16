package com.emp;

import java.util.List;
import java.util.stream.Collectors;

public class EmpMap {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		List<Employee> list = null;
		
		
		list.stream().map(s-> s.getName()).collect(Collectors.toList());
	}

}
