// 2022/05/08 done
// Runtime: 16 ms, faster than 29.06% of Java online submissions for Valid Anagram.
// Memory Usage: 42.7 MB, less than 79.72% of Java online submissions for Valid Anagram.



package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

	public static void main(String[] args) {

//		String s = "anagram", t = "nagaram"; 	// true
//		String s = "rat", t = "car"; 			// false
//		String s = "ab", t = "a"; 				// false
		String s = "aacc", t = "ccac"; // true
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {

//		 	Sol.1 Array 	(Time Limit Exceeded)
//		if (s.length() != t.length()) {
//			return false;
//		}
//
//		char[] arr = new char[s.length()];
//		for (int i = 0; i < s.length(); i++) {
//			arr[i] = s.charAt(i);
//		}
//
//		int count = 0;
//		for (int j = 0; j < t.length(); j++) {
//			for (int k = 0; k < arr.length; k++) {
//				if (t.charAt(j) == arr[k]) {
//					arr[k] = 0;
//					count++;
//					break;
//				}
//			}
//		}
//
//		return count == t.length() ? true : false;

//		 	Sol.2 HashMap

		if (s.length() != t.length()) {
			return false;
		}

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}

		int count = s.length();
		for (int j = 0; j < t.length(); j++) {
			if (map.containsKey(t.charAt(j)) && map.get(t.charAt(j)) > 0) {
				map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
				count--;
			} else {
				return false;
			}
		}
		
		return count==0? true: false;

	}

}
