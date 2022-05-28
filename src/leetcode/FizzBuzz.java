// 2022/05/28 done
// Runtime: 2 ms, faster than 60.56% of Java online submissions for Fizz Buzz.
// Memory Usage: 48.7 MB, less than 18.84% of Java online submissions for Fizz Buzz.

package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		int n = 3;	// ["1","2","Fizz"]
//		int n = 5;	// ["1","2","Fizz","4","Buzz"]
//		int n = 15;	// ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
		System.out.println(fizzBuzz(n));

	}

	public static List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add(String.valueOf(i));
			}
		}
		return list;
	}

}
