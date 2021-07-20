package com.durga.lamda;
interface SquareDemo{
	public int doSquare(int x);
}

public class Example4WithLambdaExpression {
public static void main(String[] args) {
	SquareDemo sd=(x) ->x*x;
	System.out.println(sd.doSquare(10));
	
		
	}
	

}
