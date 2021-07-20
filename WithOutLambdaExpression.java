package com.durga.lamda;
interface Demo
{
	public void m1();
}
// Main Method
public class WithOutLambdaExpression implements Demo {
	public void m1()
	{
		System.out.println("This is an implementation of m1 method");
	}
	public static void main(String[] args) {
		
		Demo d=new WithOutLambdaExpression();
		d.m1();
		
	}

}
