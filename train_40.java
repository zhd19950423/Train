package offer_train;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class train_40 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        Set<Integer> S1 = new HashSet<Integer>();
        Set<Integer> S2 = new HashSet<Integer>();
        int size = S1.size();
        for (int i = 0; i < array.length; i++) {
            S1.add(array[i]);
            if (size == S1.size()) {
                S2.add(array[i]);
            }
            size = S1.size();
        }
        Iterator it = S1.iterator();
        int index = 0;
        while (it.hasNext()) {
            Integer X = (Integer) it.next();
            if (!S2.contains(X) && index == 0) {
                num1[index++] = X;
            }
            if (!S2.contains(X) && index == 1) {
                num2[index - 1] = X;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 2, 2, 3, 5, 3, 4, 4, 6, 7, 6, 8, 8, 9, 9};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        train_40 train_40 = new train_40();
        train_40.FindNumsAppearOnce(A, num1, num2);
        System.out.println(num1[0] + "" + num2[0]);
    }
}
