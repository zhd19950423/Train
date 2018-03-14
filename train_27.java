package offer_train;

import java.util.ArrayList;
import java.util.Collections;
/*
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class train_27 {
	public ArrayList<String> Permutation(String str) {
		ArrayList<String> result = new ArrayList<String>();
		char[] chars = str.toCharArray();
		recursion(chars, 0, result);
		Collections.sort(result);
		return result;      
    }
	public void recursion(char[] chars, int index, ArrayList<String> result) {
		if(index == chars.length - 1) {
			String onestr = String.valueOf(chars);
			if(!result.contains(onestr)) {
				result.add(onestr);
			}
		}else {
			for(int j = index; j < chars.length; ++j) {
                swap(chars, index, j);
                recursion(chars, index + 1, result);
                swap(chars, index, j);
            }
		}
	}
	public void swap(char[] x, int a, int b) {
        char t = x[a];
        x[a] = x[b];
        x[b] = t;
    }
	public static void main(String[] args) {
		String string = "abcd";
		train_27 train_27 = new train_27();
		ArrayList<String> result = train_27.Permutation(string);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}
