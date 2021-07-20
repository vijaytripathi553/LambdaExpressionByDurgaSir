package com.durga.lamda;

import java.util.Iterator;

public class Example5WithoutLambdaExpression implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<50;i++)
		{
			System.out.println("Child Thread "+i);
		}
		
	}
	public static void main(String[] args) {
		Runnable r=new Example5WithoutLambdaExpression();
		Thread t=new Thread(r);
		t.start();
		
	}
}


