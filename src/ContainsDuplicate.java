// 2022/04/17 done
// 

import java.util.Arrays;

public class ContainsDuplicate {
	public static void main(String[] args) {
//		int[] nums = { 1, 2, 3, 1 };
		int[] nums = { 1, 2, 3, 4 };
//		int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		System.out.println(containsDuplicate(nums));

	}

	public static boolean containsDuplicate(int[] nums) {

		Arrays.sort(nums);

		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i + 1] - nums[i] == 0) {
				return true;
			}
		}
		
		return false;

//		for (int i = 0; i < nums.length - 1; i++) {
//
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					return true;
//				}
//			}
//
//		}
//
//		return false;
	}
}
