package offer_train;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 */
public class train_61 {
    String Serialize(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        String result = "";
        if (root == null) {
            return "";
        } else {
            deque.add(root);
            while (!deque.isEmpty()) {
                TreeNode node = deque.pop();
                if (node != null) {
                    result = result + node.val + ",";
                    deque.add(node.left);
                    deque.add(node.right);
                } else {
                    result = result + "#,";
                }

            }
        }
        while (result.endsWith("#,")) {
            result = result.substring(0, result.length() - 2);
        }

        return result.substring(0, result.length() - 1);
    }

    TreeNode Deserialize(String str) {
        if(str.equals("")){
            return null;
        }
        String[] Strs = str.split(",");
        int len = Strs.length;
        TreeNode root = new TreeNode(Integer.parseInt(Strs[0]));
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        deque.add(root);
        for (int i = 0; i < len / 2; i++) {
            if(Strs[i] != "#"){
                TreeNode pnode = deque.pop();
                if (!Strs[2 * i+1].equals("#")) {
                    TreeNode left = new TreeNode(Integer.parseInt(Strs[2 * i+1]));
                    pnode.left = left;
                    deque.add(left);
                }
                if (!Strs[2 * i+2].equals("#")) {
                    TreeNode right = new TreeNode(Integer.parseInt(Strs[2 * i + 2]));
                    pnode.right = right;
                    deque.add(right);
                }
            }else {
                continue;
            }

        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n3.right = n5;
        train_61 train_61 = new train_61();
        String s = train_61.Serialize(n1);
        System.out.println(s);
    }
}
