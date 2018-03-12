package offer_train;

/*
 * 反转单链表，递归写法
 */
public class train_15 {
	
	
	public ListNode ReverseList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode next = head.next;
		head.next = null;
		ListNode temp = ReverseList(next);
		next.next = head;
		return temp;
    }

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;
		train_15 rTrain_15 = new train_15();
		ListNode listNode = rTrain_15.ReverseList(n1);
		while(listNode != null) {
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
		
	}
}