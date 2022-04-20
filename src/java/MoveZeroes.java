package java;
// 2022/04/16 
// 後續需要看solution

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
//		int[] nums = { 0 };
//		int[] nums = { 0, 0, 1 };
		moveZeroes(nums);
		for (int i : nums) {
			System.out.println(i);
		}

	}

	public static void moveZeroes(int[] nums) {

		int maxCount = 0;
		for (int i = 0; i < nums.length; i++) {

			while (nums[i] == 0 && maxCount <= nums.length) {

//			往前搬移
				for (int j = i; j < nums.length - 1; j++) {
					nums[j] = nums[j + 1];
				}
//			最後補零
				nums[nums.length - 1] = 0;
				maxCount++;
			}
		}

	}
}
