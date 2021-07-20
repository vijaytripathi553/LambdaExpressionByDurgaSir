package com.durga.lamda;

public class Example5WithLambdaExpression {
	// Main Method
	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0; i<10; i++)
			{
				System.out.println("Child Thread"+i);
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Method"+i);
		}
	}
}