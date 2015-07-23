package com.capgemini.MathematicalOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class MathematicalOperations {
	/**
	 * Calculates quadratic residues modulo number. Number should be 1 or
	 * greater. Returns sorted list of unique quadratic residues
	 * 
	 * @author MKORCZYN
	 * @param number
	 *            - number of which quadratic residues we want to calculate
	 * @return sorted list of unique quadratic residues
	 * @throws IllegalArgumentException
	 *             if number is 0 or lower
	 */
	public List<Integer> calculateQuadraticResidues(int number) {
		List<Integer> list = new ArrayList<Integer>();
		if (number < 1) {
			throw new IllegalArgumentException("values must be positive");
		}

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < number; i++) {
			int qr = (i * i) % number;
			set.add(qr);
		}
		list.addAll(set);
		Collections.sort(list);
		return list;

	}
}
