package com.instanceofcake.oracle;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {

	private int total;
	private List<Integer> inputTracker = new ArrayList<Integer>();

	public boolean solution(int[] input) {

		boolean result = false;
		for (int i = 0; i < input.length; i++) {
			if (i == 0) {
				if (input[0] > 5) {
					return result;
				}
			}
			if (input[i] == 5) {
				inputTracker.add(input[i]);
				result = true;
			} else if (input[i] > 5) {
				int returnChange = input[i] - 5;

				if (inputTracker.contains(20) && returnChange > 10) {
					int indexOfElementToBeRemoved = inputTracker.indexOf(20);
					inputTracker.remove(indexOfElementToBeRemoved);
					total = total - 20;
					returnChange = returnChange - 20;
				}
				if (inputTracker.contains(10) && returnChange > 5) {
					int indexOfElementToBeRemoved = inputTracker.indexOf(10);
					inputTracker.remove(indexOfElementToBeRemoved);
					total = total - 10;
					returnChange = returnChange - 10;
				}
				if (inputTracker.contains(5)) {
					int indexOfElementToBeRemoved = inputTracker.indexOf(5);
					inputTracker.remove(indexOfElementToBeRemoved);
					total = total - 5;
					returnChange = returnChange - 5;
				}
				if (returnChange > 0 || returnChange < 0) {
					result = false;
					return result;
				}
				total = total + input[i];
				inputTracker.add(input[i]);
				result = true;

			}

		}
		return result;

	}

}
