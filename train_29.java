package offer_train;

import java.util.ArrayList;
/*
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class train_29 {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(k > input.length) {
			return result;
		}else {
			for(int index = 0; index < k; index++) {
				for(int i = input.length -1 ; i > index; i--) {
					if(input[i] < input[i - 1]) {
						int temp = input[i];
						input[i] = input[i - 1];
						input[i - 1] = temp;
					}
				}
				result.add(input[index]);
			}
		}	
		return result;
    }
}
