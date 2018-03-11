package offer_train;
/*
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */

public class train_13 {
	
	public void reOrderArray(int [] array) {
		int len = array.length;
		boolean isover = false;
        for(int i = 0; i < len; i++) {   	
        	if(array[i] % 2 == 0) {
        		for (int j = i + 1; j < len; j++) {
        			if(array[j] % 2 == 1) {
        				isover = false;
        				int temp = array[j];
        				for(int h = j; h > i; h--) {
        					array[h] = array[h - 1];       					
        				}
        				array[i] = temp;        				
        				break;
        			}else {
        				isover = true;
					}
				}
        		if (isover) {
					break;
				}       		
        	}
        }
    }
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		train_13 train_13 = new train_13();
		train_13.reOrderArray(a);
	}
}
