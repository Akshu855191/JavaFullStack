package com.day13;

public class Program {

	public static void main(String[] args) {

		int arr[] = { 2, 11, 12, 45, 33, 25, 26, 24, 12, 10 };

		int even = 0, odd = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		int evenarr[] = new int[even];
		int oddarr[] = new int[odd];

		int k1 = 0;
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				evenarr[k1++] = arr[i];
			} else {
				oddarr[j++] = arr[i];
			}
		}

		int sum1 = 0;
		for (int k = 0; k < evenarr.length; k++) {
			sum1 = sum1 + evenarr[k];
		}
		System.out.println(" sum of Even array : " + sum1);
		int sum2 = 0;
		for (int l = 0; l < oddarr.length; l++) {
			sum2 = sum2 + oddarr[l];
		}
		System.out.println(" sum of Even array : " + sum2);

	}

}
