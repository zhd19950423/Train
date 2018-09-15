package offer_train;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class train_56 {
    public static ListNode deleteDuplication(ListNode pHead) {
        ListNode result = pHead;
        while (pHead != null && pHead.next != null) {
            ListNode next1 = pHead.next;
            if (pHead.val != next1.val) {
                boolean falg = false;
                while (next1.next != null && next1.val == next1.next.val) {
                    falg = true;
                    next1 = next1.next;
                }
                if (!falg) {
                    pHead = next1;
                } else {
                    pHead.next = next1.next;
                    next1.next = null;
                }
            } else {

                while (next1.next != null && next1.val == next1.next.val) {
                    next1 = next1.next;
                }
                pHead = next1.next;
                next1.next = null;
                result = pHead;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(1);
        ListNode n6 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        System.out.println(deleteDuplication(n1));
    }
}
