// 2022/04/29 done

// Sol.1 Brute Force
// Runtime: 14 ms, faster than 96.96% of Java online submissions for Add Digits.
// Memory Usage: 44 MB, less than 7.94% of Java online submissions for Add Digits.

// Sol.2 Digital Root
// Runtime: 1 ms, faster than 96.96% of Java online submissions for Add Digits.
// Memory Usage: 42.1 MB, less than 7.94% of Java online submissions for Add Digits.

package leetcode;

public class AddDigits {

	public static void main(String[] args) {

//		int num = 38;
		int num = 0;
//		int num = 1;
//		int num = 9;
		System.out.println(addDigits(num));
	}

	public static int addDigits(int num) {

		// Sol.1 Brute Force
//		String numStr = String.valueOf(num);
//		Integer sum = 0;
//		if (numStr.length() == 1) {
//			return num;
//		}
//		while (numStr.length() > 1) {
//			sum = 0;
//			String[] comp = numStr.split("");
//			for (String ele : comp) {
//				sum += Integer.valueOf(ele);
//			}
//			numStr = String.valueOf(sum);
//		}
//
//		return sum;

		// Sol.2 Digital Root
		return num == 0 ? 0 : (num % 9 == 0) ? 9 : num % 9;

	}

}
