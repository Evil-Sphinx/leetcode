import java.util.Arrays;

/**
 * @author sphinx
 * @date 2020/9/25
 * @description
 */
public class Solution875 {


    public int minEatingSpeed(int[] piles, int H) {

        int max = Arrays.stream(piles).max().getAsInt();

        int left = 1, right = max;

        int K = 1;
        while (left <= right) {

            K = (left + right) / 2;
            if (canEatOut(piles, K, H)) {
                right = K - 1;
            } else {
                left = K + 1;
            }
        }
        return left;

    }

    private boolean canEatOut(int[] piles, int K, int H) {

        int cost = 0;
        for (int pile : piles) {
            // 向上取整
            cost += (pile + K - 1) / K;
        }
        return cost <= H;
    }


    public static void main(String[] args) {

        int i = new Solution875().minEatingSpeed(new int[]{332484035, 524908576, 855865114, 632922376, 222257295, 690155293, 112677673, 679580077, 337406589, 290818316, 877337160, 901728858, 679284947, 688210097, 692137887, 718203285, 629455728, 941802184}, 823855818);
        System.out.println(i);

    }

}
