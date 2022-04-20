package java;
// 2022/04/19 done
// Runtime: 6 ms, faster than 82.48% of Java online submissions for Integer to Roman.
// Memory Usage: 45 MB, less than 68.48% of Java online submissions for Integer to Roman.

public class IntergertoRoman {

	public static void main(String[] args) {
//		int num = 3; // III
//		int num = 58; // LVIII
		int num = 1994; // MCMXCIV
		System.out.println(intToRoman(num));
	}

	public static String intToRoman(int num) {

		StringBuilder romanString = new StringBuilder("");
		int ones = num % 10;
		num /= 10;
		int tens = num % 10;
		num /= 10;
		int hunds = num % 10;
		num /= 10;
		int thos = num;

		if (thos > 0) {
			romanString.append("M".repeat(thos));
		}

		if (hunds > 0) {
			switch (hunds) {
				case 9: romanString.append("CM"); break;
				case 8: romanString.append("DCCC"); break;
				case 7: romanString.append("DCC"); break;
				case 6: romanString.append("DC"); break;
				case 5: romanString.append("D"); break;
				case 4: romanString.append("CD"); break;
				case 3: romanString.append("CCC"); break;
				case 2: romanString.append("CC"); break;
				case 1: romanString.append("C"); break;
			}
		}
		
		if (tens > 0) {
			switch (tens) {
				case 9: romanString.append("XC"); break;
				case 8: romanString.append("LXXX"); break;
				case 7: romanString.append("LXX"); break;
				case 6: romanString.append("LX"); break;
				case 5: romanString.append("L"); break;
				case 4: romanString.append("XL"); break;
				case 3: romanString.append("XXX"); break;
				case 2: romanString.append("XX"); break;
				case 1: romanString.append("X"); break;
			}
		}
		if (ones > 0) {
			switch (ones) {
				case 9:	romanString.append("IX"); break;
				case 8:	romanString.append("VIII"); break;
				case 7:	romanString.append("VII"); break;
				case 6:	romanString.append("VI"); break;
				case 5:	romanString.append("V"); break;
				case 4:	romanString.append("IV"); break;
				case 3:	romanString.append("III"); break;
				case 2:	romanString.append("II"); break;
				case 1:	romanString.append("I"); break;
			}
		}

		return romanString.toString();
	}
}
