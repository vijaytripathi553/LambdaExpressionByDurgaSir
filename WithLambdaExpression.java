package com.durga.lamda;
interface Demo1
{
	public void sayHello();
}

public class WithLambdaExpression {
	// Main method
	public static void main(String[] args) {
		Demo1 d=() -> System.out.println("SaysHello Implementation");
		d.sayHello();
		
		
	}

}
