package leetcode;
// 2022/04/08 done

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
//		int[] nums = {0,1,2,2,3,0,4,2};
//		int val = 2;
		int k = removeElement(nums, val);
		
		
		for (int i : nums) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println(k);

	}

	public static int removeElement(int[] nums, int val) {

		int arrLength = nums.length;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				nums[i] = 51;
				++count;
			}
		}

		Arrays.sort(nums);

		return arrLength - count;
	}
}
