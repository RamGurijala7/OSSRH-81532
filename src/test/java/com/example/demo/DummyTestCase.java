package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.classes.Calculator;

class DummyTestCase {

	Calculator cal = new Calculator();
	
	@Test
	void test() {
		int output = cal.testMethod();
		assertEquals(1, output);
		//fail("Not yet implemented");
	}

}
