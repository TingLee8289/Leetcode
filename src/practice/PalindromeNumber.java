package practice;
// 2022/04/19 done
// Runtime: 12 ms, faster than 67.07% of Java online submissions for Palindrome Number.
// Memory Usage: 45.2 MB, less than 32.90% of Java online submissions for Palindrome Number.


public class PalindromeNumber {

	public static void main(String[] args) {
		int x = 121;
//		int x = -121;
//		int x = 10;
		System.out.println(isPalindrome(x));
	}

	public static boolean isPalindrome(int x) {
		String xString = String.valueOf(x);
		for (int i = 0; i < xString.length(); i++) {
			if (xString.charAt(i) != xString.charAt(xString.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
