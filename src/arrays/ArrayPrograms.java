package arrays;

public class ArrayPrograms {


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

    public int maxSumSubArray(int[] nums, int k) {

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
}
