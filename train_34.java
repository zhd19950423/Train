package offer_train;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/*
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 */
import javax.print.attribute.standard.MediaName;

public class train_34 {
	public int FirstNotRepeatingChar(String str) {
		Set oneSet = new LinkedHashSet<Character>();
		Set moreSet = new HashSet<Character>();
		
		char[] chars = str.toCharArray();
		int count = oneSet.size();
		for(int i = 0; i < chars.length; i++) {
			if(!moreSet.contains(chars[i])) {
				oneSet.add(chars[i]);
				if(count == oneSet.size()) {
					oneSet.remove(chars[i]);
					moreSet.add(chars[i]);
					count = oneSet.size();
				}else {
					count = oneSet.size();
				}
			}
		}
		int result = -1;
		Iterator<Character> it = oneSet.iterator();
		
		if(it.hasNext()) {
			char c = it.next();
			for(int i = 0; i < chars.length; i++) {
				if(c == chars[i]) {
					result = i;
					break;
				}
			}
		}
		return result;
    }
	public static void main(String[] args) {
		train_34 train_34 = new train_34();
		String str = "google";
		System.out.println(train_34.FirstNotRepeatingChar(str));
	}
}
