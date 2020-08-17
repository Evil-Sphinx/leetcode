/**
 * @author sphinx
 * @date 2020/8/14
 * @description
 */
public class TwoSum {


    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no solution");
    }

    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        int[] a = {2, 7, 11, 15};
        int[] ints = twoSum.twoSum(a, 9);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }

}
