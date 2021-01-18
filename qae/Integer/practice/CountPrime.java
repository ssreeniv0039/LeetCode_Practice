package com.qae.Integer.practice;

public class CountPrime {
	public static void main(String[] args) {
		int num = countPrimes(5);
		System.out.println(num);
		
	}
	
	public static boolean isPrimes(int n) {
		if(n<2)
			return false;
		for(int i = 2;i<=n/2;i++) {
			if(n % i == 0) {
				return false;
			}
		}return  true;
	}
	
	public static int countPrimes1(int n) {
		int count = 0;
		for(int  i = 1;i< n;i++) {
			if(isPrimes(i)) {
				count++;
			}
		}
		return count;
}
	public static int countPrimes(int n) {
		boolean primes[] = new boolean[n];
		for(int i = 0;i<primes.length;i++) {
			primes[i] = true;//we set the value to true because initially all the elements in boolean array are set to false in java
		}
		
		for(int i = 2;i*i<=primes.length;i++) {//there is no prime number larger than the current number and its square
			if(primes[i]) {
				for(int j = i;j*i <primes.length;j++) {
					primes[i*j] = false;
				}
			}
		}
		int countPrime = 0;
		for(int i = 2;i<primes.length;i++) {
			if(primes[i]) {
				countPrime++;
			}
		}
		return countPrime;
		
		
		
	}


}
