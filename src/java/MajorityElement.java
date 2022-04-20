package java;
// 2022/04/15 done
// map的話應該使用!counts.containsKey(num)來確認是否元素已存在



import java.util.TreeMap;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 3 };
//		int[] nums = { 1 };
//		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
//		int[] nums = { 6, 6, 6, 7, 7 };
//		int[] nums = { 6, 5, 5};
		

//		System.out.println(majorityElement(nums));
		majorityElement(nums);

	}

	public static int majorityElement(int[] nums) {

		int maxKey = nums[0];
		int maxCount = 1;

		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int element : nums) {
			if (map.get(element) == null) {
				map.put(element, 1);
				System.out.println(element + " " + map.get(element));
			} else {
				map.put(element, map.get(element) + 1);
				System.out.println(element + " " + map.get(element));
				for (int i = 0; i < map.size(); i++) {
					if (map.get(element) > maxCount) {
						maxKey = element;
						maxCount = map.get(element);
					}
				}
			}
		}

//		Set set = map.keySet();
//		Iterator<Integer> it = set.iterator();
//		while (it.hasNext()) {
//			Integer key = it.next();
//			System.out.println(key + " " + map.get(key));
//		}
		System.out.println(maxKey);
		System.out.println(maxCount);
		return maxKey;
	}

}
