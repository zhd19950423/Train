package offer_train;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class train_60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null){
            return result;
        }
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        deque.add(pRoot);
        while (!deque.isEmpty()) {
            int size = deque.size();
            ArrayList<Integer> subresult = new ArrayList<Integer>();
            while (size > 0) {
                TreeNode node = deque.pollFirst();
                subresult.add(node.val);
                if (node.left != null) {
                    deque.add(node.left);
                }
                if (node.right != null) {
                    deque.add(node.right);
                }
                size--;
            }
            result.add(subresult);
        }
        return result;
    }
}
