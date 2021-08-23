import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sphinx
 * @date 2021/8/23
 * @description -2 -1 +1 *2
 */
public class PddPQ {


    public static void main(String[] args) {

        int solution = solution(1, 9);
        System.out.println(solution);
    }

    public static int solution(int p, int q) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(p - 2);
        queue.add(p - 1);
        queue.add(p + 1);
        queue.add(p * 2);

        int idx = 1;

        while (!queue.isEmpty()) {
            for (int i = 0; i < Math.pow(4, idx); i++) {
                Integer poll = queue.poll();
                if (poll == q) return idx;
                queue.add(poll - 2);
                queue.add(poll - 1);
                queue.add(poll + 1);
                queue.add(poll * 2);
            }
            idx++;
        }

        return 0;
    }

}
