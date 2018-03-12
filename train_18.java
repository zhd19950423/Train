package offer_train;
/*
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 */
public class train_18 {
	public void Mirror(TreeNode root) {
        if(root != null) {
        	TreeNode temp = root.left;
        	root.left = root.right;
        	root.right = temp;
        	Mirror(root.left);
        	Mirror(root.right);
        }
    }
	public static void main(String[] args) {
		TreeNode A = new TreeNode(1);
		TreeNode B = new TreeNode(2);
		TreeNode C = new TreeNode(3);
		TreeNode D = new TreeNode(4);
		TreeNode E = new TreeNode(5);
		TreeNode F = new TreeNode(6);
		A.left = B;
		A.right = C;
		B.left = D;
		C.left = E;
		C.right = F;
		train_18 train_18 = new  train_18();
		train_18.Mirror(A);
		train_17 train_17 = new train_17();
		String string = train_17.first(A);
		System.out.println(string);
	}
}
