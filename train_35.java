package offer_train;
/*
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
public class train_35 {
	//循环常规写法
	public int InversePairs(int [] array) {
        int len = array.length;
        int result = 0;
        for(int i = 1; i < len; i++) {
        	for(int j = 0; j < i; j++) {
        		if(array[i] < array[j]) {
        			result++;
        		}
        	}
        }
		return result % 1000000007;
    }
	//归并排序改进，时间复杂度进一步缩小
	public int InversePairs_1(int [] array) {
		if(array == null || array.length == 0)
        {
            return 0;
        }
        int[] copy = new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            copy[i] = array[i];
        }
        int count = InversePairsCore(array, copy, 0, array.length-1);//数值过大求余
        return count;
    }
	private int InversePairsCore(int[] array,int[] copy,int low,int high)
    {
        if(low==high)
        {
            return 0;
        }
        int mid = (low+high)>>1;
        int leftCount = InversePairsCore(array, copy, low, mid) % 1000000007;
        int rightCount = InversePairsCore(array, copy, mid + 1, high) % 1000000007;
        int count = 0;
        int i=mid;
        int j=high;
        int locCopy = high;
        while(i >= low && j > mid)
        {
            if(array[i] > array[j])
            {
                count += j - mid;
                copy[locCopy--] = array[i--];
                if(count >= 1000000007)//数值过大求余
                {
                    count %= 1000000007;
                }
            }
            else
            {
                copy[locCopy--] = array[j--];
            }
        }
        for(; i >= low; i--)
        {
            copy[locCopy--]=array[i];
        }
        for(; j > mid; j--)
        {
            copy[locCopy--]=array[j];
        }
        for(int s = low; s <= high; s++)
        {
            array[s] = copy[s];
        }
        return (leftCount + rightCount + count) % 1000000007;
    }
	public static void main(String[] args) {
		train_35 train_35 = new train_35();
		int [] array = {1,2,3,4,5,6,7,0};
		System.out.println(train_35.InversePairs_1(array));
	}
}
