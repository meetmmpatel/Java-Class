package com.company.junit.test;




import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.company.junit.main.StringClaculation;

public class StringClaculationTest {
	
	@Test
	public void testConcatenate() {
		StringClaculation sc = new StringClaculation();
		
		String result = sc.concatenate("Hey", "Hi");
		assertEquals("HeyHi", result);
	
		
		
		
	}
	
	

}
