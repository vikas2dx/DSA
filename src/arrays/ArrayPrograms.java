package arrays;


import java.util.HashMap;
import java.util.Map;

public class ArrayPrograms {

    public int secondLargestNumber(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;


        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array must contains least 2 elements");
        }

        for (int num : nums) {
            if (num > largest) {
                secondlargest = largest;
                largest = num;
            } else if (num > secondlargest && num < largest) {
                secondlargest = num;
            }

        }
        return secondlargest;

    }

    // Prefix Sum: Range sum Query
    public int rangeSumQuery(int[] nums, int left, int right) {

        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }

        if (left < 0 || right >= nums.length || left > right) {
            throw new IllegalArgumentException("Invalid Range");
        }

        int[] prefixSum = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        return prefixSum[right + 1] - prefixSum[left];

    }

    // Two Pointer: remove duplicates from sorted array
    public void removeDuplicateValues(int[] nums) {

        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {

            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }

        }

        for (int i = 0; i < slow + 1; i++) {
            System.out.println(nums[i]);
        }


    }

    //sliding window : Find Maximum Sum Subarray of Size K
    public int maxSumSubArraySliding(int[] nums, int k) {

        if (nums == null || nums.length < k || k <= 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum = windowSum + nums[i];

        }
        int maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {

            windowSum = windowSum + nums[i] - nums[i - k];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }

        }

        return maxSum;


    }

    //Kadane: Find Maximum Subarray Sum
    public int maxSumSubArrayKadane(int[] nums) {

        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (currentSum + nums[i] > nums[i]) {
                currentSum = currentSum + nums[i];
            } else {
                currentSum = nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

        }


        return maxSum;

    }

    //Hashing : two Sum
    public int[] sumTwo(int[] nums, int target) {


        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Invalid Input");
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);

        }

        throw new IllegalArgumentException("No two Sum  solution");

    }


}
