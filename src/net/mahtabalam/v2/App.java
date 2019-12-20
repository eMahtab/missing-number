package net.mahtabalam.v2;

public class App {
	public static void main(String[] args) {
		int[] nums = {0, 2, 3};
		System.out.println(missingNumber(nums));
	}
	
	private static int missingNumber(int[] nums) {
		int sum = 0;
		for(int num : nums) {
			sum += num;
		}
		int n = nums.length;
		int sumOfFirstNNumbers = (n * (n + 1)) / 2;
		return sumOfFirstNNumbers - sum;
	}
}
