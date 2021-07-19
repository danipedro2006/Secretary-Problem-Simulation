package com.danipedro2006.secretary;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		
		int sucess=0;
		int sampleSize=1000;
		int stoppingPoint=90;
		
		for(int j=0;j<sampleSize;j++) {
			
			SecretaryProblem sp=new SecretaryProblem();
			ArrayList<Integer> candidates=sp.generate();
			if(SecretaryProblem.solve(candidates, stoppingPoint)==true){
				sucess++;
			}
		}
		System.out.println((double) sucess/sampleSize);
	}
}