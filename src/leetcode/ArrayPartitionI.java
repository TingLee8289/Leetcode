// 2022/04/16 done

package leetcode;

import java.util.Arrays;

public class ArrayPartitionI {

	public static void main(String[] args) {
//		int[] nums = { 1, 4, 3, 2 };
		int[] nums = { 6, 2, 6, 5, 1, 2 };
		System.out.println(arrayPairSum(nums));
	}

	public static int arrayPairSum(int[] nums) {

		int sum = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i += 2) {
			sum += nums[i];
		}
		return sum;
	}
}
