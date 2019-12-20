package net.mahtabalam.v3;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		int[] nums = {3, 0, 1};
		System.out.println(missingNumber(nums));
	}
	
	private static int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int low = 0;
		int high = nums.length - 1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(nums[mid] > mid) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

}
