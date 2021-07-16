package com.durga.lamdapractice;

import java.util.Collections;
import java.util.*;

public class SortingMapWithoutLambdaExpression {

	// Main Method
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		map.put(12, "Vijay");
		map.put(2, "Ajay");
		map.put(9, "Ram");
		map.put(56, "Raghav");

		System.out.println("After Sorting in descending order:" + map);

	}

}
