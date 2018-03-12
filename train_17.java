package offer_train;
/*
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class train_17 {
	
	
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		boolean result = false;
		if(root1 == null || root2 == null) {
			return false;
		}
		String A = first(root1);
		String B = first(root2);
		if(A.indexOf(B) != -1) {
			result = true;
		}		
		return result;       
    }
	public String first(TreeNode root) {
		String result = "";
		if (root != null) {
			result = String.valueOf(root.val) + first(root.left) + first(root.right);
		}
		return result;		
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
		
		train_17 train_17 = new train_17();
		String string = train_17.first(A);
		System.out.println(string);
	}
}
