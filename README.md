# Missing Number

Given an array containing n **distinct** numbers taken from **0, 1, 2, ..., n**, find the one that is missing from the array.

**Note : All numbers are distinct and range from 0 to n**
### Example 1:

Input: [3,0,1]

Output: 2

### Example 2:

Input: [9,6,4,2,3,5,7,0,1]

Output: 8

There are many approaches to solve this problem. Lets see them one by one.

### Approach 1 : Using HashSet

```java
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
```
The above implementation have both Runtime and Space complexity of O(n)
```
Runtime Complexity = O(n)
Space Complexity   = O(n)
```

### Approach 2 : Using Sum Formula

```java
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

```

The above implementation have Runtime complexity of O(n) and Space complexity of O(1)
```
Runtime Complexity = O(n)
Space Complexity   = O(1)
```

### Approach 3 : Using Binary Search

```java
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
```

The above implementation have Runtime complexity of O(nlogn) and Space complexity of O(1). 
The runtime complexity is O(nlogn), because we are sorting the input array first. So the upper bound for above implementation is O(nlogn), note that binaty search have the runtime complexity of just O(logn). 
```
Runtime Complexity = O(nlogn)
Space Complexity   = O(1)
```
