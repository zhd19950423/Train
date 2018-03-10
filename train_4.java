package offer_train;
/*
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class train_4 {
	public train_4() {
		// TODO Auto-generated constructor stub
	}
	public class TreeNode {
			int val;
		    TreeNode left;
		    TreeNode right;
		    TreeNode(int x) { val = x; }
		}
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		TreeNode root = new TreeNode(pre[0]);		
		this.findChild(root, pre, in);
		TreeNode result = root;
		return result;
        
    }
	public void findChild(TreeNode root, int [] pre,int [] in) {
		System.out.println("findChild");
		int index = 0;
		for(int i = 0; i < in.length; i++) {
			if (pre[0] == in[i]) {
				index = i;
				break;
			}
		}
		
		int[] leftpre = null;
		int[] leftin = null;
		int[] rightpre = null;
		int[] rightin = null;
		
		if(index > 0) {
			TreeNode leftchild = new TreeNode(pre[1]);
			root.left = leftchild;
			leftpre = this.getsub(pre, 1, index + 1);
			System.out.println("findChild");
			leftin = this.getsub(in, 0, index);
			findChild(leftchild, leftpre, leftin);
		}
		
		if(index < in.length - 1) {
			TreeNode rightchild = new TreeNode(pre[index + 1]);
			root.right = rightchild;
			rightpre = this.getsub(pre, index + 1, pre.length);
			rightin = this.getsub(in, index + 1, in.length);
			findChild(rightchild, rightpre, rightin);
		}	
	}
	public int[] getsub(int[] A,int start, int end) {
		int[] sub = new int[end - start];
		for (int i = start, j = 0; i < end; i++,j++) {
			sub[j] = A[i]; 
		}
		return sub;
		
	}
	public static void main(String[] args) {
		int[] pre = {1,2,3,4,5,6,7};
		int[] in = {3,2,4,1,6,5,7};
		train_4 train = new train_4();
		TreeNode result = train.reConstructBinaryTree(pre, in);
		System.out.println(result.left.right.val);
	}
}
