package com.capgemini.MathematicalOperations;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

public class MKORCZYNTest {

	MKORCZYN m;

	@Before
	public void setUp() {
		m = new MKORCZYN();
	}

	@Test(expected = ArithmeticException.class)
	public void shouldThrowArithmeticExceptionIfPasswordLengthIsLowerThan0() {
		m.countPessimisticTimeToBreakPasswordByBruteForce(-5, BigInteger.valueOf(1000));
	}

	@Test
	public void shouldReturn96IfPasswordLengthEquals0AndCPUFrequencyEquals1() {
		assertEquals(BigInteger.valueOf(96),
				m.countPessimisticTimeToBreakPasswordByBruteForce(1, BigInteger.valueOf(1)));
	}

}
