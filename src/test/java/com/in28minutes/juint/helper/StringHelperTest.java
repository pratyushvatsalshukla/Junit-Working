package com.in28minutes.juint.helper;

import static org.junit.Assert.*;

import org.junit.Test;

import com.in28minutes.junit.helper.StringHelper;

public class StringHelperTest {

	@Test
	public void test() {
		StringHelper helper = new StringHelper() ;
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
		assertEquals("CDAA",helper.truncateAInFirst2Positions("CDAA"));

		// Expected, Actual
		// AACD => CD   ACD => CD   CDEF => CDEF   CDAA => CDAA
	}
	

}
