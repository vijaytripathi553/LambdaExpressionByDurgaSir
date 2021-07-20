package com.durga.lamda;

interface FindLength {
	public int letsFindLength(String s);
}

public class Example3WithLambdaExpression {

	public static void main(String[] args) {
		FindLength f=s->s.length();
		System.out.println(f.letsFindLength("Hello"));
		System.out.println(f.letsFindLength("With Lamda Expression"));

	}

	
}
