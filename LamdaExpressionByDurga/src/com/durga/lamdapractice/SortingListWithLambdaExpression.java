package com.durga.lamdapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListWithLambdaExpression {
	// Main Method
	public static void main(String[] args) {
		List<Integer> list=new ArrayList();
		list.add(25);
		list.add(85);
		list.add(45);
		list.add(5);
		list.add(435);
		list.add(35);
		
		System.out.println("Before Sorting:"+list);
		Collections.sort(list,(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		System.out.println("After Sorting:"+list);
		
		
	}

}
