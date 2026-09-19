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


}
