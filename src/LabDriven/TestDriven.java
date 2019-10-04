package LabDriven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDriven {

	@Test
	void test() {
		FizzBuzz fizz = new FizzBuzz();
		
		int input = fizz.printOutput();
		assertEquals(1,input);
	}
	
	@Test
	void test2() {
		FizzBuzz fizz = new FizzBuzz();
		
		int input = fizz.printOutput2();
		assertEquals(2,input);
	}
	
	@Test
	void test3() {
		FizzBuzz fizz = new FizzBuzz();
		
		String input = fizz.printOutput3();
		assertEquals("fizz",input);
	}
	
	@Test
	void test4() {
		FizzBuzz fizz = new FizzBuzz();
		
		String input = fizz.printOutput3();
		assertEquals("4",input);
	}

}
