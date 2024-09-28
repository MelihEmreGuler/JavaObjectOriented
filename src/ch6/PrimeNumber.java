package ch6;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();

		System.out.println("Asal kontrolü yapacağiniz sayiyi giriniz: ");

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		if(primeNumber.isPrime(n)) {
			System.out.println("Asal");
		}else {
			System.out.println("Asal Degil");
		}

	}

	boolean isPrime(int n) {
		
		boolean result = true;
		
		for (int i = 2; i < n; i++) {
			if( n % i == 0) {
				result = false;
				break;
			}
		}

		return result;
	}
}
