package com.umairabdsalam.apps;

public class AlgSpeedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime;
		long endTime;
		long elapsedTime;
		
		


	
	startTime = System.nanoTime();
	
	// call addUp
	addUp(100000);
	
	endTime = System.nanoTime();
	
	elapsedTime = endTime - startTime;
	
	System.out.println("AddUp Speed:\t" + elapsedTime + " ns");
	
	
	startTime = System.nanoTime();
	
	// call addUpFaster
	addUpFaster(100000);
	
	endTime = System.nanoTime();
	
	elapsedTime = endTime - startTime;
	
	System.out.println("AddUpFaster Speed:\t" + elapsedTime + " ns");
	
	}
	
	private static int addUp(int n) {
		
		int sum = 0;
		
		for(int i = 0; i <= n; i++) {
			
			sum += i;
		}

		System.out.println("AddUp Sum:\t" + sum + " total");
		return sum;
			
	}
	
	
	private static int addUpFaster(int n) {
		
		int sum = n * (n + 1) / 2;

		System.out.println("AddUpFaster Sum:\t" + sum + " total");
		return sum;
			
	}

}
