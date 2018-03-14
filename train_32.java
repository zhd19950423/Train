package offer_train;

import java.util.ArrayList;
import java.util.Comparator;



/*
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class train_32 {
	public String PrintMinNumber(int [] numbers) {
		String result = "";
		ArrayList<Integer> chArrayList = new ArrayList<Integer>();
		for(int i = 0; i < numbers.length; i++) {
			chArrayList.add(numbers[i]);
		}
		Comparator c = new Comparator<Integer>() {  
            @Override  
            public int compare(Integer o1, Integer o2) {  
                // TODO Auto-generated method stub  
            	String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;
                //注意！！返回值必须是一对相反数，否则无效。jdk1.7以后就是这样。  
        //      else return 0; //无效  
                return s1.compareTo(s2);  
            }  
        }; 
        chArrayList.sort(c);
        for(int i = 0; i < chArrayList.size(); i++) {
        	String string = String.valueOf(chArrayList.get(i));
        	result = result + string;
        }
		return result;
    }
	public static void main(String[] args) {
		train_32 train_32 = new train_32();
		int[] numbers = {3, 32, 321};
		System.out.println(train_32.PrintMinNumber(numbers));
	}
}
