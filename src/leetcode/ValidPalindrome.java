package leetcode;
// 2022/04/20
// Runtime: 7 ms, faster than 48.20% of Java online submissions for Valid Palindrome.
// Memory Usage: 44.4 MB, less than 34.15% of Java online submissions for Valid Palindrome.
public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
//		String s = "race a car";
//		String s = " ";
		System.out.println(isPalindrome(s));

	}

	public static boolean isPalindrome(String s) {

//		Regex(之後要練習)
//		String sModified = s.toLowerCase().replace(' ', '\u0000');
//		/^[A-Za-z]+$/
//		System.out.println(sModified);

		String sLowerCase = s.toLowerCase();
		StringBuilder sBuilder = new StringBuilder("");
		for (int i = sLowerCase.length() - 1; i >= 0; i--) {
			if (Character.isLetterOrDigit(sLowerCase.charAt(i))) {
				sBuilder.append(sLowerCase.charAt(i));
			}
		}
		
		StringBuilder sBuilderReverse = new StringBuilder(sBuilder.reverse());
		sBuilder.reverse();
		
//		System.out.println(sBuilder.toString());
//		System.out.println(sBuilder.reverse().toString());
//		System.out.println(sBuilder.toString());
		// reverse會直接在傳入的物件做操作，所以new完新物件後，要再reverse回來
		
		
		return sBuilder.toString().equals(sBuilderReverse.toString());
	}
}
