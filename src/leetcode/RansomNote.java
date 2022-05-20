// 2022/05/08 done
// Runtime: 483 ms, faster than 5.15% of Java online submissions for Ransom Note.
// Memory Usage: 43.9 MB, less than 72.52% of Java online submissions for Ransom Note.


package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class RansomNote {
	public static void main(String[] args) {
//		String ransomNote = "a", magazine = "b";	// false
//		String ransomNote = "aa", magazine = "ab";	// false
		String ransomNote = "aa", magazine = "aab";	// true
		System.out.println(canConstruct(ransomNote, magazine));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {

//		Sol.1 Array
		if (ransomNote.length() > magazine.length()) {
			return false;
		}

		char[] magCharSet = magazine.toCharArray();
		char[] ranCharSet = ransomNote.toCharArray();
		Arrays.sort(magCharSet);
		for (int i = 0; i < ranCharSet.length; i++) {
			
			int index = Arrays.binarySearch(magCharSet, ranCharSet[i]);
			
			if (index < 0) {
				return false;
			} else {
				magCharSet[index] = 0;
				Arrays.sort(magCharSet);
			}
		}
		
		return true;

//		Sol.2 HashMap
//		if (ransomNote.length() > magazine.length()) {
//			return false;
//		}
//		HashMap<Character, Integer> map = new HashMap<>();
//		char[] magCharSet = magazine.toCharArray();
//		for (int i = 0; i < magCharSet.length; i++) {
//			if (map.containsKey(magCharSet[i])) {
//				map.put(magCharSet[i], map.get(magCharSet[i]) + 1);
//			} else {
//				map.put(magCharSet[i], 1);
//			}
//		}

	}
}
