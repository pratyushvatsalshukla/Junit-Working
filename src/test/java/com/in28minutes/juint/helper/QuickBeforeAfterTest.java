package com.in28minutes.juint.helper;
import static org.junit.Assert.*;

import java.util.Arrays;

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
	
	@Test(timeout = 1000)
	public void testsort_Performance() {
		int array[] = {12, 23, 4} ;
		for(int i = 0 ; i < 10000 ; i++)
		{
			array[0] = i ;
			Arrays.sort(array);
		}
	}

}
