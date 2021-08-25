import java.util.Arrays;

/**
 * @author sphinx
 * @date 2021/8/25
 * @description
 */
public class Solution27 {

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = Integer.MAX_VALUE;
                count++;
            }
        }
        Arrays.sort(nums);
        return nums.length - count;
    }
}
