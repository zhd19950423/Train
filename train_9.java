package offer_train;
/*
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class train_9 {
	public int JumpFloorII(int target) {
		int result = 0;
		if(target == 0) {
			return 0;
		}
		else {
			for(int i = target - 1; i >= 0; i--) {
				result = result + JumpFloorII(i);				
			}
			result++;
		}
		return result;	      
    }
}
