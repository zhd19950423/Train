package offer_train;
/*
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class train_8 {
	public int JumpFloor(int target) {
		int result = 0;
		if (target == 0) {
			return 0;
		}
		if (target == 1) {
			return 1;
		}
		if (target == 2) {
			return 2;
		}
		int one = 1;
		int two = 2;
		for (int i = 2; i < target; i++) {
			result = one + two;
			one = two;
			two = result;
		}
		return result;
    }
	
	public static void main(String[] args) {
		train_8 train = new train_8();
		System.out.println(train.JumpFloor(3));
	}
}
