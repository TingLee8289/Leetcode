// 2022/05/20 done
// Runtime: 1 ms, faster than 90.42% of Java online submissions for Word Pattern.
// Memory Usage: 42.3 MB, less than 15.09% of Java online submissions for Word Pattern.

package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class WordPattern {
	public static void main(String[] args) {
//		String pattern = "abba", s = "dog cat cat dog"; // true
//	String pattern = "abba", s = "dog cat cat fish"; // false
//	String pattern = "aaaa", s = "dog cat cat dog";	 // false
		String pattern = "abba", s = "dog dog dog dog"; // false
		System.out.println(wordPattern(pattern, s));
	}

	public static boolean wordPattern(String pattern, String s) {

		String[] strArr = s.split(" ");
		if (pattern.length() != strArr.length) {
			return false;
		}

		HashMap<Character, String> map = new HashMap<>();

		for (int i = 0; i < pattern.length(); i++) {

			if (!map.containsKey(pattern.charAt(i)) && !map.containsValue(strArr[i])) {
				map.put(pattern.charAt(i), strArr[i]);
			} else {
				if (!String.valueOf(map.get(pattern.charAt(i))).equals(strArr[i])) {
					return false;
				}
			}
		}

		return true;
	}
}
