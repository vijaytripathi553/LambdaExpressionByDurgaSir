package com.durga.lamda;
interface square
{
	public int squareIt(int s);
}
public class Example4WithoutLambdaExpression implements square {
	@Override
	public int squareIt(int s) {
		return s*s;
	}
	public static void main(String[] args) {
		square ss=new Example4WithoutLambdaExpression();
		int total=ss.squareIt(9);
		System.out.println(total);
		
	}

	

}
