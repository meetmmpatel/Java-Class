package com.company.junit.test;

import com.company.junit.main.Calculate;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;
import org.junit.jupiter.api.Test;

public class CalculateTest {

	Calculate clc = new Calculate();
	int sum = clc.sum(12, 12);
	int testSum = 24;

	@Test
	public void testSum() {
		System.out.println("@Test sum(); " + sum + "=" + testSum);
		assertEquals(sum, testSum);

	}
	
	

}
