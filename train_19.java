package offer_train;

import java.util.ArrayList;

/*
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class train_19 {
	public ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int row = matrix.length;
		int col = 0;
		if(row > 0) {
			col = matrix[0].length;
			int start = 0;
			while(row - 2*start > 0 && col - 2*start > 0) {
				int js = start;
				int is = start;
				if(row - 2*start == 1) {
					for(; js < col - start; js++) {
						result.add(matrix[is][js]);
					}
					break;
				}
				if(col - 2*start == 1) {
					for(; is < row - start; is++) {
						result.add(matrix[is][js]);
					}
					break;
				}
				for(; js < col - start - 1; js++) {
					result.add(matrix[is][js]);
				}
				for(; is < row - start - 1; is++) {
					result.add(matrix[is][js]);
				}
				for(; js > start; js--) {
					result.add(matrix[is][js]);
				}					
				for(; is > start; is--) {
					result.add(matrix[is][js]);
				}
				start++;
			}	
		} 
		return result;	       
    }
	public static void main(String[] args) {
		int [][] matrix = {{1, 2, 3, 4}, 
						   {5, 6, 7, 8}, 
						   {9, 10, 11, 12}, 
						   {13, 14, 15, 16}};
		int [][] matrix3 = {{1, 2, 3, 4, 5}, 
				   {4, 5, 6, 7, 8}, 
				   {7, 8, 9, 10, 11} 
				  };
		int [][] M = {{1,2,3,4,5}};
		train_19 train_19 = new train_19();
		ArrayList<Integer> S = train_19.printMatrix(matrix3);
		for(int i = 0; i < S.size(); i++) {
			System.out.println(S.get(i));
		}
	}
}
