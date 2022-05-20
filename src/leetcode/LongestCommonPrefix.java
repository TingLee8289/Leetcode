// 2022/05/12 done

package leetcode;

public class LongestCommonPrefix {
	public static void main(String[] args) {
//		String[] strs = { "flow", "flower", "flight" }; // fl
//		String[] strs = { "dog", "racecar", "car" };	// ""
		String[] strs = { "ab", "a" }; // ""
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}

		// 先猜第一個元素是答案
		String Result = strs[0];

		// 比較其他元素逐個字母
		for (int i = 1; i < strs.length; i++) {
			String temp = "";

			//
			for (int j = 0; j < strs[i].length() && j < Result.length(); j++) {
				if (strs[i].charAt(j) == Result.charAt(j)) {
					temp += strs[i].charAt(j);
				} else {
					break;
				}
			}
			
			Result = temp;
			if (temp == "") {
				return "";
			}

		}

		return Result;
	}
}
