package offer_train;

import java.util.ArrayList;
import java.util.Stack;

/*
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class train_24 {
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		ArrayList<ArrayList<Integer>> resultlist = new ArrayList<ArrayList<Integer>>();
		if(root == null || root.val > target) {
			return resultlist;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		TreeNode old = root;
		target = target - root.val;
		while(!stack.isEmpty()) {
			root = stack.peek();
			if(0 == target) {
				if(root.left == null && root.right == null) {
					ArrayList<Integer> onepath = this.getOnePath(stack);
					resultlist.add(onepath);
					old = stack.pop();	
					target = target + old.val;
					continue;
				}else {
					old = stack.pop();	
					target = target + old.val;
					continue;
				}
				
			}
			if(0 < target) {
				if(root.left != null && root.left != old && root.right != old) {
					target = target - root.left.val;
					stack.push(root.left);
					continue;
				}
				else if(root.right != null && root.right != old) {
					target = target - root.right.val;
					stack.push(root.right);
					continue;
				}else {
					old = stack.pop();
					target = target + old.val;
					continue;
				}
			}else if(0 > target){
				old = stack.pop();
				target = target + old.val;
			}
		}
		return resultlist;  
    }
	public ArrayList<Integer> getOnePath(Stack<TreeNode> stack) {
		Stack<TreeNode> tempstack = new Stack<TreeNode>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		while(!stack.isEmpty()) {
			tempstack.push(stack.pop());
		}
		while(!tempstack.isEmpty()) {
			TreeNode temp = tempstack.pop();
			result.add(temp.val);
			stack.push(temp);
		}
		return result;
	}
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(10);
		TreeNode n2 = new TreeNode(5);
		TreeNode n3 = new TreeNode(12);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(7);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		train_24 train_24 = new train_24();
		ArrayList<ArrayList<Integer>> result = train_24.FindPath(n1, 22);
		for (int i = 0; i < result.size(); i++) {
			ArrayList<Integer> pt = result.get(i);
			for(int j = 0; j < pt.size(); j++) {
				System.out.println(pt.get(j));
			}
			System.out.println("---------------------------");
		}
		
	}
}
