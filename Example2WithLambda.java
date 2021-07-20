package com.durga.lamda;

interface Addition1 {
	public void add1(int a, int b);
}

public class Example2WithLambda {
	public static void main(String[] args) {
		Addition1 a2 = (a,b) -> System.out.println(a+b);
		a2.add1(90, 778);

	}

}
