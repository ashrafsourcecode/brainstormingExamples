package com.sort.java8;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };

		int b[] = new int[4];
		int c[] = new int[4];

		int product = 1;

		int givenNum = 1;

		for (int i = 0; i < a.length; i++) {

			if (givenNum != a[i]) {
				b[i] = a[i];
				product = product * b[i];
				c[i]=product;
			}

		}

		System.out.println(b[0]);
		System.out.println(product);
		
		System.out.println(Arrays.toString(c));

	}

}
