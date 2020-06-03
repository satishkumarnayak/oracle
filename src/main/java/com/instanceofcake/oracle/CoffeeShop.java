package com.instanceofcake.oracle;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {

	private int total;
	private List<Integer> inputTracker = new ArrayList<Integer>();

	public boolean solution(int[] input) {

		boolean result = false;
		for (int i = 0; i < input.length; i++) {

			if (input[0] > 5) {
				result = false;
				return result;
			}

			if (input[i] == 5) {
				total = total + input[i];
				inputTracker.add(input[i]);
				result = true;
			} else if (input[i] > 5) {
				int tempTotal = total - input[i];
				if (tempTotal < 0) {
					result = false;
					return result;
				}
				if (tempTotal > 0) {
					if (inputTracker.contains(10)) {
						int indexOfElementToBeRemoved = inputTracker.indexOf(10);
						inputTracker.remove(indexOfElementToBeRemoved);
						total = total - 10;
					} else if (inputTracker.contains(5)) {
						int indexOfElementToBeRemoved = inputTracker.indexOf(5);
						inputTracker.remove(indexOfElementToBeRemoved);
						total = total - 5;
					}
					total = total + input[i];
					inputTracker.add(input[i]);
					result = true;
				}

			}

		}
		return result;

	}

}
