package offer_train;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class train_42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0, j = array.length - 1; i < j;) {
            if(array[i] + array[j] == sum){
                result.add(array[i]);
                result.add(array[j]);
                break;
            }
            else if(array[i] + array[j] > sum){
                j--;
                continue;
            }else {
                i++;
                continue;
            }
        }
        return result;
    }
}
