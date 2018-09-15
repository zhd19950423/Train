package offer_train;

import java.util.ArrayList;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 */
public class train_41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        if(sum == 1){
            return resultList;
        }
        int temp = 0;
        for (int i = 1; i < (sum + 1) / 2; i++) {
            ArrayList<Integer> result = new ArrayList<Integer>();
            for (int j = i; j <= (sum + 1) / 2 ; j++) {
                result.add(j);
                temp += j;
                if(temp == sum){
                    resultList.add(result);
                    break;
                }
                if(temp > sum){
                    break;
                }
            }
            temp = 0;
        }
        return resultList;
    }
}
