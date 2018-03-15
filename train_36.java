package offer_train;

/*
 * 输入两个链表，找出它们的第一个公共结点。
 * 公共节点之后的尾部是一样的
 */
public class train_36 { 
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		int len1 = findListLenth(pHead1);
        int len2 = findListLenth(pHead2);
        int flag = len1 - len2;
        while(flag > 0) {
        	pHead1 = pHead1.next;
        	flag--;
        }
        while(flag < 0) {
        	pHead2 = pHead2.next;
        	flag++;
        }
        while(pHead1 != pHead2) {
        	pHead1 = pHead1.next;
        	pHead2 = pHead2.next;
        }
        return pHead1;
    }
	public int findListLenth(ListNode pHead){
        int sum = 0;
        ListNode p = pHead;
        while(p != null) {
        	p = p.next;
        	sum++;
        }
        return sum;
    }
	
}
