package java;
import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = { 1, 2, 3 };
//		int[] digits = { 4, 3, 2, 1 };
//		int[] digits = { 1, 9 };
//		int[] digits = { 9 };
//		int[] digits = { 9, 9 };
//		int[] digits = { 8, 9, 9, 9 };
//		int[] digits = { 9, 8, 9 };
		int[] result = plusOne(digits);
		for (int i : result) {
			System.out.println(i);
		}

	}

	public static int[] plusOne(int[] digits) {

		if (digits[digits.length - 1] == 9) {

			// 有一位數不是9
			for (int i = digits.length - 1; i >= 0; i--) {
				if (digits[i] != 9) {
					digits[i] += 1;
					return digits;
				} else {
					digits[i] = 0;
				}
				
			}

			// 全部都是9的情況
			int[] result = new int[digits.length + 1];
			result[0] = 1;
			return result;

		} else {
			digits[digits.length - 1] += 1;
			return digits;
		}

	}
}
