package offer_train;

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class train_58 {
    boolean isSymmetrical(TreeNode pRoot)
    {
        TreeNode node = getMirror(pRoot);
        return isSymmetrical(pRoot,node);
    }
    boolean isSymmetrical(TreeNode pRoot,TreeNode node)
    {
        if(pRoot == null && node == null){
            return true;
        }else if(pRoot == null || node  == null){
            return false;
        }
        if(pRoot.val == node.val){
            return isSymmetrical(pRoot.left,node.left)&&isSymmetrical(pRoot.right,node.right);
        }
        return false;
    }

    TreeNode getMirror(TreeNode pRoot){
        if (pRoot == null) {
            return null;
        }
        TreeNode root = new TreeNode(pRoot.val);
        root.right = getMirror(pRoot.left);
        root.left = getMirror(pRoot.right);
        return root;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(4);
    }

}
