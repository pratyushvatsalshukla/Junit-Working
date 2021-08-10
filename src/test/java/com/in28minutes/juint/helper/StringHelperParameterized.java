package com.in28minutes.juint.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.in28minutes.junit.helper.StringHelper;

@RunWith(Parameterized.class)
public class StringHelperParameterized {
	StringHelper helper = new StringHelper() ;

	@Parameters
	public static Collection<int[]> testConditions() {
		int expectedOutput[][] = {
				{"AACD", "CD"} ,
				{"ACD", "CD"} } 
		
		return Arrays.asList(expectedOutput) ;
	}
	
	@Test
	public void TestTruncateAInFirst2Positions_AinBetween() {
		assertEquals("CCAACD",helper.truncateAInFirst2Positions("CCAACD"));

	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenerio() {
		
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD")) ;
	}

}
