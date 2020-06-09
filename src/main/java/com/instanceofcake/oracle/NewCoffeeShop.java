package com.instanceofcake.oracle;

import java.util.HashMap;
import java.util.Map;

public class NewCoffeeShop {

	Map<Integer, Integer> billToCountMap = new HashMap<Integer, Integer>();

	public boolean solution(int[] input) {
		boolean result = true;

		billToCountMap.put(5, 0);
		billToCountMap.put(10, 0);
		billToCountMap.put(20, 0);

		for (int i = 0; i < input.length; i++) {
			int fiveBillCount = 0;
			int tenBillCount = 0;

			if (i == 0) {
				if (input[0] > 5) {
					result = false;
					return result;
				}
			}
			int changeReturn = input[i] - 5;

			if (changeReturn == 0) {
				fiveBillCount = billToCountMap.get(5);
				fiveBillCount++;
				billToCountMap.put(5, fiveBillCount);
			}
			if (changeReturn == 5) {
				fiveBillCount = billToCountMap.get(5);
				if (fiveBillCount <= 0) {
					result = false;
					return result;
				}
				fiveBillCount--;
				billToCountMap.put(5, fiveBillCount);
				int inputCount = billToCountMap.get(input[i]);
				inputCount++;
				billToCountMap.put(input[i], inputCount);
			}
				if (changeReturn == 15) {
				tenBillCount = billToCountMap.get(10);
				fiveBillCount = billToCountMap.get(5);
				if (fiveBillCount == 0 || (tenBillCount <= 0 && fiveBillCount < 3)) {
					result = false;
					return result;
				}
				else if (tenBillCount >= 1 && fiveBillCount >= 1) {
					tenBillCount--;
					billToCountMap.put(10, tenBillCount);
					fiveBillCount--;
					billToCountMap.put(5, fiveBillCount);
					int inputCount = billToCountMap.get(input[i]);
					inputCount++;
					billToCountMap.put(input[i], inputCount);
				}
				else if (fiveBillCount >= 3) {
					fiveBillCount = fiveBillCount - 3;
					billToCountMap.put(5, fiveBillCount);
					int inputCount = billToCountMap.get(input[i]);
					inputCount++;
					billToCountMap.put(input[i], inputCount);
				}

			}
		}

		return result;
	}

}
