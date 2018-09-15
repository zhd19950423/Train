package offer_train;

/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class train_57 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode.right != null) {
            TreeLinkNode p = pNode.right;
            while (p.left != null) {
                p = p.left;
            }
            return p;
        } else {
            TreeLinkNode p = pNode.next;
            while (p != null && p.right == pNode) {
                pNode = p;
                p = p.next;
            }
            return  p;

        }
    }
}
