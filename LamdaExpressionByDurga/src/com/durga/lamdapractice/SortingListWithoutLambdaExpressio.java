package com.durga.lamdapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Test implements Comparator<Integer> {

	public int compare(Integer I1, Integer I2) {
		if (I1 < I2) // (100,52
			return -1;
		else if (I1 > I2)
			return +1;
		else

			return 0;
	}

}

public class SortingListWithoutLambdaExpressio {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList();

		l.add(100);
		l.add(52);
		l.add(82);
		l.add(93);
		l.add(108);
		l.add(28);
		System.out.println("Before Sorting:" + l);
		Collections.sort(l, new Test());
		System.out.println("After Sorting:" + l);

	}

}
