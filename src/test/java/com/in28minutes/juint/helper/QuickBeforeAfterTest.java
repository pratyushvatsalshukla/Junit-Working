package com.in28minutes.juint.helper;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	@Before
	public void setup() {
		System.out.println("Before Test");
	}
	
	
	@Test
	public void test1() {
		System.out.println("Test 1 Executed");
	}
	@Test
	public void test2() {
		System.out.println("Test 2 Executed");
	}

}
