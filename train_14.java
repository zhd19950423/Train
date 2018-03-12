package offer_train;


/*
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class train_14 {
	public ListNode FindKthToTail(ListNode head,int k) {		
		if(head == null || k <= 0) {
			return null;
		}
		ListNode root = head;
		int h = 1;
		while(root.next != null) {
			h++;
			root = root.next;
		}
		if (h < k) {
			return null;
		}
		while(h != k) {
			h--;
			head = head.next;
		}
		return head;   
    }
}
