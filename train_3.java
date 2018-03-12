package offer_train;

import java.util.ArrayList;

/*
 * 输入一个链表，从尾到头打印链表每个节点的值
 */

public class train_3 {
	public static ListNode listNode;
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(listNode != null) {
			temp.add(listNode.val);
			while(listNode.next != null) {
				temp.add(listNode.next.val);
				listNode = listNode.next;
			}
			int length = temp.size();
			for(int i = length - 1; i >= 0; i--) {
				result.add(temp.get(i));
			}
		}
		return result;        
    }
	public static void main(String[] args) {
		System.out.println(printListFromTailToHead(listNode).toString());
	}
}
