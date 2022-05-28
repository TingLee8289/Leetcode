// 2022/05/28 done
// Runtime: 6 ms, faster than 21.52% of Java online submissions for Greatest Common Divisor of Strings.
// Memory Usage: 42.7 MB, less than 50.44% of Java online submissions for Greatest Common Divisor of Strings.

package leetcode;

public class GreatestCommonDivisorofStrings {

	public static void main(String[] args) {
//		String str1 = "ABCABC", str2 = "ABC"; 	// ABC
//		String str1 = "ABABAB", str2 = "ABAB"; 	// AB
//		String str1 = "LEET", str2 = "CODE"; 	// ""
		String str1 = "ABCDEF", str2 = "ABC"; // ""

		System.out.println(gcdOfStrings(str1, str2));
	}

	public static String gcdOfStrings(String str1, String str2) {

		StringBuffer sb = new StringBuffer();
		// step.1 Find the longest common string
		for (int i = 0; i < str1.length() && i < str2.length(); i++) {
			if (str1.charAt(i) == str2.charAt(i)) {
				sb.append(str1.charAt(i));
			} else {
				break;
			}
		}
		
		// step.2 Check if the common string length == 0, then return ""
		int sbLength = sb.length();
		if (sbLength == 0) {
			return "";
		}
		
		// step.3 Find the longest repeatable common string for str1 & str2
		
		if (str1.length() % sbLength == 0 && str2.length() % sbLength == 0) {
			int str1times = str1.length() / sbLength;
			int str2times = str2.length() / sbLength;
			if (sb.toString().repeat(str1times).equals(str1) && sb.toString().repeat(str2times).equals(str2)) {
				return sb.toString();
			}
		}

		while (true) {
			sb.deleteCharAt(sbLength - 1);
			sbLength--;
			if (sbLength == 0) {
				return "";
			}
			if (str1.length() % sbLength == 0 && str2.length() % sbLength == 0) {
				int str1times = str1.length() / sbLength;
				int str2times = str2.length() / sbLength;
				if (sb.toString().repeat(str1times).equals(str1) && sb.toString().repeat(str2times).equals(str2)) {
					return sb.toString();
				}

			}
		}

	}

}
