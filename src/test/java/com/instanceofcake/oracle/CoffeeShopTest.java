package com.instanceofcake.oracle;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoffeeShopTest {

	@Test
	public void testSolutionExampleOneWhenInputTripleFiveAndTenAndTwenty() {
		CoffeeShop coffeeShop = new CoffeeShop();
		int[] input = { 5, 5, 5, 10, 20 };
		boolean result = coffeeShop.solution(input);
		assertTrue(result);
	}

	@Test
	public void testSolutionExampleTwoWhenInputFiveAndFiveAndTen() {
		CoffeeShop coffeeShop = new CoffeeShop();
		int[] input = { 5, 5, 10 };
		boolean result = coffeeShop.solution(input);
		assertTrue(result);
	}

	@Test
	public void testSolutionExampleThreeWhenInputTenAndTen() {
		CoffeeShop coffeeShop = new CoffeeShop();
		int[] input = { 10, 10 };
		boolean result = coffeeShop.solution(input);
		assertFalse(result);
	}

	@Test
	public void testSolutionExampleFourWhenInputDoubleFiveDoubleTenAndTwenty() {
		CoffeeShop coffeeShop = new CoffeeShop();
		int[] input = { 5, 5, 10, 10, 20 };
		boolean result = coffeeShop.solution(input);
		assertFalse(result);
	}

	@Test
	public void testSolutionFirstOrderGreaterThanFive() {
		CoffeeShop coffeeShop = new CoffeeShop();
		int[] input = { 10, 5, 10 };
		boolean result = coffeeShop.solution(input);
		assertFalse(result);
	}

	@Test
	public void testSolutionWhenInputFive() {
		CoffeeShop coffeeShop = new CoffeeShop();
		int[] input = { 5 };
		boolean result = coffeeShop.solution(input);
		assertTrue(result);
	}

	@Test
	public void testSolutionWhenInputFiveAndFive() {
		CoffeeShop coffeeShop = new CoffeeShop();
		int[] input = { 5, 5 };
		boolean result = coffeeShop.solution(input);
		assertTrue(result);
	}

}
