package com.exmaples;

import java.util.Arrays;

public class ArrayNumber {

	public static void main(String[] args) {

		int a[] = { -1, -1, -1, -1, 1, 9, 3, 2, -1, 4, -1,10,11,-1,-1,-1,15 };
		int b[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 ,12,13,14,15,16};
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("value of i at 8 "+a[8]);
			System.out.println("value of i at 9 "+a[9]);
			System.out.println("value of i at 10 "+a[10]);
			for (int j = 1; j < a.length; j++) {
				if (a[i] == b[j]) {
					System.out.println("yes at position b " + j+"value of i "+i);
					System.out.println("value at a[i] " + a[i]+"value at b[j] "+b[j]);
					a[j] = b[j];
					if(i!=j)
					a[i] = -1;
				}
			}
		}
		System.out.println("array " + Arrays.toString(a));
	}

}
