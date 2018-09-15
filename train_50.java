package offer_train;

import java.util.HashSet;
import java.util.Set;

/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */
public class train_50 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        boolean flag = false;
        if (length < 2) {
            return flag;
        }
        Set<Integer> set = new HashSet<Integer>();
        int index = 0;
        int size = set.size();
        while (index < length) {
            set.add(numbers[index++]);
            if (size == set.size()) {
                duplication[0] = numbers[index - 1];
                flag = true;
                break;
            }
            size = set.size();
        }
        return flag;
    }

    public static void main(String[] args) {
        train_50 train_50 = new train_50();
        int[] numbers = {2, 1, 3, 1, 4};
        int[] duplication = new int[1];
        System.out.println(train_50.duplicate(numbers, 5, duplication));
    }
}
