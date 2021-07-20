package com.durga.lamda;

interface Length
{
	public int findLength(String s);
}
public class Example3WithoutLambda implements Length {
	public int findLength(String s)
	{
		return s.length();
		
	}
	public static void main(String[] args) {
		
		String s="Vijay";
		Length l2= new Example3WithoutLambda();
		int totalLength=l2.findLength(s);
		System.out.println(totalLength);
	}

}
