package com.danipedro2006.secretary;

import java.util.ArrayList;
import java.util.Collections;

public class SecretaryProblem {
	static int problemSize = 100;
	static int best = Integer.MIN_VALUE;
	static ArrayList<Integer> candidates = new ArrayList<>(problemSize);

	public ArrayList<Integer> generate() {
		
		for (int i = 0; i < problemSize; i++) {
			
			candidates.add(new Integer(i));
		}
		Collections.shuffle(candidates);
		return candidates;
	}

	public static int getBest() {
		
		for (int i = 0; i < candidates.size(); i++)
			if (candidates.get(i) > best)
				best = candidates.get(i);
		return best;
	}

	public ArrayList<Integer> getCandidates() {
		return candidates;
	}


	public static boolean solve(ArrayList<Integer> candidates, int selpoint) {
		int bestSoFar = Integer.MIN_VALUE;
		int i;
		for (i = 0; i < candidates.size(); i++) {
			
			if (candidates.get(i) > bestSoFar) {
				bestSoFar = candidates.get(i);
				if (i > selpoint) {
					return bestSoFar == getBest();
				}
			}
		}
		return candidates.get(i - 1) == getBest();
	}
}
