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
}
