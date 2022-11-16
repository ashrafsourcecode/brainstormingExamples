package com.access.lambda;

public class LambdaVariableAccess {
	
	public static void main(String[] args) {
		// here if we uncomment line 9 thn err comes n same with line 12,13
		// 8 to 10 are enclosing scope and 11to 16 within lambda body
		int n=3;
		//n=5;
		int test=1;
		FunIntr fi = d->{
			//int test =6;
			//n++;
			System.out.println("n check it "+n);
			System.out.println("test check it "+test);
			return 9;
			
		};
		
		System.out.println("test "+fi.test(8));
	}

}
