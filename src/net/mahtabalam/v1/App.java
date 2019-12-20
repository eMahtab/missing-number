package net.mahtabalam.v1;

import java.util.HashSet;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		int[] nums = {0, 2, 3};
		System.out.println(missingNumber(nums));
	}
	
	private static int missingNumber(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		
		for(int i = 0; i <= nums.length; i++) {
			if(!set.contains(i)) {
				return i;
			}
		}
		return -1;
	}
}
