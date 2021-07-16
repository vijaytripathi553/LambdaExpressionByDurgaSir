package com.durga.lamdapractice;

import java.util.Set;
import java.util.TreeSet;

public class SortingSetWithLambdaExpression {

		// Main Method
		public static void main(String[] args) {
			Set<Integer> set = new TreeSet<Integer>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
			set.add(25);
			set.add(85);
			set.add(45);
			set.add(5);
			set.add(435);
			set.add(35);

			System.out.println("After Sorting in descending order:" + set);


		}

	}

	// OUTPUT:
	// By default it is sorting in ascending order
	//[5,25,35,45,85,435]

	// After applying lamda we can sort it in descending order as well
	//[435,85,45,35,25,5]

	
	


