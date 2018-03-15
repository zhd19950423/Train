package offer_train;

import javax.security.auth.kerberos.KerberosKey;

/*
 * 统计一个数字在排序数组中出现的次数。
 */
public class train_37 {
	public int GetNumberOfK(int [] array , int k) {
		int result = 0;
		if(array.length == 0 || array == null) {
			return result;
		}
		int i = 0;
		while(i < array.length && array[i] != k) {
			i++;
		}
		while(i < array.length && array[i] == k) {
			result++;
			i++;
		}
		
		return result;
    }
	public static void main(String[] args) {
		int[] A = {};
		int k = 1;
		train_37 train_37 = new train_37();
		System.out.println(train_37.GetNumberOfK(A, k));
	}
}
