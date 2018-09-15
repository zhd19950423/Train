package offer_train;

/*
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class train_39 {
	public boolean IsBalanced_Solution(TreeNode root) {
		if(root == null) {
			return true;
		}
		if(Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
			return false;
		}
		
		return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);   
    }
	public int getHeight(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		int result = 0;
		if(left > right) {
			result = left;
		}else {
			result = right;
		}
		return result + 1;
	}
	
}
