package offer_train;
/*
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class train_23 {
	public boolean VerifySquenceOfBST(int [] sequence) {
		boolean result = false;
		if(sequence == null) {
			return result;
		}
		int end = sequence.length - 1;
		int start = 0;
		result = istreeBST(sequence, start, end);
		return result;      
    }
	public boolean istreeBST(int [] sequence, int start, int end) {
		if(start >= end) {
			return true;
		}
		int i = start;
		for(; i < end; i++) {
			if(sequence[i] > sequence[end]) {
				break;
			}
		}
		for(int j = i; j < end; j++) {
			if(sequence[j] < sequence[end]) {
				return false;
			}
		}
		return istreeBST(sequence, start, i - 1) && istreeBST(sequence, i, end - 1);
	}
}
