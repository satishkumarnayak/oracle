
package com.instanceofcake.oracle;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewCoffeeShopTest {

	@Test
	public void testSolutionExampleTwoWhenTen() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 10 };
		boolean result = coffeeShop.solution(input);
		assertFalse(result);
	}

	@Test
	public void testSolutionWhenInputFive() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 5 };
		boolean result = coffeeShop.solution(input);
		assertTrue(result);
	}

	@Test
	public void testSolutionWhenInputFiveFiveFive() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 5, 5, 5 };
		boolean result = coffeeShop.solution(input);
		assertTrue(result);
	}

	@Test
	public void testSolutionWhenInputFiveTen() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 5, 10 };
		boolean result = coffeeShop.solution(input);
		assertTrue(result);
	}

	@Test
	public void testSolutionWhenInputFiveTenTen() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 5, 10, 10 };
		boolean result = coffeeShop.solution(input);
		assertFalse(result);
	}

	@Test
	public void testSolutionWhenInputTripleFiveTwenty() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 5, 5, 5, 20 };
		boolean result = coffeeShop.solution(input);
		assertTrue(result);
	}

	@Test
	public void testSolutionExampleOneWhenInputTripleFiveAndTenAndTwenty() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 5, 5, 5, 10, 20 };
		boolean result = coffeeShop.solution(input);
		assertTrue(result);
	}

	@Test
	public void testSolutionExampleTwoWhenInputFiveAndFiveAndTen() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 5, 5, 10 };
		boolean result = coffeeShop.solution(input);
		assertTrue(result);
	}

	@Test
	public void testSolutionExampleThreeWhenInputTenAndTen() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 10, 10 };
		boolean result = coffeeShop.solution(input);
		assertFalse(result);
	}

	@Test
	public void testSolutionExampleFourWhenInputDoubleFiveDoubleTenAndTwenty() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 5, 5, 10, 10, 20 };
		boolean result = coffeeShop.solution(input);
		assertFalse(result);
	}

	@Test
	public void testSolutionFirstOrderGreaterThanFive() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 10, 5, 10 };
		boolean result = coffeeShop.solution(input);
		assertFalse(result);
	}

	@Test
	public void testSolutionWhenInputFiveAndFive() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 5, 5 };
		boolean result = coffeeShop.solution(input);
		assertTrue(result);
	}

	@Test
	public void testSolutionDemo() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 5, 5, 5, 10, 5, 5, 10, 20, 20, 20 };
		boolean result = coffeeShop.solution(input);
		assertFalse(result);
	}

	@Test
	public void testSolutionDemo2() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 5, 5, 5, 10, 5, 20, 5, 10, 5, 20 };
		boolean result = coffeeShop.solution(input);
		assertTrue(result);
	}

	@Test
	public void testSolutionDemo3() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 5, 5, 5, 10, 5, 20, 5, 10, 5, 20 };
		boolean result = coffeeShop.solution(input);
		assertTrue(result);
	}

	@Test
	public void testSolutionDemo4() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 5, 5, 10, 5, 10, 20, 20, 5, 20, 20 };
		boolean result = coffeeShop.solution(input);
		assertFalse(result);
	}

	@Test
	public void testSolutionDemo5() {
		NewCoffeeShop coffeeShop = new NewCoffeeShop();
		int[] input = { 5, 5, 5, 5, 10, 5, 20, 10, 5, 5 };
		boolean result = coffeeShop.solution(input);
		assertTrue(result);
	}

}
