// 2022/05/06 done
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
// Memory Usage: 43.4 MB, less than 54.94% of Java online submissions for Search Insert Position.

package leetcode;

import java.util.Arrays;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
//		int target = 5; // 2
//		int target = 2; // 1
		int target = 7; // 4
		System.out.println(searchInsert(nums, target));

	}

// Must write an algorithm with O(log n) runtime complexity.
	public static int searchInsert(int[] nums, int target) {
		
		int index = Arrays.binarySearch(nums, target);
		
		if (index < 0) {
			++index;
			index = -index;
		}
		
		return index;
	}

}
