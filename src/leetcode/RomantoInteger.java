package leetcode;
// 2022/04/19 done
// Runtime: 6 ms, faster than 73.05% of Java online submissions for Roman to Integer.
// Memory Usage: 42.5 MB, less than 91.17% of Java online submissions for Roman to Integer.

public class RomantoInteger {

	public static void main(String[] args) {
		String s = "III"; // 3
//		String s = "LVIII"; // 58
//		String s = "MCMXCIV"; // 1994
		System.out.println(romanToInt(s));
	}

	public static int romanToInt(String s) {
		int year = 0;

		for (int i = s.length() - 1; i >= 0; i--) {

			switch (s.charAt(i)) {
			case 'M':
				if (i > 0 && (String.valueOf(s.charAt(i - 1)) + String.valueOf(s.charAt(i))).equals("CM")) {
					year += 900;
					i--;
					break;
				}
				year += 1000;
				break;
			case 'D':
				if (i > 0 && (String.valueOf(s.charAt(i - 1)) + String.valueOf(s.charAt(i))).equals("CD")) {
					year += 400;
					i--;
					break;
				}
				year += 500;
				break;
			case 'C':
				if (i > 0 && (String.valueOf(s.charAt(i - 1)) + String.valueOf(s.charAt(i))).equals("XC")) {
					year += 90;
					i--;
					break;
				}
				year += 100;
				break;
			case 'L':
				if (i > 0 && (String.valueOf(s.charAt(i - 1)) + String.valueOf(s.charAt(i))).equals("XL")) {
					year += 40;
					i--;
					break;
				}
				year += 50;
				break;
			case 'X':
				if (i > 0 && (String.valueOf(s.charAt(i - 1)) + String.valueOf(s.charAt(i))).equals("IX")) {
					year += 9;
					i--;
					break;
				}
				year += 10;
				break;
			case 'V':
				if (i > 0 && (String.valueOf(s.charAt(i - 1)) + String.valueOf(s.charAt(i))).equals("IV")) {
					year += 4;
					i--;
					break;
				}
				year += 5;
				break;
			case 'I':
				year++;
				break;
			}
		}

		return year;
	}
}
