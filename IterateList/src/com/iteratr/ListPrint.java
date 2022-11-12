package com.iteratr;

import java.util.Arrays;
import java.util.List;

public class ListPrint {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("node", "java", "python", "ruby");
		list.forEach(str -> System.out.println(str));
	}

}
