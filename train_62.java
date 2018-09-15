package offer_train;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 给定一颗二叉搜索树，请找出其中的第k大的结点。例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
 */
public class train_62 {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if(k == 0 || pRoot == null){
            return null;
        }
        TreeNode result = pRoot;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(pRoot);
        ArrayList<TreeNode> visited = new ArrayList<TreeNode>();
        int index = 0;
        boolean flag = false;
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node.left != null && !visited.contains(node.left)) {
                stack.push(node.left);
                continue;
            } else {
                node = stack.pop();
                visited.add(node);
                index++;
                if(index == k){
                    result = node;
                    flag =true;
                    break;
                }
                if (node.right != null && !visited.contains(node.right)) {
                    stack.push(node.right);
                }
            }

        }
        if (flag){
            return result;
        }else {
            return null;
        }

    }

}
