//2022/04/17 done


import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {

//		int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
//		int[] nums = { 0, 1 };
		int[] nums = { 3, 0, 1 };
		System.out.println(missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int length = nums.length;

		if (nums[0] != 0) {
			return 0;
		} else if (nums[length-1] != length) {
			return length;
		} else {
			for (int i = 0; i < length - 1; i++) {
				if (nums[i + 1] - nums[i] > 1) {
					return nums[i]+1;
				}
			}

		}

		return 0;
	}
}
