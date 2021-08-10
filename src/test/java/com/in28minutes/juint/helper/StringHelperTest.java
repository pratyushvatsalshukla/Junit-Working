package com.in28minutes.juint.helper;

import static org.junit.Assert.*;

import org.junit.Test;

import com.in28minutes.junit.helper.StringHelper;

public class StringHelperTest {
	StringHelper helper = new StringHelper() ;
	@Test
	public void TestTruncateAInFirst2Positions_Ainfirst2Positions() {
		// AACD => CD   ACD => CD   CDEF => CDEF   CDAA => CDAA
		
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	
		//assertEquals("CDAA",helper.truncateAInFirst2Positions("CDAA"));

		// Expected, Actual
		
	}
	
	@Test
	public void TestTruncateAInFirst2Positions_AinBetween() {
		assertEquals("CCAACD",helper.truncateAInFirst2Positions("CCAACD"));

	}
	

}
