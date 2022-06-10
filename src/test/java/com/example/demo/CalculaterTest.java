package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.example.classes.Calculator;

@TestInstance(Lifecycle.PER_CLASS)
public class CalculaterTest {

	static Calculator c1;

	public CalculaterTest() {
		c1 = new Calculator();
		System.out.println("CalculatorTest() object created");
	}

	@BeforeEach
	public void abc() {
		System.out.println("Before each test case....");
	}

	@AfterEach
	public void xyz() {
		System.out.println("After each test case....");
	}

	@BeforeAll
	public static void first() {
		System.out.println(".......STARTED......");
	}

	@AfterAll
	public static void last() {
		System.out.println(".......FINISHED,,,,,");
	}

	@Test
	public void test_add() {
		System.out.println(".......Executing Add test case............");
		assertEquals(30, c1.add(10, 20));
	}
	@Test
	public void test_divide() {
		System.out.println(".......Executing Divide test case............");
		assertEquals(10, c1.divide(20, 2));
	}
}
