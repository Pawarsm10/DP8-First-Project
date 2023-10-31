package com.mock;
public class SumOfAlternatePrime {

	static int check(int n) {

		if (n == 0 || n == 1)
			return 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return 0;
		}
		return n;
	}
	static boolean alternate(int c1) {

		if (c1 % 2 == 0) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {

	int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 17 };
		int sum = 0;
		int num;
		int count = 1;
		for (int i = 0; i < ar.length; i++) {
			num = check(ar[i]);
			if (num > 0)
				count++;
			if (alternate(count))
				sum += num;
		}
		System.out.println(sum);
	}

}
