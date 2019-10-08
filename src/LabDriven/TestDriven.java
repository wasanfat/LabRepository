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
		
		String input = fizz.printOutput4();
		assertEquals("4",input);
	}
	@Test
	void test5() {
		FizzBuzz fizz = new FizzBuzz();
		
		String input = fizz.printOutput5();
		assertEquals("Buzz",input);
	}
	
	@Test
	void test6() {
		FizzBuzz fizz = new FizzBuzz();
		
		String input = fizz.printOutput6();
		assertEquals("fizz",input);
	}
	
	@Test
	void test7() {
		FizzBuzz fizz = new FizzBuzz();
		
		int input = fizz.printOutput7();
		assertEquals(7,input);
	}
	
	@Test
	void test8() {
		FizzBuzz fizz = new FizzBuzz();
		
		int input = fizz.printOutput8();
		assertEquals(8,input);
	}
	
	@Test
	void test9() {
		FizzBuzz fizz = new FizzBuzz();
		
		String input = fizz.printOutput9();
		assertEquals("Fizz",input);
	}
	
	@Test
	void test10() {
		FizzBuzz fizz = new FizzBuzz();
		
		String input = fizz.printOutput10();
		assertEquals("buzz",input);
	}

}
