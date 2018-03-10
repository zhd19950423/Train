package offer_train;


/*
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class train_1 {
	static int[][] a = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
	static int n = 5;
	public static boolean Find(int target, int [][] array) {
		int rowCount = array.length;
        int colCount = array[0].length;
        int i,j;
        for(i=rowCount-1,j=0;i>=0&&j<colCount;)
        {
            if(target == array[i][j])
                return true;
            if(target < array[i][j])
            {
                i--;
                continue;
            }
            if(target > array[i][j])
            {
                j++;
                continue;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		long startTime=System.nanoTime();
		System.out.println(Find(n, a));
		long endTime=System.nanoTime(); 
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
	}
}
