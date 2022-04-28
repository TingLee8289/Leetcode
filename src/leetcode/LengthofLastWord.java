package leetcode;
// 2022/04/19 done
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
// Memory Usage: 42.5 MB, less than 25.21% of Java online submissions for Length of Last Word.


public class LengthofLastWord {

	public static void main(String[] args) {
		String s = "Hello World";
//		String s = "   fly me   to   the moon  ";
//		String s = "luffy is still joyboy";
		System.out.println(lengthOfLastWord(s));

	}

	public static int lengthOfLastWord(String s) {
		String sTrim = s.trim();
		int count = 0;
		for (int i = sTrim.length() - 1; i >= 0; i--) {
			if (sTrim.charAt(i)==' ') {
				break;
			}
			count++;
		}
		return count;
	}
}
