package com.sort.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortObj {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee("aa", "gg"));
		list.add(new Employee("aa3", "gg3"));
		list.add(new Employee("aa2", "gg2"));
		list.add(new Employee("aa4", "gg4"));

		System.out.println(list);

		Comparator<? super Employee> comparator = null;
		list = list.stream().sorted((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()))
				.collect(Collectors.toList());

		System.out.println(list);
	}

}
