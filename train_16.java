package offer_train;
/*
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class train_16 {
	class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public ListNode Merge(ListNode list1,ListNode list2) {
		ListNode newlist = null;
		ListNode resultlist = null;
		if(list1 == null && list2 == null) {
			return newlist;
		}else if (list1 == null) {
			return list2;
		}else if (list2 == null) {
			return list1;
		}else {
			if(list1.val <= list2.val) {
				newlist = list1;
				resultlist = newlist;
				list1 = list1.next;
			}else {
				newlist = list2;
				resultlist = newlist;
				list2 = list2.next;
			}
			while(list1 != null && list2 != null) {
				if(list1.val <= list2.val) {
					newlist.next = list1;
					newlist = newlist.next;
					list1 = list1.next;
				}else {
					newlist.next = list2;
					newlist = newlist.next;
					list2 = list2.next;
				}
			}
			if(list1 == null) {
				newlist.next = list2;
			}
			if(list2 == null) {
				newlist.next = list1;
			}
		}
		
		return resultlist;
    }
}

