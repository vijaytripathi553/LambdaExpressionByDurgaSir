package com.durga.lamda;

interface Addition
{
	public int add(int a, int b);
}

public class Example2WithoutLambda implements Addition {

	@Override
	public int add(int a, int b) {
		return a+b;
		
		
	}
// Main Method
	public static void main(String[] args) {
		Addition a=new Example2WithoutLambda();
		
		
		int total=a.add(100, 200);
		System.out.println(total);
		
	}
}
