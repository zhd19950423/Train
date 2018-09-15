package offer_train;

import java.util.ArrayList;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。
 */
public class train_51 {
    public static int[] multiply(int[] A) {
        int[] left = new int[A.length];
        int[] right = new int[A.length];
        int[] B = new int[A.length];
        int mul = 1;
        for (int i = 0; i < left.length; i++) {
            mul = mul * A[i];
            left[i] = mul;
        }
        mul = 1;
        for (int i = right.length - 1; i >= 0; i--) {
            mul = mul * A[i];
            right[i] = mul;
        }
        for (int i = 1; i < B.length-1; i++) {
            B[i] = left[i - 1] * right[i + 1];
        }
        B[0] = right[1];
        B[B.length - 1] = left[left.length - 2];
        return B;
    }
    public static void main(String[] args){
      int[] A = {120,60,40,30,24};
      int[] B = multiply(A);
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
    }
}
