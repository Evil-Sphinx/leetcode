import model.ListNode;

/**
 * @author sphinx
 * @date 2021/8/23
 * @description
 */
public class Solution206 {


    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode pre = head;
        ListNode post = head.next;

        while (post != null) {
            ListNode tmp = post.next;
            post.next = pre;
            pre = post;
            post = tmp;
        }
        head.next = null;
        return pre;
    }
}
