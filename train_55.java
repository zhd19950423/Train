package offer_train;

import java.util.HashSet;
import java.util.Set;

/**
 * 一个链表中包含环，请找出该链表的环的入口结点。
 */
public class train_55 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        Set<ListNode> set = new HashSet<ListNode>();
        boolean flag = false;
        while(pHead.next != null){
            if(!set.contains(pHead)){
                set.add(pHead);
                pHead = pHead.next;
            }else{
                flag = true;
                break;
            }


        }
        if(flag){
            return pHead;
        }else{
            return null;
        }

    }
}
