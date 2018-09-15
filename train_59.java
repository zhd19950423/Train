package offer_train;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class train_59 {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null){
            return result;
        }
        Stack<TreeNode> stack01 = new Stack<TreeNode>();
        Stack<TreeNode> stack02 = new Stack<TreeNode>();
        int high = 1;
        stack01.add(pRoot);
        while (!stack01.isEmpty() || !stack02.isEmpty()) {
            if (high % 2 == 1) {
                ArrayList<Integer> subresult = new ArrayList<Integer>();
                while (!stack01.isEmpty()){
                    TreeNode node = stack01.pop();
                    subresult.add(node.val);
                    if(node.left != null){
                        stack02.push(node.left);
                    }
                    if(node.right != null){
                        stack02.push(node.right);
                    }
                }
                result.add(subresult);
            }else{
                ArrayList<Integer> subresult = new ArrayList<Integer>();
                while (!stack02.isEmpty()){
                    TreeNode node = stack02.pop();
                    subresult.add(node.val);
                    if(node.right != null){
                        stack01.push(node.right);
                    }
                    if(node.left != null){
                        stack01.push(node.left);
                    }
                }
                result.add(subresult);
            }
            high++;
        }
        return result;
    }
}
