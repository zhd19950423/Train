package offer_train;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/*
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class train_28 {
	public int MoreThanHalfNum_Solution(int [] array) {		
		int result = 0;
		Set<Integer> hs = new HashSet<Integer>(); 
		for(int i = 0; i < array.length; i++) {
			hs.add(array[i]);
		}
		Iterator<Integer> it = hs.iterator();
		int num = array.length - hs.size() + 1;
		while(it.hasNext() && num > (array.length / 2)){
			int x = it.next();
			int count_x = 0;
			for(int i = 0; i < array.length; i++) {
				if(x == array[i]) {
					count_x++;
				}
			}
			if(count_x > (array.length / 2)) {
				result = x;
				break;
			}
			num = num - count_x + 1;
		}
		return result;      
    }
	public static void main(String[] args) {
		int [] a = {1,2,3,2,2,2,5,4,2};
		train_28 train_28 = new train_28();
		System.out.println(train_28.MoreThanHalfNum_Solution(a));
	}
}
