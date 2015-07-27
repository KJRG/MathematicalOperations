package com.capgemini.MathematicalOperations;

import java.math.BigInteger;
import java.math.RoundingMode;

import com.google.common.math.BigIntegerMath;
import com.google.common.math.LongMath;

public class MKORCZYN {
	
	public BigInteger convertMHzToHz(long frequencyMHz){
		return BigInteger.valueOf(LongMath.checkedMultiply(frequencyMHz, 1000000));
	}

	public BigInteger convertGHzToHz(long frequencyGHz){
		return BigInteger.valueOf(LongMath.checkedMultiply(frequencyGHz, 1000000000));
	}

	public BigInteger countPessimisticTimeToBreakPasswordByBruteForce(int passLenght, BigInteger cpuFrequencyHz) {
		BigInteger possibilities = BigInteger.valueOf(96).pow(passLenght);
		BigInteger seconds = BigIntegerMath.divide(possibilities, cpuFrequencyHz, RoundingMode.FLOOR);
		return seconds;
	}
}
