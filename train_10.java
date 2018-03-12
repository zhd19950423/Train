package offer_train;
/*
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class train_10 {
	public int RectCover(int target) {
		int result = 0;
		if (target == 0) {
			return 0;
		}
		if (target == 1) {
			return 0;
		}
		if (target == 2) {
			return 2;
		}
		if(target > 2) {
			int one = 1;
			int two = 2;
			for(int i = 3; i <= target; i++) {
				result = one + two;
				one = two;
				two = result;
			}
		}
		return result;
    }
}
